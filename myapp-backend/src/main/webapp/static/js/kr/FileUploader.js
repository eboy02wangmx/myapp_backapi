function FileUploader(){
    this.Data={};
    this.Data.params = new Array();
    this.key="";
    this.mime_types="mp4,rmvb";
    this.max_file_size="300mb";
    this.multiple=true;
    this.request_params_callback=set_request_upload_param;
    // this.bind_callback=set_bind_callback;
    this.act="video";
    this.btn_id="";
    this.l_params={};//附加参数
    this.uploader=null;
    this.style_id=""; //样式id
    this.qn_video_token={};
    this.autoUpload=false;
    this.chunk_size=0;
    /**
    * 初始化数据
    *@param btn_id 按钮id 必填
    *@param url 上传url地址 必填
    *@param success_callback 上传成功回调函数  选填
    *@param act 获取参数类型 选填
    *@param request_params_callback 参数回调函数  选填
    *@param mime_types 上传媒体类型 默认为"mp4,rmvb" 选填
    *@param max_file_size 上传大小 默认为300mb 选填
    *@param multiple 是否支持多张上传 默认为true 选填
    *@param style_callback 样式回调函数 选填
    *@param style_id 样式id 选填
    *@param uploadProgress_callback 进度条回调函数 选填
    *@param autoUpload 是否自动上传 选填 默认为false
    *@param chunk_size 分片上传 选填 默认为0(表示不分片) 单位KB
    */
    this.Init=function(btn_id,url,success_callback,act,request_params_callback,mime_types,max_file_size,multiple,style_callback,style_id,uploadProgress_callback,autoUpload,chunk_size,file_uploaded){
        if((typeof(multiple)!="undefined" && multiple!=null)){ this.multiple=multiple;}
        this.btn_id=btn_id;
        if((typeof(mime_types)!="undefined" && mime_types!=null && mime_types!="")){this.mime_types=mime_types;}
        if((typeof(max_file_size)!="undefined" && max_file_size!=null && max_file_size!="")){this.max_file_size=max_file_size;}
        if(request_params_callback){this.request_params_callback=request_params_callback};
        if(act){this.act=act};
        if(style_id){this.style_id=style_id;}
        if(autoUpload){this.autoUpload=autoUpload;}
        if((typeof(chunk_size)!="undefined" && chunk_size!=null)){ this.chunk_size=chunk_size;}

        this.uploader=upload_file(this,btn_id,url,success_callback,this.act,this.request_params_callback,this.mime_types,this.max_file_size,this.multiple,style_callback,uploadProgress_callback,file_uploaded);
        return this.uploader;
    }
}

function upload_file(obj,btn_id,url,success_callback,act,request_params_callback,mi_types,max_file_size,multiple,style_callback,uploadProgress_callback,file_uploaded){
        var uploader= new plupload.Uploader({
            runtimes : 'html5,flash,silverlight,html4',
            browse_button : btn_id,
            chunk_size:obj.chunk_size,
            multi_selection: multiple,
            flash_swf_url: '/static/js/plupload/Moxie.swf',
            silverlight_xap_url : '/static/js/plupload/Moxie.xap',
            url : url,
            filters: {
                mime_types : [ //只允许上传图片
                    { title : "Video files", extensions : mi_types }
                ],
                max_file_size : max_file_size, //
                prevent_duplicates : false //不允许选取重复文件
            },
            init: {
                PostInit: function(up) {
                    request_params_callback(obj,up, '', false,url);
                },
                FilesAdded: function(up, files) {
                    //var file= files[files.length-1];
                    for(var i=0 ; i<files.length ;i++){
                        var file = files[i];
                        if(style_callback){
                            style_callback(up,file,obj);
                        }
                        else{
                            if(!multiple||multiple=="false"){
                                //只需传单个
                                if(up.files.length>1){
                                    up.removeFile(up.files[0]);
                                    $(obj.style_id).html("");
                                }
                                else if($.trim($(obj.style_id).html()).length>0){
                                    $(obj.style_id).html("");
                                }
                            }
                            if (!file || !/image\//.test(file.type)){
                                bindData(up,file,obj);
                            }
                            else{
                                 //确保文件是图片
                                $.each(files||[],function(i,file){
                                    previewImage(file,function(imgsrc){
                                        bindImg(up,file,imgsrc,obj);
                                    })
                                })
                            }
                        }

                    }
                    if(obj.autoUpload){
                        //自动上传
                        obj.uploader.start();
                    }
                    return true;
                },
                BeforeUpload: function(up, file) {
                    $("#"+btn_id).css('pointer-events','none');
                    request_params_callback(obj,up, file.name, true,url);
                },

                UploadProgress: function(up, file) {
                    if(uploadProgress_callback)
                        uploadProgress_callback(up,file,obj);
                    else{
                         if (!file || !/image\//.test(file.type)){
                            //非图片上传进度
                            var d = document.getElementById(file.id);
                            if(null==d)return false;
                            d.getElementsByTagName('span')[0].innerHTML = '  ' + file.percent + "%";
                            var progBar = d.getElementsByTagName('div')[0];
                            // var progBar = prog.getElementsByTagName('div')[0]
                            progBar.style.width= file.percent+'%';
                            progBar.setAttribute('aria-valuenow', file.percent);
                        }
                        else{
                            //图片上传进度
                            var header= $(obj.style_id+" .card[data-id='"+file.id+"'] .card-heading");
                            header.show();
                            header.find('span').html(file.percent+"%");
                            var progBar=header.find('.progress-bar');
                            progBar.css("width",file.percent+"%");
                            progBar.attr('aria-valuenow', file.percent);
                        }
                    }
                },

                FileUploaded: function(up, file, info) {
                    if (info.status == 200){
                        var param = {};
                        param.location =obj.key;
                        param.name = file.name;
                        param.size = file.size;
                        obj.Data.params.push(param);
                        // var files = up.files;
                        //  if(files[files.length-1].id == file.id){
                        //     if(success_callback)
                        //         success_callback(obj);
                        // }
                    }
                    else
                    {
                        if(typeof(alert_notice)!="undefined")
                            alert_notice("上传失败",'danger');
                        else
                            alert("上传失败");
                    }
                    $("#selectfiles").css('pointer-events','');
                    if (file_uploaded) {
                        file_uploaded(up,file,obj);
                    }
                },
                UploadComplete:function(files){
                        if(success_callback)
                            success_callback(obj);
                },
                Error: function(up, err) {
                    if (err.code == -600) {
                        if(typeof(alert_notice)!="undefined")
                            alert_notice("选择的文件太大了,不能超过"+obj.max_file_size,'danger');
                        else
                            alert("选择的文件太大了,不能超过"+obj.max_file_size);
                    }
                    else if (err.code == -601) {
                        if(typeof(alert_notice)!="undefined")
                             alert_notice("只能上传"+obj.mime_types+"格式大小的文件",'danger');
                        else
                             alert("只能上传jpg格式大小的图片");
                    }
                    else if (err.code == -602) {
                        if(typeof(alert_notice)!="undefined")
                             alert_notice("这个文件已经上传过一遍了",'danger');
                        else
                             alert("这个文件已经上传过一遍了");
                    }
                    else
                    {
                        if(typeof(alert_notice)!="undefined")
                            alert_notice("上传异常",'danger');
                        else
                            alert("上传异常");
                    }
                }
            }
        });
    uploader.init();
    return uploader;
}

/**
*绑定除图片的默认数据样式
*@param up  当前上传对象
*@param file 当前文件对象
*@param obj 当前上下文对象
*/
function bindData(up,file,obj){
    $(obj.style_id).append('<tr data-id="'+file.id+'">'+
        '<th class="col-md-4">'+file.name+'</th>'+
        '<th class="col-md-3">'+(file.size/1024).toFixed(1)+' KB</th>'+
        '<th class="col-md-6"><div class="progress progress-striped" id="'+file.id+'">'+
        '<div class="progress-bar progress-bar-success" style="width: 0%"></div>'+
        '<span class="text-muted" style="font-size:11px;font-weight:normal;">点击下方发布按钮开始上传</span>'+
        '<a href="javascript:void(0)" class="text-danger store-delete" onclick="del_click(this,tr)" data-id="'+file.id+'" title="删除">'+
        '<i class="icon-trash pull-right"></i></a></div></th>'+
        '</tr>');
    $("#video_up_table").show();
    $(obj.style_id+" a[data-id="+file.id+"]").data('data',up).data('remove',$(obj.style_id+" tr[data-id="+file.id+"]"));
}

/**
*绑定图片的默认数据样式
*@param up  当前上传对象
*@param file 当前文件对象
*@param imgsrc 图片数据
*@param obj 当前上下文对象
*/
function bindImg(up,file,imgsrc,obj){
      var files=$(obj.style_id);
      var del_obj="'.card'";
      var html='<a class="card cards-borderless" style="float:left;margin-left:5px; width:200px;"  data-id="'+file.id+'" href="javascript:void(0)">'+
        '<div class="media-wrapper"><img width="200px" height="200px" src="'+imgsrc+'" alt=""></div>'+
        '<div class="caption">'+
        '<div class="pull-left" style="width:75%;white-space:nowrap;overflow:hidden;text-overflow:ellipsis;">'+file.name+'</div>'+
        '<div class="pull-right"> <span data-id="'+file.id+'" onclick="del_click(this,'+del_obj+')" class="text-danger"><i class="icon icon-times"></i></span></div>'+
        '</div>'+
        '<div class="card-heading" style="display:none">'+
        '<div class="progress progress-striped" style="margin-bottom:0"><div class="progress-bar progress-bar-success" role="progressbar" aria-valuenow="0" aria-valuemin="0" aria-valuemax="100" style="width: 0%">'+
        '<span class=""></span>'+
        '</div>'+
        '</div>'+
        '</div>'+
        '</a>';
        files.append(html);
        files.find("span[data-id="+file.id+"]").data('data',up).data('remove',$(obj.style_id+" .card[data-id="+file.id+"]"));
}

/**
*plupload中为我们提供了mOxie对象
*有关mOxie的介绍和说明请看：https://github.com/moxiecode/moxie/wiki/API
*@param file  当前文件对象
*@param callback 回调函数 参数:imgsrc  图片数据
*/
function previewImage(file, callback) {//file为plupload事件监听函数参数中的file对象,callback为预览图片准备完成的回调函数
    if (!file || !/image\//.test(file.type)) return; //确保文件是图片
    if (file.type == 'image/gif') {//gif使用FileReader进行预览,因为mOxie.Image只支持jpg和png
        var fr = new mOxie.FileReader();
        fr.onload = function () {
            callback(fr.result);
            fr.destroy();
            fr = null;
        }
        fr.readAsDataURL(file.getSource());
    } else {
        var preloader = new mOxie.Image();
        preloader.onload = function () {
            //preloader.downsize(550, 400);//先压缩一下要预览的图片,宽300，高300
            var imgsrc = preloader.type == 'image/jpeg' ? preloader.getAsDataURL('image/jpeg', 80) : preloader.getAsDataURL(); //得到图片src,实质为一个base64编码的数据
            callback && callback(imgsrc); //callback传入的参数为预览图片的url
            preloader.destroy();
            preloader = null;
        };
        preloader.load(file.getSource());
    }
}

/**
* 删除
*@param obj 当前删除对象
*/
function del_click(obj){
    var file_id=$(obj).attr("data-id");
    var up= $(obj).data('data');
    var file=up.getFile(file_id);
    var remove_id= $(obj).data('remove');
    if(remove_id)
        $(remove_id).remove();
    if(file&&up){
        up.removeFile(file);
    }
}

/**
* 请求参数函数
*/
function set_request_upload_param(obj,up,filename,ret,url){
    if (ret == false){
        obj.qn_video_token ={};
        $.ajax({
            url:"/get_token.php",
            data:{"act":obj.act},
            async: false,
            success:function(result){
                result = eval("("+result+")");
                obj.qn_video_token.prefix= result.prefix;
                obj.qn_video_token.type=result.type;
                if (result.type=="1") {
                    //七牛
                    obj.qn_video_token.token=result.token;
                }
                else if (result.type=="2") {
                    //OSS
                    obj.qn_video_token.policy = result.policy;
                    obj.qn_video_token.OSSAccessKeyId = result.accessid;
                    obj.qn_video_token.host = result.host;
                    obj.qn_video_token.signature = result.signature;
                }
                else if(result.type=="0"){
                    //本地
                }
            }
        })
    }else{
        obj.key = obj.qn_video_token.prefix+generico_name()+filename.substr(filename.lastIndexOf("."));
        var new_multipart_params={
            'key' : obj.key,
            'prefix':obj.qn_video_token.prefix,
            'success_action_status':'200' //让服务端返回200,不然，默认会返回204
        };

        if (obj.qn_video_token.type=="1") {
            //七牛
            new_multipart_params.token=obj.qn_video_token.token;
        }
        else if (obj.qn_video_token.type=="2") {
            //OSS
            new_multipart_params.policy= obj.qn_video_token.policy;
            new_multipart_params.OSSAccessKeyId=obj.qn_video_token.OSSAccessKeyId;
            new_multipart_params.host= obj.qn_video_token.host;
            new_multipart_params.signature=obj.qn_video_token.signature
        }
        else if (obj.qn_video_token.type=="0") {
            //本地
        }

        up.setOption({
            'url': url,
            'multipart_params': new_multipart_params
        });
    }
}

/**
* 生成文件随机数
@return 返回随机数
*/
 function generico_name() {
  var $chars = 'abcdefghijklmnopqrstwxyz0123456789';
　　var maxPos = $chars.length;
　　var pwd = '';
　　for (i = 0; i < 3; i++) {
　　　　pwd += $chars.charAt(Math.floor(Math.random() * maxPos));
　　}
　　return new Date().getTime()+pwd;
}
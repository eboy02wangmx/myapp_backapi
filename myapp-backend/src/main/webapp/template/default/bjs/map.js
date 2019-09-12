function tiao(view_uuid) {
    window.open("/tour/" + view_uuid)
}
var markerIndex = 0;
var map;
var my_map;
function jq(a) {
    return document.getElementById(a);
}
var datas;
$(function() {
    $.ajax({
        url: "/getMap.php",
        success: function(data) {
            //console.log(data);
            data = JSON.parse(data);
            my_map = data.map;
            my_thumb = data.thumb_path;
            console.log(typeof my_map);
            my_map = my_map.toString();
            data = my_map.replace('[', '');
            data = my_map.replace(']', '');
            data = my_map.replace(/\"/g, "");
            data = my_map.replace(/\s+/g, "");
            datas = my_map.split(",");
            //datas=["116.34366989135742","39.916537677418894"];
            console.log(datas);
            console.log(datas.length);
            window.init();
        }
    });
});
var data = [[39.959228, 116.367874], ];
window.init = function() {
    var Map = qq.maps.Map;
    var Marker = qq.maps.Marker;
    var LatLng = qq.maps.LatLng;
    var Event = qq.maps.event;
    var MarkerImage = qq.maps.MarkerImage;
    var MarkerShape = qq.maps.MarkerShape;
    var MarkerAnimation = qq.maps.MarkerAnimation;
    var Point = qq.maps.Point;
    var Size = qq.maps.Size;
    var ALIGN = qq.maps.ALIGN;
    var MVCArray = qq.maps.MVCArray;
    var MarkerCluster = qq.maps.MarkerCluster;
    var Cluster = qq.maps.Cluster;
    var MarkerDecoration = qq.maps.MarkerDecoration;
    var forEach = function(array, fun) {
        for (var i = 0,
        l = array.length; i < l; ++i) {
            if (fun(array[i], i) === false) {
                return false;
            }
        }
    };
    var latlng = new LatLng(39.91, 116.38);
    var options = {
        'zoom': 4,
        'center': latlng,
        'mapTypeId': "roadmap"
    };
    var map = new Map(jq('map_canvas'), options);
    var markers = new MVCArray();
    var markerCluster;
    //console.log(datas.length);
    function createCluster() {
        console.log(datas.length);
        for (var i = 0; i < datas.length; i = i + 2) {
            // console.log(my_thumb[i].name);
            // console.log(my_thumb[i].thumb_path);
            var latLng = new LatLng(datas[i + 1], datas[i]);
            var decoration = new MarkerDecoration(i, new Point(0, -5));
            var marker = new Marker({
                'position': latLng,
                map: map,
                name: my_thumb[i].name,
                thumb_path: my_thumb[i].thumb_path,
                view_uuid: my_thumb[i].view_uuid
            });
            var infoWin = new qq.maps.InfoWindow({
                map: map
            });
            qq.maps.event.addListener(marker, 'click',
            function(evt) {
                var view_uuid = "'" + this.view_uuid + "'";
                infoWin.open();
                infoWin.setContent('<div style="text-align:center;white-space:nowrap;margin:4px;font-size:14px;"><img src="' + this.thumb_path + '" style="width:70px;height:40px;vertical-align:middle"/><span style="height:40px;line-height:40px;display:inline-block;margin-left:5px;">' + this.name + '</span><div style="margin-top:5px;"><a style="color:#fff;background:#3280fc;padding:4px 10px;text-decoration:none;margin-top:10px;border-radius:5px;cursor:pointer" target="_blank" onclick="tiao(' + view_uuid + ')" view_uuid="' + this.view_uuid + '">进入场景</a><div></div>');
                infoWin.setPosition(this.position);
            });
            markers.push(marker);
        }
        markerClusterer = new MarkerCluster({
            map: map,
            minimumClusterSize: 2,
            //默认2
            markers: markers,
            zoomOnClick: true,
            //默认为true
            gridSize: 30,
            //默认60
            averageCenter: true,
            //默认false
            maxZoom: 18,
            //默认18
        });
        console.log(markerClusterer);
        Event.addListener(markerClusterer, 'click',
        function(evt) {
            // writeLog("mouse event", eventType);
            //var ss =  evt;
            //   console.log('点击了聚合点');
        });
    };
    createCluster();
    var imgPath = "./images/";
    var Styles = {
        "People": [{
            icon: new MarkerImage(imgPath + "people35.png", new Size(35, 35), new Point(0, 0), new Point(16, 0)),
            text: new MarkerDecoration('<font style="color:#ff00ff;font-size:10px;font-weight:bold;">{num}</font>', new Point(0, 5))
        }],
        "Conversation": [{
            icon: new MarkerImage(imgPath + "conv30.png", new Size(30, 27), new Point(0, 0), new Point(3, 0)),
            text: new MarkerDecoration('<font style="color:#ff00ff;font-size:10px;font-weight:bold;">{num}</font>', new Point(0, -2))
        }]
    };
    var maker_add;
    function addMarker(index) {
        var latLng = new LatLng(39.849558, 116.406893);
        var decoration = new MarkerDecoration(index, new Point(0, -5));
        maker_add = new Marker({
            'position': latLng,
            decoration: decoration,
            map: map
        });
        markers.push(maker_add);
        markerClusterer.addMarker(maker_add);
    }
    var markers_add = [];
    function addMarkers() {
        var bounds = map.getBounds();
        var sw = bounds.getSouthWest();
        var ne = bounds.getNorthEast();
        var lngSpan = Math.abs(sw.getLng() - ne.getLng());
        var latSpan = Math.abs(ne.getLat() - sw.getLat());
        for (var i = 0; i < 100; i++) {
            var position = new qq.maps.LatLng(ne.getLat() - latSpan * (Math.random() * 0.95), sw.getLng() + lngSpan * (Math.random() * 0.95));
            var decoration = new MarkerDecoration(i, new Point(0, -5));
            var makeradd = new Marker({
                'position': position,
                decoration: decoration,
                map: map
            });
            markers_add.push(makeradd);
        }
        markerClusterer.addMarkers(markers_add);
    }
    function removeMarker() {
        markerClusterer.removeMarker(maker_add);
    }
    function removeMarkers() {
        markerClusterer.removeMarkers(markers_add);
    }
    function clearMarkers() {
        markerClusterer.clearMarkers();
    }
    function setMarkerClusterOption(key, value) {
        markerClusterer.set(key, value);
    }
    var setKeyHandle = {
        'gridSize': 'setGridSize',
        'maxZoom': 'setMaxZoom',
        'averageCenter': 'setAverageCenter'
    };
    var getKeyHandle = {
        'gridSize': 'getGridSize',
        'maxZoom': 'getMaxZoom',
        'averageCenter': 'getAverageCenter'
    };
    var gridSize = jq("gridSize");
    Event.addDomListener(gridSize, "change",
    function() {
        setMarkerClusterOption("gridSize", parseInt(this.value));
    });
    var maxZoom = jq("maxZoom");
    Event.addDomListener(maxZoom, "change",
    function() {
        setMarkerClusterOption("maxZoom", this.value ? parseInt(this.value) : null);
    });
    var addmarker = jq("addMarkerBt");
    Event.addDomListener(addmarker, "click",
    function() {
        markerIndex++;
        addMarker(markerIndex);
    });
    var removeMarkerb = jq("removeMarkerBt");
    Event.addDomListener(removeMarkerb, "click",
    function() {
        removeMarker();
    });
    var addmarker = jq("addMarkersBt");
    Event.addDomListener(addmarker, "click",
    function() {
        addMarkers();
    });
    var removeMarkerb = jq("removeMarkersBt");
    Event.addDomListener(removeMarkerb, "click",
    function() {
        removeMarkers();
    });
    var clearMarkerb = jq("clearMarkersBt");
    Event.addDomListener(clearMarkerb, "click",
    function() {
        clearMarkers();
    });
    var minimumClusterSize = jq("minimumClusterSize");
    Event.addDomListener(minimumClusterSize, "change",
    function() {
        setMarkerClusterOption("minimumClusterSize", parseInt(this.value));
    });
    var averageCenter_true = jq("averageCenter_true");
    Event.addDomListener(averageCenter_true, "click",
    function() {
        setMarkerClusterOption("averageCenter", true);
    });
    var averageCenter_false = jq("averageCenter_false");
    Event.addDomListener(averageCenter_false, "click",
    function() {
        setMarkerClusterOption("averageCenter", false);
    });
    var zoomOnClick_true = jq("zoomOnClick_true");
    Event.addDomListener(zoomOnClick_true, "click",
    function() {
        setMarkerClusterOption("zoomOnClick", true);
    });
    var zoomOnClick_false = jq("zoomOnClick_false");
    Event.addDomListener(zoomOnClick_false, "click",
    function() {
        setMarkerClusterOption("zoomOnClick", false);
    });
    var stylesSelect = jq("styles");
    Event.addDomListener(stylesSelect, "change",
    function() {
        setMarkerClusterOption("styles", Styles[this.value] ? Styles[this.value] : null);
    });
};
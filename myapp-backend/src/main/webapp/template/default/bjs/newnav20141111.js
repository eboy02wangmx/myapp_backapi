!function(e,n){function t(){for(var e=o("newnav20141104nr"),n=e.length,t=0;n>t;t++){var s=e[t],r=s.getAttribute("track-id");r&&(s.onmouseover=a(m.length,!0),s.onmouseout=a(m.length,!1),d.push(r),v.push(s),m.push(s.className))}y=d.length}function s(e){for(var n=0;y>n;n++)if(d[n]==e){g=n,m[n]=m[n]+" bj2014",v[n].className=m[n];break}}function a(e,n){return n?function(){this.className=g===e?m[e].replace("bj2014","on2014"):m[e]+" on2014"}:function(){this.className=m[e]}}function o(e){var t,s,a,o,c=r(e,n,"div",!0)[0];if(c)for(t=c.children||c.childNodes,s=0,a=t.length,o=[];a>s;s++)1==t[s].nodeType&&o.push(t[s]);return o}function r(e,t,s,a){if(n.getElementsByClassName)return n.getElementsByClassName(e);var o=[],r=t.getElementsByTagName(s),c=0,i=r.length;e=e.replace(/\-/g,"\\-");for(var u=new RegExp("(^|\\s)"+e+"(\\s|$)");i>c&&(!u.test(r[c].className)||(o.push(r[c]),!a));)c++;return o}function c(){if(f=o("city20141104hd")){l=f.length;for(var e=0;l>e;e++){var t=f[e];t.onmouseover=i(e),t.onmouseout=i(e)}h=r("city20141104nr",n,"div")}}function i(e){return function(){u(e)}}function u(e){for(var n=0;l>n;n++)h[n].style.display="none",f[n].className=p;h[e].style.display="block",f[e].className=N}var l,f,h,m=[],v=[],g=-1,d=[],y=0,N="city1",p="city2";t(),c(),e.PublicNav={select:s,changeTab:u}}(window,document);

!function(e,n){function t(){for(var e=o("newnav20141104r"),n=e.length,t=0;n>t;t++){var s=e[t],r=s.getAttribute("track-id");r&&(s.onmouseover=a(m.length,!0),s.onmouseout=a(m.length,!1),d.push(r),v.push(s),m.push(s.className))}y=d.length}function s(e){for(var n=0;y>n;n++)if(d[n]==e){g=n,m[n]=m[n]+" bj2014",v[n].className=m[n];break}}function a(e,n){return n?function(){this.className=g===e?m[e].replace("bj2014","on2014"):m[e]+" on2014"}:function(){this.className=m[e]}}function o(e){var t,s,a,o,c=r(e,n,"div",!0)[0];if(c)for(t=c.children||c.childNodes,s=0,a=t.length,o=[];a>s;s++)1==t[s].nodeType&&o.push(t[s]);return o}function r(e,t,s,a){if(n.getElementsByClassName)return n.getElementsByClassName(e);var o=[],r=t.getElementsByTagName(s),c=0,i=r.length;e=e.replace(/\-/g,"\\-");for(var u=new RegExp("(^|\\s)"+e+"(\\s|$)");i>c&&(!u.test(r[c].className)||(o.push(r[c]),!a));)c++;return o}function c(){if(f=o("city20141104hd")){l=f.length;for(var e=0;l>e;e++){var t=f[e];t.onmouseover=i(e),t.onmouseout=i(e)}h=r("city20141104nr",n,"div")}}function i(e){return function(){u(e)}}function u(e){for(var n=0;l>n;n++)h[n].style.display="none",f[n].className=p;h[e].style.display="block",f[e].className=N}var l,f,h,m=[],v=[],g=-1,d=[],y=0,N="city1",p="city2";t(),c(),e.PublicNav={select:s,changeTab:u}}(window,document);

(function(){
    var bp = document.createElement('script');
    var curProtocol = window.location.protocol.split(':')[0];
    if (curProtocol === 'https') {
        bp.src = 'https://zz.bdstatic.com/linksubmit/push.js';        
    }
    else {
        bp.src = 'http://push.zhanzhang.baidu.com/push.js';
    }
    var s = document.getElementsByTagName("script")[0];
    s.parentNode.insertBefore(bp, s);
})();

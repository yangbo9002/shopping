<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
	<script src='//g.alicdn.com/??kissy/k/6.2.4/seed-min.js,tbc/global/0.0.8/index-min.js,tms/tb-init/0.0.39/index-min.js'></script>
 <link rel="stylesheet" href="${pageContext.request.contextPath }/bootstrap/css/bootstrap.min.css" />  
		<script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery-3.2.0.min.js" ></script>
		<script type="text/javascript" src="${pageContext.request.contextPath }/bootstrap/js/bootstrap.min.js" ></script>
	<link rel="stylesheet" href="${pageContext.request.contextPath }/css/yemei.css" /> 
	<link rel="stylesheet" href="${pageContext.request.contextPath }/css/yang.css" /> 
	
	<style type="text/css">
		.tu{
			height: 675px;
		}
		.wei{
			float: left;
		}
		.xian{
			text-decoration:line-through ;
			text-align: right;
		}
		.sheng{
			overflow: hidden; 
      		text-overflow:ellipsis;  
      		white-space: nowrap; 
		}
		.se{
		 	font-size: 18px;
			color: red;
		}
		
	.qw{
    position:relative;
    bottom: 27px;
    left:70px;
	}
	</style>
	<script type="text/javascript">
		function dingdan(){
			if("${user}" != null && "${user}" != ""){
				location.href="${pageContext.request.contextPath }/jsp/orders.jsp";
			}else{
				location.href="${pageContext.request.contextPath }/jsp/Login.jsp";
			}
		}
		function gouwu(){
			if("${user}" != null && "${user}" != ""){
				location.href="${pageContext.request.contextPath }/jsp/carts.jsp";
			}else{
				location.href="${pageContext.request.contextPath }/jsp/Login.jsp";
			}
		}
		function dianpu(){
			if("${user}" != null && "${user}" != ""){
				location.href="${pageContext.request.contextPath }/rnfm/selectShop?usersId=${user.usersId}";
			}else{
				location.href="${pageContext.request.contextPath }/jsp/Login.jsp";
			}
		}
		function dizhi(){
			if("${user}" != null && "${user}" != ""){
				location.href="${pageContext.request.contextPath }/selectAddress";
			}else{
				location.href="${pageContext.request.contextPath }/jsp/Login.jsp";
			}
		}
		
		
		function key(){
			location.href="${pageContext.request.contextPath }/goods/queryByKey?key="+encodeURIComponent(encodeURIComponent($("#q").val(),'UTF-8'),'UTF-8'); 
		}
		function kaidian(){
			if("${user}" != null && "${user}" != ""){
				location.href="${pageContext.request.contextPath }/jsp/shopadd.jsp";
			}else{
				location.href="${pageContext.request.contextPath }/jsp/Login.jsp";
			}
		}
		
		
	</script>
</head>
<body>

<div data-spm="620129" data-moduleid="80582" data-name="tb-top" data-guid="620129" id="guid-620129" data-scene-id="0" data-scene-version="" data-hidden="" data-gitgroup="tb-mod" data-ext="" class="tb-top J_Module" tms="tb-top/0.0.4" tms-datakey="0"><link rel="stylesheet" href="//g.alicdn.com/??kg/global-util/1.0.6/index-min.css,kg/tb-nav/2.4.2/index-min.css">
<style>.footer a {display:inline !important;}</style>
<div class="site-nav site-nav-status-logout" id="J_SiteNav" data-component-config="{ &quot;cart&quot;: &quot;0.0.6&quot;,&quot;message&quot;: &quot;3.4.6&quot;,&quot;umpp&quot;: &quot;1.5.4&quot;,&quot;mini-login&quot;: &quot;6.3.8&quot;,&quot;tb-ie-updater&quot;: &quot;0.0.4&quot;,&quot;tbar&quot;: &quot;2.1.0&quot;,&quot;tb-footer&quot;: &quot;1.1.6&quot;,&quot;sidebar&quot;: &quot;1.0.10&quot; }" data-tbar="{ &quot;show&quot;:true, &quot;miniCart&quot;: &quot;2.12.2&quot;,&quot;paramsBlackList&quot;: &quot;_wt,seeyouagain1722&quot;,&quot;my_activity&quot;: &quot;https://market.m.taobao.com/apps/abs/5/38/my12?psId=58386&amp;pcPsId=58388&quot;, &quot;venueUrl&quot;: &quot;https://1212.taobao.com?wh_weex=true&amp;data_prefetch=true&amp;wx_navbar_transparent=true&quot;, &quot;helpUrl&quot;: &quot;https://consumerservice.taobao.com/online-help&quot;, &quot;validTime&quot;:{&quot;startTime&quot;: 1512057599, &quot;endTime&quot;: 1513094400}, &quot;style&quot;: {&quot;name&quot;: &quot;171212&quot;, &quot;path&quot;: &quot;kg/sidebar-style-171212/0.0.5/&quot; }, &quot;page&quot;:[],&quot;blackList&quot;:[],&quot;navDataId&quot;:{&quot;tceSid&quot;:1182567,&quot;tceVid&quot;:0},&quot;pluginVersion&quot;:{ &quot;cart&quot;:&quot;0.2.0&quot;,&quot;history&quot;:&quot;0.2.0&quot;,&quot;redpaper&quot;:&quot;0.0.8&quot;,&quot;gotop&quot;:&quot;0.2.5&quot;,&quot;help&quot;:&quot;0.2.1&quot;,&quot;ww&quot;:&quot;0.0.3&quot;,&quot;pagenav&quot;:&quot;0.0.27&quot;,&quot;myasset&quot;:&quot;0.0.9&quot;,&quot;my1212&quot;:&quot;0.0.1&quot;,&quot;my1111&quot;:&quot;0.2.2&quot;}}">
<div class="site-nav-bd" id="J_SiteNavBd">
<ul class="site-nav-bd-l" id="J_SiteNavBdL" data-spm-ab="1">
<li class="site-nav-menu site-nav-login" id="J_SiteNavLogin" data-name="login" data-spm="754894437"><div class="site-nav-menu-hd">  <div class="site-nav-sign">    

<c:if test="${empty user }">
<a href="${pageContext.request.contextPath }/jsp/Login.jsp" target="_top" class="h">亲，请登录</a>    <a href="${pageContext.request.contextPath }/jsp/zhuc.jsp" target="_top">免费注册</a> 
</c:if>

<c:if test="${!empty user }">
<span>${user.userName } <a class="btn" href="${pageContext.request.contextPath }/user/zhuxiao">注销登录</a></span>
</c:if>

 </div>  
 
 <div class="site-nav-user">    <a href="" target="_top" class="site-nav-login-info-nick "></a>    <span class="site-nav-arrow"><span class="site-nav-icon"></span></span>  </div></div><div class="site-nav-menu-bd" id="J_SiteNavLoginPanel"></div></li>




<li id="J_Tmsg" class="site-nav-tmsg tmsg site-nav-multi-menu J_MultiMenu" data-name="tmsg" data-spm="1997563201">
<div class="J_Menu site-nav-menu">
<div class="site-nav-menu-hd J_Tmsg_Basic tmsg_basic">
<span class="J_Tmsg_Logo tmsg_logo_area" style="zoom:1;">
<span class="J_Tmsg_Logo_Loading tmsg_logo_loading"></span>
<span class="J_Tmsg_Logo_Icon tmsg_logo_icon site-nav-icon" style="display:none"></span>
<span class="J_Tmsg_Logo_Text tmsg_logo_text">消息</span>
<span class="J_Tmsg_Logo_Unread tmsg_logo_unread"></span>
</span>
<span class="site-nav-arrow"><span class="site-nav-icon"></span></span>
</div>
<div class="site-nav-menu-bd">
<div class="J_Tmsg_Panel_Apps tmsg_panel_apps"></div>
</div>
</div>
<div class="J_Tmsg_Panels tmsg_panels">
<div class="J_Tmsg_Panel_Detail tmsg_panel_detail"></div>
<div class="J_Tmsg_Panel_history tmsg_panel_history"></div>
<div class="J_Tmsg_Panel_Strong tmsg_panel_strong"></div>
<div class="J_Tmsg_Panel_Setting tmsg_panel_setting"></div>
</div>
</li>
<!-- <li class="site-nav-menu site-nav-mobile" id="J_SiteNavMobile" data-name="mobile" data-spm="1997563273">
<div class="site-nav-menu-hd">
<a href="//www.taobao.com/m" target="_top">
<span>手机逛淘宝</span>
</a>
</div>
</li> -->
<li class="site-nav-menu site-nav-weekend site-nav-multi-menu J_MultiMenu" id="J_SiteNavWeekend" data-name="weekend" data-spm="201711111212">
</li>
</ul>
<ul class="site-nav-bd-r" id="J_SiteNavBdR" data-spm-ab="2">
<li class="site-nav-menu site-nav-home" id="J_SiteNavHome" data-name="home" data-spm="1581860521">
<div class="site-nav-menu-hd">
<a href="${pageContext.request.contextPath }/index.jsp" target="_top">
<span>淘宝网首页</span>
</a>
</div>
</li>
<li class="site-nav-menu site-nav-mytaobao site-nav-multi-menu J_MultiMenu" id="J_SiteNavMytaobao" data-name="mytaobao" data-spm="1997525045">
<div class="site-nav-menu-hd">
<a href="#" onclick="dingdan();" target="_top">
<span>我的订单</span>
</a>
<span class="site-nav-arrow"><span class="site-nav-icon"></span></span>
</div>
<div class="site-nav-menu-bd site-nav-menu-list">
<div class="site-nav-menu-bd-panel menu-bd-panel">
<a href="" target="_top">已买到的宝贝</a>
<a href="jsp/order.jsp" target="_top">我的订单</a>
</div>
</div>
</li>
<li class="site-nav-menu site-nav-cart site-nav-menu-empty site-nav-multi-menu J_MultiMenu mini-cart menu" id="J_MiniCart" data-name="cart" data-spm="1997525049">
<div class="site-nav-menu-hd">
<a href="#" onclick="gouwu();" target="_top" id="mc-menu-hd">
<span class="site-nav-icon site-nav-icon-highlight"></span>
<span>购物车</span>
<strong class="h" id="J_MiniCartNum">0</strong>
</a>
<span class="site-nav-arrow"><span class="site-nav-icon"></span></span>
</div>
<div class="site-nav-menu-bd">
<div class="site-nav-menu-bd-panel menu-bd-panel mini-cart-ready"><div class="mini-cart-ft"><p>您购物车里还没有任何宝贝。<a target="_top" href="//cart.taobao.com/my_cart.htm?from=mini&amp;ad_id=&amp;am_id=&amp;cm_id=&amp;pm_id=150042785330be233161" class="site-nav-btn">查看我的购物车</a></p></div></div>
</div>
</li>
<li class="site-nav-menu site-nav-favor site-nav-multi-menu J_MultiMenu" id="J_SiteNavFavor" data-name="favor" data-spm="1997525053">
<div class="site-nav-menu-hd">
<a href="#" onclick="dizhi();" target="_top">
<span class="site-nav-icon"></span>
<span>我的收货地址</span>
</a>
<span class="site-nav-arrow"><span class="site-nav-icon"></span></span>
</div>
<div class="site-nav-menu-bd site-nav-menu-list">
<div class="site-nav-menu-bd-panel menu-bd-panel">
<a href="" target="_top">收藏的宝贝</a>
<a href="" target="_top">收藏的店铺</a>
</div>
</div>
</li>
<li class="site-nav-menu site-nav-catalog" id="w" data-name="catalog" data-spm="1997563209">
<div class="site-nav-menu-hd">
<a href="${pageContext.request.contextPath }/goods/queryCation" target="_top">
<span>商品分类</span>
</a>
</div>
</li>
<li class="site-nav-pipe">|</li>
<li class="site-nav-menu site-nav-seller site-nav-multi-menu J_MultiMenu" id="J_SiteNavSeller" data-name="seller" data-spm="1997525073">
<div class="site-nav-menu-hd">
<a href="#" onclick="dianpu();" target="_top">
<span>我的店铺</span>
</a>
<span class="site-nav-arrow"><span class="site-nav-icon"></span></span>
</div>
<div class="site-nav-menu-bd site-nav-menu-list">
<div class="site-nav-menu-bd-panel menu-bd-panel">
<a href="" target="_top">免费开店</a>
<a href="" target="_top">已卖出的宝贝</a>
<a href="" target="_top">出售中的宝贝</a>
<a href="" target="_top">卖家服务市场</a>
<a href="" target="_top">卖家培训中心</a>
<a href="" target="_top">体检中心</a>
<a href="" target="_top">问商友</a>
</div>
</div>
</li>
<li class="site-nav-menu site-nav-service site-nav-multi-menu J_MultiMenu" id="J_SiteNavService" data-name="service" data-spm="754895749">
<div class="site-nav-menu-hd">
<a href="#" target="_top" onclick="kaidian();">
<span>开店</span>
</a>
<span class="site-nav-arrow"><span class="site-nav-icon"></span></span>
</div>
<div class="site-nav-menu-bd site-nav-menu-list">
<div class="site-nav-menu-bd-panel menu-bd-panel">
<a href="" target="_top">消费者客服</a>
<a href="" target="_top">卖家客服</a>
</div>
</div>
</li>

</ul>
</div>
</div>

<script src="//g.alicdn.com/??kg/global-util/1.0.5/index-min.js,tb/tracker/4.0.1/p/index/index.js,kg/tb-nav/2.5.3/index-min.js"></script><!-- 
<script>if (window.KISSY && /^1\.4/.test(KISSY.version)) {KISSY.config({modules:{'flash':{alias:['gallery/flash/1.0/']}}});}KISSY.use('kg/global-util/1.0.5/',{sync:true});KISSY.config({modules: {'kg/tb-nav':{alias:'kg/tb-nav/2.5.3/',requires:['kg/global-util/1.0.5/']}}});KISSY.ready(function(){KISSY.use('kg/tb-nav')});</script> -->
</div>
<div data-spm="249291" data-moduleid="72085" data-name="ems-rgn" data-guid="249291" id="guid-249291" data-scene-id="268158" data-scene-version="0" data-hidden="" data-gitgroup="tb-mod" data-ext="" class="ems-rgn J_Module" tms="ems-rgn/0.0.13" tms-datakey="268158"><div class="module-wrap J_tb_lazyload">

<style>
  .skin-default .market-nav-ext{border-color:#eb5386}.skin-default .market-nav-ext dt{color:#f56293}.skin-default .market-nav-ext dt a{color:#f56293}.skin-default .market-nav-ext .ext-hot{color:#f56293}.skin-default .nav .sm-cat-list .fix-box{background-color:#f56293}.skin-default .nav .sm-cat-list.current .box-fixed .current{background-color:#f56293}.skin-default .nav .sm-cat-list .sm-cat-list-main dl{border-color:#f56293}.skin-default .nav .sm-cat-list .sm-cat-list-main dl:hover{border-color:#eb5386;background-color:#eb5386}.skin-default .nav .sm-cat-list .sm-cat-list-main .hover{border-color:#eb5386}.skin-default .nav .sm-cat-list .sm-cat-list-main .hover:hover{border-color:#eb5386;background-color:#FFF}.skin-default .nav .sm-cat-list .sm-cat-list-main .hover .current{background-color:#FFF}.skin-default .nav .sm-cat-list .sm-cat-list-main .hover .current a{color:#f56293}.skin-default .nav .sm-cat-list .sm-cat-list-main .hover dt a{color:#f56293}.skin-default .nav .sm-cat-list .sm-cat-list-main .hover dt .cat-title{color:#f56293}.skin-default .nav .sm-cat-list .sm-cat-list-main .current a{color:#eb5386}.skin-default .nav .sm-item-list{border-bottom-color:#f56293}.skin-default .nav .search-wrap a.local,.skin-default .nav .search-wrap a.local:hover{background:#f56293}.skin-default .nav .main-list li a:hover{_background:#f56293}.skin-default .nav .main-list li a.current,.skin-default .nav .main-list li a.hl{background:#f56293}.skin-default .nav .main-list li b{background:#f56293}.skin-default .nav .opt-drop{border-color:#f56293}.skin-default .nav .input-wrap.active,.skin-default .nav .input-wrap.hl{border-color:#f56293}.skin-default .nav .menu-button a.current,.skin-default .nav .menu-button b{background:#f56293}.skin-default .nav .menu-button a:hover{_background:#f56293}
</style>




<div id="sm-nav-2014" class="skin-default module-wrap J_Dynamic sm-nav-2014">
<div class="head clearfix">
<div class="market-wrap">
<div class="clearfix">
<div class="logo">
<a href=""><img src="//img.alicdn.com/tps/i4/T1AlHkFPNdXXaCwpjX.png" data-retina="//img.alicdn.com/tps/i3/T1VBb7FT0cXXaCwpjX.png" alt="淘宝女装" height="45"></a>
</div>
<div class="more-button" style="display: none;">
<div class="more-label"><span>更多市场</span><b class="theme-bd-t-level2"></b></div>
<div class="more-content"></div>
</div>


<div class="search" data-spm-anchor-id="a217f.8051907.249291.i1.28b63308YXQs53">
<form action="foo" accept-charset="gbk" class="market-search" method="GET">
<div class="search-wrap">
<div class="input-wrap" data-spm-anchor-id="a217f.8051907.249291.i2.28b63308YXQs53">
<div class="opt">
<span data-type="item" data-action="//s.taobao.com/list?seller_type=taobao&amp;style=grid" data-allaction="//s.taobao.com/search" data-target="" data-cat="16">宝贝</span>
<b class="icon"></b>
<div class="opt-drop theme-bd-level2" style="display: none;">
<ul>

</ul>
</div>
</div>
<div class="search-combobox" id="ks-component314" aria-pressed="false"><div class="qw"><input type="text" id="q" class="search-combobox-input" name="q" aria-haspopup="true" aria-combobox="list" role="combobox" autocomplete="off" x-webkit-grammar="builtin:translate" aria-label="请输入搜索文字" tabindex="0"></div></div>
</div>
<a class="local no-bg" href="#" title="" onclick="key();">搜女装</a>
<a class="global" href="#" title="搜全站" onclick="key();">搜全站</a>
</div>
</form>
</div>


</div>
</div>
</div>

<div class="nav">
<div class="sm-item-list theme-bd-b-level2 clearfix">
<div class="market-wrap list-wrap">
<ul class="main-list hl-list">
<li>
<a href="#" class="list-index" data-tag="index">首页
<span class="icon">&#x3473;</span>
</a>
</li>
</ul>
</div>
</div>
<div class="sm-cat-list theme-bg-level2 theme-bd-level2 theme-color-level2 clearfix ">
<div class="fix-box theme-bg-level2 theme-bd-level2">
<div class="market-wrap clearfix market-ext-wrap" style="">
<div class="market-nav-ext theme-bd-level2" data-open="">
<div class="bd-fix"></div>
<div class="old-cat">
</div>
<div class="ext-wrap A">
</div>
</div>
</div>
<div data-spm-ab="static" class="market-wrap clearfix sm-cat-list-main">
          <c:forEach items="${classification }" var="cation">
          	 <dl class="theme-bd-level2" data-ext-img="">
            
            
            <dt class="clearfix">

            <span class="cat-title 1st" data-tag="">
              
              <a href="${pageContext.request.contextPath }/goods/queryCation?cid=${cation.cid }">${cation.cname }</a>
              
            </span>
            <span class="lala">&#xe60e;</span>
            </dt>
            
            <c:forEach items="${cation.cation }" var="ca">
            	<dd class="cat-title 2rd" data-tag="">
            
            <a href="${pageContext.request.contextPath }/goods/queryCation?cid=${ca.cid }">${ca.cname }</a></dd>
            </c:forEach>
            
            
            
            
          </dl>
          
          </c:forEach>

         
        </div>
</div>
</div>
</div>
</div>
<script>
  (function(S){
    S.ready(function(){
      S.use('sm-nav-2014',function(S,Mod){
        new Mod('','#sm-nav-2014');
      });
    })
  })(KISSY)
</script>
<script src="//g.alicdn.com/tb-mod/sm-nav-2014/0.0.38/index.js"></script>
</div>
</div>
<script src="//g.alicdn.com/tb-mod/??tb-top/0.0.4/index.js,ems-rgn/0.0.13/index.js"></script>
	
	
<div id="myCarousel" class="carousel slide">
	<!-- 轮播（Carousel）指标 -->
	<ol class="carousel-indicators">
		<li data-target="#myCarousel" data-slide-to="0" class="active"></li>
		<li data-target="#myCarousel" data-slide-to="1"></li>
		<li data-target="#myCarousel" data-slide-to="2"></li>
	</ol>   
	<!-- 轮播（Carousel）项目 -->
	<div class="carousel-inner">
		<div class="item active tu">
			<img src="/images/TB1IZ4ZfgaTBuNjSszfSutgfpXa.jpg_720x720Q70.jpg" alt="First slide" width="100%" height="100%">
		</div>
		
		<div class="item tu">
			<img class="wei" src="/images/TB2spXHbaSWBuNjSsrbXXa0mVXa_!!201512228.jpg" alt="Second slide" width="50%" height="100%">
			<img class="wei" src="/images/TB2xQlPbkCWBuNjy0FaXXXUlXXa_!!201512228.jpg" alt="Second slide" width="50%" height="100%">
			
		</div>
		<div class="item tu">
			<img src="/images/TB2xQlPbkCWBuNjy0FaXXXUlXXa_!!201512228.jpg" alt="Second slide" width="100%" height="100%">
		</div>
	</div>
	<!-- 轮播（Carousel）导航 -->
	<a class="left carousel-control" href="#myCarousel" role="button" data-slide="prev">
		<span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
		<span class="sr-only">Previous</span>
	</a>
	<a class="right carousel-control" href="#myCarousel" role="button" data-slide="next">
		<span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
		<span class="sr-only">Next</span>
	</a>
</div> 
	<br/>
	<div  class="container">
	
	<div class="panel panel-success">
  <div class="panel-heading">
    <h3 class="panel-title">销量最好</h3>
  </div>
  <div class="panel-body row">
  	<c:forEach items="${goods }" var="good">
  		<div class="col-lg-2">
    	<a href="${pageContext.request.contextPath }/shop/GoodId?goodsId=${good.goodsId }"><img src="${good.goodsImg }" width="165" height="240"></a>
    	<div class="sheng"><a href="${pageContext.request.contextPath }/shop/GoodId?goodsId=${good.goodsId }">${good.goodsInfo }</a></div>
    	<span class="se">￥ ${good.shopPrice }</span> &nbsp; &nbsp;<span class="xian">${good.marketPrice }</span>
    
    	</div>
  	</c:forEach>
    
    
  </div>
</div>
	
	
</div>
</body>
</html>
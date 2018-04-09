<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
    
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
        <script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery-3.2.0.min.js"></script>
 		<link rel="stylesheet" href="${pageContext.request.contextPath }/js/bootstarp-3.3.7/css/bootstrap.min.css" />    		
		<script type="text/javascript" src="${pageContext.request.contextPath }/js/bootstarp-3.3.7/js/bootstrap.min.js" ></script>		   
		<script src='//g.alicdn.com/??kissy/k/6.2.4/seed-min.js,tbc/global/0.0.8/index-min.js,tms/tb-init/0.0.39/index-min.js'></script>
		
       <link rel="stylesheet" href="../css/yemei.css" /> 
	<link rel="stylesheet" href="../css/yang.css" /> 
	
	
  <style type="text/css">
   .goods{
	background-color: #FCFCFC;
	border:1px solid;
	border-color:#e6e6e6;
	
} 
.qw{
    position:relative;
    bottom: 27px;
    left:70px;
	}

  .inputw{
	width:40px;
	text-align:center;
}

  .divs{
	float:right 
}
  
  .wrap-line {
    clear: both;
    background: #e6e6e6;
    height: 2px;
   /*  //position: relative; */
}



.em {
    background-color: #E5E5E5;
    height:65px;
    text-align:center;
	line-height:59px;    
	font-size:15px;
}

.em1 {
      width:80px; 
      font-size:30px;
      color:#FFFFFF;
}
  
  .tb{
  		color: #FF5200;
  		font-family:  KaiTi;
  		font-weight:bold ;
  		font-size:50px;
  } 
    
    .jg{
  		color: #FF5200;
  		font-family:  KaiTi;
  		 font-weight:bold ;
  		/* //font-size:20px;  */
  }
    .span{
    	font-size:20px;
   		font-family:  SimHei;
  		font-weight:bold ;
    	color: #34343A;
    }  
    
    .hj{
    	color: #FF5200;
    } 
    
      .sh{
			width: 40px;
			height: 60px;
		}
 </style>
 
 
<script type="text/javascript">
 $(function(){
	$.ajax({
		url:"${pageContext.request.contextPath}/shopcartsr/selectCarte?usersId=1",
		dataType:"json",
		success:function(data){
			for(i=0;i<data.length;i++){
				
				$("#d2").append("<br><div><div class='row'><div class='col-md-12 col-lg-12'>&nbsp;&nbsp;&nbsp;<input type='checkbox' "
						+"name='chec_name' id='chekss' value='"+data[i][0].shopId+"' onclick='chen()'>店铺:"+data[i][0].shopName+"<div class='goods' id='dd"+i+"'></div></div></div></div>");
				for(j=0;j<data[i].length;j++){
					
				    $("#dd"+i).append("</br><div class='row td-inner'><div class='col-lg-1 col-md-1 '><input type='checkbox'"
						 +" name='cartgoodId_checkbox' class='divs' id='cartgoodId' value='"+data[i][j].goodsId+"'/></div><div class='col-lg-5 col-md-5'>"
						 +"<span class='sh'><img src='"+data[i][j].goodsImg+"'width='40' height='60'/></span>&nbsp;&nbsp;<span class='sh'>"+data[i][j].goodsInfo+"</span>&nbsp;&nbsp;"+data[i][j].attrName+"&nbsp;&nbsp;"+data[i][j].attrVal+"</div>"
				         +"<div class='col-lg-1 col-md-1'>￥"+data[i][j].shopPrice+"</div>"
				         +"<div class='col-lg-2 col-md-2'><div><input  type='button'value='-' disabled='disabled' id='bu-'><input type='text' id='inputnum' readonly='readonly' class='inputw' value='"+data[i][j].cartNum+"'/><input type='button'value='+' id='bu+' onclick='butt()'></div></div>"
				         +"<div class='col-lg-1 col-md-1'>"+data[i][j].shopPriceNum+"</div>"
				         +"<div class='col-lg-2 col-md-2'><a onclick='show("+data[i][j].goodsName+")'>添加到收藏夹</a><br>"
				         +"<a href='${pageContext.request.contextPath}/shopcartsr/deleteCarts?goodsId="+data[i][j].goodsId+"'>删除</a> </div></div></br>");
				   			
				}
			}
		}
	});
		
	 
 });
 
 
function butt(){
	
 var num = document.getElementById("inputnum").value

 
}

//全选
function ckAll(){
    var flag=document.getElementById("chackid").checked;
    var cks=document.getElementsByName("chec_name");
   // console.log(cks[1]);
    var ckss=document.getElementsByName("cartgoodId_checkbox");
    for(var i=0;i<=cks.length;i++){
        cks[i].checked=flag;
         for(var j=0;j<ckss.length;j++){
        	ckss[j].checked=flag;
        } 
    }
}
 
  function chen(){
	  var cartgoodId_checkbox="";
	 $("#chekss").click(function(){		
		 document.write(cartgoodId_checkbox);
		 $("input[type=checkbox][name='cartgoodId_checkbox']checkbox:checked").each(function(){
			 cartgoodId_checkbox +=$(this).val();
		 })	
		 document.write(cartgoodId_checkbox);
	 })
 } 

	
   
	 

  

	


 

</script>
       
</head>
<body>
<div class="container">
<div>

<div data-spm="620129" data-moduleid="80582" data-name="tb-top" data-guid="620129" id="guid-620129" data-scene-id="0" data-scene-version="" data-hidden="" data-gitgroup="tb-mod" data-ext="" class="tb-top J_Module" tms="tb-top/0.0.4" tms-datakey="0"><link rel="stylesheet" href="//g.alicdn.com/??kg/global-util/1.0.6/index-min.css,kg/tb-nav/2.4.2/index-min.css">
<style>.footer a {display:inline !important;}</style>
<div class="site-nav site-nav-status-logout" id="J_SiteNav" data-component-config="{ &quot;cart&quot;: &quot;0.0.6&quot;,&quot;message&quot;: &quot;3.4.6&quot;,&quot;umpp&quot;: &quot;1.5.4&quot;,&quot;mini-login&quot;: &quot;6.3.8&quot;,&quot;tb-ie-updater&quot;: &quot;0.0.4&quot;,&quot;tbar&quot;: &quot;2.1.0&quot;,&quot;tb-footer&quot;: &quot;1.1.6&quot;,&quot;sidebar&quot;: &quot;1.0.10&quot; }" data-tbar="{ &quot;show&quot;:true, &quot;miniCart&quot;: &quot;2.12.2&quot;,&quot;paramsBlackList&quot;: &quot;_wt,seeyouagain1722&quot;,&quot;my_activity&quot;: &quot;https://market.m.taobao.com/apps/abs/5/38/my12?psId=58386&amp;pcPsId=58388&quot;, &quot;venueUrl&quot;: &quot;https://1212.taobao.com?wh_weex=true&amp;data_prefetch=true&amp;wx_navbar_transparent=true&quot;, &quot;helpUrl&quot;: &quot;https://consumerservice.taobao.com/online-help&quot;, &quot;validTime&quot;:{&quot;startTime&quot;: 1512057599, &quot;endTime&quot;: 1513094400}, &quot;style&quot;: {&quot;name&quot;: &quot;171212&quot;, &quot;path&quot;: &quot;kg/sidebar-style-171212/0.0.5/&quot; }, &quot;page&quot;:[],&quot;blackList&quot;:[],&quot;navDataId&quot;:{&quot;tceSid&quot;:1182567,&quot;tceVid&quot;:0},&quot;pluginVersion&quot;:{ &quot;cart&quot;:&quot;0.2.0&quot;,&quot;history&quot;:&quot;0.2.0&quot;,&quot;redpaper&quot;:&quot;0.0.8&quot;,&quot;gotop&quot;:&quot;0.2.5&quot;,&quot;help&quot;:&quot;0.2.1&quot;,&quot;ww&quot;:&quot;0.0.3&quot;,&quot;pagenav&quot;:&quot;0.0.27&quot;,&quot;myasset&quot;:&quot;0.0.9&quot;,&quot;my1212&quot;:&quot;0.0.1&quot;,&quot;my1111&quot;:&quot;0.2.2&quot;}}">
<div class="site-nav-bd" id="J_SiteNavBd">
<ul class="site-nav-bd-l" id="J_SiteNavBdL" data-spm-ab="1">
<li class="site-nav-menu site-nav-login" id="J_SiteNavLogin" data-name="login" data-spm="754894437"><div class="site-nav-menu-hd">  <div class="site-nav-sign">    


<c:if test="${empty user }">
<a href="${pageContext.request.contextPath }/jsp/Login.jsp" target="_top" class="h">亲，请登录</a>    <a href="" target="_top">免费注册</a> 
</c:if>

<c:if test="${!empty user }">
<span>${user.userName }</span>
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
<a href="${pageContext.request.contextPath }/jsp/orders.jsp" target="_top">
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
<a href="${pageContext.request.contextPath }/jsp/carts.jsp" target="_top" id="mc-menu-hd">
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
<a href="" target="_top">
<span class="site-nav-icon"></span>
<span>收藏夹</span>
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
<a href="" target="_top">
<span>卖家中心</span>
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
<a href="" target="_top">
<span>联系客服</span>
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
<li><a href=""><span data-type="shop" data-shop="yes" data-action="//s.taobao.com/search" data-target="//s.taobao.com/search" data-cat="">店铺</span></a></li>
</ul>
</div>
</div>
<div class="search-combobox" id="ks-component314" aria-pressed="false"><div class="qw"><input type="text" id="q" class="search-combobox-input" name="q" aria-haspopup="true" aria-combobox="list" role="combobox" autocomplete="off" x-webkit-grammar="builtin:translate" aria-label="请输入搜索文字" tabindex="0"></div></div>
</div>
<a class="local no-bg" href="" title="">搜女装</a>
<a class="global" href="" title="搜全站">搜全站</a>
</div>
</form>
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
	





	<div class="td-inner">&nbsp;</div>
	
<div id="d1" class="container">
		<div class="row">
					
		<div class="col-lg-12 col-md-12 td-inner" id="d2">		 
		<div class="row">
		<div class="col-lg-2 col-md-2" id="w1">&nbsp;&nbsp;&nbsp;<input type="checkbox" id="chackid" onclick="ckAll()">全选</div>
		<div class="col-lg-4 col-md-4" id="w2">商品信息</div>
		<div class="col-lg-1 col-md-1" id="w3">单价</div>
		<div class="col-lg-2 col-md-2" id="w4">数量</div>
		<div class="col-lg-1 col-md-1" id="w5">金额</div>
		<div class="col-lg-2 col-md-2" id="w6">操作</div>
		</div>			
		</div>
		<div class="col-lg-1 col-md-1" id="d3"></div>		
		</div>				
</div>	

<div class="td-inner">&nbsp;</div>

<div class="container">
<div class="row">
	<div class="col-lg-1 col-md-1"></div>
	<div class="col-lg-10 col-md-10 em">
		<div>
			<div class="row">		
	<div class="col-lg-2 col-md-2">&nbsp;&nbsp;&nbsp;<input type="checkbox" align="right">&nbsp;&nbsp;&nbsp;全选</div>	
	<div class="col-lg-3 col-md-3"><a href="">删除</a>&nbsp;&nbsp;&nbsp;<a href="">移入收藏夹</a></div>
	<div class="col-lg-2 col-md-2"><a href="">上一页</a>&nbsp;&nbsp;&nbsp;<a href="">下一页</a></div>	
	<div class="col-lg-3 col-md-3">已选入多少件商品</div>	
	<div class="col-lg-2 col-md-2 jg">0.00&nbsp;&nbsp;&nbsp;<a href="#" class="em1">结账</a></div>
	</div>
		</div>
	</div>
	<div class="col-lg-1 col-md-1"> </div>
</div></div>

   		 	
 </div>

</div>
<div class="td-inner">&nbsp;</div>

<div class="td-inner">&nbsp;</div>

<div class="td-inner">&nbsp;</div>









<div class="td-inner">&nbsp;</div>
<div class="td-inner">&nbsp;</div>
</body>
</html>
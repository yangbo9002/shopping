<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
    
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
        <script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery.min.js"></script>
 		<link rel="stylesheet" href="${pageContext.request.contextPath }/js/bootstarp-3.3.7/css/bootstrap.min.css" />    
		<script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery-3.2.0.min.js" ></script>			
		<script type="text/javascript" src="${pageContext.request.contextPath }/js/bootstarp-3.3.7/js/bootstrap.min.js" ></script>		
		<script type="text/javascript" src="${pageContext.request.contextPath }/js/bootstarp-table-1.11.1/bootstrap-table.min.js" ></script>
		<script type="text/javascript" src="${pageContext.request.contextPath }/js/bootstarp-table-1.11.1/bootstrap-table-zh-CN.min.js" ></script>      
		
       
  <style type="text/css">
       .wrap-line {
    clear: both;
    background: #e6e6e6;
    height: 2px;
    position: relative;
}

.switch-cart .current a em {
    color: #f40;
}


       
 </style>
       
</head>
<body>
<div class="container">
<div>
	<div class="td-inner">&nbsp;</div>
	<div class="row">
		<div class="col-md-12">	
		<div class="header tb-header" id="J_Header">
    <h1 class="cart-logo" id="logo">  <a title="淘宝网 Taobao.com - 阿里巴巴旗下网站" href="" target="_top">淘宝网<span></span></a></h1>
          </div>
          <div class="td-inner">&nbsp;</div>
   </div>
	</div>
	
	
	<div class="row">
  <div class="col-md-12">
  	<a href="" ><em>全部商品</em></a>
  </div>
  
  <div class="wrap-line"><div class="floater" style="width: 132px; left: -1px;"></div></div>
  
</div>
<div class="td-inner">&nbsp;</div>
<div class="row">
		<div class="col-md-1">				
			<input   type="checkbox">&nbsp;全选
		</div>
		<div class="col-md-4"><div class="td-inner">商品信息</div>	</div>
		<div class="col-md-3">	<div class="td-inner">&nbsp;</div></div>
		<div class="col-md-1">单价</div>
		<div class="col-md-1">数量</div>
		<div class="col-md-1">金额</div>
		<div class="col-md-1">操作</div>
	</div>
	<div class="td-inner">&nbsp;</div>
   		<div class="row">
  <div class="col-md-12">
  	<input   type="checkbox" >&nbsp;店铺:
  </div> 
</div>

<table class="table table-bordered">
   	<c:forEach items="${list }" var="l"> 
   		<tr>
   	  <td align="center"><input   type="checkbox"></td>
      <td>${l.cartId }</td>
      <td>${l.good.goodsName }</td>
      <td>${l.cartNum }</td>
      <td>${l.attr.attrName }</td>
      <td>${l.attrVal.attrVal }</td>
      <td>${l.user.userName }</td>
      <td align="right">
      	<a href="#">移入收藏夹</a><br>
      	<a href="#">删除</a>
      </td>
    </tr>  	
   	</c:forEach>  
   </table> 
 </div>
</div>
</body>
</html>
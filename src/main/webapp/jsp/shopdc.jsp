<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
 <script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery.min.js"></script>       
 		<link rel="stylesheet" href="${pageContext.request.contextPath }/js/bootstarp-3.3.7/css/bootstrap.min.css" />   						
		<script type="text/javascript" src="${pageContext.request.contextPath }/js/bootstarp-3.3.7/js/bootstrap.min.js" ></script>		
		
		<style type="text/css">
			.bb{
				width: 100%;
				height: 45px;
				color: fuchsia;
				font-size:30px;
				font-family:微软雅黑;
				background-color: blue;
			}
		
		
		</style>
</head>


<body>
		<div id="myCarousel" class="carousel slide">
	<!-- 轮播（Carousel）指标 -->
	<ol class="carousel-indicators">
		<li data-target="#myCarousel" data-slide-to="0" class="active"></li>
		<li data-target="#myCarousel" data-slide-to="1"></li>
		<li data-target="#myCarousel" data-slide-to="2"></li>
	</ol>   
	<!-- 轮播（Carousel）项目 -->
	<div class="carousel-inner">
		<div class="item active">
			<img src="${pageContext.request.contextPath }/imgege/1.jpg">
		</div>
		<div class="item">
			<img src="${pageContext.request.contextPath }/imgege/2.jpg">
			
		</div>
		<div class="item">
			<img src="${pageContext.request.contextPath }/imgege/3.jpg">
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

<div class="bb">寶貝推薦</div>	
 	<div class="row">
 	 	<c:forEach items="${selsctShop}" var="s">
 	 		<div class="col-lg-3 col-md-3 col-sm-3">
 	 			<a href="${pageContext.request.contextPath }/shop/GoodId">
 				<img src="${pageContext.request.contextPath }/${s.goodsImg}"></a><br>
 				<a href="${pageContext.request.contextPath }/shop/GoodId">${s.goodsName}</a><br>
 				${s.shopPrice}<br>
 				${s.goodsStock}
 	 		</div>
 	 	</c:forEach>
 	 </div>
 	 	
 		

 	

</body>
</html>
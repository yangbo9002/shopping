<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel = "stylesheet" href="../js/bootstrap/css/bootstrap.min.css">
   <script type="text/javascript" src="../js/jquery-3.0.0.js"> </script>
   <script type ="text/javascript" src="../js/bootstrap/js/bootstrap.min.js"></script>
   <link rel="stylesheet"  href="../js/bootstrap-table/bootstrap-table.min.css">
   <script type ="text/javascript" src = "../js/bootstrap-table/bootstrap-table.min.js"></script>
   <script type = "text/javascript" src= "../js/bootstrap-table/bootstrap-table-zh-CN.min.js"></script>

<style type="text/css" >	
	.xian{
	display:block; 
	}
	.ying{
	display:none; 
	}
</style>

<script type="text/javascript">
	
$(function(){
	$("table").bootstrapTable({
		url:"../selectOrders",
		dataType:"json",
		idField:"ogid",
		//pagination:true,
		//sidePagination:"server",
		//pageNumber:1,
		//pageSize:5,
		//pageList:[5,10,15,20],
		queryParams:queryParams,
		columns:[{
			field:"goods.goodsImg",
			title:"商品图片",
			align:"center"
		},{
			field:"goods.goodsName",
			title:"商品介绍",
			align:"center"
		},{
			field:"goods.shopPrice",
			title:"商品价格",
			align:"center"
		},{
			field:"goodsNum",
			title:"购买数量",
			align:"center"
		}]
	});
});
	
function queryParams(params){
	return {
		/* limit:params.limit,
		offset:params.offset, */
		key:$("#ca").val()
	};
}
	
	function daifu(){
		$("#ca").val("1");
		$("table").bootstrapTable("refresh");
	}
	
	/* function show(){
		$("#tab").removeClass();
		$("#tab").addClass("ying");
		$("#tabb").removeClass();
		$("#tabb").addClass("xian");
	}
	
	function show1(){
		$("#tabb").removeClass();
		$("#tabb").addClass("ying");
		$("#tab").removeClass();
		$("#tab").addClass("xian");
	}
	
	function dfh(){
		location.href="selectDfh";
	} */
	
 

</script>

</head>
<body>
<div class="container">
<!--导航条  -->
<nav class="navbar navbar-default">
  <div class="container-fluid">
    <!-- Brand and toggle get grouped for better mobile display -->
    <div class="navbar-header">
      <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
        <span class="sr-only">Toggle navigation</span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
      </button>
      <span class="navbar-brand btn active" onclick="show1();">所有订单</span>
    </div>

    <!-- Collect the nav links, forms, and other content for toggling -->
    <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
      <ul class="nav navbar-nav">
        <li><span class="navbar-brand btn" onclick="daifu();">待付款<input type="hidden" id="ca"></span></li>
        <li><span class="navbar-brand btn" onclick="">待发货</span></li>
      	<li><span class="navbar-brand btn" onclick="">待评价</span></li>
      </ul>  
    </div><!-- /.navbar-collapse -->
  </div><!-- /.container-fluid -->
</nav>

<table></table>

	<%-- 
		<div id="tab">
	<table align="right" class="table table-bordered table-hover" style="table-layout:fixed;">
	
		<tr class="active" style="text-align: center;">
			<td>商品名称</td>
			<td>商品图片</td>
			<td>商品价格</td>
			<td>促销价格</td>
			<td>购买数量</td>
		</tr>	
		<c:forEach items="${od }" var="od">
		<tr>
			<td>${od.goods.goodsName }</td>
			<td>${od.goods.goodsImg}</td>
			<td>${od.goods.shopPrice }</td>
			<td>${od.goods.goodsTips }</td>
			<td>${od.goodsNum }</td>
		</tr>
		</c:forEach>
		
	
	</table>
	
	</div>	
	
	
	<div id="tabb" class="ying">
	<table align="right" class="table table-bordered table-hover" style="table-layout:fixed;">
	
		<tr class="active" style="text-align: center;">
			<td>商品名称</td>
			<td>商品图片</td>
			<td>商品价格</td>
			<td>促销价格</td>
			<td>购买数量</td>
		</tr>	
		<c:forEach items="${oda }" var="od">
		<tr>
			<td>${od.goods.goodsName }</td>
			<td>${od.goods.goodsImg}</td>
			<td>${od.goods.shopPrice }</td>
			<td>${od.goods.goodsTips }</td>
			<td>${od.goodsNum }</td>
		</tr>
		</c:forEach>
		
	
	</table>
	
	
	</div>
	
	<div id="tabb" class="ying">
	<table align="right" class="table table-bordered table-hover" style="table-layout:fixed;">
	
		<tr class="active" style="text-align: center;">
			<td>商品名称</td>
			<td>商品图片</td>
			<td>商品价格</td>
			<td>促销价格</td>
			<td>购买数量</td>
		</tr>	
		<c:forEach items="${oda }" var="od">
		<tr>
			<td>${od.goods.goodsName }</td>
			<td>${od.goods.goodsImg}</td>
			<td>${od.goods.shopPrice }</td>
			<td>${od.goods.goodsTips }</td>
			<td>${od.goodsNum }</td>
		</tr>
		</c:forEach>
		
	
	</table>
	
	
	</div>

 --%>
</div>
</body>
</html>
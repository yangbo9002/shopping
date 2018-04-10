<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style>
		#d2{
			width: 1100px;
			height: 800px;
			margin: 0px auto;
		}
		#t2{
			border:1px;
			solid green;
			width: 100%;
			height: 100%;
			border-collapse: collapse;
			align-content: center;
		}
		#td1{
			width: 18%;
			height: 50%;
		}
	</style>
		
</head>
<body>
<div>
			<div id="d2">
			<form action="">
			<table id="t2" >
				<tr align="left">
					<td rowspan="6" width="32%">${ssl.goodsImg }</td>
					<td>商品简介：${ssl.goodsName }</td>
					<td width="18%">店铺简介：${ssl.shop.shopLogo }</td>
				</tr>
				<tr align="left">
					<td>商品简介：${ssl.goodsName }</td>
					<td>店铺名称：${ssl.shop.shopName }</td>
				</tr>
				<tr align="left">
					
					<td>促销信息：${ssl.goodsTips }</td>
					<td>掌柜名称:${ssl.shop.user.userName }</td>
				</tr>
				<tr align="left">
					
					<td>商品属性</td>
					<td><button>收藏店铺</button>&nbsp;&nbsp;&nbsp;<button>查看店铺</button></td>
				</tr>
				<tr align="left">
					
					<td>促销价格：${ssl.shopPrice }</td>
					<td rowspan="2" ><a href="index.html"><img src="img/"></a></td>
				</tr>
				<tr align="left">
					
					<td><button type="submit">立即购买 </button>&nbsp;&nbsp;&nbsp;<button type="submit">加入购物车</button></td>
 
				</tr>			
			</table>
			</form>
			</div>
		</div>
</body>
</html>
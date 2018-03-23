<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="js/jquery.min.js"></script>
</head>
<body>
<table border="1px">
<tr>
<td colspan="6" align="center">收货地址</td>
</tr>
<tr>
<td>编号</td>
<td>收货人姓名</td>
<td>收货人电话</td>
<td>收货地址</td>
<td colspan="2" align="center">操作</td>
</tr>
<c:forEach items="${address }" var="address">
<tr>
<td>${address.addressId }</td>
<td>${address.uname }</td>
<td>${address.usersPhone }</td>
<td>${address.address }</td>
<td><button onclick="sel('${address.addressId}')">修改收货地址</button></td>
<td><button onclick="del('${address.addressId }')">删除收货地址</button></button></td>
</tr>
</c:forEach>
</table>
<a href="jsp/insertAddress.jsp">添加收货地址</a>
<script type="text/javascript">
function del(addressId){
	location.href="deleteAddress?addressId="+addressId;	
}
function sel(addressId){
	location.href="selectAddressId?addressId="+addressId;
}				  
</script>
</body>   
</html>
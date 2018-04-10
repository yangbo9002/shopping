<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel = "stylesheet" href="${pageContext.request.contextPath }/js/bootstrap/css/bootstrap.min.css">
   <script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery-3.0.0.js"> </script>
   <script type ="text/javascript" src="${pageContext.request.contextPath }/js/bootstrap/js/bootstrap.min.js"></script>
   <link rel="stylesheet"  href="${pageContext.request.contextPath }/js/bootstrap-table/bootstrap-table.min.css">
   <script type ="text/javascript" src = "${pageContext.request.contextPath }/js/bootstrap-table/bootstrap-table.min.js"></script>
   <script type = "text/javascript" src= "${pageContext.request.contextPath }/js/bootstrap-table/bootstrap-table-zh-CN.min.js"></script>
   <script type="text/javascript">
   	function showInsertModel(){
   		$("#insertModal").modal("show");
   	}
	function showUpdateModel(addressId){
		$.ajax({
			url:"selectAddressId?addressId="+addressId,
					dataType:"json",
					success:function(data){
						$("#addressId").val(data.addressId);
						$("#up_uname").val(data.uname);
						$("#up_usersPhone").val(data.usersPhone);
						$("#up_address").val(data.address);
						$("#updateAddress").modal("show");
					}
		})
   	}
   </script>
	</head>
	<body>
		<div class="container">	
			
		<dir clas="row">
			<div class="col-lg-12 col-sm-12">
	<table class="table table-bordered table-hover" style="table-layout:fixed;">
		
		<tr><td colspan="4"><button class="btn btn-success btn-info"
			onclick="showInsertModel();"><span class="glyphicon glyphicon-plus">			
		</span>添加收获地址</button></td></tr>
		
		<tr class="active" style="text-align: center;">
			<td>收货人姓名</td>
			<td>收货人电话</td>
			<td>收货人地址</td>
			<td>操作</td>
		</tr>	
		<c:forEach items="${address }" var="address">
		<tr>
		<td>${address.uname }</td>
		<td>${address.usersPhone }</td>
		<td>${address.address }</td>
		<td align="center"><button type="button" class="btn btn-success" onclick="showUpdateModel('${address.addressId}');">修改</button>	
			&nbsp;&nbsp;				<button type="button" class="btn btn-warning" onclick="del('${address.addressId}')">删除</button>
		</td>
		</tr>		
		</c:forEach>
	</table>
	</div>
	</div>	
	</div>
	
	<script type="text/javascript">
	function del(addressId){
		location.href="deleteAddress?addressId="+addressId;
	}
	
	
	</script>
	
	<div class="modal fade" id="insertModal" tabindex="-1" role="dialog"
		aria-labelledby="myModalLabel" aria-hidden="true"
		data-backdrop="false">
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal"
						aria-hidden="true">&times;</button>
					<font color="#66AFE9" size="5">添加收获地址</font>
				</div>
				<div class="modal-body">
					<form action="insertAddress" method="post" class="form-horizontal" role="form">
						
						<div class="form-group">
							<label for="" class="col-sm-3 control-label">收获人姓名:</label>
							<div class="col-sm-9">
								<input type="text" class="form-control" id="uname"
									name="uname" placeholder="请填写您的姓名" required="required">
							</div>
						</div>

						<div class="form-group">
							<label for="sex" class="col-sm-3 control-label">收获人电话:</label>
							<div class="col-sm-9">

								<input type="text" class="form-control" id="usersPhone"
									name="usersPhone" placeholder="请填写您的号码" required="required">
								</div>
							</div>
						

						<div class="form-group">
							<label for="sex" class="col-sm-3 control-label">收获地址:</label>
							<div class="col-sm-9">
								<input type="text" class="form-control" id="address"
									name="address" placeholder="请填写您的地址" required="required">
								</div>
							</div>
							
							<div style="text-align: center;" class="form-group">
								<div class="col-lg-4 col-sm-4">
										<button type="submit" class="btn btn-info btn-sm">添加</button>												
								</div>
								
								<div class="col-lg-4 col-sm-4">
										<button type="reset" class="btn btn-warning btn-sm">重新填写</button>						
						
								</div>
								
								<div class="col-lg-4 col-sm-4">
									<a href="#" class="btn btn-danger btn-sm " role="button" data-dismiss="modal">放弃添加</a>																
								</div>										
							</div>
					</form>

				</div>
				<div class="modal-footer" style="text-align: center;">
				<img src="img/2.jpg" width="30" height="30"><font color="red">以上信息信息很重要，请您认真填写!</font>	

				</div>
			</div>		
		</div>	
	</div>
	
	
	
	
	
	
	<div class="modal fade" tabindex="-1" role="dialog" id="updateAddress">
  <div class="modal-dialog" role="document">
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
        <h4 class="modal-title">修改收货地址</h4>
      </div>
      <div class="modal-body">
        <form action="updateAddress" method="post" class="form-horizontal" role="form">
						<div class="form-group">
								
								<div class="col-sm-10">
									<input type="hidden" id="addressId" name="addressId">>
								</div>
							</div>
						<div class="form-group">
							<label for="uname" class="col-sm-3 control-label" >收获人姓名:</label>
							<div class="col-sm-9">
								<input type="text" class="form-control" id="up_uname" name="uname"
									  required="required">
							</div>
						</div>

						<div class="form-group">
							<label for="usersPhone" class="col-sm-3 control-label"  >收获人电话:</label>
							<div class="col-sm-9">

								<input type="text" class="form-control" id="up_usersPhone" name="usersPhone"
									  required="required">
								</div>
							</div>
						

						<div class="form-group">
							<label for="address" class="col-sm-3 control-label" >收获地址:</label>
							<div class="col-sm-9">
								<input type="text" class="form-control"  name="address"
									 required="required" id="up_address">
								</div>
							</div>
							
							<div style="text-align: center;" class="form-group">
								<div class="col-lg-4 col-sm-4">
										<button type="submit" class="btn btn-info btn-sm">修改</button>												
								</div>
							
								
								<div class="col-lg-4 col-sm-4">
									<a href="#" class="btn btn-danger btn-sm " role="button" data-dismiss="modal">放弃修改</a>																
								</div>										
							</div>
					</form>
      </div>
      
    </div><!-- /.modal-content -->
  </div><!-- /.modal-dialog -->
</div><!-- /.modal -->
 
	
	</body>
 
</html>
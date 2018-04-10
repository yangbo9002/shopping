<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
<link rel="stylesheet" href="../css/reset.css"/>
<link rel="stylesheet" href="../css/common.css"/>
<link rel="stylesheet" href="../css/font-awesome.min.css"/>
</head>
<body>
		<div class="wrap login_wrap">
			<div class="content">
				
				<div class="logo"></div>
				
				<div class="login_box">	
					
					<div class="login_form">
						<div class="login_title">
							注册
						</div>
						<form action="${pageContext.request.contextPath}/user/zhuc" method="post" enctype="multipart/form-data">
							
							<div class="form_text_ipt">
								<input name="loginName" type="text" placeholder="不能为控" required="required" pattern="^{4，16}$">
							</div>
							<div class="ececk_warning"><span>手机号/邮箱不能为空</span></div>
							
							<div class="form_text_ipt">
							<!-- 密码只能以字母开头，长度是6-18位 -->
								<input name="loginPwd" type="password" placeholder="密码必须为英文开头长度为6-18" pattern="^[a-zA-Z]\w{5,17}$" required="required">
							</div>
							<div class="ececk_warning"><span>密码不能为空</span></div> 
							 <div class="form_text_ipt">
								<input name="payPwd" type="text" placeholder="输入的支付密码必须是6位数字" pattern="^\d{6}$"  required="required">
							</div>
							<div class="ececk_warning"><span>密码不能为空</span></div>
							
							<br/>
                        <div  style="text-align:center;">                 
                        <input type="file" name="mFile" class="form-control" >                          
                         </div> 
			
							<div class="form_btn">
								<button type="submit" onclick="javascript:window.location.href='#'">注册</button>
							</div>
							<div class="form_reg_btn">
								<span>已有帐号？</span><a href="Login.jsp">马上登录</a>
							</div>
						</form>
					
					</div>
				</div>
			</div>
		</div>
		<script type="text/javascript" src="js/jquery.min.js" ></script>
		<script type="text/javascript" src="js/common.js" ></script>
		<div style="text-align:center;">

</div>
	</body>
</html>

<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">

<title>登录界面</title>

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
							登录
						</div>
						<form action="${pageContext.request.contextPath}/user/login" method="post">
							
							<div class="form_text_ipt">
								<input name="loginName" type="text" placeholder="手机号/邮箱" required="required">
							</div>
							<div class="ececk_warning"><span>手机号/邮箱不能为空</span></div>
							<div class="form_text_ipt">
								<input name="loginPwd" type="password" placeholder="密码" required="required" >
							</div>
							<div class="ececk_warning"><span>密码不能为空</span></div>
							<div class="form_check_ipt">
								<div class="left check_left">
									<label><input name="" type="checkbox"> 下次自动登录</label>
								</div>
								<div class="right check_right">
									<a href="#">忘记密码</a>
								</div>
							</div>
							<div class="form_btn">
								<button type="submit" onclick="javascript:window.location.href='#'">登录</button>
							</div>
							<div class="form_reg_btn">
								<span>还没有帐号？</span><a href="zhuc.jsp">马上注册</a>
							</div>
						</form>
					
					</div>
				</div>
			</div>
		</div>
		<script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery.min.js" ></script>
		<script type="text/javascript" src="${pageContext.request.contextPath }/js/common.js" ></script>
		<div style="text-align:center;">

</div>
	</body>

</html>
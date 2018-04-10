<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>新开店铺</title>
    <meta http-equiv="content-type" content="text/html; charset=utf-8" />
    <meta name="Keywords" content="网站关键词">
    <meta name="Description" content="网站介绍">
    <link rel="stylesheet" href="${pageContext.request.contextPath }/css/reg.css">
</head>
<body>
	<div id="ajax-hook"></div> 
    <div class="wrap">
        <div class="wpn">
            <div class="form-data pos">
                <!--<p class="tel-warn hide"><i class="icon-warn"></i></p>-->
                <form action="${pageContext.request.contextPath }/shop/New">
                    <p class="p-input pos">
                        <label for="tel">请输入店铺名称</label>
                        <input type="text" id="tel" autocomplete="off" name="shopName">
                        <span class="tel-warn tel-err hide"><em></em><i class="icon-warn"></i></span>
                    </p>
                    <p class="p-input pos">
                    	店铺详情：
                        <textarea cols="45" rows="3" name="shopText"></textarea>
                        <span class="tel-warn tel-err hide"><em></em><i class="icon-warn"></i></span>
                    </p>
                    <br />
                <button type="submit" class="lang-btn" >开通店铺</button>
                </form>
                <p class="right">Powered by © 2018</p>
            </div>
        </div>
    </div>
    <script src="${pageContext.request.contextPath }/js/jquery.js"></script>
    <script src="${pageContext.request.contextPath }/js/agree.js"></script>
    <script src="${pageContext.request.contextPath }/js/reg.js"></script>
	<div style="text-align:center;">
</div>
</body>
</html>
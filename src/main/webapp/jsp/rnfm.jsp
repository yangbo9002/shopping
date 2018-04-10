<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
        <script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery.min.js"></script>       
 		<link rel="stylesheet" href="${pageContext.request.contextPath }/js/bootstarp-3.3.7/css/bootstrap.min.css" />   						
		<script type="text/javascript" src="${pageContext.request.contextPath }/js/bootstarp-3.3.7/js/bootstrap.min.js" ></script>		
		<script type="text/javascript" src="${pageContext.request.contextPath }/js/bootstarp-table-1.11.1/bootstrap-table.min.js" ></script>
		<script type="text/javascript" src="${pageContext.request.contextPath }/js/bootstarp-table-1.11.1/bootstrap-table-zh-CN.min.js" ></script> 
		
		
		<style type="text/css">
		.you{
    		 margin: 0px;font-family: Arial, Helvetica, sans-serif;
    		 background:url(${pageContext.request.contextPath }/imgege/18.jpg)center 0px no-repeat;
       			 background-size:contain;
       			 background-size: 100%; 
       			 
		}
		
		.ys{
		  color: red;
		  font-family:微软雅黑;
		  font-size:50px;
		}
		.yss{
		  /* //color: red; */
		  font-family:微软雅黑;
		  font-size:20px;
		}
		
		</style>
		
		
		
		

<script type="text/javascript">
	function insertGood(){
		var fro= $("[class='form-horizontal']")[0];
		var fd=new FormData(fro);
		
		$.ajax({
			url:"${pageContext.request.contextPath }/rnfm/Dc",
			type : "post",
			dataType:"json",
			data:fd,
			  processData: false,//用于对data参数进行序列化处理 这里必须false
              contentType: false, //必须
			success : function(data) {
				alert("你好");
			}
		});
		
		
	}

</script>
		
		
		
</head>



<body class="you">

        <div class="container" align="center">
        <div class="td-inner">&nbsp;</div>
	<div class="row">
		<div class="col-md-12">	
		<div class="header tb-header" id="J_Header">
    <h1 class="cart-logo" id="logo">  <a title="淘宝网 Taobao.com - 阿里巴巴旗下网站" href="" target="_top" class="ys">淘宝网</a></h1>
          </div>
          <div class="td-inner">&nbsp;</div>
   </div>
	</div>
        
      <form action="" class="form-horizontal" enctype="multipart/form-data" method ="post"> 
         <div class="form-group">
         <div class="col-sm-3 control-label yss">商品详情</div>  
    <div class="col-sm-6">
      <input type="text" class="form-control" id="goodsinfo" name="goodsinfo">
    </div>
    <div class="col-sm-3"></div>
  </div>
  <div class="form-group">
    <div  class="col-sm-3 control-label yss">商品简介</div>
    <div class="col-sm-6">
      <input type="text" class="form-control" id="goodsName" name="goodsName">
    </div>
    <div class="col-sm-3"></div>
  </div>
  <div class="form-group">
    <div  class="col-sm-3 control-label yss">价格</div>
    <div class="col-sm-6">
      <input type="text" class="form-control" id="shopPrice" name="shopPrice">
    </div>
    <div class="col-sm-3"></div>
  </div>
  <div class="form-group">
    <div  class="col-sm-3 control-label yss">库存</div>
    <div class="col-sm-6">
      <input type="text" class="form-control" id="goodsStock" name="goodsStock">
    </div>
    <div class="col-sm-3"></div>
  </div>
  <div class="form-group">
    <div  class="col-sm-3 control-label yss">商品图片</div>
    <div class="col-sm-6">
      <input type="file" class="form-control" id="goodsImg" name="mFile">
    </div>
    <div class="col-sm-3"></div>
  </div>
   
  <div class="form-group">
  <div class="col-sm-3"></div>
    <div class="col-sm-6">
      <button type="button" class="btn btn-default" onclick="insertGood()">确认添加</button>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
      <button type="reset" class="btn btn-default">放弃添加</button>
    </div>
    <div class="col-sm-3"></div>
  </div>
</form>
        
        
        </div>     
		

</body>
</html>
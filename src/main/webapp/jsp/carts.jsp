<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
    
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
        <script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery-3.2.0.min.js"></script>
 		<link rel="stylesheet" href="${pageContext.request.contextPath }/js/bootstarp-3.3.7/css/bootstrap.min.css" />    		
		<script type="text/javascript" src="${pageContext.request.contextPath }/js/bootstarp-3.3.7/js/bootstrap.min.js" ></script>		   
		
       
  <style type="text/css">
   .goods{
	background-color: #FCFCFC;
	border:1px solid;
	border-color:#e6e6e6;
	
} 

  .inputw{
	width:40px;
	text-align:center;
}

  .divs{
	float:right 
}
  
  .wrap-line {
    clear: both;
    background: #e6e6e6;
    height: 2px;
   /*  //position: relative; */
}



.em {
    background-color: #E5E5E5;
    height:65px;
    text-align:center;
	line-height:59px;    
	font-size:15px;
}

.em1 {
      width:80px; 
      font-size:30px;
      color:#FFFFFF;
}
  
  .tb{
  		color: #FF5200;
  		font-family:  KaiTi;
  		font-weight:bold ;
  		font-size:50px;
  } 
    
    .jg{
  		color: #FF5200;
  		font-family:  KaiTi;
  		 font-weight:bold ;
  		/* //font-size:20px;  */
  }
    .span{
    	font-size:20px;
   		font-family:  SimHei;
  		font-weight:bold ;
    	color: #34343A;
    }  
    
    .hj{
    	color: #FF5200;
    } 
    
      .sh{
			width: 40px;
			height: 60px;
		}
 </style>
 
 
<script type="text/javascript">
 $(function(){
	$.ajax({
		url:"${pageContext.request.contextPath}/shopcartsr/selectCarte?usersId=1",
		dataType:"json",
		success:function(data){
			for(i=0;i<data.length;i++){
				
				$("#d2").append("<br><div><div class='row'><div class='col-md-12 col-lg-12'>&nbsp;&nbsp;&nbsp;<input type='checkbox' "
						+"name='chec_name' id='chekss' value='"+data[i][0].shopId+"' onclick='chen()'>店铺:"+data[i][0].shopName+"<div class='goods' id='dd"+i+"'></div></div></div></div>");
				for(j=0;j<data[i].length;j++){
					
				    $("#dd"+i).append("</br><div class='row td-inner'><div class='col-lg-1 col-md-1 '><input type='checkbox'"
						 +" name='cartgoodId_checkbox' class='divs' id='cartgoodId' value='"+data[i][j].goodsId+"'/></div><div class='col-lg-5 col-md-5'>"
						 +"<span class='sh'><img src='"+data[i][j].goodsImg+"'width='40' height='60'/></span>&nbsp;&nbsp;<span class='sh'>"+data[i][j].goodsInfo+"</span>&nbsp;&nbsp;"+data[i][j].attrName+"&nbsp;&nbsp;"+data[i][j].attrVal+"</div>"
				         +"<div class='col-lg-1 col-md-1'>￥"+data[i][j].shopPrice+"</div>"
				         +"<div class='col-lg-2 col-md-2'><div><input  type='button'value='-' disabled='disabled' id='bu-'><input type='text' id='inputnum' readonly='readonly' class='inputw' value='"+data[i][j].cartNum+"'/><input type='button'value='+' id='bu+' onclick='butt()'></div></div>"
				         +"<div class='col-lg-1 col-md-1'>"+data[i][j].shopPriceNum+"</div>"
				         +"<div class='col-lg-2 col-md-2'><a onclick='show("+data[i][j].goodsName+")'>添加到收藏夹</a><br>"
				         +"<a href='${pageContext.request.contextPath}/shopcartsr/deleteCarts?goodsId="+data[i][j].goodsId+"'>删除</a> </div></div></br>");
				   			
				}
			}
		}
	});
		
	 
 });
 
 
function butt(){
	
 var num = document.getElementById("inputnum").value

 
}

//全选
function ckAll(){
    var flag=document.getElementById("chackid").checked;
    var cks=document.getElementsByName("chec_name");
   // console.log(cks[1]);
    var ckss=document.getElementsByName("cartgoodId_checkbox");
    for(var i=0;i<=cks.length;i++){
        cks[i].checked=flag;
         for(var j=0;j<ckss.length;j++){
        	ckss[j].checked=flag;
        } 
    }
}
 
  function chen(){
	  var cartgoodId_checkbox="";
	 $("#chekss").click(function(){		
		 document.write(cartgoodId_checkbox);
		 $("input[type=checkbox][name='cartgoodId_checkbox']checkbox:checked").each(function(){
			 cartgoodId_checkbox +=$(this).val();
		 })	
		 document.write(cartgoodId_checkbox);
	 })
 } 

	
   
	 

  

	


 

</script>
       
</head>
<body>
<div class="container">
<div>
	<div class="td-inner">&nbsp;</div>
	<div class="row">
		<div class="col-md-1"></div>
		<div class="col-md-10">	
		<div class="header tb-header" id="J_Header">
    <h1>  <a title="淘宝网 Taobao.com - 阿里巴巴旗下网站" href="" target="_top" class="tb">淘宝网<span class="span">购物车</span></a></h1>
         </div><div class="td-inner">&nbsp;</div></div><div class="col-md-1"></div></div>
	
	
	<div class="row">
	<div class="col-md-1"></div>
  <div class="col-md-10"><a href="" ><em>全部商品</em></a> </div>
  <div class="wrap-line hj"><div class="floater "  style="width: 132px; left: -1px;"></div></div><div class="col-md-1"></div></div>  
	
	<div class="td-inner">&nbsp;</div>
	
<div id="d1" class="container">
		<div class="row">
					
		<div class="col-lg-12 col-md-12 td-inner" id="d2">		 
		<div class="row">
		<div class="col-lg-2 col-md-2" id="w1">&nbsp;&nbsp;&nbsp;<input type="checkbox" id="chackid" onclick="ckAll()">全选</div>
		<div class="col-lg-4 col-md-4" id="w2">商品信息</div>
		<div class="col-lg-1 col-md-1" id="w3">单价</div>
		<div class="col-lg-2 col-md-2" id="w4">数量</div>
		<div class="col-lg-1 col-md-1" id="w5">金额</div>
		<div class="col-lg-2 col-md-2" id="w6">操作</div>
		</div>			
		</div>
		<div class="col-lg-1 col-md-1" id="d3"></div>		
		</div>				
</div>	

<div class="td-inner">&nbsp;</div>

<div class="container">
<div class="row">
	<div class="col-lg-1 col-md-1"></div>
	<div class="col-lg-10 col-md-10 em">
		<div>
			<div class="row">		
	<div class="col-lg-2 col-md-2">&nbsp;&nbsp;&nbsp;<input type="checkbox" align="right">&nbsp;&nbsp;&nbsp;全选</div>	
	<div class="col-lg-3 col-md-3"><a href="">删除</a>&nbsp;&nbsp;&nbsp;<a href="">移入收藏夹</a></div>
	<div class="col-lg-2 col-md-2"><a href="">上一页</a>&nbsp;&nbsp;&nbsp;<a href="">下一页</a></div>	
	<div class="col-lg-3 col-md-3">已选入多少件商品</div>	
	<div class="col-lg-2 col-md-2 jg">0.00&nbsp;&nbsp;&nbsp;<a href="#" class="em1">结账</a></div>
	</div>
		</div>
	</div>
	<div class="col-lg-1 col-md-1"> </div>
</div></div>

   		 	
 </div>

</div>
<div class="td-inner">&nbsp;</div>

<div class="td-inner">&nbsp;</div>

<div class="td-inner">&nbsp;</div>









<div class="td-inner">&nbsp;</div>
<div class="td-inner">&nbsp;</div>
</body>
</html>
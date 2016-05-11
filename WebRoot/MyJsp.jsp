<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'MyJsp.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<script type="text/javascript">
	function fun1(){
	//获得img标签对象
	var img= document.getElementById("one");
	//改变src属性
	img.src="/verifyCode/VerifyPhoto?date="+new Date();
	}
	</script>
  </head>
  
  <body>
    <form action="/verifyCode/Login" >
    用户名：<input type="text" name="name"/>
    密码：<input type="password" name="password"/><br/>
    验证码：<input type="text" name="verify" size="4">
    <img id="one" src="/verifyCode/VerifyPhoto"/><a href="javaScript:void(0)" onclick="fun1();">换一张</a>
    <font color="red">${requestScope.error}</font>
    <br>
    <input type="submit" value="登录"/>
    </form>
  </body>
</html>

<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
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

  </head>
  
  <body>
    <form:form modelAttribute="currentUser">
    <form:input path="Username" cssStyle="width:320px;" />
    <form:input path="Userpwd" cssStyle="width:320px;" />
    <form:input path="Address" cssStyle="width:320px;" />
    <input type="submit" name="Button1" value="确定" id="Button1" /> &nbsp;
<input id="Reset1" class="button_bak" type="reset" value="重填" />
    </form:form>
  </body>
</html>

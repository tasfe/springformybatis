<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<html>
<head>
<title>企业网站后台管理系统</title>
<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
<tiles:insertAttribute name="head"/>
</head>
<body width="100%" height="100%">
<table width="100%" height="100%" border="0" cellpadding="0" cellspacing="0">
<tr><td>
<!--top start-->
<tiles:insertAttribute name="top"/>
<!--top end-->
<!--main start-->
<table width="100%" height="100%" border="0" cellpadding="0" cellspacing="0">
  <tr> 
    <td width="150" height="100%" align="center" valign="top"> 

<!--left start-->
<tiles:insertAttribute name="left"/>
<!--left end-->
	</td>
    <td width="80%" style="text-align:left;" valign="top">	
      <tiles:insertAttribute name="content"/>
	</td>
  </tr>
</table>
<!--main end-->
</td>
</tr>
</table>
</body>
</html>

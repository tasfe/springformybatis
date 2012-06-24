<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<spring:url var="rpath" value="/resources/admin" />
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>工商导航ASM网站技术平台</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<style type="text/css">
<!--
body {
	background-color: #0099FF;
	margin-left: 0px;
	margin-top: 0px;
	margin-right: 0px;
	margin-bottom: 0px;
}
.style1 {font-size: 9pt}
-->
</style>

  </head>
  
  <body>
    <table width="100%" height="100%"  border="00" cellpadding="0" cellspacing="0">
  <tr><td>    
    <table width="571" height="227" border="00" align="center" cellpadding="0" cellspacing="0">
      <tr>
        <td height="56"><img src="${rpath}/images/inex_r1_c1.jpg" width="571" height="56"></td>
      </tr>
      <tr>
	  <td height="144" background="${rpath}/images/inex_r2_c1.jpg">
        
        <div align="center">
            <table width="58%" height="115" border="0" align=center cellpadding="0" cellspacing="1" bordercolorlight="#cccccc" bordercolordark="#ffffff">
              <tr>
                <td colspan="2" align="center"><span style="color: #FFFFFF; font-weight: bold;">管 理 员 登 陆</span></td>
              </tr>
              <form:form>
                <tr>
                  <td  align=right width=42%><div align="right" class="style1"><span style="color: #FFFFFF"> 帐　号： </span></div></td>
                  <td width="58%">
                    <div align="left">
                      <form:input path="memberName" cssStyle="width:15px;" />
                                            <form:errors path="memberName" cssClass="error" />
                  </div></td>
                </tr>
                <tr>
                  <td  align=right width=42%><div align="right" class="style1"><span style="color: #FFFFFF">密　码： </span></div></td>
                  <td>
                    <div align="left">
                      <form:password path="memberPwd" cssStyle="width:15px;" />
                                             <form:errors path="memberPwd" cssClass="error" />
                  </div></td>
                </tr>
                <tr>
                  <td align=center colspan=2>
                    <input name="Submit2" type="submit" class="buttonn" style="" value="登  录">
              　 　      </td></tr>
              </form:form>
            </table>
        </div></td></tr>
      <tr>
        <td height="27"><img src="${rpath}/images/inex_r4_c1.jpg" width="571" height="27" border="0" usemap="#Map"></td>
      </tr>
    </table></td>
  </tr>
</table>
<br>
<map name="Map">
  <area shape="rect" coords="85,7,189,20" href="http://www.chinaasm.com" target="_blank">
</map>
</body>
</html>


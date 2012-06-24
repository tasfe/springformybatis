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
    
    <title>用户登录</title>
    
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
a:link {
	text-decoration: none;
}
a:visited {
	text-decoration: none;
}
a:hover {
	text-decoration: none;
}
a:active {
	text-decoration: none;
}
ul li{list-style-type:none;}

table{width:600px; background-color:blue;font-size:12px;}
tr{ background-color:#FFFFFF;}
td{height:25px;}
.error{color:red;font-size:12px;}
.required{color:red;font-size:12px;}
td{padding-left:3px;}
-->
</style>
<script type="text/javascript" src="/resources/js/jquery-1.4.4.min.js"></script>
<script type="text/javascript">      
        $(function(){           
            $('#kaptchaImage').click(function () {//生成验证码  
             $(this).hide().attr('src', '/captcha-image?' + Math.floor(Math.random()*100) ).fadeIn(); })      
                  });   
        
       </script>  
  </head>
  
  <body>
  <form:form modelAttribute="member" action="/member/login">  
  <form:errors path="authenticate" cssClass="error" />
    <table cellspacing="1" cellpadding="0" width="380" align="center" border="0">

                                    <tr>

                                        <td colspan="2" height="30">

                                            用户登录</td>

                                    </tr>

                                    <tr>

                                        <td width="70" height="30" align="left">

                                            用户名：</td>

                                        <td width="310" height="30" align="left">

                                            <form:input path="memberName" cssStyle="width:150px;" />
                                            <form:errors path="memberName" cssClass="error" />
                                            </td>

                                    </tr>

                                    <tr>

                                        <td width="70" height="30" align="left">

                                            密 码：</td>

                                        <td width="310" height="30" align="left">

                                            <form:password path="memberPwd" cssStyle="width:150px;" />
                                             <form:errors path="memberPwd" cssClass="error" />
                                            </td>

                                    </tr>
                                    
                                     <tr>

                                        <td width="70" height="30" align="left">

                                            验证码：</td>

                                        <td width="310" height="30" align="left">

                                           <form:input path="checkcode" cssStyle="width:150px;" />
                                           <img src="/captcha-image" width="55" height="20" id="kaptchaImage"  style="margin-bottom: -3px"/>   
        
                                            <form:errors path="checkcode" cssClass="error" />
                                            </td>

                                    </tr>

                                    

                                    <tr>

                                        <td width="70" height="30" align="left">

                                            &nbsp;</td>

                                        <td width="310" height="30" align="left">

                                            &nbsp;

                                            <input type="submit" name="btnLogon" value="登陆" id="btnLogon" class="butt" />&nbsp;

                                            <button class="butt" id="btnClose" onclick="javascript:window.opener=null;window.close();"

                                                type="button">

                                                关闭</button></td>

                                    </tr>

                                </table>
                                </form:form>

  </body>
</html>

<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'Messages.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<link rel="stylesheet" href="css/Site_Css.css" type="text/css" />
	<link rel="shortcut icon" href="images/Icon.ico" type="image/x-icon" />
<style type="text/css">
<!--
.style3 {
	font-size: 18px;
	font-weight: bold;
}
-->
</style>
</head>
  
  <body bgcolor="#EEEEEE" Scroll="no">
    <div>

    <table width="100%" height="100%"  border="0" cellpadding="0" cellspacing="0">

      <tr height="20%"><td>&nbsp;</td></tr>

	  <tr>

        <td align="center" valign="top">
	      <table width="200" border="0" cellpadding="0" cellspacing="0">
      <tr>

        <td height="48" valign="middle" background="images/MessageIcon/MessageHead.gif"><table width="100%"  border="0" cellspacing="0" cellpadding="0">

          <tr>

            <td width="7%" height="8"></td>

          <td width="93%" align="left"></td>

          </tr>

          <tr>

            <td>&nbsp;</td>

            <td align="left"><span class="style3">登陆成功！</span></td>

          </tr>

        </table></td>

      </tr>

      <tr>

        <td background="images/MessageIcon/MessageBody.gif"><table width="100%" style="table-layout:fixed;"  border="0" cellspacing="0" cellpadding="0">

          <tr>

            <td width="6%">&nbsp;</td>

            <td width="11%" height="120"><img src="images/MessageIcon/MessageOk.gif"></td>

          <td width="77%" align="left"><table width="100%"  border="0" cellspacing="10" cellpadding="0">

                <tr>

                  <td style="word-break : break-all; ">欢迎您admin，成功登入。您的IP为：118.250.118.209！</td>

                </tr>

                      </table></td>

            <td width="6%">&nbsp;</td>

          </tr>

          <tr>

            <td>&nbsp;</td>

            <td>&nbsp;</td>

            <td align="left"><input type='button' ID='Message_Button0' class='button_bak' onClick="JavaScript:window.location.href='default.aspx';" value='确定' title='点击按钮登陆！'> 

            </td>

            <td>&nbsp;</td>

          </tr>

        </table></td>

      </tr>

      <tr>

        <td><img src="images/MessageIcon/MessageEnd.gif" width="459" height="29" /></td>

      </tr>

    </table>		</td>

      </tr>

    </table>

    </div>

<script type="text/javascript">
//<![CDATA[

document.getElementById('Message_Button0').focus();
//]]>
</script>
</body>
</html>

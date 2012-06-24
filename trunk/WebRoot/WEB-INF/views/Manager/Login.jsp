<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
String FrameName=(String)request.getAttribute("FrameName");
String FrameNameVer=(String)request.getAttribute("FrameNameVer");
%>
<spring:url var="rpath" value="/resources/manager" />
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title><%=FrameName %></title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<link rel="stylesheet" href="${rpath}/Css/Site_Css.css" type="text/css" />
<link rel="shortcut icon" href="${rpath}/images/Icon.ico" type="image/x-icon" />
    <script language="javascript" src="${rpath}/js/checkform.js"></script>
    <style type="text/css">
    body {
	font-size: 12px; font-family: "Verdana", "Arial", "细明体", "sans-serif";
     }
table
{
    font-size: 12px; font-family: "Verdana", "Arial", "细明体", "sans-serif";
}

.middlecss
{
	background-color:#FFFFFF; 
	border-right:1px solid #C7C5D9;
}

.cbutton 
{
    border: 1px solid #000000; margin: 0px; padding: 2px;
    cursor:pointer;font-family: "Arial","宋体"; font-size: 9pt; color: #000000; 
    background-color: #EAEFF2;line-height: 10px; 
    Padding-top: 4px; padding-bottom: 2px; 
    Padding-left: 2px; padding-right:2px;
    border-top-color:#FFFFFF; border-right-color: #91ABC4; 
    border-left-color: #FFFFFF; border-bottom-color: #91ABC4}
.button_bak {
	BORDER-RIGHT: medium none; 
	BORDER-TOP: medium none; 
	background-image:url(${rpath}/images/Button_On.gif); 
	BORDER-LEFT: medium none; 
	WIDTH: 60px; 
	CURSOR: pointer; 
	BORDER-BOTTOM: medium none; 
	HEIGHT: 20px;
	FONT-SIZE: 9pt; 
	FONT-FAMILY: tahoma,宋体;
}
.TD_Class
{
    font-size:12px;   FONT-FAMILY: "Verdana", "Arial", "细明体", "sans-serif";  
}


A:hover{TEXT-DECORATION: none}
A{COLOR: #000000;}

             

.text_input  
{
BORDER-TOP-WIDTH: 1px;	
PADDING-RIGHT: 2px;	
PADDING-LEFT: 2px;	
BORDER-LEFT-WIDTH: 1px;	
BORDER-LEFT-COLOR: #ddd;	
BORDER-BOTTOM-WIDTH: 1px;
BORDER-BOTTOM-COLOR: #ddd;	
PADDING-BOTTOM: 2px;	
BORDER-TOP-COLOR: #ddd;	
PADDING-TOP: 3px;	
BORDER-RIGHT-WIDTH: 1px;
BORDER-RIGHT-COLOR: #ddd;
height:22px;
FONT: Trebuchet MS, Helvetica, Arial, sans-serif;	
COLOR: #000;
}
.tex_input  
{
BORDER-TOP-WIDTH: 1px;	
PADDING-RIGHT: 2px;	
PADDING-LEFT: 2px;	
BORDER-LEFT-WIDTH: 1px;	
BORDER-LEFT-COLOR: #ddd;	
BORDER-BOTTOM-WIDTH: 1px;
BORDER-BOTTOM-COLOR: #ddd;	
PADDING-BOTTOM: 2px;	
BORDER-TOP-COLOR: #ddd;	
PADDING-TOP: 2px;	
BORDER-RIGHT-WIDTH: 1px;
BORDER-RIGHT-COLOR: #ddd;
FONT: 12px/1.6em Trebuchet MS, Helvetica, Arial, sans-serif;	
COLOR: #000;
width:100%;
}
.Table_yellow {  font-family: "Verdana", "Arial", "Helvetica", "sans-serif"; font-size: 12px; background-color: #FFFF99}
.Table_blue {  font-family: "Verdana", "Arial", "Helvetica", "sans-serif"; font-size: 12px; background-color: #336699; color: #FFFFFF}
.Table_blue1 {  font-family: "Verdana", "Arial", "Helvetica", "sans-serif"; font-size: 12px; color: #FFFFFF; background-color: #3366CC}
.no_input { border :#665b8e 0px solid; color: #333333; cursor: text; font-family: "Arial"; font-size: 12px; height: 20px; padding: 1px}
.down_text {
	font-family: Arial;	font-size:8pt;background-color:#000000;color:#FFFFFF
	}
.down_tools_button {	
	border-left:1px solid #FFFFFF; border-right:1px solid #000000; 
	width: 80; height: 20; position:relative;
	letter-spacing:1; FONT-FAMILY: "Arial"; 
	FONT-SIZE: 9pt; LINE-HEIGHT: 7px; 
	PADDING-TOP: 0px; PADDING-BOTTOM: 0px; 
	PADDDING-LEFT: 2px; PADDING-RIGHT: 2px; 
	background-color:#000000; cursor:pointer;color:#FFFFFF}
.menubar_button { 
	border:1pt solid #FFFFFF; height: 20; 
	position:relative;letter-spacing:1;
	FONT-FAMILY: "Arial"; FONT-SIZE: 9pt; 
	LINE-HEIGHT: 7px; PADDDING-LEFT: 0px; 
	background-color:#FFFFFF; 
	position:relative; top:-1; cursor:pointer; padding-left:2px; padding-right:2px; padding-top:0; padding-bottom:0}

.menubar_button_on { 
	border-left:1pt solid #000000; border-right:1pt outset #000000; border-top:1pt outset #000000; border-bottom:1pt outset #000000; height: 20; 
	position:relative;letter-spacing:1;
	FONT-FAMILY: "Arial"; FONT-SIZE: 9pt; 
	LINE-HEIGHT: 7px; PADDDING-LEFT: 0px; 
	background-color:#FFCC00; 
	position:relative; top:-1; cursor:pointer; padding-left:2px; padding-right:2px; padding-top:0px; padding-bottom:0px}

.menubar_table {
	border-bottom:3px solid #000000; 
	border-collapse: collapse; 
	padding: 0; border-left-width:1;
	border-right-width:1; border-top-width:1; }

.menubar_title {FONT-FAMILY: "Verdana", "Arial", "细明体", "sans-serif"; font-size:14px; font-weight:bold;}
	
.menubar_readme_text {font-size:9pt;FONT-FAMILY: "Arial"; 
	color:#808080; text-align:right; padding-bottom:5px }

.menubar_down_text {
	border-top:1px solid #000000; font-size:9pt;
	FONT-FAMILY: "Arial"; position:relative; 
	color:#808080; text-align:center; border-left-width:1; 
	border-right-width:1; border-bottom-width:1; padding-top:3 }

.menubar_function_text {
	border-top:3px solid #000000; font-size:9pt;
	FONT-FAMILY: "Arial"; position:relative; 
	color:#808080; border-left-width:1; 
	border-right-width:1; border-bottom-width:1; padding-top:3; padding-left:10 }

.menubar_menu_td {
	border-top:3px solid #000000; font-size:8pt;
	FONT-FAMILY: "Arial"; position:relative; 
	color:#808080; border-left-width:1; 
	border-right-width:1; border-bottom-width:1; padding-top:3; padding-left:10 }
.tab {
	PADDING-RIGHT: 15px; PADDING-LEFT: 10px; FONT-SIZE: 12px; PADDING-BOTTOM: 1px; CURSOR: pointer; PADDING-TOP: 5px; LETTER-SPACING: 1px
}

#ld 
{    
filter: alpha(opacity=100);
-moz-opacity:.100;
opacity:1.0;
position:absolute;
left:0px;
top:0px;
width: expression(body.scrollWidth);
height: expression(body.scrollHeight);
width:100%; 
height: 100%;
z-index:1;
background-color: #000000;
}
.topmenuoff { cursor: pointer;color: #FFFFFF; font-size: 9 pt }
.topmenuon { cursor: pointer;color: #FFCC00; font-size: 9 pt }
.topmenuoff2 { cursor: pointer;color: #000000; font-size: 9 pt }
.topmenuon2 { cursor: pointer;color: #000000; font-size: 9 pt }
    </style>

  </head>
<body scroll="no" leftmargin="0" topmargin="0" marginheight="0" marginwidth="0">
    <table border="0" cellspacing="0" cellpadding="0" width="100%" height="100%">
        <tr>
            <td width="100%" height="50" colspan="3" style="border-bottom: 1px solid #000000">
                <table height="49" border="0" cellspacing="0" cellpadding="0" width="100%" class="font_size">
                    <tr>
                        <td style="background-image: url(${rpath}/images/top-gray.gif); background-repeat: no-repeat;
                            background-position: right top">
                            <b>
                                <%=FrameName %>
                            </b>
                            <br />
                            <font size="2" color="#999999" face="Verdana, Arial, Helvetica, sans-serif">
                                <%=FrameNameVer %>
                            </font>
                        </td>
                    </tr>
                </table>
            </td>
        </tr>
        <tr>
            <td colspan="3">
            <form:form modelAttribute="sysUser">
                <table width="100%" border="0" cellspacing="0" cellpadding="0" height="100%">
                

                        <tr>
                            <td>
                                <table width="431" border="0" cellpadding="0" cellspacing="0" align="center">
                                    <tr>
                                        <td colspan="2" background="${rpath}/images/logon/Logon_1.gif" width="431" height="125">
                                        </td>
                                    </tr>
                                    <tr>
                                        <td colspan="2">
                                            <img src="${rpath}/images/logon/Logon_2.gif" width="431" height="30" alt="" /></td>
                                    </tr>
                                    <tr>
                                        <td>
                                            <img src="${rpath}/images/logon/Logon_3.gif" width="194" height="28" alt="" /></td>
                                        <td background="${rpath}/images/logon/Logon_4.gif" width="237">
                                            <form:input path="uLoginname" cssClass="text_input" cssStyle="width:138px;" />
                       <form:errors path="uLoginname" cssClass="error" />    </td>
                                    </tr>
                                    <tr>
                                        <td>
                                            <img src="${rpath}/images/logon/Logon_5.gif" width="194" height="24" alt="" /></td>
                                        <td background="${rpath}/images/logon/Logon_6.gif">
                                            <form:password path="uPassword" cssClass="text_input" cssStyle="width:138px;"/>
                        <form:errors path="uPassword"/> </td>
                                    </tr>
                                    <tr>
                                        <td>
                                            <img id="Logincode_op" src="${rpath}/images/logon/Logon_7no.gif" width="194" height="25" alt="" /></td>
                                        <td rowspan="3" background="${rpath}/images/logon/Logon_18.jpg" valign="top">
                                            <table border="0" cellpadding="0" cellspacing="0">                                                
                                                <tr>
                                                    <td height="3">
                                                    </td>
                                                </tr>
                                                <tr>
                                                    <td>
                                                        <input type="submit"  value="确定" id="ctl00_PageBody_Button1" class="button_bak"/> &nbsp;

<input id="Reset1" class="button_bak" type="reset" value="重填"/>
                                                    </td>
                                                </tr>
                                            </table>
                                        </td>
                                    </tr>
                                    <tr>
                                        <td>
                                            <img src="${rpath}/images/logon/Logon_9.gif" width="194" height="40" alt="" /></td>
                                    </tr>
                                    <tr>
                                        <td height="39" background="${rpath}/images/logon/Logon_11.gif">
                                            </td>
                                    </tr>
                                    <tr>
                                        <td colspan="2">
                                            <b>提醒 : </b>本管理系统建议议采用Internet Explorer 5.5 (或以上版本) 的浏览器。请开启浏览器的 Cookies 与 JavaScript
                                            功能。</td>
                                    </tr>
                                </table>
                            </td>
                        </tr>                    
                </table>
                </form:form>
            </td>
        </tr>
        <tr>
            <td colspan="3" height="20">
                <table border="0" cellpadding="0" cellspacing="0" width="100%" height="20">
                    <tr>
                        <td class="down_text">
                            Powered By <a href="http://www.supesoft.com" target="_blank"><font color="#ffffff">Supesoft.com</font></a>
                            Information Technology Logistics Inc.</td>
                    </tr>
                </table>
            </td>
        </tr>
    </table>
  </body>
  <script language="JavaScript" type="text/javascript"><!-- 

    // The Central Randomizer 1.3 (C) 1997 by Paul Houle (houle@msc.cornell.edu) 

    // See: http://www.msc.cornell.edu/~houle/javascript/randomizer.html 

    rnd.today=new Date(); 

    rnd.seed=rnd.today.getTime(); 

    function rnd() { 

　　　　rnd.seed = (rnd.seed*9301+49297) % 233280; 

　　　　return rnd.seed/(233280.0); 

    }; 

    function rand(number) { 

　　　　return Math.ceil(rnd()*number); 

    }; 
    
    if(top!=self)
    {
        top.location.href = "/Manager/login";
    }
    //alert(navigator.appVersion);
    if(navigator.appVersion.indexOf("MSIE")   ==   -1   ){   
        //alert("提醒 : 本管理系统建议议采用Internet Explorer 5.5 (或以上版本) 的浏览器。请开启浏览器的 Cookies 与 JavaScript 功能。");   
    }   

    // end central randomizer. --> 

</script>
</html>

<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%  
response.setHeader("P3P","CP=CAO PSA OUR");  
%>  
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
String FrameName=(String)request.getAttribute("FrameName");
String FrameNameVer=(String)request.getAttribute("FrameNameVer");
int MenuStyle=0;
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
    <link rel="stylesheet" href="${rpath}/css/Site_Css.css" type="text/css" />
    <link rel="stylesheet" type="text/css" href="${rpath}/inc/FineMessBox/css/subModal.css" />
    <link rel="shortcut icon" href="${rpath}/images/Icon.ico" type="image/x-icon" />
    <script type="text/javascript" src="${rpath}/inc/FineMessBox/js/common.js"></script>

    <script type="text/javascript" src="${rpath}/inc/FineMessBox/js/subModal.js"></script>    
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
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
	background-image:url(../../resources/manager/images/Button_On.gif); 
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

.navPoint
	{
	font-family: Webdings;
	font-size:9pt;
	color:white;
	cursor:pointer;
	}
p{
	font-size:9pt;
}

.font_size {  font-family: "Verdana", "Arial", "Helvetica", "sans-serif"; font-size: 12px; font-weight: normal; font-variant: normal; text-transform: none}
</style>
  </head>
  
  <body scroll="no"  leftmargin="0" topmargin="0" marginheight="0" marginwidth="0">
    <table border="0" cellspacing="0" cellpadding="0" width="100%" height="100%">
        <tr>
            <td width="100%" height="50" colspan="3" style="border-bottom: 1px solid #000000">
                <table height="49" border="0" cellspacing="0" cellpadding="0" width="100%" class="font_size">
                    <tr>
                        <td width="300">
                            <b><%=FrameName %></b><br />
                            <font size="2" color="#999999" face="Verdana, Arial, Helvetica, sans-serif">
                                <%=FrameNameVer %>
                            </font>
                        </td>
                        <td style="background-image: url(${rpath}/images/top-gray.gif); background-repeat: no-repeat;
                            background-position: right top" valign="bottom">
                            &nbsp;
                        </td>
                    </tr>
                </table>
            </td>
        </tr>
        <%
    switch (MenuStyle)
    {
        case 0:
        %>
        <tr>
            <td id="frmTitle" name="frmTitle" nowrap="nowrap" valign="middle" align="center"
                width="198" style="border-right: 1px solid #000000">
                <iframe name="BoardTitle" style="height: 100%; visibility: inherit; width: 198; z-index: 2"
                    scrolling="auto" frameborder="0" src="Manager/Menu"></iframe>
            </td>
            <td style="width: 10pt" bgcolor="#7898A8" width="10" title="关闭/打开左栏" class="navPoint">
                <table border="0" cellpadding="0" cellspacing="0" width="11" height="100%" align="right">
                    <tr>
                        <td valign="middle" align="right"  class="middleCss">
                            <img border="0" src="${rpath}/images/Menu/close.gif" id="menuimg" alt="隐藏左栏" onmouseover="javascript: menuonmouseover();"
                                onmouseout="javascript: menuonmouseout();" onclick="javascript:switchSysBar()"
                                style="cursor: hand" width="11" height="76" /></td>
                    </tr>
                </table>
            </td>
            <td style="width: 100%">
                <iframe id="mainFrame" name="mainFrame" style="height: 100%; visibility: inherit;
                    width: 100%; z-index: 1" scrolling="auto" frameborder="0" src="Manager/right"></iframe>
            </td>
        </tr>
        <%
            break;
        case 1:
            
        %>
        <tr>
            <td id="frmTitle" name="frmTitle" nowrap="nowrap" valign="middle" align="center"
                width="115" style="border-right: 1px solid #000000">
                <iframe name="BoardTitle" style="height: 100%; visibility: inherit; width: 100%; z-index: 2"
                    scrolling="no" frameborder="0" src="Menu1.aspx"></iframe>
            </td>
            <td style="width: 10pt" bgcolor="#7898A8" width="10" title="关闭/打开左栏" class="navPoint">
                <table border="0" cellpadding="0" cellspacing="0" width="11" height="100%" align="right">
                    <tr>
                        <td valign="middle" align="right" class="middleCss">
                            <img border="0" src="${rpath}/images/Menu/close.gif" id="menuimg" alt="隐藏左栏" onmouseover="javascript: menuonmouseover();"
                                onmouseout="javascript: menuonmouseout();" onclick="javascript:switchSysBar()"
                                style="cursor: hand" width="11" height="76" /></td>
                    </tr>
                </table>
            </td>
            <td style="width: 100%">
                <iframe id="Iframe" name="mainFrame" style="height: 100%; visibility: inherit;
                    width: 100%; z-index: 1" scrolling="auto" frameborder="0" src="right.aspx"></iframe>
            </td>
        </tr>
        <%
            break;
            case 2:
        %>
        <tr>
            <td height="51px">
               <iframe name="MainTop" style="height: 100%; visibility: inherit;
                    width: 100%; z-index: 1" scrolling="no" frameborder="0" src="Menu2.aspx"></iframe>
            </td>
        </tr>
        <tr>
            <td style="width: 100%">
                <iframe id="Iframe" name="mainFrame" style="height: 100%; visibility: inherit;
                    width: 100%; z-index: 1" scrolling="auto" frameborder="0" src="right.aspx"></iframe>
            </td>
        </tr>
        <%
            break;
            case 3:
        %>
        <tr>
            <td id="frmTitle" name="frmTitle" nowrap="nowrap" valign="middle" align="center"
                width="198" style="border-right: 1px solid #000000">
                <iframe name="BoardTitle" style="height: 100%; visibility: inherit; width: 198; z-index: 2"
                    scrolling="auto" frameborder="0" src="Menu3.aspx"></iframe>
            </td>
            <td style="width: 10pt" bgcolor="#7898A8" width="10" title="关闭/打开左栏" class="navPoint">
                <table border="0" cellpadding="0" cellspacing="0" width="11" height="100%" align="right">
                    <tr>
                        <td valign="middle" align="right"  class="middleCss">
                            <img border="0" src="${rpath}/images/Menu/close.gif" id="menuimg" alt="隐藏左栏" onmouseover="javascript: menuonmouseover();"
                                onmouseout="javascript: menuonmouseout();" onclick="javascript:switchSysBar()"
                                style="cursor: hand" width="11" height="76" /></td>
                    </tr>
                </table>
            </td>
            <td style="width: 100%">
                <iframe id="Iframe1" name="mainFrame" style="height: 100%; visibility: inherit;
                    width: 100%; z-index: 1" scrolling="auto" frameborder="0" src="right.aspx"></iframe>
            </td>
        </tr>       
        <%
            break;
        }
        %>
        <tr>
            <td colspan="3" height="20">
                <table border="0" cellpadding="0" cellspacing="0" width="100%" height="20">
                    <tr>
                        <td class="down_text">
                            Powered By <a href="http://www.faydrian.com" target="_blank"><font color="#ffffff">faydrian.com</font></a>
                            Information Technology Logistics Inc.</td>
                            <td align="right" width="460" bgcolor="#000000">
                            <table border="0" cellpadding="0" cellspacing="0" width="100%">
                                <tr>
                                    <td style="cursor:pointer;border-left:1px solid #FFFFFF;" onclick="javascript:showPopWin('About','/Manager/about',510, 170, null,false)">&nbsp;<img src="${rpath}/images/info.gif" style="margin-bottom: -3px">&nbsp;<font color="#FFFFFF">版本信息</font></td>
                                    <td style="cursor:pointer;border-left:1px solid #FFFFFF;" onclick="javascript:showPopWin('登陆日志','/Manager/MyLogin',550, 370, null,true,true)">&nbsp;<img src="${rpath}/images/log.gif" style="margin-bottom: -3px">&nbsp;<font color="#FFFFFF">登陆日志</font></td>
                                    <td style="cursor:pointer;border-left:1px solid #FFFFFF;" onclick="javascript:showPopWin('个人设定','/Manager/UserSet?rand'+rand(100000000),400, 255, AlertMessageBox,true)">&nbsp;<img src="${rpath}/images/userset.gif" style="margin-bottom: -3px">&nbsp;<font color="#FFFFFF">个人设定</font></td>
                                    <td style="cursor:pointer;border-left:1px solid #FFFFFF;" onclick="javascript: window.mainFrame.location.href='/Manager/right'">&nbsp;<img src="${rpath}/images/house.gif" style="margin-bottom: -3px">&nbsp;<font color="#FFFFFF">回到首页</font></td>
                                    <td style="cursor:pointer;border-left:1px solid #FFFFFF;" onclick="javascript: window.top.location.href = '/Manager/LoginOut'">&nbsp;<img src="${rpath}/images/logout.gif" style="margin-bottom: -3px">&nbsp;<font color="#FFFFFF">退出系统</font></td>
                                    <td style="cursor:pointer;border-left:1px solid #FFFFFF;" onclick="javascript:window.open('http://www.faydrian.com:8081/help/');">&nbsp;<img src="${rpath}/images/Help.gif" style="margin-bottom: -3px">&nbsp;<font color="#FFFFFF">帮助手册</font></td>
                                </tr>
                            </table>
                            
                            </td>
                    </tr>
                </table>
            </td>
        </tr>
    </table>
</body>
</html>
<script language="JavaScript" type="text/javascript">

var DispClose = true;

function CloseEvent()
{
    if (DispClose)
    {
        return "是否离开当前页面?";
    }
}
　window.onbeforeunload=CloseEvent;
　
　
    rnd.today=new Date(); 

    rnd.seed=rnd.today.getTime(); 

    function rnd() { 

　　　　rnd.seed = (rnd.seed*9301+49297) % 233280; 

　　　　return rnd.seed/(233280.0); 

    }; 

    function rand(number) { 

　　　　return Math.ceil(rnd()*number); 

    }; 
    
    function AlertMessageBox(Messages)
    {
        DispClose = false; 
        alert(Messages);
        setTimeout("reload()",100)
        //window.location.reload();
        //window.location.href = location.href+"?"+rand(1000000);
        
    }
    function reload()
    {
        window.location.href = location.href+"?"+rand(1000000);
    }
    
var var_frmTitle = document.getElementById("frmTitle");
var var_menuimg  = document.getElementById("menuimg");

function switchSysBar(){

 	if (var_frmTitle.style.display=="none") {
		var_frmTitle.style.display=""
		var_menuimg.src="${rpath}/images/Menu/close.gif";
		var_menuimg.alt="隐藏左栏"
		}
	else {
		var_frmTitle.style.display="none"
		var_menuimg.src="${rpath}/images/Menu/open.gif";
		var_menuimg.alt="开启左栏"
	 }
	 
	 

}

 function menuonmouseover(){
 		if (var_frmTitle.style.display=="none") {
 		var_menuimg.src="${rpath}/images/Menu/open_on.gif";
 		}
 		else{
 		var_menuimg.src="${rpath}/images/Menu/close_on.gif";
 		}
 }
 function menuonmouseout(){
 		if (var_frmTitle.style.display=="none") {
 		var_menuimg.src="${rpath}/images/Menu/open.gif";
 		}
 		else{
 		var_menuimg.src="${rpath}/images/Menu/close.gif";
 		}
 }
     if(top!=self)
    {
        top.location.href = "/";
    }
   
</script>

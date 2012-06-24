<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="t" uri="http://tiles.apache.org/tags-tiles" %>
<s:url var="rpath" value="/resources/manager" />
<html>
  <head>
    <title><t:insertAttribute name="title"/></title>
    <link rel="stylesheet" href="${rpath}/css/Site_Css.css" type="text/css">
    <link rel="stylesheet" href="${rpath}/css/table/default/Css.css" type="text/css">
    <link rel="shortcut icon" href="${rpath}/images/Icon.ico" type="image/x-icon" />
    <meta http-equiv="Content-Type" content="text/html; charset=gb2312"/>
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

/* CSS Document */

.table-box {
WIDTH: 100%;
}

.table_Title {
FONT: bold 14px Tahoma, Verdana;	
COLOR: #ffffff;	
BACKGROUND-COLOR: #7898A8;
height:30px; 
PADDING-LEFT: 5px;
PADDING-RIGHT:5px;
}
.table_title A {COLOR: #ffffff;}
.table_body {	
FONT-SIZE: 9pt;
BACKGROUND-COLOR: #CADEE8;
height:30px;
PADDING-LEFT: 5px;
PADDING-RIGHT:5px;
width:25%;
font-family: "Verdana", "Arial", "Helvetica", "sans-serif"; 
}
.table_none {	
FONT-SIZE: 9pt;
BACKGROUND-COLOR: #E9F2F7;
height:30px;
PADDING-LEFT: 5px;
PADDING-RIGHT:5px;
width:75%;
font-family: "Verdana", "Arial", "Helvetica", "sans-serif"; 
}
.table_body_NoWidth{  width:20%;}
.table_none_NoWidth{  width:30%;}

.table_body_List {	
FONT-SIZE: 9pt;
BACKGROUND-COLOR: #CADEE8;
height:30px;
PADDING-LEFT: 5px;
PADDING-RIGHT:5px;
font-family: "Verdana", "Arial", "Helvetica", "sans-serif"; 
}
.table_none_List {	
FONT-SIZE: 9pt;
BACKGROUND-COLOR: #E9F2F7;
height:30px;
PADDING-LEFT: 5px;
PADDING-RIGHT:5px;
font-family: "Verdana", "Arial", "Helvetica", "sans-serif"; 
}

.row
{
    PADDING-LEFT: 5px;PADDING-RIGHT:5px; HEIGHT:28px; 
    BACKGROUND-COLOR: #CADEE8;
    font-size:12px;
}
.row1
{
    PADDING-LEFT: 5px;PADDING-RIGHT:5px; HEIGHT:28px; 
    BACKGROUND-COLOR: #E9F2F7;
    font-size:12px;
}    
    </style>
    <script type="text/javascript">
    function MenuOnMouseOver(obj)
	{		
		obj.className = 'menubar_button';
	}

	function MenuOnMouseOut(obj)
	{
		obj.className = 'menubar_button_on';
	}
    function DelData(DeleteUrl)
	{
		if (confirm("您确定要删除当前记录吗?\n\n注意:删除后不能恢复!"))
		{
			window.location.href = DeleteUrl;
		}
	}
	
    </script>
  </head>

<body bgColor="#FFFFFF" topMargin="5" >    
    <div>
    <table border="0" cellpadding="0" cellspacing="0" width="100%">   
    <tr><td>    
        <t:insertAttribute name="content" />    
    </td></tr>    
    <tr><td height="5"></td></tr>
    </table>
    </div>
</body>
</html>

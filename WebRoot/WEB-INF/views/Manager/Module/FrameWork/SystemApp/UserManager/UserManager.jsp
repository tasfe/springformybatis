<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<spring:url var="rpath" value="/resources/manager" />
<!-- 头部菜单 Start -->
	        <table border='0' cellpadding='0' cellspacing='0' width='100%' align='center'>
              <tr>
                <td class='menubar_title'><img border='0' src='${rpath}/images/ICON/applist.gif' align='absmiddle' hspace='3' vspace='3'>&nbsp;用户资料管理</td>
                <td class='menubar_readme_text' valign='bottom'><img src='${rpath}/images/ICON/office.gif' align='absMiddle' border='0' />&nbsp;帮助？</td>
              </tr>
              <tr>
                <td height='27px' class='menubar_function_text'>目前操作功能：用户资料</td>
                <td class='menubar_menu_td' align='right'><table border="0" cellspacing="0" cellpadding="0"><tr><td class="menubar_button" id="button_0" OnClick="JavaScript:window.location.href='List';" OnMouseOut="javascript:MenuOnMouseOver(this);" OnMouseOver="javascript:MenuOnMouseOut(this);"><img border="0" align="texttop" src="${rpath}/images/ICON/list.gif">&nbsp;列表用户</td></tr></table></td>
              </tr>
              <tr><td height='5px' colspan='2'></td></tr>
            </table>
        <!-- 头部菜单 End -->
        
    <!-- 选项卡 Start -->
        <TABLE cellSpacing=0 cellPadding=0 width='100%' align=center border=0>   
        <TBODY>   
	        <TR>     
		        <TD style='PADDING-LEFT: 2px; HEIGHT: 22px' background='${rpath}/images/Menu/tab_top_bg.gif'>
			        <TABLE cellSpacing=0 cellPadding=0 border=0>
				        <TBODY><TR>
                                    <!--按钮　Start-->
                                    <TD >
	        <TABLE height=22 cellSpacing=0 cellPadding=0 border=0>
		        <TBODY>
                       <TR>
				         <TD width=3><IMG id=tabImgLeft__0 height=22 src='${rpath}/images/Menu/tab_unactive_left.gif'  width=3></TD>
				         <TD class=tab id=tabLabel__0 onclick='javascript:tabClick(0,1)' background='${rpath}/images/Menu/tab_unactive_bg.gif' UNSELECTABLE='on'>用户资料</TD>
				         <TD width=3><IMG id=tabImgRight__0 height=22 src='${rpath}/images/Menu/tab_unactive_right.gif' width=3></TD>
			           </TR>
		        </TBODY>
	        </TABLE>
        </TD>
                                    <!--按钮 End-->
						        </TR>
				        </TBODY>
			        </TABLE>
		        </TD>
	        </TR>
	        <TR>
	        <TD bgColor=#ffffff>           
		        <TABLE cellSpacing=0 cellPadding=0 width='100%' border=0>
		        <TBODY>
		        <TR>
			        <TD width=1 background='${rpath}/images/Menu/tab_bg.gif'><IMG  height=1 src='${rpath}/images/Menu/tab_bg.gif'  width=1></TD>
			        <TD style='PADDING-RIGHT: 15px; PADDING-LEFT: 15px; PADDING-BOTTOM: 15px; PADDING-TOP: 15px; HEIGHT: 100px' vAlign=top>
        <input type='hidden' ID='FrameWork_YOYO_LzppccSelectIndex' name='FrameWork_YOYO_LzppccSelectIndex' value='0'>
        <!--内容框Start--><DIV id='tabContent__0'>
<form:form modelAttribute="user">
<table width="100%" border="0" cellspacing="1" cellpadding="3" align="center">		
		<tr>
			<td class="table_body">
                用户编号</td>
			<td class="table_none">                
                <form:input path="uUserno" Cssclass="text_input"/>
                <form:errors path="uUserno" cssClass="error" /></td>
		</tr>
		<tr>
			<td class="table_body">
                用户名</td>
			<td class="table_none">                
                <form:input path="uLoginname" Cssclass="text_input"/><span class="required">* 必填</span>
                <form:errors path="uLoginname" cssClass="error" />
                </td>
		</tr>
		<tr>
			<td class="table_body">
                密码</td>
			<td class="table_none">                
                <form:password path="uPassword" Cssclass="text_input"/><span class="required">* 必填</span>
                <form:errors path="uPassword" cssClass="error" />
                </td>
		</tr>
		<tr>
			<td class="table_body">
                中文名</td>
			<td class="table_none">                
                <form:input path="uCname" Cssclass="text_input"/>
                <form:errors path="uCname" cssClass="error" />
                </td>
		</tr>
		<tr>
			<td class="table_body">
                用户状态</td>
			<td class="table_none">
			<form:select path="uStatus" cssStyle="width:60px;">
                    <form:option value="0">正常</form:option>
                    <form:option value="1">禁止</form:option>
                    </form:select>
                 <span class="required">* 必选</span>
                <form:errors path="uStatus" cssClass="error" />
                </td>
		</tr>
		<tr>
			<td class="table_body">
                备注说明</td>
			<td class="table_none">                
                <form:input path="uRemark" Cssclass="text_input" Cssstyle="width:200px;"/>
                <form:errors path="uRemark" cssClass="error" />
                </td>
		</tr>		
		<tr id="ctl00_PageBody_SubmitTr">
	<td colspan="2" align="right">
            <input type="submit" name="ctl00$PageBody$Button1" value="确定" id="ctl00_PageBody_Button1" class="button_bak" />
            <input id="Reset1" class="button_bak" type="reset" value="重填" />&nbsp;
		
		</td>
</tr>

	   </table>
	   </form:form>
	   </DIV><!--内容框End-->
			        </TD>
			        <TD width=1 background='${rpath}/images/Menu/tab_bg.gif'><IMG height=1 src='${rpath}/images/Menu/tab_bg.gif'  width=1></TD>
		        </TR>
		        </TBODY>
		        </TABLE>
	        </TD>
	        </TR>
	        <TR>
		        <TD background='${rpath}/images/Menu/tab_bg.gif' bgColor='#ffffff'><IMG height=1 src='${rpath}/images/Menu/tab_bg.gif' width='1'></TD>
	        </TR>
        </TBODY>
        </TABLE>
        <!--选项卡 End-->

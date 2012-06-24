<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<form:form modelAttribute="user">
<table width="100%" border="0" cellspacing="1" cellpadding="3" align="center">
		    <tr>
			    <td class="table_body">
                    用户名</td>
			    <td class="table_none" >
                    <span id="ctl00_PageBody_U_LoginName_Txt">admin</span></td>
		    </tr>
            <tr>
                <td class="table_body">
                    原始密码</td>
                <td class="table_none">                
                <form:password path="Old_U_Password" cssClass="text_input"/>
                <form:errors path="Old_U_Password"/>
                    </td>
            </tr>
            <tr>
                <td class="table_body">
                    新密码</td>
                <td class="table_none">
                <form:password path="New_U_Password" cssClass="text_input"/>
                <form:errors path="New_U_Password"/>
</td>
            </tr>
            <tr>
                <td class="table_body" nowrap>
                    重新输入新密码</td>
                <td class="table_none">
                <form:password path="ReNew_U_Password" cssClass="text_input"/>
                <form:errors path="ReNew_U_Password"/>
                   </td>
            </tr>
            <tr>
                <td class="table_body">
                    菜单样式</td>
                <td class="table_none">
                <form:select path="MenuSink" items="${skills}"/>
                   </td>
            </tr>
            <tr>
                <td class="table_body">
                    表格样式</td>
                <td class="table_none">
                <form:select path="TableSink" items="${skills}"/>
                    </td>
            </tr>            
            <tr>
                <td class="table_body" nowrap>
                    页码设定(每页/笔)</td>
                <td class="table_none">
                    <form:select path="PageSize" items="${skills}"/>
                    </td>
            </tr>
            <tr>
                <td align="right" colspan="2">
                                    <input type="submit" name="ctl00$PageBody$Button1" value="确定" id="ctl00_PageBody_Button1" class="button_bak" />
                    <input id="Reset1" class="button_bak" type="reset" value="重填" />
                </td>
            </tr>
		</table>
		</form:form>

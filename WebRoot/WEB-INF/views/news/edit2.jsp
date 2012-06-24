<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
    <%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<table width="100%" border="0" cellspacing="1" cellpadding="0" align="center" class="table">
<form:form commandName="entity" action="editprocess.html">
 <tr>
                    <td class="table_body">
                        类别</td>
                    <td class="table_none">
                    <form:select path="newsNesortId">
                    <form:option value="">请选择类别</form:option>
                    <form:options items="${sortlist}" itemValue="key" itemLabel="value"/>
                    </form:select>
                    <form:errors path="newsNesortId"/>
                        </td>
                </tr>

                <tr>
                    <td class="table_body">
                        标题</td>
                    <td class="table_none">                   
                    <spring:bind path="command.newsTitle">
                      <input type="newsTitle" name="${status.expression}" value="${status.value}"/>
                     <font color="red"><b>${status.errorMessage}</b></font><br>                    
                    </spring:bind>
                    
                        </td>
                </tr>

                <tr>
                    <td class="table_body">
                        来源</td>
                    <td class="table_none">                     
                        <form:input path="neswFrom"/>
                    <form:errors path="neswFrom"/>
                        </td>
                </tr>   
 <tr> 
 <td class="table_body">
                        内容</td> 
                    <td class="table_none">
                     
                       <form:textarea path="newsContent"/>
                       <form:errors path="newsContent"/>                    
                        </td>
                </tr>
                <tr>
                    <td class="table_body">
                        摘要</td>
                    <td class="table_none">
                     <form:textarea path="newsSummery"/>
                        <form:errors path="newsSummery"/>
                        </td>
                </tr>
 <tr>
                    <td class="table_body">
                        Tags 标签</td>
                    <td class="table_none">
                     <form:input path="newsKeywords"/>
                        <form:errors path="newsKeywords"/>                    
                        </td>
                </tr>
                              
                <tr>
	<td colspan="2" style="text-align:center;">
<input type="submit" name="ctl00$PageBody$Button1" value="确定" id="ctl00_PageBody_Button1" /> &nbsp;

<input id="Reset1" class="button_bak" type="reset" value="重填" />
                    </td>
</tr>
</form:form>
</table>



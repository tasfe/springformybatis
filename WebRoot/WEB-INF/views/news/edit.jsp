<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
    <%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://ckeditor.com" prefix="ckeditor" %>
<%@page import="java.util.HashMap"%>
<%@page import="java.util.Map"%>

<table width="100%" border="0" cellspacing="1" cellpadding="0" align="center" class="table">
<form:form modelAttribute="ProNew">
 <form:errors path="*"/> 
                <tr>
                    <td class="table_body">
                        标题</td>
                    <td class="table_none">                   
                    <form:input path="News_Title" cssStyle="width:320px;" />
                       <form:errors path="News_Title" cssClass="error" />      
                        </td>
                </tr>
                <tr>
                    <td class="table_body">
                        类别</td>
                    <td class="table_none">
                    <form:select path="News_NesortID">
                    <form:option value="">请选择类别</form:option>
                    <form:options items="${sortlist}"/>
                    </form:select>
                    <form:errors path="News_NesortID" cssClass="error" />                      
                    
                        </td>
                </tr>
                <tr>
                    <td class="table_body">
                        来源</td>
                    <td class="table_none">                     
                        <form:input path="News_From" cssStyle="width:320px;"/>
                    <form:errors path="News_From"/>
                        </td>
                </tr>   
 <tr> 
 <td class="table_body">
                        内容</td> 
                    <td class="table_none">
                     
                       <form:textarea path="News_Content"/>
                       <form:errors path="News_Content"/> 
                      
                        </td>
                </tr>
                <tr>
                    <td class="table_body">
                        摘要</td>
                    <td class="table_none">
                     <form:textarea path="News_Summery" rows="8" cols="60"/>
                        <form:errors path="News_Summery" cssClass="error" />
                        </td>
                </tr>
 <tr>
                    <td class="table_body">
                        Tags 标签</td>
                    <td class="table_none">
                     <form:input path="News_Keywords" cssStyle="width:320px;"/>
                        <form:errors path="News_Keywords"/>                      
                       
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
<!--<ckeditor:replace  replace="newsContent" basePath="../ckeditor/" />-->
<script type="text/javascript">//<![CDATA[
window.CKEDITOR_BASEPATH='../ckeditor/';
//]]></script>
<script type="text/javascript" src="../ckeditor/ckeditor.js?t=B37D54V"></script>
<script type="text/javascript" src="../ckfinder/ckfinder.js"></script>
<script type="text/javascript">//<![CDATA[
var editor=CKEDITOR.replace('News_Content');
// Just call CKFinder.setupCKEditor and pass the CKEditor instance as the first argument.
	// The second parameter (optional), is the path for the CKFinder installation (default = "/ckfinder/").
	CKFinder.setupCKEditor( editor, '../ckfinder/' ) ;

	// It is also possible to pass an object with selected CKFinder properties as a second argument.
	// CKFinder.setupCKEditor( editor, { basePath : '../', skin : 'v1' } ) ;
//]]></script>

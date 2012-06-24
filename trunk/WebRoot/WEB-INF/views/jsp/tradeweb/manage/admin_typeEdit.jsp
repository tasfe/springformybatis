<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@page import="com.hedgehog.domain.*"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://ckeditor.com" prefix="ckeditor" %>
<br/><br/>
<form:form modelAttribute="bizmenu">
<table border="0" cellspacing="1" cellpadding="0" class="table" style="width:100%;" align="left">
<tr class="tr">
    <td colspan="2" class="td">编辑栏目
    </td>    
  </tr>  
  <tr class="tr">
    <td class="td" style="width:18%;">栏目名称</td>
    <td><form:input path="menuName" cssStyle="width:150px;" /><span class="required">* 必填</span>
                       <form:errors path="menuName" cssClass="error" /> </td>
  </tr>
  <tr class="tr">
    <td class="td" style="width:18%;">栏目类型</td>
    <td>
    <form:select path="menuChCode" cssStyle="width:100px;">
    <form:option value="">请选择类型</form:option>
    <form:options items="${list_channel}" itemValue="chCode" itemLabel="chName"/>      
    </form:select>
    <span class="required">* 必填</span>
                       <form:errors path="menuChCode" cssClass="error" /> </td>
  </tr>
  <tr class="tr">
    <td class="td">排序</td>
    <td>
    <form:input path="menuIndex" cssStyle="width:20px;" /><span class="required">* 必填</span>&nbsp;&nbsp;必须为数字
                       <form:errors path="menuIndex" cssClass="error" />    
     </td>
  </tr>
  <tr class="tr">
    <td class="td">是否启用</td>
    <td>启用<form:radiobutton path="menuEnable" value="1"/>&nbsp;&nbsp;&nbsp;&nbsp;不启用<form:radiobutton path="menuEnable" value="0"/>
    
    <span class="required">* 必填</span>
                       <form:errors path="menuEnable" cssClass="error" /> </td>
  </tr>
  <tr class="tr">
    <td colspan="2" style="text-align:center;" class="td"><input type="submit" name="Button1" value="确定" /> &nbsp;
                     <input id="Reset1" class="button_bak" type="reset" value="重填" /></td>    
  </tr>  
</table>
</form:form>
<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@page import="com.hedgehog.domain.*"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<br/><br/>
<form:form modelAttribute="friendlink">
<table border="0" cellspacing="1" cellpadding="0" class="table">
<tr class="tr">
    <td colspan="2" class="td">添加友情链接
    </td>    
  </tr>  
  <tr class="tr">
    <td class="td">标题</td>
    <td><form:input path="friendlinkTitle" cssStyle="width:200px;" /><span class="required">* 必填</span>
                       <form:errors path="friendlinkTitle" cssClass="error" /> </td>
  </tr>
  <tr class="tr">
    <td class="td">URL地址</td>
    <td><form:input path="friendlinkUrl" cssStyle="width:200px;" /><span class="required">* 必填</span>
                       <form:errors path="friendlinkUrl" cssClass="error" /> </td>
  </tr>
  
  <tr class="tr">
    <td class="td">排序</td>
    <td><form:input path="friendlinkOrder" cssStyle="width:20px;"/><span class="required">必须为数字</span>
                       <form:errors path="friendlinkOrder" cssClass="error" /> </td>
  </tr>  

  <tr class="tr">
    <td colspan="2" style="text-align:center;" class="td"><input type="submit" name="Button1" value="确定" /> &nbsp;
                     <input id="Reset1" class="button_bak" type="reset" value="重填" /></td>    
  </tr>  
</table>
</form:form>

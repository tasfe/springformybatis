<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@page import="com.hedgehog.domain.*"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<br/><br/>
<form:form modelAttribute="newsclass">
<table border="0" cellspacing="1" cellpadding="0" class="table">
<tr class="tr">
    <td colspan="2" class="td">添加新闻类别
    </td>    
  </tr>  
  <tr class="tr">
    <td class="td">类别名称</td>
    <td><form:input path="ncName" cssStyle="width:100px;" /><span class="required">* 必填</span>
                       <form:errors path="ncName" cssClass="error" /> </td>
  </tr>
  <tr class="tr">
    <td class="td">排序</td>
    <td><form:input path="ncOrder" cssStyle="width:100px;" /><span class="required">* 必填</span>
                       <form:errors path="ncOrder" cssClass="error" /> </td>
  </tr>
  
  <tr class="tr">
    <td class="td">描述</td>
    <td><form:textarea path="ncDes" rows="3" cols="25"/>
                       <form:errors path="ncDes" cssClass="error" /> </td>
  </tr>  

  <tr class="tr">
    <td colspan="2" style="text-align:center;" class="td"><input type="submit" name="Button1" value="确定" /> &nbsp;
                     <input id="Reset1" class="button_bak" type="reset" value="重填" /></td>    
  </tr>  
</table>
</form:form>

<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@page import="com.hedgehog.domain.*"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<br/><br/>
<form:form modelAttribute="member">
<table border="0" cellspacing="1" cellpadding="0" class="table" style="width:100%;" align="left">
<tr class="tr">
    <td colspan="2" class="td">修改密码
    </td>    
  </tr>  
  <tr class="tr">
    <td class="td" style="width:18%;">您的帐号</td>
    <td><form:hidden path="memberName" /><span>${member.memberName}</span>
                       </td>
  </tr>
  <tr class="tr">
    <td class="td" style="width:18%;">旧密码</td>
    <td>
    <form:password path="memberPwd" cssStyle="width:100px;" />
    <span class="required">* 必填</span>
                       <form:errors path="memberPwd" cssClass="error" /> </td>
  </tr>
  <tr class="tr">
    <td class="td">新密码</td>
    <td>
    <form:password path="memberNewPwd" cssStyle="width:100px;" /><span class="required">* 必填</span>
                       <form:errors path="memberNewPwd" cssClass="error" />    
     </td>
  </tr>
  <tr class="tr">
    <td class="td">确认新密码</td>
    <td>
    <form:password path="memberconfirmNewPwd" cssStyle="width:100px;" /><span class="required">* 必填</span>
                       <form:errors path="memberconfirmNewPwd" cssClass="error" />    
     </td>
  </tr>
  <tr class="tr">
    <td colspan="2" style="text-align:center;" class="td"><input type="submit" name="Button1" value="确定" /> &nbsp;
                     <input id="Reset1" class="button_bak" type="reset" value="重填" /></td>    
  </tr>  
</table>
</form:form>

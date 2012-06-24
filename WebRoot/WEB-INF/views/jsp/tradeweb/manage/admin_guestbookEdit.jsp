<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@page import="com.hedgehog.domain.*"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://ckeditor.com" prefix="ckeditor" %>
<br/><br/>
<form:form modelAttribute="webguestbook">
<table border="0" cellspacing="1" cellpadding="0" class="table" style="width:100%;" align="left">
<tr class="tr">
    <td colspan="2" class="td">添加客户留言
    </td>    
  </tr>  
  <tr class="tr">
    <td class="td" style="width:18%;">昵称</td>
    <td><form:input path="gbNikename" cssStyle="width:200px;" /><span class="required">* 必填</span>
                       <form:errors path="gbNikename" cssClass="error" /> </td>
  </tr>
  
  <tr class="tr">
  <td class="td">留言内容</td>
    <td class="td" ><form:textarea path="gbContent" rows="5" cols="50"/>
    <span class="required">* 必填</span>
    <form:errors path="gbContent" cssClass="error" />
                        </td>
  </tr>  
  <tr class="tr">
    <td class="td">验证码</td>
    <td><form:input path="checkcode" cssStyle="width:200px;" /><img src="/captcha-image" width="55" height="20" id="kaptchaImage"  style="margin-bottom: -3px"/>   <span class="required">* 必填</span>
                       <form:errors path="checkcode" cssClass="error" /> </td>
  </tr>
  
  <tr class="tr">
    <td colspan="2" style="text-align:center;" class="td"><input type="submit" name="Button1" value="确定" /> &nbsp;
                     <input id="Reset1" class="button_bak" type="reset" value="重填" /></td>    
  </tr>  
</table>
</form:form>
<script type="text/javascript" src="/resources/js/jquery-1.4.4.min.js"></script>
<script type="text/javascript">      
        $(function(){           
            $('#kaptchaImage').click(function () {//生成验证码  
             $(this).hide().attr('src', '/captcha-image?' + Math.floor(Math.random()*100) ).fadeIn(); })      
                  });   
        
       </script>  


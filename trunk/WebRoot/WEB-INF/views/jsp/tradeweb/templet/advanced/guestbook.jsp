<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<div id="right">
  <div class="right-top"> 
    <div class="right-top-top">
  <span>在线留言</span>  </div>
  <form:form modelAttribute="webguestbook">
  <div class="right-top-bottom">
  <div class="tianxie"><br />
    <p>  昵称：<form:input path="gbNikename" cssStyle="width:200px;" /><span class="required">* 必填</span>
                       <form:errors path="gbNikename" cssClass="error" />
      </p>
    <p>验证码：<form:input path="checkcode" cssStyle="width:200px;" /><img src="/captcha-image" width="55" height="20" id="kaptchaImage"  style="margin-bottom: -3px"/>   <span class="required">* 必填</span>
                       <form:errors path="checkcode" cssClass="error" />
    
    </p>
  </div>
      <div class="liuyan">
     <p> 
      留言内容：      <span class="anniu">
      <form:textarea path="gbContent" rows="5" cols="50"/>
    <span class="required">* 必填</span>
    <form:errors path="gbContent" cssClass="error" />
      </span></p>
      </div>
  <div class="anniu">   <input name="" type="submit" value="提交" class="tijiao" /> <input name="" type="reset" value="重置" />
  </div>
  </div>
</form:form>
</div>
  </div>
  <script type="text/javascript" src="/resources/js/jquery-1.4.4.min.js"></script>
<script type="text/javascript">      
        $(function(){           
            $('#kaptchaImage').click(function () {//生成验证码  
             $(this).hide().attr('src', '/captcha-image?' + Math.floor(Math.random()*100) ).fadeIn(); })      
                  });   
        
       </script>  
<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<script type="text/javascript" src="/resources/js/jquery-1.4.4.min.js"></script>
<script type="text/javascript">      
        $(function(){           
            $('#kaptchaImage').click(function () {//生成验证码  
             $(this).hide().attr('src', '/captcha-image?' + Math.floor(Math.random()*100) ).fadeIn(); })      
                  });   
        
       </script>  
<div style=" clear:both"></div>
 <div style="background-color: #FFF; margin: 0 auto; width: 960px;">
            <div class="flow"></div>
            <!--会员 注册 -->            
			<div class="flow">
                <div class="textbox" style="margin-top: 10px;">
                    <div class="title">
                        ·通行证注册</div>
                    <div class="aa">
                        <div class="flow_txt">
                            ◆ 通行证登陆：<span class="tit">请认真、仔细地填写以下信息，严肃的商业信息有助于您获得别人的信任，结交潜在的商业伙伴，获取商业机会！</span>
                            <hr class="hr1"/>
                        </div>
                          <form:form modelAttribute="member">  
  <form:errors path="authenticate" cssClass="error" />
                        <div class="hyzc">
                            <div class="tit">
                            </div>
                            
                                <div class="bd">
                                    <div class="bt">会员登录</div>
                                   
                                    <ul>
                                    <li class="li1">用户名：</li>
                                        <li class="li2">
                                            <form:input path="memberName" cssStyle="width:150px;" />
                                            <form:errors path="memberName" cssClass="error" />
                                        </li>
                                        <li class="li3"><span>* 必填</span>6-20位字母、数字或'_'组合，首字符必须为字母！</li>
                                    </ul>
                                    <ul>
                                        <li class="li1">密码：</li>
                                        <li class="li2">
                                            <form:password path="memberPwd" cssStyle="width:150px;" />
                                             <form:errors path="memberPwd" cssClass="error" />
                                        </li>
                                        <li class="li3"><span>* 必填</span>6-20位至少包含字母和数字组合，区分大小写！</li>
                                    </ul>
                                    <ul>
                                        <li class="li1">验证码：</li>
                                        <li class="li2">
                                            <form:input path="checkcode" cssStyle="width:150px;" />                                             
        
                                            <form:errors path="checkcode" cssClass="error" /></li>
                                        <li class="li3">  <img src="/captcha-image" width="55" height="20" id="kaptchaImage"  style="margin-bottom: -3px"/> 
                                         </li>
                                    </ul>
                                </div>
                                <div style="margin-top: 10px; text-align: center">
                              <div id="upButton">
	
                                            <input name="BtnRegister" value="确认登陆" id="BtnRegister" type="submit"/>
                                        
</div>
                                </div>
                            
                            <div style="clear: both; text-align: center; margin-top: 15px;"></div>
                        </div>
            </form:form>
            <!--会员 注册 -->
            <div style="height: 10px;">
            </div>
            <div class="top">

  </div>          
</div>
</div>
</div>
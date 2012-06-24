<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<script type="text/javascript" src="/resources/js/jquery-1.4.4.min.js"></script>
<script type="text/javascript">
    var $j=jQuery.noConflict(); 
    jQuery().ready(function(){	
	$j('#kaptchaImage').click(function () {//生成验证码  
             $j(this).hide().attr('src', '/captcha-image?' + Math.floor(Math.random()*100) ).fadeIn(); });     
});
</script> 
<div style="clear:both"></div>
<form:form modelAttribute="classinfo" enctype="multipart/form-data" onSubmit="return Validate();">
<form:hidden path="classinfoParentclass" />
<form:hidden path="classinfoClass" />
<div class="zhongjian">
  <div class="mf_doc4">
                <div id="bd" class="yn-pub-two">
                    <div class="bd">
                        <div class="publish-step">
                            <span class="step1">选择信息分类</span>&nbsp;&gt; <span class="step2-active">填写内容</span>&nbsp;&gt;
                            <span class="step3">发布成功</span>
                        </div>
                    </div>
                    <div class="cleft">
                        <div class="ct">
                            <div class="publish-detail">
                            <span id="spanlogon">
                                <div class="yn-pub-notice">
                                    您可以匿名发布，建议您 <a href="/login">登录</a>
                                    后发布信息，日后可以方便的更新、修改和删除它。
                                </div></span>
                                
                                <!--发布页面-->
                                
                                    <div>
                                    </div>
                                    <table align="center" border="0" cellpadding="0" cellspacing="0">
                                        <tbody><tr>
                                            <td colspan="2" height="5">
                                            </td>
                                        </tr>
                                        <tr>
                                            <td style="width: 550px;" valign="bottom" align="center">
                                                <!--class="boder1-td2" -->
                                            </td>
                                        </tr>
                                    </tbody></table>
                                    <table align="center" border="0" cellpadding="0" cellspacing="0">
                                        <tbody><tr>
                                            <td class="height5">
                                            </td>
                                        </tr>
                                    </tbody></table>
                                    <table align="center" border="0" cellpadding="0" cellspacing="0">
                                        <tbody><tr>
                                            <td height="1">
                                                <!--Sys AD Position-->
                                            </td>
                                        </tr>
                                    </tbody></table>
                                    <table width="710" align="center" bgcolor="#FF9400" border="0" cellpadding="0" cellspacing="1">
                                        <tbody><tr>
                                            <td valign="top" bgcolor="F6F6F6">
                                                <table width="96%" align="center" border="0" cellpadding="0" cellspacing="0">
                                                    <tbody><tr>
                                                      <td valign="top" bgcolor="#F6F6F6">
                                                            <table width="100%" align="center" border="0" cellpadding="0" cellspacing="0">
                                                                <tbody><tr>
                                                                    <td class="red" style="width: 4%;" height="40">
                                                                        <img alt="" src="/resources/images/point_t.gif" width="20" height="20"></td>
                                                                    <td class="red" width="66%">
                                                                        <p>
                                                                            --请开始填写您所需要发布的信息!</p>
                                                                    </td>
                                                                    <td width="30%" align="right">
                                                                        <a href="/classify/infoseltype" class="red">选择其他分类</a></td>
                                                                </tr>
                                                            </tbody></table>
                                                        <table width="95%" align="center" border="0" cellpadding="0" cellspacing="0">
                                                                <tbody><tr>
                                                                    <td class="tex" height="22">
                                                                        <strong>小提醒:</strong></td>
                                                                </tr>
                                                                <tr>
                                                                    <td class="unnamed1" height="30">
                                                                        <span class="red">1.</span> 如果您是注册用户，请先<a href="/login">登录</a>，否则无法发布信息；</td>
                                                                </tr>
                                                                <tr>
                                                                    <td class="unnamed1" height="30">
                                                                        <span class="red">2.</span> 如果您已成功登录，并在<a href="">我的联系方式</a>中添加了联系信息，可在信息组中选择您的某个联系方法；</td>
                                                                </tr>
                                                                <tr>
                                                                    <td class="unnamed1" height="30">
                                                                        <span class="red">3.</span> 如果您尚未注册，只要填写上您的Email，仍可以发布信息，并且我们会向此Email发送提示邮件；</td>
                                                                </tr>
                                                                <tr>
                                                                    <td class="unnamed1" height="30">
                                                                        <span class="red">4.</span> 您发布的描述内容要少于3000字节，此内容是指HTML代码，并非显示的文字内容。</td>
                                                                </tr>
                                                                <tr>
                                                                <td class="unnamed1" style="color: Red;" height="30"><span class="red">5.</span>请您严格遵守国家法律法规，禁止发布色情、隐私、赌博、制假、暴力、毒品、敏感政治话题和其他非法信息，否则我们将把您的上网IP地址移交到国家网监部门处理，谢谢您对中国114黄页的大力支持！您当前的IP是：58.20.115.77</td>
                                                                </tr>
                                                          </tbody></table>
                                                            
					                                      &nbsp;					           
                                                              <table width="99%" align="center" border="0" cellpadding="0" cellspacing="0"><tbody><tr>
                                                                    <td class="fenlei2" align="center" height="24">
                                                                        标题
                                                                    </td>
                                                                    <td colspan="2" class="fenlei2" height="30">
                                                                    <form:input path="classinfoTitle" cssClass="input" cssStyle="width:250px;" />                                                                        
                                                                        <span class="red" style="font-size: 9pt">＊</span><form:errors path="classinfoTitle" cssClass="error" /></td>
                                                                </tr>
                                                                <tr>
                                                                    <td class="fenlei2" align="center" height="24">
                描述
                                                                    </td>
                                                                    <td colspan="2" class="fenlei2" height="24">
                                                                    <form:textarea path="classinfoDes" cssClass="diaryTextArea" rows="15" cols="60"/>
                                                                        <form:errors path="classinfoDes" cssClass="error" />
                                                                    </td>
                                                                </tr>
                                                                <tr>
                                                                            <td class="fenlei2" align="center" height="24">
                                                                        图片</td>
                                                                    <td class="fenlei2" colspan="2" width="50%" height="24">
                                                                        <form:input path="fileData" type="file" cssClass="input"/><form:errors path="fileData" cssClass="error" />
                                                                    </td>
                                                                </tr>
                                                                <tr>
                                                                    <td class="fenlei2" align="center" height="24">
                                                                        价格</td>
                                                                    <td class="fenlei2" colspan="2" width="50%" height="24">
                                                                        <form:input path="classinfoPrice" cssClass="input" cssStyle="width:100px;" /><form:errors path="classinfoPrice" cssClass="error" />
                                                                    </td>
                                                                </tr>
                                                                <tr>
                                                                    <td class="fenlei2" align="center" height="24">
                                                                        EMail
                                                                    </td>
                                                                    <td colspan="2" class="fenlei2" height="30">
                                                                        <input name="tbxEmail" maxlength="100" id="tbxEmail" class="input" type="text">
                                                                    </td>
                                                                </tr>
                                                                <tr>
                                                                    <td colspan="3">
                                                                        <hr>
                                                                    </td>
                                                                </tr>
                                                                <tr>
                                                                    <td colspan="3">
                                                                        <span class="unnamed1">联系信息 </span>
                                                                    </td>
                                                                </tr>
                                                                <tr>
                                                                    <td colspan="3">
                                                                    </td>
                                                                </tr>
                                                                <tr class="unnamed1">
                                                                    <td align="center">
                                                                        姓名</td>
                                                                    <td style="height: 27px;" colspan="2">
                                                                        <form:input path="classinfoName" cssStyle="width:100px;" />
                       <form:errors path="classinfoName" cssClass="error" />
                                                                    </td>
                                                                </tr>
                                                                <tr class="unnamed1">
                                                                    <td align="center">
                                                                        地址
                                                                    </td>
                                                                    <td colspan="2" height="22">
                                                                        <form:input path="classinfoAddr" cssStyle="width:250px;" />
                       <form:errors path="classinfoAddr" cssClass="error" />
                                                                        <span class="red" style="font-size: 9pt">＊(请填写省_市_街道,便于外地客户与您联系！)</span>
                                                                    </td>
                                                                </tr>
                                                                <tr class="unnamed1">
                                                                    <td align="center">
                                                                        邮编
                                                                    </td>
                                                                    <td colspan="2" style="height: 22px;">
                                                                        <form:input path="classinfoCode" cssStyle="width:100px;" />
                       <form:errors path="classinfoCode" cssClass="error" />
                                                                    </td>
                                                                </tr>
                                                                <tr class="unnamed1">
                                                                    <td align="center">
                                                                        电话
                                                                    </td>
                                                                    <td colspan="2" height="22">
                                                                        <form:input path="classinfoTel" cssStyle="width:100px;" />
                       <form:errors path="classinfoTel" cssClass="error" />
                                                                        <span class="red" style="font-size: 9pt">＊</span>
                                                                    </td>
                                                                </tr>
                                                                <tr class="unnamed1">
                                                                    <td align="center">
                                                                        即时通讯
                                                                    </td>
                                                                    <td colspan="2" height="22">
                                                                        <form:input path="classinfoIcq" cssStyle="width:100px;" />
                       <form:errors path="classinfoIcq" cssClass="error" />
                                                                        （即时通讯，QQ、MSN、雅虎通等）</td>
                                                                </tr>
                                                                <tr class="unnamed1">
                                                                    <td align="center">
                                                                        验证码
                                                                    </td>
                                                                    <td style="height: 34px;" align="left">
                                                                    <form:input path="checkcode" cssStyle="width:50px;" /><img src="/captcha-image" width="55" height="20" id="kaptchaImage"  style="margin-bottom: -3px"/>        
                                            <form:errors path="checkcode" cssClass="error" />    
                                                                    </td>
                                                                </tr>
                                                                <tr>
                                                                    <td colspan="3" align="center" height="35">
                                                                        &nbsp;
                                                                        <input name="imgbtnSubmit" src="/resources/images/PostAd.gif" style="border-width: 0px;" type="image">
                                                                    </td>
                                                                </tr>
                                                          </tbody></table>
                                                      </td>
                                                    </tr>
                                                </tbody></table>
                                            </td>
                                        </tr>
                                    </tbody></table>
                                    <table class="bottom-tab" align="center" border="0" cellpadding="0" cellspacing="0">
                                        <tbody><tr>
                                            <td>
                                            </td>
                                        </tr>
                                    </tbody></table>
                                    <table class="bottom1" align="center" border="0" cellpadding="0" cellspacing="0">
                                        <tbody><tr>
                                            <td>
                                            </td>
                                        </tr>
                                    </tbody></table>
                                    <table class="bottom-tab" align="center" border="0" cellpadding="0" cellspacing="0">
                                        <tbody><tr>
                                            <td>
                                            </td>
                                        </tr>
                                    </tbody></table>
                                    <table class="bottom-tab1" align="center" border="0" cellpadding="0" cellspacing="0">
                                        <tbody><tr>
                                            <td>
                                            </td>
                                        </tr>
                                    </tbody></table>
                                
                            </div>
                        </div>
                    </div>
                    <div class="cright">
                        <div class="yn-pub-tips">
                            <div class="wmodule">
                                <div class="hd">
                                    小贴士：
                                </div>
                                <div class="bd">
                                    <p>
                                        无论发布、查找信息都是免费的。虚假信息、重复信息，不符合各类目规则以及发错类目的信息在发布后都会在第一时间被管理员删除。符合标准的信息会有更好的效果。</p>
                                    <p>
                                    </p>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
    </div>
    </div>
</form:form>
<script type="text/javascript"> 
        <!--               
                
				function Validate()
				  {
					 var image =document.getElementById("fileData").value;
					 if(image!=''){
						  var checkimg = image.toLowerCase();
						  if (!checkimg.match(/(\.jpg|\.png|\.JPG|\.PNG|\.jpeg|\.JPEG)$/)){
							  alert("Please enter  Image  File Extensions .jpg,.png,.jpeg");
							  document.getElementById("fileData").focus();
							  return false;
						    }
						 }
					 return true;
				 }			

                // -->
            </script>   

<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<div style="clear:both"></div>
<div class="dao">
 <div>                       
<span class="zuo">当前位置：<a href="/classify" target="_blank" style="font-size: 14px; background-color: Transparent; color: Black;">分类信息</a>&nbsp;&nbsp;&gt;&nbsp;&nbsp;
<a  href="#" style="color: Black;">${cic.parentclassinfoclass.cicName}</a>&nbsp;&nbsp;&gt;&nbsp;&nbsp;<span class="dhbiaohong"><a  href="/classify/infolist/${cic.cicid}" style="color: Red;">${cic.cicName}</a></span></span>
</div> </div>
<div style="clear:both"></div>
  

<div  class="zhongjian">
<div class="left">
<div class="biaoti">${classinfo.classinfoTitle}</div>
<div class="biaoti2">${classinfo.classinfoDes}
<br />---------------------</div>
<div class="dizhi">


<span>姓名：</span>${classinfo.classinfoName} <br/>

<span>电话：</span>${classinfo.classinfoTel}<br />
<span>地址：</span>${classinfo.classinfoAddr}<br />
<span>邮编：</span>${classinfo.classinfoCode}<br /> 
<span>邮箱：</span>${classinfo.classinfoEmail}<br />
<span>ICQ：</span>${classinfo.classinfoIcq}<br />
<span>帖主IP：</span>${classinfo.classinfoClientip}<br />
<p>${classinfo.classinfoDes}</p>
<p>
<c:if test="${! empty classinfo.classinfoPic}"><img src="${classinfo.classinfoPic}"/></c:if>
</p>
</div>
     <div style="float: left;">
                        <hr style="border: 1px dashed #777777; width: 643px; text-align: left;">
                    </div>
                    
 <div class="zxhf">
<span> 最新回复</span></div>
<c:if test= "${!empty classinfo.list_reply}">
<c:forEach items="${classinfo.list_reply}" var="vector">
<div class="zxhf-bottom">
<div class="zxhf-bottom-nr">
<span>Email：<c:out value="${vector.replyEmail}"/></span><br />
<span>昵称：<c:out value="${vector.replyNikename}"/></span><br />
<span>留言内容：</span><br />
<p><c:out value="${vector.replyContent}"/></p>
</div>
</div>
</c:forEach>
</c:if>
 </div>
<div class="right">
<div class="right-top">
 <a href="/classify/infopublish?cateid=${cic.cicid}"> <img src="/resources/images/mffbclxx.gif" width="135" height="32" /></a>
  </div>
<div class="right-huifu">
<span>回复此信息</span>
</div>  
  <div class="right-bottom">
  <form:form modelAttribute="reply" onSubmit="return Validate();">  
  <form:hidden path="replyInfoid" />
  <div class="right-bottom-nr">
                                您的Email：
                              <form:input path="replyEmail" cssStyle="width:150px;" />
                       <form:errors path="replyEmail" cssClass="error" />  
                                <br />
                                您的昵称：&nbsp;
                                <form:input path="replyNikename" cssStyle="width:150px;" />
                       <form:errors path="replyNikename" cssClass="error" /> 
                                <br />
    留言内容：
    <form:textarea path="replyContent" cssStyle="width:260px;height:250px;" rows="15" cols="60"/>
    <form:errors path="replyContent" cssClass="error" />         
    
    <input type="image" src="/resources/images/hf.gif" width="92" height="32"/>
    </div>
  </form:form>
  </div>
  </div>
</div>
<div style="clear:both"></div>
<script type="text/javascript"> 
<!--               
String.prototype.trim = function()
{
    // 用正则表达式将前后空格，用空字符串替代。
    return this.replace(/(^\s*)|(\s*$)/g, "");
}
				function Validate()
				  {
					 var content =document.getElementById("replyContent").value.trim();
					 if(content==''){
					 alert("留言内容不能为空！");
			          document.getElementById("replyContent").focus();
						  return false;
						 }
					 return true;
				 }
// -->
</script> 

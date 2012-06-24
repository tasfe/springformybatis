<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@page import="com.hedgehog.domain.*"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<div id="left"> 
  <div class="left-top1">
 <span>供应商信息</span>
 </div> 
 <div class="left-bottom">
 <c:choose>
 <c:when test="${! empty website.wCompany}">
 <img src="/resources/template/${website.wCompany}" width="172" height="45"/>
</c:when>
<c:otherwise>
<img src="/resources/template/company/images/jqlb_10.jpg" width="172" height="45" />
</c:otherwise>
 </c:choose>
 <span>${website.wComname}</span> 
  <div class="qqd">
  联系人：${member.memberRealname}&nbsp;&nbsp; <br/>
  <a target="_blank" href="http://wpa.qq.com/msgrd?v=3&uin=${member.memberQq}&site=qq&menu=yes"><img border="0" src="http://wpa.qq.com/pa?p=2:${member.memberQq}:46" alt="点击这里给我发消息" title="点击这里给我发消息"></a></div>
 <ul>
  <li>企业类型：${website.wBcomtype}</li>
  <li>所在地：${website.province.provinceName} ${website.city.cityName}</li>
  </ul>
 </div>

 <div class="lxfs-top">
 <span>联系方式</span>
 </div>
 <div class="lxfs-bottom">
 <ul>
 <li>联系人：${member.memberRealname}</li>
 <li>  <a target="_blank" href="http://wpa.qq.com/msgrd?v=3&uin=${member.memberQq}&site=qq&menu=yes"><img border="0" src="http://wpa.qq.com/pa?p=2:${member.memberQq}:46" alt="点击这里给我发消息" title="点击这里给我发消息"></a></li>
 <li> 电话</li>
  <li>${member.memberTel}</li>   
   
     <li> 传真:${website.wFax}</li>
     <li> 地址:${website.wAddress}</li>
 </ul>
 </div>
 <div class="yqlj-top">
<span>友情链接</span>  
 </div>
 <div class="yqlj-bottom">
<ul>
<%
List<web_friendlink> list_friendlink=(List<web_friendlink>)request.getAttribute("list_friendlink");

if(list_friendlink.size()>0)
{
Iterator<web_friendlink> it=list_friendlink.iterator();  
 web_friendlink news=null;
  //SimpleDateFormat df=new SimpleDateFormat("yyyy-MM-dd");//.format(news.getNewsUpdateTime());
  
  //df.format(news.getNewsUpdateTime())
  //news.getNewsUpdateTime();
  int seq=0;
  while(it.hasNext())
  {
  seq++;
    news=(web_friendlink)it.next();    
    %>
    <li><a href="<%=news.getFriendlinkUrl()%>" target="_blank"><%=news.getFriendlinkTitle()%></a></li>
    <%
    }
}
%>
</ul> 
 </div>
  </div>  

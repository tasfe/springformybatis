<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@page import="com.hedgehog.domain.*"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<div class="right">
<div class="right-top"><span>供应商信息</span></div>
<div class="right-top-bottom">
<c:choose>
 <c:when test="${! empty website.wCompany}">
 <span><img src="/resources/template/${website.wCompany}" width="172" height="45"/></span>
</c:when>
<c:otherwise>
<span><img src="/resources/template/standard/image/jqlb_10.jpg" width="172" height="45" /></span>
</c:otherwise>
 </c:choose>
<p>联系人：${member.memberRealname}&nbsp;
<a target="_blank" href="http://wpa.qq.com/msgrd?v=3&uin=${member.memberQq}&site=qq&menu=yes"><img border="0" src="http://wpa.qq.com/pa?p=2:${member.memberQq}:46" alt="点击这里给我发消息" title="点击这里给我发消息"></a>
</p>
<p>企业类型：${website.wBcomtype}</p>
<p>所在地区：${website.province.provinceName} ${website.city.cityName}</p>
</div>
<div class="zxtj"><span>${menu.menuName}</span></div>
<div class="zxtj-bottom">
 	<ul>
 	<%
List<web_supplyclass> list=(List<web_supplyclass>)request.getAttribute("list_supplyclass");
  if(list.size()>0)
  {
  Iterator<web_supplyclass> it=list.iterator();  
   web_supplyclass menu=null;   
  int seq=0;
  while(it.hasNext())
  {
  seq++;
    menu=(web_supplyclass)it.next();     
    
    %>
    <li><a href="/${username}/purvey/${menu.menuid}/<%=menu.getScid()%>"><%=menu.getScName()%></a></li>
    <%
    }
  
  }
  %> 
</ul>
</div>

<div class="lxfs"><span>联系方式</span></div>
<div class="lxfs-bottom">
<p>联系人：${member.memberRealname}</p>
<p><a target="_blank" href="http://wpa.qq.com/msgrd?v=3&uin=${member.memberQq}&site=qq&menu=yes"><img border="0" src="http://wpa.qq.com/pa?p=2:${member.memberQq}:46" alt="点击这里给我发消息" title="点击这里给我发消息"></a></p>
<p>电话：${member.memberTel}</p>
<p>地址：${website.wAddress}</p>
<p>邮箱：${website.wMail}</p>
<p>传真：${website.wFax}</p>
</div>
</div>

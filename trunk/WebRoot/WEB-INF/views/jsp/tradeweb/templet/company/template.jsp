<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@page import="com.hedgehog.domain.biz_menu"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<title>${title}-<tiles:insertAttribute name="title"/></title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<tiles:insertAttribute name="header"/>
</head>
<body style="text-align:center">
<div class="wall" style="text-align:left">
<br>
<div id="top">
<div id=top_image>
<c:choose>
 <c:when test="${! empty website.wLogo}">
<img src="/resources/files/userfiles/${username}/${website.wLogo}"/>
</c:when>
<c:otherwise>
<img src="/resources/template/company/images/jqlb_03.jpg"/>
</c:otherwise>
 </c:choose>
</div>
<div id=top_list>
<%
List<biz_menu> list=(List<biz_menu>)request.getAttribute("menuenable");
 %>
<ul>
<li><a href="/${username}/">首页</a></li>
<%
                 if(list.size()>0)
                 {
                 Iterator<biz_menu> it=list.iterator();  
   biz_menu menu=null;
   while(it.hasNext())
   {
     menu=(biz_menu)it.next(); 
     //System.out.println("栏目代号："+menu.getMenuChCode());
     //System.out.println("栏目访问视图："+menu.getChannel().getChUrl());
   %>
   <li><a href='/${username}/<%=menu.getChannel().getChUrl()%>/<%=menu.getMenuid()%>'><%=menu.getMenuName()%></a></li>   
   <%   
   }
  }                 
%>
</ul>
</div>
<!--图片轮播开始-->
<div id="img_go">
<c:choose>
 <c:when test="${! empty website.wBanner}">
 <img src="/resources/files/userfiles/${username}/${website.wBanner}"/>
</c:when>
<c:otherwise>
<img src="/resources/template/company/images/jqlb_06.jpg"/>
</c:otherwise>
 </c:choose>
</div>
</div>
<!--导航栏结束-->
<tiles:insertAttribute name="left"/>
<tiles:insertAttribute name="content"/>
<div style="clear:both"></div>
<div  class="footer">
<c:choose>
 <c:when test="${! empty website.wFootnote}">
 ${website.wFootnote}
</c:when>
<c:otherwise>
版权所有&nbsp;中山利耀织有限公司<br />
 地址：长沙中意一路| 电话：122345566<br />
 技术支持：中国工商导航
</c:otherwise>
 </c:choose>
 </div> 
</div>
</body>
</html>
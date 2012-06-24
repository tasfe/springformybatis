<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@page import="com.hedgehog.domain.*"%>
<%
String username=(String)request.getAttribute("username");
  String menuid=(String)request.getAttribute("menuid");
  
biz_menuoper menuoper=(biz_menuoper)request.getAttribute("menuoper");
biz_menu freeweb=(biz_menu)request.getAttribute("webmenu");
 %>
 <br/><br/>
 <a href="/<%=username%>/manage/admin_freeweb/<%=menuid%>">返回编辑</a>
<h4><%=menuoper.getMenuoperName()%></h4>
<%=freeweb.getMenuContent()%>

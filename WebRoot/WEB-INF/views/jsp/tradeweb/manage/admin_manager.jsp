<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@page import="com.hedgehog.domain.*"%>
<%
String username=(String)request.getAttribute("username");
biz_member member=(biz_member)request.getAttribute("member");
%>
<br/><br/>
你的网址：<a href="http://www.faydrian.com:8081/<%=username%>/" target="_blank">http://www.faydrian.com:8081/<%=username%>/</a>

<br/>
你的会员级别：<%=member.getRank().getPrank().getPrankName()%><%=member.getRank().getRankName()%><br/>
你可以进行的操作：<a href="/<%=username%>/manage/admin_attrib">基本信息</a>  <a href="/<%=username%>/manage/admin_template">选择模板</a>  <a href="/<%=username%>/manage/admin_type">栏目管理</a>  <a href="/<%=username%>/manage/admin_website">网站属性</a>  <a href="/<%=username%>/manage/admin_setpwd">帐号管理</a>


<br/>
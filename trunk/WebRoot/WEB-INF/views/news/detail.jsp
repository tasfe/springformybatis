<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>    
     <%@page import="com.hedgehog.domain.ProNew"%>
    有没有来这里
    <%
    ProNew news=(ProNew)request.getAttribute("ProNew"); 
    if(news!=null)
    {
    %>
    <H1><%=news.getNews_Title() %></H1>
    <p><%=news.getNews_Summery() %></p>
    <p><%=news.getNews_Content() %></p>
    <%
    
    }
    %>
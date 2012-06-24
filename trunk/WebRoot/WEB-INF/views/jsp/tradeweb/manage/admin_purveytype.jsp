<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@page import="com.hedgehog.domain.*"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<br/><br/>
<table width="100%" border="0" cellspacing="0" cellpadding="0" class="table">
  <tr class="tr">    
    <td class="td"><a href="?cmd=new">添加供求分类</a></td>    
  </tr>
  </table>
  <%
List<web_supplyclass> list=(List<web_supplyclass>)request.getAttribute("list_supplyclass");
if(list.size()>0)
   {
   %>
   
   <table width="100%" border="0" cellspacing="1" cellpadding="0" class="table">
  <tr class="tr">
    
    <td class="td">类名</td>
    <td>排序</td>
    <td>描述</td>
    <td>操作</td>    
  </tr>
   <%
   Iterator<web_supplyclass> it=list.iterator();  
   web_supplyclass menu=null;   
   
   while(it.hasNext())
   {
      menu=(web_supplyclass)it.next();     
   %>
   <tr class="tr">
    <td class="td"><%=menu.getScName()%></td>
    <td><%=menu.getScOrder()%></td>   
    <td><%=menu.getScDes()%></td>    
    <td><a href="?cmd=edit&id=<%=menu.getScid()%>">编辑</a>||<a href="?cmd=del&id=<%=menu.getScid()%>">删除</a></td>
  </tr>      
   <%   
   }
   %>
   </table>
   <%
   
   }   
    %>
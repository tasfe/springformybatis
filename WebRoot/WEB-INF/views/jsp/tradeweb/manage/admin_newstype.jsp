<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@page import="com.hedgehog.domain.*"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<br/><br/>

<table width="100%" border="0" cellspacing="0" cellpadding="0" class="table">
  <tr class="tr">    
    <td class="td"><a href="?cmd=new">添加分类</a></td>    
  </tr>
  </table>
<%
List<web_newsclass> list=(List<web_newsclass>)request.getAttribute("list_newsclass");
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
   Iterator<web_newsclass> it=list.iterator();  
   web_newsclass menu=null;   
   
   while(it.hasNext())
   {
      menu=(web_newsclass)it.next();
   %>
   <tr class="tr">
    <td class="td"><%=menu.getNcName()%></td>
    <td><%=menu.getNcOrder()%></td>   
    <td><%=menu.getNcDes()%></td>    
    <td><a href="?cmd=edit&id=<%=menu.getNewsclassid()%>">编辑</a>||<a href="?cmd=del&id=<%=menu.getNewsclassid()%>">删除</a></td>
  </tr>      
   <%   
   }
   %>
   </table>
   <%
   
   }   
    %>
   


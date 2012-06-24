<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@page import="com.hedgehog.domain.*"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<br/><br/>
<table width="100%" border="0" cellspacing="0" cellpadding="0" class="table">
  <tr class="tr">    
    <td class="td"><a href="?cmd=new">添加产品分类</a></td>    
  </tr>
  </table>
  <%
List<web_productclass> list=(List<web_productclass>)request.getAttribute("list_productclass");
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
   Iterator<web_productclass> it=list.iterator();  
   web_productclass menu=null;   
   
   while(it.hasNext())
   {
      menu=(web_productclass)it.next();
      
      
   %>
   <tr class="tr">
    <td class="td"><%=menu.getPcName()%></td>
    <td><%=menu.getPcOrder()%></td>   
    <td><%=menu.getPcDes()%></td>    
    <td><a href="?cmd=edit&id=<%=menu.getPcid()%>">编辑</a>||<a href="?cmd=del&id=<%=menu.getPcid()%>">删除</a></td>
  </tr>      
   <%   
   }
   %>
   </table>
   <%
   
   }   
    %>

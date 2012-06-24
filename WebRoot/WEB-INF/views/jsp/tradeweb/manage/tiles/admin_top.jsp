<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@page import="com.hedgehog.domain.biz_menu"%>
<%@ page import="java.util.Iterator" %>
<%@page import="java.util.List"%>
<%
String username=(String)request.getAttribute("username");
List<biz_menu> list=(List<biz_menu>)request.getAttribute("menuenable");
 %>
<table width="100%" height="30" border="0" cellpadding="0" cellspacing="0">
  <tr> 
    <td><div align="left"><b><img src="/resources/admin/images/tiao.gif" width="778" height="47"/></b></div></td>
	</tr>
</table>
<table width="100%" height="28" border="0" cellpadding="0" cellspacing="0" class="HeaderTdStyle">
  <tr> 
    <td> 
      <table width="100%" height="30" border="0" cellpadding="0" cellspacing="0">
        <tr> 
          <td align="center" bgcolor="#3886D0" >
			 <div align="left">
			 <strong><font color="#808000"><a href="admin_type"><font color="#FFFFFF">　</font></a></font></strong><a href="/<%=username%>/manage/admin_type"><font color="#FFFFFF">系统管理</font> </a>
                 <font color="#FFFFFF">|</font>			     <font color="#FFFFFF"> 
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
   <a href='/<%=username%>/manage/admin_<%=menu.getChannel().getChUrl()%>/<%=menu.getMenuid()%>'><font color='#FFFFFF'><%=menu.getMenuName()%></font></a> | 
   <%   
   }
                 }                 
 %>
                 
                 <a href="/<%=username%>/manage/admin_updown"><font color="#FFFFFF">网络硬盘 </font></a>|<a href="/<%=username%>/manage/admin_logout"> <font color="#FFFFFF">退出管理</font></a> </font>  </div></td>
        </tr>
      </table></td>
  </tr>
</table>

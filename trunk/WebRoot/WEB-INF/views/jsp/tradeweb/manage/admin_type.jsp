<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@page import="com.hedgehog.domain.biz_menu"%>
<%@ page import="java.util.Iterator" %>
<%@page import="java.util.List"%>
<br/><br/>
<table width="100%" border="0" cellspacing="0" cellpadding="0" class="table">
  <tr class="tr">    
    <td class="td"><a href="?cmd=new">添加新栏目</a></td>    
  </tr>
  </table> 

<%
   
   List<biz_menu> list=(List<biz_menu>)request.getAttribute("menu");
   if(list.size()>0)
   {
   %>
   
   <table width="100%" border="0" cellspacing="1" cellpadding="0" class="table">
  <tr class="tr">
    <td class="td">序号</td>
    <td>名称</td>
    <td>类型</td>    
    <td>状态</td>
    <td>操作</td>
    <td>&nbsp;</td>
    <td>&nbsp;</td>
    <td>&nbsp;</td>
  </tr>
   <%
   Iterator<biz_menu> it=list.iterator();  
   biz_menu menu=null;
   String[] strArray={"<font color=\"#CC9900\">禁用</font>","<font color=\"#FF0000\">启用</font>"}; 
   
   while(it.hasNext())
   {
   menu=(biz_menu)it.next();
   //menu.getChannel().getChName();
   
   %>
   <tr class="tr">
    <td class="td"><%=menu.getMenuIndex()%></td>
    <td><%=menu.getMenuName()%></td>
    <td><%=menu.getChannel().getChName()%></td>
    <td><%=strArray[menu.getMenuEnable()]%></td>
    <td>   
    <a href="?cmd=edit&menuid=<%=menu.getMenuid()%>">编辑</a>||<a href="?cmd=del&menuid=<%=menu.getMenuid()%>" onclick="javascript:return p_del()">删除</a>    
</td>
    <td>&nbsp;</td>
    <td>&nbsp;</td>
    <td>&nbsp;</td>
  </tr>      
   <%
   
   }
   %>
   </table>
   <%
   
   }   
    %>
    <script language="javascript" type="text/javascript">
<!--
function p_del() {
var msg = "您真的确定要删除吗？\n\n请确认！";
if (confirm(msg)==true){
return true;
}else{
return false;
}
}
// -->
    </script>


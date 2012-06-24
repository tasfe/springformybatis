<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@page import="com.hedgehog.domain.biz_menuoper"%>
<%@page import="com.hedgehog.domain.biz_submenuoper"%>
<%@ page import="java.util.Iterator" %>
<%@page import="java.util.List"%>
<%
  String username=(String)request.getAttribute("username");
  String menuid=(String)request.getAttribute("menuid");
  biz_menuoper menuoper=(biz_menuoper)request.getAttribute("menuoper");
  
   %>
<table width="150" height="100%" border="0" cellpadding="0" cellspacing="0" class="HeaderTdStyle">
        	<tr> 
          <td align="center" valign="top"><table width="100%" height="24" border="0" cellpadding="0" cellspacing="0">
              <tr> 
                <td align="center">功能菜单</td>
              </tr>
            </table>
            <table width="100%" height="508" border="0" cellpadding="0" cellspacing="0" class="MenuBg">
              <tr> 
                <td align="center" valign="top"><br> 
                
                <table width="90%" border="0" cellpadding="0" cellspacing="0">
                    <tr> 
                      <td width="16%"><img src="/resources/admin/images/Left_1.gif" width="28" height="11"></td>
                      <td width="84%" height="20"><div align="left"><font color="#FFFF00"><%=menuoper.getMenuoperName()%></font></div></td>
                    </tr>
                  </table>
                  <%
                  List<biz_submenuoper> list_submenuoper=menuoper.getList_submenuoper();
                  if(list_submenuoper.size()>0)
                  {
                  
                  Iterator<biz_submenuoper> it=list_submenuoper.iterator();  
   biz_submenuoper submenuoper=null;
   while(it.hasNext())
   {
      submenuoper=(biz_submenuoper)it.next(); 
      
      
      %>
      <table width="90%" height="28" border="0" cellpadding="0" cellspacing="0">
                    <tr> 
                      <td width="34%" height="20" align="right"><img src="/resources/admin/images/Left_1_1.gif" width="29" height="16"></td>
                      <td width="66%" valign="bottom"><div align="left"><a href="/<%=username%>/manage/<%=submenuoper.getSubmenuoperLink()%>/<%=menuid%>"><font color="#FFFF00"><%=submenuoper.getSubmenuoperName()%></font></a></div></td>
                    </tr>
                  </table>
      
      <%   
   }       
                  } 
                   %>
				  <p>&nbsp;</p></td>
              </tr>
            </table></td>
        </tr>
</table>
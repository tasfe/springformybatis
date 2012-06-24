<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@page import="com.hedgehog.domain.*"%>
<br/><br/>
<%
String username=(String)request.getAttribute("username");

List<web_friendlink> list_friendlink=(List<web_friendlink>)request.getAttribute("list_friendlink");
		
 %>
<TABLE width="100%" height="100%" border=0 cellPadding=0 cellSpacing=0>
                      
                        <TBODY>
                          <TR> 
                            <TD vAlign=top align=left bgColor=#ffffff> 
                              <table width="100%" border="0" cellpadding="0" cellspacing="1" bgcolor="#A4B9D7">
                                <tr> 
                                  <td height="0" valign="top">
<table width="100%" border="0" cellspacing="0" cellpadding="0">
                                      <tr> 
                                        <td height="40"> <table width="100%" border="0" cellspacing="0" cellpadding="0">
                                            <tr>
                                              <td height="30" valign="bottom"> 
                                                <table border="0" cellspacing="0" cellpadding="0">
                                                  <tr> 
                                                    <td width="0"><IMG height=21 id=itab_0 src="/resources/admin/images/tab_7.gif" 
            width=9></td>
                                                    <td width="100" align="center" valign="baseline" background="/resources/admin/images/tab_b1.gif"><a href="admin_website2"><font color="#FFFFFF">自由首页</font></a></td>
                                                    <td width="0"><IMG height=21 id=itab_2 src="/resources/admin/images/tab_5.gif" 
            width=9></td>
                                                    <td width="100" align="center" valign="baseline" background="/resources/admin/images/tab_b1.gif"><a href="admin_website"><font color="#FFFFFF">常规属性</font></a></td>
                                                    <td width="0"><IMG height=21 id=itab_4 src="/resources/admin/images/tab_2.gif" 
            width=9></td>
            <td width="100" align="center" valign="baseline" background="/resources/admin/images/tab_b1.gif"><a href="admin_website1"><font color="#FFFFFF">网站脚注</font></a></td>
                                                    <td width="0"><IMG height=21 id=itab_4 src="/resources/admin/images/tab_2.gif" 
            width=9></td>
                                                    <td width="80" align="center" valign="baseline" background="/resources/admin/images/tab_b2.gif">友情链接</td>
                                                    <td width="9%"><IMG height=21 id=itab_8 src="/resources/admin/images/tab_3.gif" 
            width=9></td>
                                                  </tr>
                                                </table>
                                              </td>
                                            </tr>
                                          </table> 
                                          <table width="100%" border="0" cellspacing="0" cellpadding="0">
                                            <tr> 
                                              <td height="397" valign="top" bgcolor="#FFFFFF"><table width="100%" border="0" cellspacing="0" cellpadding="0">
                                                <tr> 
                                                  <td>&nbsp;</td>
                                                </tr>
                                                <tr> 
                                                  <td align="center"> 
<table width="100%" border="0" cellspacing="0" cellpadding="0" class="table">
  <tr class="tr">    
    <td class="td"><a href="?cmd=new">添加友情链接</a></td>    
  </tr>
  </table>  
<%
if(list_friendlink.size()>0)
{
%>
  <table width="100%" border="0" cellspacing="1" cellpadding="0" class="table">
  <tr class="tr">
    
    <td class="td">序号</td>
    <td>标题</td>
    <td>URL地址</td>
    <td>排序</td>    
    <td>操作</td>    
  </tr>
  <%
  Iterator<web_friendlink> it=list_friendlink.iterator();  
 web_friendlink news=null;
  //SimpleDateFormat df=new SimpleDateFormat("yyyy-MM-dd");//.format(news.getNewsUpdateTime());
  
  //df.format(news.getNewsUpdateTime())
  //news.getNewsUpdateTime();
  int seq=0;
  while(it.hasNext())
  {
  seq++;
    news=(web_friendlink)it.next();    
    //String updatetime=df.format(news.getNewsUpdatetime());
    
    
    //news.getNewsid();
  %>
  <tr class="tr">
    
    <td class="td"><%=seq%></td>
    <td><%=news.getFriendlinkTitle()%></td>
    <td><%=news.getFriendlinkUrl()%></td>
    <td><%=news.getFriendlinkOrder()%></td>    
    <td><a href="?cmd=edit&id=<%=news.getFriendlinkId()%>">编辑</a>||<a href="?cmd=del&id=<%=news.getFriendlinkId()%>" onclick="javascript:return p_del()">删除</a></td>    
  </tr>   
  <%
  }  
  %>
  </table>
  <%  
}


 %>												  
												  </td>
                                                </tr>
                                                <tr> 
                                                  <td>&nbsp;</td>
                                                </tr>                                                
                                              </table></td>
                                            </tr>
                                          </table>
										  
										  </td>
                                      </tr>
                                    </table>
                                  </td>
                                </tr>
                              </table> 
                            </TD>
                          </TR>
                        </TBODY>                    
                      </TABLE>
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

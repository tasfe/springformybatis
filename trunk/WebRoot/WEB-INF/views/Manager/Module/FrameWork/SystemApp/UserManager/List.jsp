<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@page import="com.hedgehog.domain.*"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<spring:url var="rpath" value="/resources/manager" />

<!-- 头部菜单 Start -->
	        <table border='0' cellpadding='0' cellspacing='0' width='100%' align='center'>
              <tr>
                <td class='menubar_title'><img border='0' src='${rpath}/images/ICON/applist.gif' align='absmiddle' hspace='3' vspace='3'>&nbsp;用户资料管理</td>
                <td class='menubar_readme_text' valign='bottom'><img src='${rpath}/images/ICON/office.gif' align='absMiddle' border='0' />&nbsp;帮助？</td>
              </tr>
              <tr>
                <td height='27px' class='menubar_function_text'>目前操作功能：用户资料列表</td>
                <td class='menubar_menu_td' align='right'><table border="0" cellspacing="0" cellpadding="0"><tr><td class="menubar_button" id="button_0" OnClick="JavaScript:window.location.href='?cmd=new';" OnMouseOut="javascript:MenuOnMouseOver(this);" OnMouseOver="javascript:MenuOnMouseOut(this);"><img border="0" align="texttop" src="${rpath}/images/ICON/new.gif">&nbsp;新增用户</td></tr></table></td>
              </tr>
              <tr><td height='5px' colspan='2'></td></tr>
            </table>
        <!-- 头部菜单 End -->
        <TABLE cellSpacing=0 cellPadding=0 width='100%' align=center border=0>   
        <TBODY>   
	        <TR>     
		        <TD style='PADDING-LEFT: 2px; HEIGHT: 22px' background='${rpath}/images/Menu/tab_top_bg.gif'>
			        <TABLE cellSpacing=0 cellPadding=0 border=0>
				        <TBODY><TR>
                                    <!--按钮　Start-->
                                    <TD >
	        <TABLE height=22 cellSpacing=0 cellPadding=0 border=0>
		        <TBODY>
                       <TR>
				         <TD width=3><IMG id=tabImgLeft__0 height=22 src='${rpath}/images/Menu/tab_unactive_left.gif'  width=3></TD>
				         <TD class=tab id=tabLabel__0 onclick='javascript:tabClick(0,1)' background='${rpath}/images/Menu/tab_unactive_bg.gif' UNSELECTABLE='on'>用户资料列表</TD>
				         <TD width=3><IMG id=tabImgRight__0 height=22 src='${rpath}/images/Menu/tab_unactive_right.gif' width=3></TD>
			           </TR>
		        </TBODY>
	        </TABLE>
        </TD>
                                    <!--按钮 End-->
						        </TR>
				        </TBODY>
			        </TABLE>
		        </TD>
	        </TR>
	        <TR>
	        <TD bgColor=#ffffff>           
		        <TABLE cellSpacing=0 cellPadding=0 width='100%' border=0>
		        <TBODY>
		        <TR>
			        <TD width=1 background='${rpath}/images/Menu/tab_bg.gif'><IMG  height=1 src='${rpath}/images/Menu/tab_bg.gif'  width=1></TD>
			        <TD style='PADDING-RIGHT: 15px; PADDING-LEFT: 15px; PADDING-BOTTOM: 15px; PADDING-TOP: 15px; HEIGHT: 100px' vAlign=top>
        <input type='hidden' ID='FrameWork_YOYO_LzppccSelectIndex' name='FrameWork_YOYO_LzppccSelectIndex' value='0'>
        <!--内容框Start-->
        <DIV id='tabContent__0'>
           
            <div>
         <%
  List<sys_User> list=(List<sys_User>)request.getAttribute("userlist"); 
  QueryParam qp=(QueryParam)request.getAttribute("queryParam");
  int pagecount=qp.getPageCount();
  int pageNo=qp.getPageIndex();  
  int pagesize=qp.getPageSize();
  if(list.size()>0)
  { 
  String[] strArray={"正常","禁止"}; 
             %>
<table class="table-box" cellspacing="1" border="0" id="ctl00_PageBody_GridView1" style="background-color:White;border-width:0px;">
		<tr class="table_title" align="center">
			<th scope="col">员工编号</th><th scope="col">用户名</th><th scope="col">中文名</th><th scope="col">用户状态</th><th scope="col">操作</th>
		</tr>
		<%
  Iterator<sys_User> it=list.iterator();  
 sys_User app=null;
  //SimpleDateFormat df=new SimpleDateFormat("yyyy-MM-dd");//.format(news.getNewsUpdateTime());
  //df.format(news.getNewsUpdateTime())
  //news.getNewsUpdateTime();
  int seq=0;
  while(it.hasNext())
  {
  seq++;
    app=(sys_User)it.next();
    //app.getuUserno();
    //app.getuLoginname();
    //app.getuCname();
    //app.getuWorkstartdate();
    //app.getuStatus();
    //app.getUserid()    
    %>
    <tr class="<%=seq%2==1?"row":"row1"%>" align="center" style="height:28px;">
			<td><%=app.getuUserno()%></td>
			<td><%=app.getuLoginname()%></td>
			<td><%=app.getuCname()%></td>
			<td><%=strArray[app.getuStatus()]%></td>
			<td><a href="?cmd=edit&id=<%=app.getUserid()%>">编辑</a>||<a href="JavaScript:DelData('?cmd=del&id=<%=app.getUserid()%>')">删除</a></td>
		</tr>
    <%
    
    }
    %>		
</table>
<%
  }
   %>
</div>
            
            
<!-- AspNetPager V6.0.0 for VS2005  Copyright:2003-2006 Webdiyer (www.webdiyer.com) -->
<div id="ctl00_PageBody_Pager">
<%
  if(pagecount>1 )
  {
  int perpagecount=10;
  
int startpage=pageNo%perpagecount!=0?(pageNo/perpagecount)*perpagecount+1:(pageNo/perpagecount)*perpagecount+1-perpagecount;
//int startpage = ((qp.pageNo + perpagecount - 1) / perpagecount - 1) * perpagecount+1;
int endpage=pageNo%perpagecount!=0?(pageNo/perpagecount+1)*perpagecount:(pageNo/perpagecount)*perpagecount;
//int endpage = ((qp.pageNo + perpagecount - 1) / perpagecount) * perpagecount;
endpage=endpage>pagecount?pagecount:endpage;

if(pageNo!=1)
{
%>
<a href="?page=1">首页</a><a href="?page=<%=pageNo-1%>">上一页</a>
<%
}
else
{
%>
首页 上一页
<%

}
int turnNo=pageNo%perpagecount!=0?pageNo/perpagecount:pageNo/perpagecount-1;
int turnCount=pagecount%perpagecount!=0?pagecount/perpagecount:pagecount/perpagecount-1;
%>

<%
if(turnNo>0)
{
%>
<a href="?page=<%=startpage-1%>">&lt;&lt;</a>
<%

}
for(int i=startpage;i<=endpage;i++)
{
if(i==pageNo)
{
%>
<a href="?page=<%=Integer.toString(i)%>" style="color:red;"><%=Integer.toString(i)%></a>
<%
continue;
}
%>
<a href="?page=<%=Integer.toString(i)%>"><%=Integer.toString(i)%></a>
<%

}
if(turnNo<turnCount)
{
%>
<a href="?page=<%=endpage+1%>">&gt;&gt;</a>
<%
}
if(pageNo!=pagecount)
{
%>
<a href="?page=<%=pageNo+1%>">下一页</a><a href="?page=<%=pagecount%>">尾页</a>
<%

}
else
{
%>下一页 尾页<%

}
  
  }
%>
</div>
<!-- AspNetPager V6.0.0 for VS2005 End -->


           
        </DIV><!--内容框End-->
			        </TD>
			        <TD width=1 background='${rpath}/images/Menu/tab_bg.gif'><IMG height=1 src='${rpath}/images/Menu/tab_bg.gif'  width=1></TD>
		        </TR>
		        </TBODY>
		        </TABLE>
	        </TD>
	        </TR>
	        <TR>
		        <TD background='${rpath}/images/Menu/tab_bg.gif' bgColor='#ffffff'><IMG height=1 src='${rpath}/images/Menu/tab_bg.gif' width='1'></TD>
	        </TR>
        </TBODY>
        </TABLE>

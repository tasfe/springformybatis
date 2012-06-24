<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@page import="com.hedgehog.domain.*"%>
<br/><br/>
<%
String username=(String)request.getAttribute("username");
List<biz_templet_class> list_tc=(List<biz_templet_class>)request.getAttribute("list_tc");

List<biz_templet> list_templet=(List<biz_templet>)request.getAttribute("list_templet");
QueryParam qp=(QueryParam)request.getAttribute("queryParam");
  int pagecount=qp.getPageCount();
  int pageNo=qp.getPageIndex();  
  int pagesize=qp.getPageSize();
if(list_tc.size()>0)
{
%>
<div style="display:block;">
<ul>
<%

Iterator<biz_templet_class> it=list_tc.iterator();  
   biz_templet_class menu=null;   
   
   while(it.hasNext())
   {
      menu=(biz_templet_class)it.next();
      
      %>
     <li><%=menu.getTcName()%></li>
      <%
      }
      %>
</ul>
</div>
<%
}
if(list_templet.size()>0)
{
%>
<div style="display:block;text-align:left;margin-top:40px;">
<ul>
<%

Iterator<biz_templet> it=list_templet.iterator();  
   biz_templet templet=null;   
   
   while(it.hasNext())
   {
      templet=(biz_templet)it.next();
      
      %>
     <li style="text-align:center;">
     <img src="/resources/files/templet/<%=templet.getTempletCode()%>.jpg" width="200px" height="120px"/><br/>
     <%=templet.getTempletName()%>
      <input type="button" name="Submit" value="我要这个" onclick="if(confirm('信息提示：\n您真的要更改模板吗　\n\n如确实要更改模板，建议您先将数据备份到本地硬盘！　')){location='?templet=<%=templet.getTempletCode()%>';}">
     </li>
      <%
      }
      %>
</ul>
</div>
<%
}
%>
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
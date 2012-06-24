<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@page import="com.hedgehog.domain.*"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="com.hedgehog.domain.QueryParam"%>
<br/><br/>
<table width="100%" border="0" cellspacing="0" cellpadding="0" class="table">
  <tr class="tr">    
    <td class="td"><a href="?cmd=new">添加客户留言</a></td>    
  </tr>
  </table>  
  <%
  List<web_guestbook> list=(List<web_guestbook>)request.getAttribute("list_guestbook");
  QueryParam qp=(QueryParam)request.getAttribute("queryParam");
  int pagecount=qp.getPageCount();
  int pageNo=qp.getPageIndex();
  
  int pagesize=qp.getPageSize();

  if(list.size()>0)
  {
  %>
  <table width="100%" border="0" cellspacing="1" cellpadding="0" class="table">
  <tr class="tr">
    
    <td class="td">序号</td>
    <td>昵称</td>
    <td>内容</td>
    <td>来源</td>    
    <td>留言时间</td>
    <td>操作</td>    
  </tr>
  <%
  Iterator<web_guestbook> it=list.iterator();  
  web_guestbook news=null;
  SimpleDateFormat df=new SimpleDateFormat("yyyy-MM-dd");//.format(news.getNewsUpdateTime());
  
  //df.format(news.getNewsUpdateTime())
  //news.getNewsUpdateTime();
  int seq=0;
  while(it.hasNext())
  {
  seq++;
    news=(web_guestbook)it.next();    
    String updatetime=df.format(news.getGbDatetime());
    
    //news.getNewsid();
  %>
  <tr class="tr">
    
    <td class="td"><%=((pageNo-1)*pagesize)+seq%></td>
    <td><%=news.getGbNikename()%></td>

    <td><%=news.getGbContent()%></td>
    <td><%=news.getGbClientip()%></td>
    <td><%=updatetime%></td>
    <td><a href="?cmd=edit&id=<%=news.getGuestbookid()%>">编辑</a>||<a href="?cmd=del&id=<%=news.getGuestbookid()%>" onclick="javascript:return p_del()">删除</a></td>    
  </tr>   
  <%
  }  
  %>
  </table>
  <%  
  }
  
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

<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@page import="com.hedgehog.domain.biz_member"%>
<%@ page import="java.util.Iterator" %>
<%@page import="java.util.List"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="com.hedgehog.domain.QueryParam"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>用户列表</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
  <a href="/member/register">注册会员</a>
    <%
    List<biz_member> list=(List<biz_member>)request.getAttribute("userlist");
    if(list.size()>0)
  {
  %>
  <ul>
  <%
  Iterator it=list.iterator();  
  biz_member member=null;
  SimpleDateFormat df=new SimpleDateFormat("yyyy-MM-dd");//.format(news.getNewsUpdateTime());
  //df.format(news.getNewsUpdateTime())
  //news.getNewsUpdateTime();
  while(it.hasNext())
  {
    member=(biz_member)it.next();
  %>
    <li><a href="<%=member.getMemberid()%>" target="_blank"><%=member.getMemberName()%></a>------<a href="/member/edit?id=<%=member.getMemberid()%>">编辑</a>||<a href="/member/delete?id=<%=member.getMemberid()%>">删除</a></li>
  <%
  }  
  %>
  </ul>
  <%  
  }
  QueryParam qp=(QueryParam)request.getAttribute("queryParam");
  int pagecount=qp.getPageCount();
  int pageNo=qp.getPageIndex();
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
  </body>
</html>

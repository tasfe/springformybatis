<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@page import="com.hedgehog.domain.*"%>
<%@page import="com.hedgehog.domain.QueryParam"%>
<div style="clear:both"></div>
<div id="left">
<div class="left-top"><span> ${nav}</span> </div>
<div class="left-bottom">
<div class="left-bottom-left">
<ul>
<%
List<biz_website> list_website1=(List<biz_website>)request.getAttribute("tradelist");
if(list_website1.size()>0)
{
Iterator<biz_website> it=list_website1.iterator();  
   biz_website website=null;   
   
   while(it.hasNext())
   {
   website=(biz_website)it.next();
   %>
     <li><span><a href="/city/<%=website.getCity().getCityCode()%>" target="_blank"><%=website.getCity().getCityName()%></a></span><a id="link"  href="/<%=website.getMember().getMemberName()%>/" target="_blank"><%=website.getwComname()%>|</a></li>
     <%
   }
}
 %>
</ul>
</div>
</div>
<%
QueryParam qp=(QueryParam)request.getAttribute("queryParam");
  int pagecount=qp.getPageCount();
  int pageNo=qp.getPageIndex();
  
  int pagesize=qp.getPageSize();
 %>
<div class="p">
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
</div>


<div id="right">
<div class="guanggao2"> <img src="/resources/images/guanggaos.png" /> </div>
<div class="right-top"> <span> 最新推荐企业</span></div>
<div  class="right-bottom">
<ul>
<%
List<biz_website> list_website_tuijian=(List<biz_website>)request.getAttribute("tradelist_tuijian");
if(list_website_tuijian.size()>0)
{
Iterator<biz_website> it=list_website_tuijian.iterator();  
   biz_website website=null;   
   int seq=0;
   while(it.hasNext())
   {
   website=(biz_website)it.next();
   %>
     <li><span><a href="/city/<%=website.getCity().getCityCode()%>" target="_blank"><%=website.getCity().getCityName()%></a></span><a id="link"  href="/<%=website.getMember().getMemberName()%>/" target="_blank"><%=website.getwComname()%>|</a></li>
     <%
   }
   }
%>
</ul>
 </div> 
 </div>

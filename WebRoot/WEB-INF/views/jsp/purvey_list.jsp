<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@page import="com.hedgehog.domain.*"%>
<div style="clear:both"></div>
<!--最新供应信息开始-->
<div class="left_top"><span>最新${nav}信息</span> </div>
<div class="right_top"><p>推荐求购信息</p></div>

<div class="gyxxlb_bottom">
  <div class="left_bottom">
   
   <div class="left_bottom_left">
 <ul>
 <%
List<web_supplyinfo> list_supplyinfo=(List<web_supplyinfo>)request.getAttribute("list_supplyinfo");
  if(list_supplyinfo.size()>0)
  {
  Iterator<web_supplyinfo> it=list_supplyinfo.iterator();  
  web_supplyinfo supplyinfo=null;
  while(it.hasNext())
  {    
    supplyinfo=(web_supplyinfo)it.next();
    %>
<li><span><a href="/city/<%=supplyinfo.getMenu().getMember().getWebsite().getCity().getCityCode()%>" target="_blank"><%=supplyinfo.getMenu().getMember().getWebsite().getCity().getCityName()%></a></span> 
<a id="link" href="/<%=supplyinfo.getMenu().getMember().getMemberName()%>/purvey/<%=supplyinfo.getSupplyinfoMenuid()%>/<%=supplyinfo.getSupplyinfoSc()%>/<%=supplyinfo.getSupplyinfoid()%>" target="_blank">  <span id="gq_left">【供】</span><%=supplyinfo.getSupplyinfoTitle()%></a></li>

    <%
    }
}
%>
</ul>  
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

   <div class="right_bottom">
  <div class="right_bottom_top">
       <ul>

<%
List<web_supplyinfo> list_supplyinfo1_tujian=(List<web_supplyinfo>)request.getAttribute("list_supplyinfo1_tuijian");
  if(list_supplyinfo1_tujian.size()>0)
  {
  Iterator<web_supplyinfo> it=list_supplyinfo1_tujian.iterator();  
  web_supplyinfo supplyinfo=null;
  while(it.hasNext())
  {    
    supplyinfo=(web_supplyinfo)it.next();
    %>
<li><span><a href="/city/<%=supplyinfo.getMenu().getMember().getWebsite().getCity().getCityCode()%>" target="_blank"><%=supplyinfo.getMenu().getMember().getWebsite().getCity().getCityName()%></a></span> 
<a id="link" href="/<%=supplyinfo.getMenu().getMember().getMemberName()%>/purvey/<%=supplyinfo.getSupplyinfoMenuid()%>/<%=supplyinfo.getSupplyinfoSc()%>/<%=supplyinfo.getSupplyinfoid()%>" target="_blank">  <span id="gq_left">【供】</span><%=supplyinfo.getSupplyinfoTitle()%></a></li>

    <%
    }
}
 %>


</ul>   
 </div> 
 <div style="clear:both"></div>
 <div class="right_bottom_tupian"><p>推荐求购信息</p></div>
 
   <div class="right_bottom_top">
       <ul>
<%
List<web_supplyinfo> list_supplyinfo2_tujian=(List<web_supplyinfo>)request.getAttribute("list_supplyinfo2_tuijian");
  if(list_supplyinfo2_tujian.size()>0)
  {
  Iterator<web_supplyinfo> it=list_supplyinfo2_tujian.iterator();  
  web_supplyinfo supplyinfo=null;
  while(it.hasNext())
  {    
    supplyinfo=(web_supplyinfo)it.next();
    %>
<li><span><a href="/city/<%=supplyinfo.getMenu().getMember().getWebsite().getCity().getCityCode()%>" target="_blank"><%=supplyinfo.getMenu().getMember().getWebsite().getCity().getCityName()%></a></span> 
<a id="link" href="/<%=supplyinfo.getMenu().getMember().getMemberName()%>/purvey/<%=supplyinfo.getSupplyinfoMenuid()%>/<%=supplyinfo.getSupplyinfoSc()%>/<%=supplyinfo.getSupplyinfoid()%>" target="_blank">  <span id="gq_left">【求】</span><%=supplyinfo.getSupplyinfoTitle()%></a></li>

    <%
    }
}
 %>
</ul>   
 </div> 
   </div> 
      </div>
<div style="clear:both"></div>
<div class="diduan"></div>
<!--最新供应信息结束-->
<div style="clear:both"></div>
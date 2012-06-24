<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@page import="com.hedgehog.domain.*"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="com.hedgehog.domain.QueryParam"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<div id="right">
<div class="right-top-top">
  <span>${menu.menuName}</span> &gt;&gt;<span><c:if test="${! empty productclass}">${productclass.pcName}</c:if></span> </div>
    <div class="right-bottom"> 
<ul>
<c:if test="${! empty list_product}">
<%
List<web_product> list=(List<web_product>)request.getAttribute("list_product");
if(list.size()>0)
{
  Iterator<web_product> it=list.iterator();  
  web_product product=null;
  SimpleDateFormat df=new SimpleDateFormat("yyyy-MM-dd");//.format(news.getNewsUpdateTime());
  
  //df.format(news.getNewsUpdateTime())
  //news.getNewsUpdateTime();
  int seq=0;
  while(it.hasNext())
  {
  seq++;
    product=(web_product)it.next();     
    //String updatetime=df.format(news.getNewsUpdatetime());    
    %>
    <li>
      <div class="right-bottom-img"><a href="/${username}/product/${menu.menuid}/${productclass.pcid}/<%=product.getProductid()%>"><img src="<%=product.getProductThumbs()%>" /></a></div> 
  <h2><a href="/${username}/product/${menu.menuid}/${productclass.pcid}/<%=product.getProductid()%>"><%=product.getProductName()%></a></h2>
    <h2>&yen;<font color="#ff00">&nbsp;<%=product.getProductPromote()%></font></h2>
    
  </li>
   
    <%
    }
}
 %>
</c:if>

</ul>
    </div>  
<div style="clear:both"></div>   

<div class="p">
<c:if test="${! empty queryParam}">
<%
QueryParam qp=(QueryParam)request.getAttribute("queryParam");
  int pagecount=qp.getPageCount();
  int pageNo=qp.getPageIndex();
  
  int pagesize=qp.getPageSize();
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
</c:if>
</div>
</div>
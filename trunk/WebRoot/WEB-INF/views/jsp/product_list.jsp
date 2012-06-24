<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@page import="com.hedgehog.domain.*"%>
<div style="clear:both"></div>
<div id="left">
<div class="left1"> <span>${nav}</span></div>
<div class="left2">
<ul>
<%
List<web_product> list_product=(List<web_product>)request.getAttribute("list_product");
if(list_product.size()>0)
{
Iterator<web_product> it=list_product.iterator();  
  web_product product=null;
  while(it.hasNext())
  {    
    product=(web_product)it.next();
    %>
    <li><a href="/<%=product.getMenu().getMember().getMemberName()%>/product/<%=product.getProductMenuid()%>/<%=product.getProductClass()%>/<%=product.getProductid()%>" target="_blank"><img src="<%=product.getProductThumbs()%>" width="108" height="89" /></a><p><a href="/<%=product.getMenu().getMember().getMemberName()%>/product/<%=product.getProductMenuid()%>/<%=product.getProductClass()%>/<%=product.getProductid()%>" target="_blank"><%=product.getProductName()%></a></p> </li>
    <%
    }
}
%>
</ul>
</div>
<div style="clear:both"></div>
<div class="left3"></div>
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
<div class="guanggao"><img src="/resources/images/guanggao.png" /></div>
<div class="right1"> <span>推荐产品</span></div>
<div class="right2">
<ul>
<%
List<web_product> list_product_tuijian=(List<web_product>)request.getAttribute("list_product_tuijian");
if(list_product_tuijian.size()>0)
{
Iterator<web_product> it=list_product_tuijian.iterator();  
  web_product product=null;
  while(it.hasNext())
  {    
    product=(web_product)it.next();    
    %>
    <li><a href="/<%=product.getMenu().getMember().getMemberName()%>/product/<%=product.getProductMenuid()%>/<%=product.getProductClass()%>/<%=product.getProductid()%>" target="_blank"><img src="<%=product.getProductThumbs()%>" width="108" height="89" /></a><p><a href="/<%=product.getMenu().getMember().getMemberName()%>/product/<%=product.getProductMenuid()%>/<%=product.getProductClass()%>/<%=product.getProductid()%>" target="_blank"><%=product.getProductName()%></a></p> </li>
    <%
  }
}
%>
</ul>
 </div>
<div class="right3"></div>
<div class="guanggao"><img src="/resources/images/guanggao.png" /></div>
 </div>
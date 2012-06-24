<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@page import="com.hedgehog.domain.*"%>
<div id="left">
<div class="zxsm"><span>最新商贸通加强版产品<a href="/product/list/1/2">更多 >></a></span></div>
<div class="leftd">
<ul>
<%
List<web_product> list_product=(List<web_product>)request.getAttribute("list_product_jiaqiang");
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
<div class="guanggao2"><img src="/resources/images/guanggao2.png" /></div>
<div class="zxsm"><span>最新商贸通标准版产品<a href="/product/list/1/1">更多 >></a></span></div>
<div class="leftd">
<ul>
<%
List<web_product> list_product2=(List<web_product>)request.getAttribute("list_product_biaozhun");
if(list_product2.size()>0)
{
Iterator<web_product> it=list_product2.iterator();  
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
<div class="guanggao2"><img src="/resources/images/guanggao2.png" /></div>
<div class="zxsm"><span>最新生意通产品<a href="/product/list/2">更多 >></a></span></div>
<div class="leftd">
<ul>
<%
List<web_product> list_product3=(List<web_product>)request.getAttribute("list_product_shengyi");
if(list_product3.size()>0)
{
Iterator<web_product> it=list_product3.iterator();  
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
<div class="guanggao2"><img src="/resources/images/guanggao2.png" /></div>
</div>

<div id="right">

<div class="guanggao"><img src="/resources/images/guanggao8.png" /></div>
<div class="tjcp"><span> 推荐产品 </span></div>
<div class="rightd">

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
 <div class="guanggao"><img src="/resources/images/guanggao8.png" /></div>


 </div>

<div>
 <div style="clear:both"></div>

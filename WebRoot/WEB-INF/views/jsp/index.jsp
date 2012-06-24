<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@page import="com.hedgehog.domain.*"%>
<!--最新加入企业开始-->
<div class="join">
<div class="join_top">
<h1><a href="">最新加入企业</a></h1>
<span><a href="">我要加入</a><img src="/resources/images/join_jt.gif" border="0" /></span>
</div>

<div class="join_bottom">
<div class="join_bottom_smtjq">
<div class="join_bottom_smtjq_top"><img src="/resources/images/smt_jq.gif" border="0" /><span><a href="/trade/list/2">更多&gt;&gt;</a></span></div>
<div class="join_bottom_smtjq_bottom">
<ul>
<%
List<biz_website> list_website1=(List<biz_website>)request.getAttribute("tradelist_jiaqiang");
if(list_website1.size()>0)
{
Iterator<biz_website> it=list_website1.iterator();  
   biz_website website=null;   
   int seq=0;
   while(it.hasNext())
   {
     seq++;
     website=(biz_website)it.next();     
     if(seq==1||seq==9)
     {
     %>
     <li><a id="link" href="/<%=website.getMember().getMemberName()%>/" target="_blank"><%=website.getwComname()%></a><span><a href="/city/<%=website.getCity().getCityCode()%>" target="_blank"><%=website.getCity().getCityName()%></a></span></li>
     <%
     continue;
     }
     
     %>
     <li><span><a href="/city/<%=website.getCity().getCityCode()%>" target="_blank"><%=website.getCity().getCityName()%></a></span><a id="link"  href="/<%=website.getMember().getMemberName()%>/" target="_blank"><%=website.getwComname()%>|</a></li>
     <%
   }
}
 %>
</ul>
</div>
</div>

<div class="join_fg"></div>

<div class="join_bottom_smtbz">
<div class="join_bottom_smtbz_top"><img src="/resources/images/smt_bz.gif" border="0" /><span><a href="/trade/list/1">更多&gt;&gt;</a></span></div>
<div class="join_bottom_smtbz_bottom">
<ul>
<%
List<biz_website> list_website2=(List<biz_website>)request.getAttribute("tradelist_biaozhun");
if(list_website2.size()>0)
{
Iterator<biz_website> it=list_website2.iterator();  
   biz_website website=null;   
   int seq=0;
   while(it.hasNext())
   {
     seq++;
     website=(biz_website)it.next();
     if(seq==8)
     {
     %>
     <li><a id="link" href="/<%=website.getMember().getMemberName()%>/" target="_blank"><%=website.getwComname()%></a><span><a href="/city/<%=website.getCity().getCityCode()%>" target="_blank"><%=website.getCity().getCityName()%></a></span></li>
     <%
     continue;
     }
     %>
     <li><span><a href="/city/<%=website.getCity().getCityCode()%>" target="_blank"><%=website.getCity().getCityName()%></a></span><a id="link"  href="/<%=website.getMember().getMemberName()%>/" target="_blank"><%=website.getwComname()%>|</a></li>
     <%
     }
     }
     %>
</ul>
</div>
</div>

<div class="join_fg"></div>

<div class="join_bottom_syt">
<div class="join_bottom_syt_top"><img src="/resources/images/smt_bz.gif" border="0" /><span><a href="">更多&gt;&gt;</a></span></div>
<div class="join_bottom_syt_bottom">
<ul>
<%
List<biz_website> list_website3=(List<biz_website>)request.getAttribute("businesslist");
if(list_website3.size()>0)
{
Iterator<biz_website> it=list_website3.iterator();  
   biz_website website=null;   
   int seq=0;
   while(it.hasNext())
   {
     seq++;
     website=(biz_website)it.next();
     if(seq==8)
     {
     %>
     <li><a id="link" href="/<%=website.getMember().getMemberName()%>/" target="_blank"><%=website.getwComname()%></a><span><a href="/city/<%=website.getCity().getCityCode()%>" target="_blank"><%=website.getCity().getCityName()%></a></span></li>
     <%
     continue;
     }
     %>
     <li><span><a href="/city/<%=website.getCity().getCityCode()%>" target="_blank"><%=website.getCity().getCityName()%></a></span><a id="link"  href="/<%=website.getMember().getMemberName()%>/" target="_blank"><%=website.getwComname()%>|</a></li>
     <%
     }
     }
     %>
</ul>
</div>
</div>

</div>
</div>
<!--最新加入企业结束-->

<!--产品展示开始-->
<div class="product">
<div class="product_top">
<h1><a href="">产品展示</a></h1>
<span><a href="">我要发布</a><img src="/resources/images/join_jt.gif" border="0" /></span>
</div>

<div class="product_bottom">
<div class="product_bottom_left">
<div class="product_bottom_left_top"><h1><a href="/product">最新产品展示</a></h1><span><a href="/product/list/1/2">更多加强版产品</a>&nbsp;&nbsp;<a href="/product/list/1/1">更多标准版产品</a>&nbsp;&nbsp;<a href="/product/list/2">更多生意通产品</a>&nbsp;&nbsp;</span></div>

<div class="product_bottom_left_bottom">
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
    <li><a href="/<%=product.getMenu().getMember().getMemberName()%>/product/<%=product.getProductMenuid()%>/<%=product.getProductClass()%>/<%=product.getProductid()%>" target="_blank"><%=product.getProductName()%></a></li>
    <%  
    }
}
%>
</ul>
</div>
</div>

<div class="product_bottom_right">
<div class="product_bottom_right_top"><h1>精品展示</h1><span><a href="/product">更多产品>></a>&nbsp;&nbsp;</span></div>

<div class="product_bottom_right_bottom">
<ul>
<%
List<web_product> list_productjingpin=(List<web_product>)request.getAttribute("list_product_jingpin");
if(list_productjingpin.size()>0)
{
Iterator<web_product> it=list_productjingpin.iterator();  
  web_product product=null;
  while(it.hasNext())
  {    
    product=(web_product)it.next();    
    
    %>
    <li><a href="/<%=product.getMenu().getMember().getMemberName()%>/product/<%=product.getProductMenuid()%>/<%=product.getProductClass()%>/<%=product.getProductid()%>" target="_blank">
   <img src="<%=product.getProductThumbs()%>" /> 
    <br /><%=product.getProductName()%></a></li>
    <%  
    }
}
%>
</ul>
</div>
</div>
</div>
</div>
<!--产品展示结束-->

<!--供求信息开始-->
<div class="gongqiu">
<div class="gongqiu_top">
<h1><a href="">供求信息</a></h1>
<span><a href="">我要发布</a><img src="/resources/images/join_jt.gif" border="0" /></span>
</div>

<div class="gongqiu_bottom">
<div class="gongqiu_bottom_left">
<div class="gongqiu_bottom_left_top"><h1><a href="/purvey">最新供求信息</a></h1><span><a href="/purvey/list/1">更多供应</a>&nbsp;&nbsp;<a href="/purvey/list/2">更多求购</a>&nbsp;&nbsp;</span></div>

<div class="gongqiu_bottom_left_bottom">
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
    String[] strarray=new String[]{"供","求"};   
     
    %>
<li>
 <span><a href="/city/<%=supplyinfo.getMenu().getMember().getWebsite().getCity().getCityCode()%>" target="_blank"><%=supplyinfo.getMenu().getMember().getWebsite().getCity().getCityName()%></a></span>
 <a id="link" href="/<%=supplyinfo.getMenu().getMember().getMemberName()%>/purvey/<%=supplyinfo.getSupplyinfoMenuid()%>/<%=supplyinfo.getSupplyinfoSc()%>/<%=supplyinfo.getSupplyinfoid()%>" target="_blank"><span id="gq_left">【<%=strarray[supplyinfo.getSupplyinfoType()-1]%>】</span><%=supplyinfo.getSupplyinfoTitle()%></a></li>   
    <%  
    }  
  }  
%>
</ul>
</div>
</div>

<div class="gongqiu_bottom_right">
<div class="gongqiu_bottom_right_top"><h1>推荐供求信息</h1><span>&nbsp;&nbsp;</span></div>

<div class="gongqiu_bottom_right_bottom">
<ul>
<%
  List<web_supplyinfo> list_supplyinfo_tujian=(List<web_supplyinfo>)request.getAttribute("list_supplyinfo_tuijian");
  if(list_supplyinfo_tujian.size()>0)
  {
  Iterator<web_supplyinfo> it=list_supplyinfo_tujian.iterator();  
  web_supplyinfo supplyinfo=null;
  while(it.hasNext())
  {    
    supplyinfo=(web_supplyinfo)it.next();
    String[] strarray=new String[]{"供","求"};   
     
    %>
<li>
 <span><a href="/city/<%=supplyinfo.getMenu().getMember().getWebsite().getCity().getCityCode()%>" target="_blank"><%=supplyinfo.getMenu().getMember().getWebsite().getCity().getCityName()%></a></span>
 <a id="link" href="/<%=supplyinfo.getMenu().getMember().getMemberName()%>/purvey/<%=supplyinfo.getSupplyinfoMenuid()%>/<%=supplyinfo.getSupplyinfoSc()%>/<%=supplyinfo.getSupplyinfoid()%>" target="_blank"><span id="gq_left">【<%=strarray[supplyinfo.getSupplyinfoType()-1]%>】</span><%=supplyinfo.getSupplyinfoTitle()%></a></li>   
    <%  
    }  
  }  
%>
</ul>
</div>
</div>
</div>
</div>
<!--供求信息结束-->

<!--企业信息开始-->
<div class="qiye">
<div class="qiye_top">
<h1><a href="">企业信息</a></h1>
<span><a href="">我要加入</a><img src="/resources/images/join_jt.gif" border="0" /></span>
</div>

<div class="qiye_bottom">
<div class="qiye_bottom_left">
<div class="qiye_bottom_left_top"><h1><a href="">精品企业</a></h1><span><a href="/trade/list/2">加强版</a>&nbsp;&nbsp;<a href="/trade/list/1">标准版</a>&nbsp;&nbsp;<a href="/business/list/5">钻石店铺</a>&nbsp;&nbsp;&nbsp;&nbsp;<a href="/business/list/3">铂金店铺</a>&nbsp;&nbsp;<a href="/business/list/4">黄金店铺</a>&nbsp;&nbsp;<a href="/business/list/3">白银店铺</a>&nbsp;&nbsp;<a href="/trade">更多>></a>&nbsp;&nbsp;</span></div>    

<div class="qiye_bottom_left_bottom">
<ul>
<%
List<biz_website> list_websitejinping=(List<biz_website>)request.getAttribute("tradelist_jingpin");
if(list_websitejinping.size()>0)
{
Iterator<biz_website> it=list_websitejinping.iterator();  
   biz_website website=null;   
   int seq=0;
   while(it.hasNext())
   {
     seq++;
     website=(biz_website)it.next();
     
     
     %>     
     <li><span><a href="/city/<%=website.getCity().getCityCode()%>" target="_blank"><%=website.getCity().getCityName()%></a></span><a id="link"  href="/<%=website.getMember().getMemberName()%>/" target="_blank"><%=website.getwComname()%></a></li>
     <%
   }
}
%>
</ul>
</div>
</div>

<div class="qiye_bottom_right">
<div class="qiye_bottom_right_top"><h1>推荐企业</h1><span>&nbsp;&nbsp;</span></div>

<div class="qiye_bottom_right_bottom">
<ul>
<%
List<biz_website> list_websitetuijian=(List<biz_website>)request.getAttribute("tradelist_tuijian");
if(list_websitetuijian.size()>0)
{
Iterator<biz_website> it=list_websitetuijian.iterator();  
   biz_website website=null;   
   int seq=0;
   while(it.hasNext())
   {
     seq++;
     website=(biz_website)it.next();     
     %>     
     <li><span><a href="/city/<%=website.getCity().getCityCode()%>" target="_blank"><%=website.getCity().getCityName()%></a></span><a id="link"  href="/<%=website.getMember().getMemberName()%>/" target="_blank"><%=website.getwComname()%></a></li>
     <%
   }
}
%>
</ul>
</div>
</div>
</div>
</div>
<!--企业信息结束-->


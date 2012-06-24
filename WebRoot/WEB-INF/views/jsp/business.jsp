<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@page import="com.hedgehog.domain.*"%>
<!--左边开始-->
<div id="left">
<div class="left-top"><span> 最新生意通钻石店铺</span><a href="/business/list/5">更多>></a> </div>
<div class="left-bottom">
<div class="left-bottom-left">
<ul>
<%
List<biz_website> list_website1=(List<biz_website>)request.getAttribute("businesslist_zuanshi");
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

<div class="left-top"><span>最新生意通铂金店铺</span><a href="/business/list/3">更多>></a></div>
<div class="left-bottom">
<div class="left-bottom-left">
<ul>
<%
List<biz_website> list_website2=(List<biz_website>)request.getAttribute("businesslist_baiyin");
if(list_website2.size()>0)
{
Iterator<biz_website> it=list_website2.iterator();  
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
<div class="guanggao"><img src="/resources/images/guanggao6.png" /></div>
<div class="left-top"><span> 最新生意通黄金店铺</span> <a href="/business/list/4">更多>></a></div>
<div class="left-bottom">
<div class="left-bottom-left">
<ul>
<%
List<biz_website> list_website3=(List<biz_website>)request.getAttribute("businesslist_huangjin");
if(list_website3.size()>0)
{
Iterator<biz_website> it=list_website3.iterator();  
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

<div class="left-top"><span> 最新生意通白银店铺</span><a href="/business/list/3">更多>></a> </div>
<div class="left-bottom">
<div class="left-bottom-left">
<ul>
<%
List<biz_website> list_website4=(List<biz_website>)request.getAttribute("businesslist_baiyin");
if(list_website4.size()>0)
{
Iterator<biz_website> it=list_website4.iterator();  
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
</div>
<!--左边结束-->

<!--右边开始-->
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

<!--右边结束-->

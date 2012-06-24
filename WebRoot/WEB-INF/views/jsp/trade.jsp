<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@page import="com.hedgehog.domain.*"%>
<!--左边开始-->
<div id="left">
<div class="left-top"><span> 最新商贸通加强</span><a href="/trade/list/2">更多&gt;&gt;</a></div>
<div class="left-bottom">
<div class="left-bottom-left">
<ul>
<%
List<biz_website> list_website1=(List<biz_website>)request.getAttribute("tradelist_jiaqiang");
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
<div class="guanggao"><img src="/resources/images/guanggao5.png" /></div>
<div class="left-top"><span> 最新商贸通标准版</span><a href="/trade/list/1">更多&gt;&gt;</a> </div>
<div class="left-bottom">
<div class="left-bottom-left">
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


<div class="guanggao"><img src="/resources/images/guanggao5.png" /></div>
</div>
<!--左边结束-->
<!--右边开始-->
<div id="right">
<div class="guanggao2"><img src="/resources/images/guanggaos.png"  /></div>
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

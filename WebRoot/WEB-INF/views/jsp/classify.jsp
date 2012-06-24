<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@page import="com.hedgehog.domain.*"%>
<div style="clear:both"></div>
<div id="left">
<div class="left-top"><span>最新分类信息</span></div>

<div class="left-bottom">
<div class="left-bottom-left">
<ul>
<%
List<biz_classinfo> list_news=(List<biz_classinfo>)request.getAttribute("classinfolist_new");
if(list_news.size()>0)
    {
    Iterator<biz_classinfo> it=list_news.iterator();  
  biz_classinfo member=null;
  //SimpleDateFormat df=new SimpleDateFormat("yyyy-MM-dd");//.format(news.getNewsUpdateTime());
  //biz_classinfoclass cic=null;
  //biz_classinfoclass pcic=null;
  int seq=0;
  while(it.hasNext())
  {
   seq++;
    member=(biz_classinfo)it.next();    
    //cic=   member.getClassinfoclass();
    //pcic=cic.getParentclassinfoclass();
    %>

<li><a id="link" href="/classify/hotinfoview/<%=member.getClassinfoClass()%>/<%=member.getClassinfoid()%>"><%=member.getClassinfoTitle()%></a></li>
    <%
    }
  
    }
%>
</ul>
</div>
</div>

<div class="guanggao2"><img src="/resources/images/guanggao2.png" /></div>
<div class="left-bottom-top"><span>分类信息</span> </div>
<div class="left-bottom-bottom">
<%
List<biz_classinfoclass> list_cic=(List<biz_classinfoclass>)request.getAttribute("list_cic");
if(list_cic.size()>0)
{
Iterator<biz_classinfoclass> it=list_cic.iterator();  
   biz_classinfoclass classinfoclass=null;
   List<biz_classinfoclass> list_cicchild=null;
   
   //Iterator<biz_classinfoclass> it2=null;
   //biz_classinfoclass classinfoclass2=null;
   int seq=0;
   while(it.hasNext())
   {  
   seq++;   
     classinfoclass=(biz_classinfoclass)it.next();     
     %>     
     <div class="left-bottom-bottom<%=seq%>">
<p><%=classinfoclass.getCicName()%></p>
<ul>
<%
list_cicchild=classinfoclass.getListchildclassinfoclass();
if(list_cicchild.size()>0)
{
Iterator<biz_classinfoclass> it2=list_cicchild.iterator();
biz_classinfoclass classinfoclass2=null;
while(it2.hasNext())
{
classinfoclass2=(biz_classinfoclass)it2.next();
%>
<li><a id="jia" href="/classify/infolist/<%=classinfoclass2.getCicid()%>"><%=classinfoclass2.getCicName()%></a>|</li>
<% 
}
}
%>
</ul>
</div>
     <%
     }
}
%>
</div>

<div class="guanggao2"><img src="/resources/images/guanggao2.png" /></div>
</div>

<!-- 左边结束-->


<!-- 右边结束-->
<div id="right">
<div class="mffb"><a href="classify/infoseltype"><img src="/resources/images/flxxlb.png" width="123" height="37" /></a></div>
 <%
List<biz_classinfoclass> list_cic2=(List<biz_classinfoclass>)request.getAttribute("list_cic");
if(list_cic2.size()>0)
{
Iterator<biz_classinfoclass> it=list_cic2.iterator();  
   biz_classinfoclass classinfoclass=null;//父类
   
   //List<biz_classinfoclass> list_cicchild=null; //子类list
   List<biz_classinfo> list_parent_classinfo=null;
   
   //Iterator<biz_classinfoclass> it2=null;
   //biz_classinfoclass classinfoclass2=null;
   int seq=0;
   while(it.hasNext())
   {  
   seq++;   
     classinfoclass=(biz_classinfoclass)it.next(); //父类
     %>
<div class="right-top"><span><%=classinfoclass.getCicName()%></span></div>
 <div class="right-bottom">
<ul>
<%
		    //list_cicchild=classinfoclass.getListchildclassinfoclass();//子类list
		    list_parent_classinfo=classinfoclass.getList_parent_classinfo();
			if(list_parent_classinfo.size()>0)
			{
			Iterator<biz_classinfo> it2=list_parent_classinfo.iterator();
			biz_classinfo classinfo=null;//分类信息
				while(it2.hasNext())
				{
				  classinfo=(biz_classinfo)it2.next();//分类信息				  
				%>
				<li><a href="/classify/hotinfoview/<%=classinfo.getClassinfoClass()%>/<%=classinfo.getClassinfoid()%>"><%=classinfo.getClassinfoTitle()%></a></li>
				<% 
				}
			}
%>
</ul>
</div>
     <%
     }
}
%> 
</div>
<!-- 右边结束-->

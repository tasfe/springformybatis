<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@page import="com.hedgehog.domain.*"%>
<div style="clear:both"></div>
<div class="zhongjian">
    <div class="mf_doc4">
      <div id="bd" class="yn-pub-two">
                <div class="publish-step">
                    <span class="step1-active">选择信息分类</span>&nbsp;&gt; <span class="step2">填写详细内容</span>&nbsp;&gt;
                    <span class="step3">发布成功</span>
                </div>
        <div class="cleft">
                    <div class="ct">
                        <div class="publish-detail">
                        <span id="spanlogon">
                                <div class="yn-pub-notice">
                                    您可以匿名发布，建议您 <a href="/login">登录</a>
                                    后发布信息，日后可以方便的更新、修改和删除它。
                                </div></span>
                                
                         
<div class="yn-pub-list">
<ul>
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
     <li>
<div class="cmodule">
<div class="chd color-yellow"><%=classinfoclass.getCicName()%></div><div class="cbd yn-fix-float">
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
<li><a href="/classify/infoselmode?cateid=<%=classinfoclass2.getCicid()%>"><%=classinfoclass2.getCicName()%></a></li>
<% 
}
}
%>
</ul>
</div></div>
</li>
     <%
   }
}
%>
</ul>
</div>
</div>
</div>
                       
                    </div>
          </div>
            </div>
    </div>
  <div style="clear:both"></div>

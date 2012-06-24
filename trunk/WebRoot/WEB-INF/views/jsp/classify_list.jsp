<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@page import="com.hedgehog.domain.*"%>
<div style="clear:both"></div>
<div class="dqwz"><p>当前位置：分类信息&nbsp;>&nbsp;${cic.parentclassinfoclass.cicName}&nbsp;>&nbsp;${cic.cicName}<span><a href="/classify"target="_blank">更多分类信息</a>>></span> </p></div>

<!-- 左边开始-->
<div id="left">
<div class="left-top"><span>分类信息目录</span></div>
<div class="left-bottom">
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
     if(seq>1)
     {
     %>
     <div  class="aa"></div>
     <%
     }
   %>
   
<div class="left-bottom-nr">
<span><%=classinfoclass.getCicName()%></span>
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
<li><a href="/classify/infolist/<%=classinfoclass2.getCicid()%>"><%=classinfoclass2.getCicName()%></a></li>
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
</div>
<!-- 左边结束-->

<!-- 右边开始-->
<div id="right">
<div  class="right-top"><span>${cic.cicName}</span></div>
<div class="right-bottom">
<%
    List<biz_classinfo> list=(List<biz_classinfo>)request.getAttribute("classinfolist");
    QueryParam qp=(QueryParam)request.getAttribute("queryParam");
  int pagecount=qp.getPageCount();
  int pageNo=qp.getPageIndex();
  
  int pagesize=qp.getPageSize();
    if(list.size()>0)
    {
    Iterator<biz_classinfo> it=list.iterator();  
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
<div class="right-bottom-bottom"> <span><a href="/classify/hotinfoview/${cic.cicid}/<%=member.getClassinfoid()%>"><%=member.getClassinfoTitle()%></a></span>
<div class="right-bottom-bottom-nr">
<%=member.getClassinfoDes()%>
</div>
<h1><a href="/classify/hotinfoview/${cic.cicid}/<%=member.getClassinfoid()%>">回复此信息</a> </h1>
</div>
    <%
    }
  
    }
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
  <br />
  <form>
     <div class="chaxun"> 如果还没有找到满意的信息，请直接输入关键  
       <input name="114chnkey2" id="114chnkey2" type="text" onKeyPress="btnkeypress2(event)" />
       <input name="input" type="button" value="查询" onClick="searchSubmit2()"  class="bt1"/>
      </div>
 </form>
</div>
</div>
<!--右边结束-->
<script type="text/javascript"> 
<!--               
String.prototype.trim = function()
{
    // 用正则表达式将前后空格，用空字符串替代。
    return this.replace(/(^\s*)|(\s*$)/g, "");
}
				function searchSubmit2()
				  {
					 var querystr =document.getElementById("114chnkey2").value.trim();
					 //alert(querystr);
					 
					 if(querystr.length>=2){
					 var newUrl="/searchresult?type=4&key="+encodeURI(querystr.toLowerCase().replace("script","").replace("}",""))+"&page=1";
					 window.location.href= newUrl;
			          
						 }
						 else
						 {
						 alert("搜索关键词的长度不能小于2个字符！");
                  document.getElementById("114chnkey2").focus();
						 
						 }
					
				 }
				 function btnkeypress2(event)
{
    
    var code = 0;
    code = event.keyCode;
    if (code==13)
    {
        event.keyCode = 0;

        searchSubmit2();
    }
}
// -->
</script> 

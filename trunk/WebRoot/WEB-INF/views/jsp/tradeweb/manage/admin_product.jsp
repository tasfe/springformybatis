<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@page import="com.hedgehog.domain.*"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="com.hedgehog.domain.QueryParam"%>
<br/><br/>
<table width="100%" border="0" cellspacing="0" cellpadding="0" class="table">
  <tr class="tr">    
    <td class="td"><a href="?cmd=new">添加产品</a></td>    
  </tr>
  </table>  
  <%
  List<web_product> list=(List<web_product>)request.getAttribute("list_product");
  QueryParam qp=(QueryParam)request.getAttribute("queryParam");
  int pagecount=qp.getPageCount();
  int pageNo=qp.getPageIndex();
  
  int pagesize=qp.getPageSize();

  if(list.size()>0)
  {
  %>
  <table width="100%" border="0" cellspacing="1" cellpadding="0" class="table">
  <tr class="tr">
    
    <td class="td">序号</td>
    <td>产品名称</td>
    <td>类别</td>
    <td>市场价格</td>
    <td>优惠价格</td>
    <td>浏览次数</td>
    <td>更新时间</td>
    <td>操作</td>    
  </tr>
  <%
  Iterator<web_product> it=list.iterator();  
  web_product product=null;
  SimpleDateFormat df=new SimpleDateFormat("yyyy-MM-dd");//.format(product.getproductUpdateTime());
  
  //df.format(product.getproductUpdateTime())
  //product.getproductUpdateTime();
  int seq=0;
  while(it.hasNext())
  {
    seq++;
    product=(web_product)it.next();    
    String updatetime=df.format(product.getProductUpdatetime());
    
    
    //product.getproductid();
  %>
  <tr class="tr">
    
    <td class="td"><%=((pageNo-1)*pagesize)+seq%></td>
    <td><%=product.getProductName()%></td>
    <td><%=product.getProductclass().getPcName()%></td>
    <td><%=product.getProductMarket()%></td>
    <td><%=product.getProductPromote()%></td>
    <td><%=product.getProductHits()%></td>
    <td><%=updatetime%></td>
    <td><a href="?cmd=edit&id=<%=product.getProductid()%>">编辑</a>||<a href="?cmd=del&id=<%=product.getProductid()%>" onclick="javascript:return p_del()">删除</a></td>    
  </tr>   
  <%
  }  
  %>
  </table>
  <%  
  }
  
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
<script language="javascript" type="text/javascript">
<!--
function p_del() {
var msg = "您真的确定要删除吗？\n\n请确认！";
if (confirm(msg)==true){
return true;
}else{
return false;
}
}
// -->
    </script>

<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="com.hedgehog.domain.QueryParam"%>
<%@page import="com.hedgehog.domain.biz_website"%>
<%@page import="org.apache.solr.common.SolrDocument"%>
<%@page import="org.apache.solr.common.SolrDocumentList"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>列表页面</title>
<link  rel="stylesheet" href="/resources/css/liebiao.css"type="text/css" />
<link href="/resources/css/sousuo3.css" type="text/css" rel="stylesheet"/>
<script language="javascript" type="text/javascript" src="/resources/js/search2.js"></script>
</head>

<body>


<!--LOGO部分开始-->
<div class="logo">
<div class="logo_zggsdh"><a href="#"><img src="/resources/images/logo.jpg" border="0"/></a></div>

<div class="SearchType_sp">
<div class="indexnav">
<a class="currentsearch" id="SearchType1" onClick="SetSearchType('1')">单位查询</a>
<a class="searchlist" id="SearchType2" onClick="SetSearchType('2')">产品查询</a>
<a class="searchlist" id="SearchType3" onClick="SetSearchType('3')">供求查询</a>
<a class="searchlist" id="SearchType4" onClick="SetSearchType('4')">分类信息</a>
</div>
</div>
<form>
<div class="resech_kuang">
<div class="resultsearch_kuang">
<input id="114chnkey" name="key" style="float: left;" class="key1" value="${SearchParameter.key}" onKeyPress="btnkeypress(event)" onClick="AutoTxt()"/>
<input name="submit" class="result_ss" onClick="searchSubmit()" value="查询" style="cursor: pointer;" type="button"/>

</div>
</div>
</form>
</div>
<!--LOGO部分结束-->

<div style=" clear:both"></div>
<div class="bi">
<span class="swsy">
您当前的工商导航查询范围是：
全国
</span>
<c:choose>
 <c:when test="${! empty callback}">
<span class="jgtj">共为您找到相关结果 ${callback.sum} 个, 查询用时${callback.span} 秒 </span>
</c:when>
<c:otherwise>
<span class="jgtj">没有找到相关结果 </span>
</c:otherwise>
 </c:choose>
</div>
<div class="zhongjian">
<div class="left-col">
<c:choose>
<c:when test="${! empty docs}">
 <%
 SolrDocumentList docs=(SolrDocumentList)request.getAttribute("docs");
 Map<String,Map<String,List<String>>> hl=(Map<String,Map<String,List<String>>>)request.getAttribute("hl");
 if(docs.getNumFound()>0)
 {
 //循环开始
            for (SolrDocument doc : docs) {  
                String title = (String) doc.getFieldValue("title");
                String id = (String) doc.getFieldValue("id");
                String url = (String) doc.getFieldValue("link");
                Date update = (Date) doc.getFieldValue("update");
                //response.getWriter().println(update);
                SimpleDateFormat df=new SimpleDateFormat("yyyy-MM-dd");//.format(news.getNewsUpdateTime());
                String datefmt=df.format(update);
                //String datefmt="date";
  //df.format(news.getNewsUpdateTime())
                String content = (String) doc.getFieldValue("content"); 
                Map<String,List<String>> list_hl=hl.get(id);
                %>
                <div class="f">
                <%
                //start title
                if(null!=list_hl.get("title"))
                {
                  List<String> list_str=list_hl.get("title");
                          if(list_str.size()>0)
			                {
			                %>
			                <a href="<%=url%>" target="_blank">
			                <%			                
			                   StringBuffer buf  = new StringBuffer();
				                for(String str:list_str)
				                {
				                  buf.append(str);
				                  //buf.append("...");				                            
				                }
				                %>
				                <%=buf.toString()%>
			                </a>
			                <%				                
			                }
			                
                }
                else
		                {
		                %>
		                <a href="<%=url%>" target="_blank"><%=title%></a>
		                <%
		                
		                }
                // end title
                //start
		                //if(list_hl.containsKey("content"))
		                if(null!=list_hl.get("content"))
		                {
		                List<String> list_str2=list_hl.get("content");
			                if(list_str2.size()>0)
			                {
			                %>
			                <div class="ss_jianjie">
			                <%
			                StringBuffer buf2  = new StringBuffer();
			                
				                for(String str2:list_str2)
				                {
				                buf2.append(str2);
				                  buf2.append("...");	       
				                }
				                %>
				                <%=buf2.toString()%>
			                </div>
			                <%
				                   
			                }
		                
		                } 
		                else
		                {
		                 if(null!=content)
		                 {
		                   if (content.length() >= 100) 
		                   {
		                     content = content.substring(0, 100);		                
		                   }
		                 }
		                %>
		                <div class="ss_jianjie"><%=content%></div>
		                <%
		                
		                }
//end
                 %>


<div class="ss_dizhi">
<%=url+"-"+datefmt%>
</div>
</div>
                <%
                
                }
                //循环结束
 }
  %>

</c:when>
<c:otherwise>
<span>没有查询到该关键词的相关数据,请更换关键词重新查询!
</span>
</c:otherwise>

 </c:choose>



<c:if test="${! empty queryParam}">
<div class="p">
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
<a href="?type=${SearchParameter.type}&key=${SearchParameter.key}&page=1">首页</a><a href="?type=${SearchParameter.type}&key=${SearchParameter.key}&page=<%=pageNo-1%>">上一页</a>
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
<a href="?type=${SearchParameter.type}&key=${SearchParameter.key}&page=<%=startpage-1%>">&lt;&lt;</a>
<%

}
for(int i=startpage;i<=endpage;i++)
{
if(i==pageNo)
{
%>
<a href="?type=${SearchParameter.type}&key=${SearchParameter.key}&page=<%=Integer.toString(i)%>" style="color:red;"><%=Integer.toString(i)%></a>
<%
continue;
}
%>
<a href="?type=${SearchParameter.type}&key=${SearchParameter.key}&page=<%=Integer.toString(i)%>"><%=Integer.toString(i)%></a>
<%

}
if(turnNo<turnCount)
{
%>
<a href="?type=${SearchParameter.type}&key=${SearchParameter.key}&page=<%=endpage+1%>">&gt;&gt;</a>
<%
}
if(pageNo!=pagecount)
{
%>
<a href="?type=${SearchParameter.type}&key=${SearchParameter.key}&page=<%=pageNo+1%>">下一页</a><a href="?type=${SearchParameter.type}&key=${SearchParameter.key}&page=<%=pagecount%>">尾页</a>
<%

}
else
{
%>下一页 尾页<%

}
  
  }
%>
</div>
</c:if>



</div>

<div class="right-col">

<div class="commendinfo_link">
精品推荐：<a href="/" target="_blank">更多&gt;&gt;</a>
<ul class="neir_right2">
<%
List<biz_website> tradelist_last=(List<biz_website>)request.getAttribute("tradelist_last");
if(tradelist_last.size()>0)
{
Iterator<biz_website> it=tradelist_last.iterator();  
   biz_website website=null;   
   int seq=0;
   while(it.hasNext())
   {
     seq++;
     website=(biz_website)it.next();     
     %>
     <li><a href="/<%=website.getMember().getMemberName()%>/" target="_blank"><%=website.getwComname()%></a></li>
     <%
   }
}
%>
</ul>
</div>

</div>
<div style="text-align:left;">
<div style="clear:both"></div>
<!--版权开始-->
<div class="copyright">
<div class="copyright_sm">免责声明：以上所展示的信息由用户自行提供且由系统自动收录，内容的准确性、完整性、合法性或真实性由用户负责。工商导航网对此不承担任何责任。</div>
<div class="copyright_lj"><a target="_blank" href="http://www.zggsdh.com/web/htm/contact/contact.asp" rel="nofollow">关于我们</a>&nbsp;&nbsp;|&nbsp;&nbsp;<a target="_blank" href="http://www.zggsdh.com/web/htm/contact/server.asp" rel="nofollow">服务条款</a>&nbsp;&nbsp;|&nbsp;&nbsp;<a target="_blank" href="http://www.zggsdh.com/web/htm/contact/zizhi.asp" rel="nofollow">公司资质</a>&nbsp;&nbsp;|&nbsp;&nbsp;<a target="_blank" href="http://www.zggsdh.com/web/htm/contact/person.asp" rel="nofollow">求贤纳士</a>&nbsp;&nbsp;|&nbsp;&nbsp; <a target="_blank" href="http://www.zggsdh.com/web/htm/contact/feed.asp" rel="nofollow">意见反馈</a>&nbsp;&nbsp;|&nbsp;&nbsp; <a target="_blank" href="http://www.zggsdh.com/web/htm/contact/ad.asp" rel="nofollow">广告服务</a>&nbsp;&nbsp;|&nbsp;&nbsp; <a target="_blank" href="http://www.114chn.com/TextLink.htm">文字链接</a>&nbsp;&nbsp;|&nbsp;&nbsp;<a target="_blank" href="http://www.114chn.com/Imagelink.htm">图片链接</a>&nbsp;&nbsp;|&nbsp;&nbsp;<a target="_blank" href="http://www.zggsdh.com/web/htm/contact/web.asp" rel="nofollow">网站建设</a>&nbsp;&nbsp;|&nbsp;&nbsp;<a target="_blank" href="http://www.zggsdh.com/web/htm/contact/pay.asp" rel="nofollow">付款方式</a>&nbsp;&nbsp;|&nbsp;&nbsp;<a target="_blank" href="http://www.zggsdh.com/web/htm/contact/jiameng.asp" rel="nofollow">代理合作</a>&nbsp;&nbsp;|&nbsp;&nbsp;<a target="_blank" href="http://www.zggsdh.com/web/htm/contact/manner.asp" rel="nofollow">联系方式</a>&nbsp;&nbsp;&nbsp;  <a target="_blank" href="http://www.114chn.com/swzn.aspx" rel="nofollow" style="display: none;">|&nbsp;&nbsp;&nbsp;公司动态</a>&nbsp;&nbsp;&nbsp;<span style="display:none;">|</span>&nbsp;&nbsp;&nbsp; 
</div>
<div class="copyright_body">Copyright&#169;2003-2012 www.zggsdh.com All Rights Reserved 网站运营：长沙游信网络科技有限公司<br>
全国统一电话：400-0909-516   电话：0731-89855260   传真：0731-89855296<br>
技术支持:<a href="http://www.faydrian.com/" target="_blank">长沙沸点文化传播有限公司</a>
<p></p><p></p><p></p><p>

</p><img src="/resources/images/cpxxlb.jpg" width="130" height="54" />
 <img src="/resources/images/cpxxlb.jpg" width="130" height="54" />
  <img src="/resources/images/cpxxlb.jpg" width="130" height="54" /></div>
</div>
</div>
</div>

</body>
</html>


<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@page import="com.hedgehog.domain.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>城市首页</title>
<link rel="stylesheet" href="/resources/css/cssy.css" type="text/css" />
<link href="/resources/css/sousuo1.css" type="text/css" rel="stylesheet"/>
<script language="javascript" type="text/javascript" src="/resources/js/search.js"></script>
<script src="/resources/flash/js/swfobject.js" type="text/javascript"></script>
</head>
<body>
<!--顶部开始-->

<div class="top">
<div class="topd">
<form>
<div class="top_left">

您好，欢迎来到工商导航${city.cityName}&nbsp;&nbsp;

<select name="lstProductType" class="producttype">
<option selected="selected" value="0101">商贸通标准版</option>
<option value="0102">生意通店铺</option>
<option value="0103">商贸通加强版</option>
</select>&nbsp;&nbsp;
<a href="/login">请登录</a>&nbsp;&nbsp;<a href="/register">免费注册</a>
</div>
</form>
<div class="top_right"><a href="javascript:window.external.addFavorite(window.location.href,'%E5%B7%A5%E5%95%86%E5%AF%BC%E8%88%AA')">加入收藏</a> | <a href="">网站导航</a></div>
</div></div>
<!--顶部结束-->
<div class="wall">


<!--LOGO部分开始-->
<div class="logo">
<div class="logo_zggsdh"><a href="#"><img src="/resources/images/logo.jpg" border="0"/></a></div>
<div class="logo_ad">
<ul>
<li><a target="_blank" href="" title="石家庄保安公司（河北众邦保安服务有限公司）">石家庄保安公司</a></li>
<li><a target="_blank" href="" title="中国矿山井巷行业网">中国矿山井巷网</a></li>
<li><a target="_blank" href="" title="西宁夏都租车 西宁租车 西宁旅游租车 青海旅游租车 青海租车">西宁夏都租车</a></li>
<li><a target="_blank" href="" title="石家庄驴友装备商城">石家庄驴友装备</a></li></ul>
<ul><li><a target="_blank" href="" title="韩国电热板|无辐射电热板|电热板批发销售|韩国电热板中国总代理">韩国电热板代理</a></li>
<li><a target="_blank" href="" title="重庆南珺电子科技有限公司">重庆南珺电子</a></li>
<li><a target="_blank" href="" title="青岛慈心健康管理有限公司_青岛体检_青岛健康管理_健康调养_崂山体检">青岛慈心健康管</a></li>
<li><a target="_blank" href="" title="静海饭店_王口饭店_餐馆_静海王口饭店">静海饭店_王口</a></li></ul>
</div>
<div class="SearchType_sp">
<div class="indexnav">
<a class="currentsearch" id="SearchType1" onClick="SetSearchType('1')">产品</a>
<a class="searchlist" id="SearchType2" onClick="SetSearchType('2')">公司</a>
<a class="searchlist" id="SearchType3" onClick="SetSearchType('3')">求购</a>
<a class="searchlist" id="SearchType4" onClick="SetSearchType('4')">分类信息</a>
</div>
</div>
<form>
<div class="resech_kuang">
<div class="resultsearch_kuang">
<input id="114chnkey" name="key" style="float: left;" class="key1" value="请输入您要找的产品信息关键字" onKeyPress="btnkeypress(event)" onClick="AutoTxt()"/>
<input name="submit" class="result_ss" onClick="searchSubmit()"  style="cursor: pointer;" type="button"/>
</div>
</div>
</form>
</div>

<!--LOGO部分结束-->

<!--导航栏开始-->
<div class="menu">
<ul>
<li id="menu_home"><a href="/home">首页</a></li>
<li><a href="/trade">商贸通</a></li>
<li><a href="/business">生意通</a></li>
<li><a href="/product">产品信息</a></li>
<li><a href="/purvey">供求信息</a></li>
<li><a href="/classify">分类信息</a></li>
<li><a href="/search" target="_blank">工商导航查询</a></li>
<li><a href="/agent">加盟代理</a></li>
<li><a href="http://news.zggsdh.com" target="_blank">新闻资讯</a></li>
</ul>
</div>
<!--导航栏结束-->
<!-- 导航下会员登录开始-->
<div style="clear:both"></div>
<div id="content" >
<div id="huiyuan">
  <div class="hydl">
 
  <div class="hydl-top">
 <a href=""> <img src="/resources/images/csy-18.png" width="108" height="33" /> </a> <a href=""> <img src="/resources/images/cssy_17.png" width="111" height="37" /></a>
   <form><div class="hydl-top-m" >用户名：<input name="" type="text"  class="text1" />&nbsp;密码：<input name="" type="text" class="text1" /> <br />
<img src="/resources/images/11.png" width="40" height="20" />
    <input name="" type="text" class="text1" />
  
      <select name="select" id="select" class="select1">
      </select>
    
    <input name="" type="button"  class="bt1"/>
  </div></form>
  <div class="hydl-m" > 
   <a href=""> <img src="/resources/images/cssy_11.png" width="107" height="36" /></a> <a href=""><img src="/resources/images/cssy_12.png" width="110" height="37" /></a>
   <a href=""><img src="/resources/images/cssy_13.png" width="109" height="35" /></a><a href=""><img src="/resources/images/cssy_14.png" width="109" height="37" style="margin-left:3px" /></a></div>
  
  </div>
  
  
  </div> 
   <div class="guanggao"> <img src="/resources/images/guanggao7.png" width="229" height="51" /></div>
</div>

<div id="flash"></div>
<script type="text/javascript">
var xmlData='<list><item><img>/resources/flash/uploads/cssy01.jpg</img><url>/home</url></item></list>';
	var flashvars = {xmlData:xmlData};
	var params = {menu:false,wmode:"opaque"};
	var attributes = {};
	swfobject.embedSWF("/resources/flash/swf/lanren.swf", "flash", "437", "238", "9","expressInstall.swf", flashvars, params, attributes);
</script>
<div id="shangji">
  <div class="shangji1"><span>最新供求商机</span></div>
  <div class="shangji2"> 
    <div class="sjnr">
      <ul>
      <%
  List<web_supplyinfo> list_supplyinfo1=(List<web_supplyinfo>)request.getAttribute("list_supplyinfo");
  if(list_supplyinfo1.size()>0)
  {
  Iterator<web_supplyinfo> it=list_supplyinfo1.iterator();  
  web_supplyinfo supplyinfo=null;
  while(it.hasNext())
  {    
    supplyinfo=(web_supplyinfo)it.next();
    String[] strarray=new String[]{"供","求"};   
     
    %>
<li> 
 <span id="gq_left">【<%=strarray[supplyinfo.getSupplyinfoType()-1]%>】</span>
 <a href="/<%=supplyinfo.getMenu().getMember().getMemberName()%>/purvey/<%=supplyinfo.getSupplyinfoMenuid()%>/<%=supplyinfo.getSupplyinfoSc()%>/<%=supplyinfo.getSupplyinfoid()%>" target="_blank"><%=supplyinfo.getSupplyinfoTitle()%></a></li>   
    <%  
    }  
  }  
%>
</ul>
      </div>
    </div>
</div>
<!-- 导航下会员登录结束-->


<!-- 中间大图片开始-->
<div style="clear:both"></div>
<div class="datu"> </div>
<!-- 中间大图结束片-->

<!-- 主要内容开始-->
<div id="content1">  
<div class="dazi"> <p> 全国信息联展</p> 
<span class="span1">1.全国最新诚信认证用户</span> <span class="span2">2.全国最新加入企业 <a> &nbsp;最新加入网店</a></span>  

<span class="span3">3.全国最新发布产品 <a> &nbsp;更多</a></span>   <span class="span4">4.全国最新供求信息 <a>&nbsp; 更多

</a></span>  <span class="span5">5.全国最新招聘信息 <a> &nbsp;更多</a></span>
  
</div>

<div  class="xiaozi">


<div class="xiaozi1">
<marquee style="WIDTH: 175px; HEIGHT: 125px" scrollamount="2" direction="up" >
<ul>
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
</marquee >
</div>


<div class="xiaozi2">
<marquee style="WIDTH: 175px; HEIGHT: 125px" scrollamount="2" direction="up" >
<ul>
<%
List<biz_website> tradelist_last2=(List<biz_website>)request.getAttribute("tradelist_last");
if(tradelist_last2.size()>0)
{
Iterator<biz_website> it=tradelist_last2.iterator();  
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
</ul></marquee >
</div>
<div class="xiaozi3">
<marquee style="WIDTH: 175px; HEIGHT: 125px" scrollamount="2" direction="up" >
<ul>
<%
List<web_product> list_product_last=(List<web_product>)request.getAttribute("list_product_last");
if(list_product_last.size()>0)
{
Iterator<web_product> it=list_product_last.iterator();  
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
</marquee >
</div>
<div class="xiaozi4">
<marquee style="WIDTH: 175px; HEIGHT: 125px" scrollamount="2" direction="up" >
<ul>
<%
  List<web_supplyinfo> list_supplyinfo_last=(List<web_supplyinfo>)request.getAttribute("list_supplyinfo_last");
  if(list_supplyinfo_last.size()>0)
  {
  Iterator<web_supplyinfo> it=list_supplyinfo_last.iterator();  
  web_supplyinfo supplyinfo=null;
  while(it.hasNext())
  {    
    supplyinfo=(web_supplyinfo)it.next();
    String[] strarray=new String[]{"供","求"};   
     
    %>
<li> 
 <a href="/<%=supplyinfo.getMenu().getMember().getMemberName()%>/purvey/<%=supplyinfo.getSupplyinfoMenuid()%>/<%=supplyinfo.getSupplyinfoSc()%>/<%=supplyinfo.getSupplyinfoid()%>" target="_blank"><%=supplyinfo.getSupplyinfoTitle()%></a></li>   
    <%  
    }  
  }  
%>
</ul></marquee >
</div>
<div class="xiaozi5">
<marquee style="WIDTH: 175px; HEIGHT: 125px" scrollamount="2" direction="up" >
<ul>
<%
List<biz_classinfo> classinfolist_new=(List<biz_classinfo>)request.getAttribute("classinfolist_new");
if(classinfolist_new.size()>0)
    {
    Iterator<biz_classinfo> it=classinfolist_new.iterator();  
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

<li><a href="/classify/hotinfoview/<%=member.getClassinfoClass()%>/<%=member.getClassinfoid()%>"><%=member.getClassinfoTitle()%></a></li>
    <%
    }
  
    }
%>
</ul></marquee >
</div>

</div>

</div>

<!-- 最新加入企业开始--><div class="join">
<div class="join_top">
<h1><a href="">最新加入企业</a></h1>
<span><a href="">我要加入</a></span>
</div>

<div class="join_bottom">
<div class="join_bottom_smtjq">
<div class="join_bottom_smtjq_top"><img src="/resources/images/shouye_03.jpg" /><span><a href="/trade/list/2">更多&gt;&gt;</a></span></div>
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
     if(seq==1)
     {
     %>
     <li><a id="link" href="/<%=website.getMember().getMemberName()%>/" target="_blank"><%=website.getwComname()%></a><span><a href="/city/<%=website.getCity().getCityCode()%>" target="_blank"><%=website.getCity().getCityName()%></a></span></li>
     <%
     continue;
     }
     
     %>
     <li><span><a href="/city/<%=website.getCity().getCityCode()%>" target="_blank"><%=website.getCity().getCityName()%></a></span><a id="link"  href="/<%=website.getMember().getMemberName()%>/" target="_blank"><%=website.getwComname()%></a></li>
     <%
   }
}
 %>
</ul>
</div>
</div>

<div class="join_fg"></div>

<div class="join_bottom_smtbz">
<div class="join_bottom_smtbz_top"><img src="/resources/images/shouye_05.jpg"/><span><a href="/trade/list/1">更多&gt;&gt;</a></span></div>
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
<div class="join_bottom_syt_top"><img src="/resources/images/shouye_07.jpg"/><span><a href="/business">更多&gt;&gt;</a></span></div>
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
<!-- 最新加入企业结束-->
<!-- 产品展示-->
<div style="clear:both"></div>
<div class="product">
<div class="product_top">
<h1><a href="">产品展示</a></h1>
<span><a href="">我要发布</a></span>
</div>

<div class="product_bottom">
<div class="product_bottom_left">
<div class="product_bottom_left_top"><h1>最新产品展示</h1><span><a href="/product/list/1/2">更多加强版产品</a>&nbsp;&nbsp;<a href="/product/list/1/1">更多标准版产品</a>&nbsp;&nbsp;<a href="/product/list/2">更多生意通产品</a>&nbsp;&nbsp;</span></div>

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
<!-- 产品展示结束-->
<!-- 精品展示开始-->
<div class="product_bottom_right">
<div class="product_bottom_right_top"><h1>精品展示</h1></div>

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
<!-- 精品展示结束-->
<!--供求信息开始-->

<div class="gongqiu">
<div class="gongqiu_top">
<h1><a href="">供求信息</a></h1>
<span><a href="">我要发布</a></span>
</div>

<div class="gongqiu_bottom">
<div class="gongqiu_bottom_left">
<div class="gongqiu_bottom_left_top"><h1>最新供求信息</h1><span><a href="/purvey/list/1">更多供应</a>&nbsp;&nbsp;<a href="/purvey/list/2">更多求购</a>&nbsp;&nbsp;</span></div>

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
<div class="gongqiu_bottom_right_top"><h1>推荐供求信息</h1></div>

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
<span><a href="">我要加入</a></span>
</div>

<div class="qiye_bottom">
<div class="qiye_bottom_left">
<div class="qiye_bottom_left_top"><h1>精品企业</h1><span><a href="/trade/list/2">加强版</a>&nbsp;&nbsp;<a href="/trade/list/1">标准版</a>&nbsp;&nbsp;<a href="/business/list/5">钻石店铺</a>&nbsp;&nbsp;&nbsp;&nbsp;<a href="/business/list/3">铂金店铺</a>&nbsp;&nbsp;<a href="/business/list/4">黄金店铺</a>&nbsp;&nbsp;<a href="/business/list/3">白银店铺</a>&nbsp;&nbsp;<a href="/trade">更多&gt;&gt;</a>&nbsp;&nbsp;</span></div>    

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
<div class="qiye_bottom_right_top"><h1><a href="">推荐企业</a></h1></div>

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
<!--友情链接开始-->
<div class="link">
 <strong>友情连接：</strong>
 <a target="_blank" href="http://s.114chn.com/">生活网</a> &nbsp;<a target="_blank" href="http://search.114chn.com/">114查询</a> &nbsp;<a target="_blank" href="http://viking.mhfs.cn/ar.asp">精密电阻</a> &nbsp;<a target="_blank" href="http://www.yellowpages.com/">黄页</a> &nbsp;<a target="_blank" href="http://viking.mhfs.cn/">贴片电阻</a> &nbsp;<a target="_blank" href="http://www.yellowurl.cn/">中国黄页网</a> &nbsp;<a target="_blank" href="http://www.socom.cn/">企业名录</a> &nbsp;<a target="_blank" href="http://www.jsxys.com/">企业黄页</a> &nbsp;<a target="_blank" href="http://www.qy6.com/">中华企业录</a> &nbsp;<a target="_blank" href="http://www.795.com.cn/">点子创意网</a> &nbsp;<a target="_blank" href="http://viking.mhfs.cn/csr.asp">金属膜电阻</a> &nbsp;<a target="_blank" href="http://www.biz178.com/">连锁加盟网</a> &nbsp;<a target="_blank" href="http://www.okooo.com/">澳客彩票网</a> &nbsp;<a target="_blank" href="http://www.114chn.com/AllSiteMap.htm">YellowpageMap</a> &nbsp;<a target="_blank" href="http://www.txooo.com/">天下商机网</a> &nbsp;<a target="_blank" href="http://www.gushi360.com/">股票</a> &nbsp;<a target="_blank" href="http://viking.mhfs.cn/cfs.asp">碳膜电阻</a> &nbsp;<a target="_blank" href="http://www.bokee.net/">企博网</a> &nbsp;<a target="_blank" href="http://www.glass.com.cn/">中国玻璃网</a> &nbsp;<a target="_blank" href="http://www.3156.cn/">医药招商</a> &nbsp;<a target="_blank" href="http://www.qcwe.com/">搜车网</a> &nbsp;<a target="_blank" href="http://www.lc800.com/">工程机械与配件</a> &nbsp;<a target="_blank" href="http://www.zhantai.com/">站台网</a> &nbsp;<a target="_blank" href="http://www.cnhm.net/">中国花木网</a> &nbsp;<a target="_blank" href="http://www.jinku.com/">金库网</a> &nbsp;<a target="_blank" href="http://www.273.cn/">273二手车</a> &nbsp;<a target="_blank" href="http://www.globrand.com/">全球品牌网</a> &nbsp;<a target="_blank" href="http://www.b2b168.com/">八方资源网</a> &nbsp;<a target="_blank" href="http://www.11467.com/">顺企黄页网</a> &nbsp;<a target="_blank" href="http://www.6book.net/">企业网址导航</a> &nbsp;<a target="_blank" href="http://cy.78.cn/">商机网</a> &nbsp;<a target="_blank" href="http://www.89178.com/">创业网</a> &nbsp;<a target="_blank" href="http://www.icycn.com/">创业中国</a> &nbsp;<a target="_blank" href="http://www.ebdoor.com/">一比多</a> &nbsp;<a target="_blank" href="http://www.net114.com/">网络114</a> &nbsp;<a target="_blank" href="http://www.egou.com/">易购网</a> &nbsp;<a target="_blank" href="http://www.64365.com/">法律咨询</a> &nbsp;<a target="_blank" href="http://www.wufengguan.org/">无缝管</a> &nbsp;<a target="_blank" href="http://cy.78.cn/">创业项目</a> &nbsp;<a target="_blank" href="http://www.onccc.com/">义乌小商品批发</a> &nbsp;<a target="_blank" href="http://www.chinabaike.com/">百科</a> &nbsp;<a target="_blank" href="http://www.cjcp.com.cn/">彩经网</a> &nbsp;<a target="_blank" href="http://www.86mai.com/">b2b平台</a> &nbsp;<a target="_blank" href="http://www.marry52.com/">婚纱摄影</a> &nbsp;<a target="_blank" href="http://beijing.edeng.cn/">北京易登网</a> &nbsp;<a target="_blank" href="http://bbs.poco.cn/">POCO论坛</a> &nbsp;<a target="_blank" href="http://s.114chn.com/beijing">更多...</a>
</div>
<!--友情链接结束-->

<!--版权开始-->
<div class="copyright">
<div class="copyright_sm">免责声明：以上所展示的信息由用户自行提供且由系统自动收录，内容的准确性、完整性、合法性或真实性由用户负责。工商导航网对此不承担任何责任。</div>
<div class="copyright_lj"><a target="_blank" href="http://www.zggsdh.com/web/htm/contact/contact.asp" rel="nofollow">关于我们</a>&nbsp;&nbsp;|&nbsp;&nbsp;<a target="_blank" href="http://www.zggsdh.com/web/htm/contact/server.asp" rel="nofollow">服务条款</a>&nbsp;&nbsp;|&nbsp;&nbsp;<a target="_blank" href="http://www.zggsdh.com/web/htm/contact/zizhi.asp" rel="nofollow">公司资质</a>&nbsp;&nbsp;|&nbsp;&nbsp;<a target="_blank" href="http://www.zggsdh.com/web/htm/contact/person.asp" rel="nofollow">求贤纳士</a>&nbsp;&nbsp;|&nbsp;&nbsp; <a target="_blank" href="http://www.zggsdh.com/web/htm/contact/feed.asp" rel="nofollow">意见反馈</a>&nbsp;&nbsp;|&nbsp;&nbsp; <a target="_blank" href="http://www.zggsdh.com/web/htm/contact/ad.asp" rel="nofollow">广告服务</a>&nbsp;&nbsp;|&nbsp;&nbsp; <a target="_blank" href="http://www.114chn.com/TextLink.htm">文字链接</a>&nbsp;&nbsp;|&nbsp;&nbsp;<a target="_blank" href="http://www.114chn.com/Imagelink.htm">图片链接</a>&nbsp;&nbsp;|&nbsp;&nbsp;<a target="_blank" href="http://www.zggsdh.com/web/htm/contact/web.asp" rel="nofollow">网站建设</a>&nbsp;&nbsp;|&nbsp;&nbsp;<a target="_blank" href="http://www.zggsdh.com/web/htm/contact/pay.asp" rel="nofollow">付款方式</a>&nbsp;&nbsp;|&nbsp;&nbsp;<a target="_blank" href="http://www.zggsdh.com/web/htm/contact/jiameng.asp" rel="nofollow">代理合作</a>&nbsp;&nbsp;|&nbsp;&nbsp;<a target="_blank" href="http://www.zggsdh.com/web/htm/contact/manner.asp" rel="nofollow">联系方式</a>&nbsp;&nbsp;&nbsp;  <a target="_blank" href="http://www.114chn.com/swzn.aspx" rel="nofollow" style="display: none;">|&nbsp;&nbsp;&nbsp;公司动态</a>&nbsp;&nbsp;&nbsp;<span style="display:none;">|</span>&nbsp;&nbsp;&nbsp; 
</div>
<div class="copyright_body">Copyright&#169;2003-2012 www.zggsdh.com All Rights Reserved 网站运营：长沙游信网络科技有限公司<br/>
全国统一电话：400-0909-516   电话：0731-89855260   传真：0731-89855296<br/>
技术支持:<a href="http://www.faydrian.com/" target="_blank">长沙沸点文化传播有限公司</a>
<p></p><p></p><p></p><p>

</p><img src="/resources/images/cpxxlb.jpg" width="130" height="54" />
 <img src="/resources/images/cpxxlb.jpg" width="130" height="54" />
  <img src="/resources/images/cpxxlb.jpg" width="130" height="54" /></div>

</div>
<!--版权结束-->
</div>
</div>

</body>
</html>



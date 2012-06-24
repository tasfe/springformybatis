<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@page import="com.hedgehog.domain.biz_menu"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>${title}-<tiles:insertAttribute name="title"/></title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<tiles:insertAttribute name="header"/>
</head>
<body><div class="top">
<div class="topd">
<form>
<div class="top_left">
您好，欢迎来到工商导航&nbsp;&nbsp;
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
<div class="wall">
<!--顶部结束-->
<!--LOGO部分开始-->
<div class="logo">
<div class="logo_zggsdh"><img src="/resources/template/standard/image/logo.jpg" width="185" height="70" /></div>
<div class="logo_ad">
<ul>
<li><a target="_blank" href="#" title="石家庄保安公司（河北众邦保安服务有限公司）">石家庄保安公司</a></li>
<li><a target="_blank" href="#" title="中国矿山井巷行业网">中国矿山井巷网</a></li>
<li><a target="_blank" href="#" title="西宁夏都租车 西宁租车 西宁旅游租车 青海旅游租车 青海租车">西宁夏都租车</a></li>
<li><a target="_blank" href="#" title="石家庄驴友装备商城">石家庄驴友装备</a></li></ul>
<ul><li><a target="_blank" href="#" title="韩国电热板|无辐射电热板|电热板批发销售|韩国电热板中国总代理">韩国电热板代理</a></li>
<li><a target="_blank" href="#" title="重庆南珺电子科技有限公司">重庆南珺电子</a></li>
<li><a target="_blank" href="#" title="青岛慈心健康管理有限公司_青岛体检_青岛健康管理_健康调养_崂山体检">青岛慈心健康管</a></li>
<li><a target="_blank" href="#" title="静海饭店_王口饭店_餐馆_静海王口饭店">静海饭店_王口</a></li></ul>
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

<div id="daohang">
<p>${website.wComname}</p><span>版权名称</span>
<%
List<biz_menu> list=(List<biz_menu>)request.getAttribute("menuenable");
 %>
<ul>
<li class="jc"><a href="/${username}/">网站首页</a></li>
<%
                 if(list.size()>0)
                 {
                 Iterator<biz_menu> it=list.iterator();  
   biz_menu menu=null;
   while(it.hasNext())
   {
     menu=(biz_menu)it.next(); 
     //System.out.println("栏目代号："+menu.getMenuChCode());
     //System.out.println("栏目访问视图："+menu.getChannel().getChUrl());
   %>
   <li><a href='/${username}/<%=menu.getChannel().getChUrl()%>/<%=menu.getMenuid()%>'><%=menu.getMenuName()%></a></li>   
   <%   
   }
  }                 
%>
</ul>

</div>
<div style="clear:both"></div>
<tiles:insertAttribute name="left"/>
<tiles:insertAttribute name="content"/>
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
<div class="copyright_body">Copyright&#169;2003-2012 www.zggsdh.com All Rights Reserved 网站运营：长沙游信网络科技有限公司<br>
全国统一电话：400-0909-516   电话：0731-89855260   传真：0731-89855296<br>
技术支持:<a href="http://www.faydrian.com/" target="_blank">长沙沸点文化传播有限公司</a>
<p></p><p></p><p></p><p>

</p><img src="/resources/template/standard/image/cpxxlb.jpg"width="130" height="54" />
 <img src="/resources/template/standard/image/cpxxlb.jpg" width="130" height="54" />
  <img src="/resources/template/standard/image/cpxxlb.jpg"width="130" height="54" /></div>

</div>
<!--版权结束-->
</div>


</body>
</html>

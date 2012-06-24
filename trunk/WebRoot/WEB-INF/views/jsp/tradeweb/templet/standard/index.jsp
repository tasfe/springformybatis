<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<div class="left">
  <div id="main">
<span class="bs"> <a> 首页</a> &gt;&gt; ${website.wComname}</span>
    <div class="bx"> <span class="left_a">欢迎您与我联系业务：</span> <span class="right_a">欲获的更多功能,请&nbsp;<a href="#">立即升级更高会员</a></span></div>
    <div id="main_tx"></div>
    <div id="main_tx_bottom">
      <h1>${website.wComname}</h1>
      
      <ul>
        <li>电话：${member.memberTel} <a href="">电话纠错举报</a></li>        
        <li>传真：${website.wFax}</li>
        <li>地址：${website.wAddress}</li>
        <li>邮编：${website.wZip}<br />
        </li>
      </ul>
    </div>
    <p>&nbsp;</p>
  </div>
  <div style="clear:both"></div>
<div id="xxxx"><span>${website.wFree}</span>
  <p>${website.wFreetext}</p>
</div>
</div>
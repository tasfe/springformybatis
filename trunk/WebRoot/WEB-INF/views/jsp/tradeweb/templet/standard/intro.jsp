<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<div class="left">
  <div id="main">
 <span class="bs">首页 &gt;&gt;${website.wComname}</span>
    <div class="bx"> <span class="left_a">欢迎您与我联系业务：</span> <span class="right_a">欲获的更多功能,请&nbsp;<a href="#">立即升级更高会员</a></span></div>
   <div class="wenzi">
<p><c:if test="${! empty commoninfo}">${commoninfo.cmmVallue}</c:if> </p>
 
      </div>
  </div>
  <div style="clear:both"></div>
</div>

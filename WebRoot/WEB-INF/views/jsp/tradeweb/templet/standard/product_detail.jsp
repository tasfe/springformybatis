<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<div class="left">
  <div id="main"> <span class="bs">首页 &gt;&gt;${website.wComname}</span>
      <div class="bx"> <span class="left_a">欢迎您与我联系业务：</span> <span class="right_a">欲获的更多功能,请&nbsp;<a href="#">立即升级更高会员</a></span></div>
    <div class="gyxx_bottom_left">
       
      <span>${product.productName}</span>
       <div class="gyxx_bottom_left_neirong" >
       <p><img src="${product.productThumbs}" width="208" height="207" /></p>
       <p>产品类别：${product.productclass.pcName}</p>
  <p>市场价格：${product.productMarket}</p>
  <p>促销价格：${product.productPromote}</p>
   <p>${product.productDes}</p>
       </div>         
     
    </div>
  </div>
  <div style="clear:both"></div>
</div>

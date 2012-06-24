<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<div id="right">

 <span>${product.productName}</span> 
 <div class="tupian">
<div class="tupian-bottom"><img src="${product.productThumbs}" width="208" height="207" /></div>
 </div>
 <div class="b-top"><img src="/resources/template/company/images/jqbnr-02.jpg" width="741" height="38" /></div>
 
 <div class="b1">
 <ul> 
 
 <li>产品类别</li>
  <li>产品名称</li>
    
 </ul>
 </div>
  <div class="b2">
  <ul>
 
  <li>${product.productclass.pcName}</li>
  <li>${product.productName}</li>

 </ul></div>
   <div class="b3">
    <ul>
 <li>市场价格</li>
  <li>优惠价格</li>

 </ul>
   </div>
    <div class="b4">
    <ul>
 <li>${product.productMarket}</li>
  <li>${product.productPromote}</li>
 </ul>
   </div> 
   <div  style="clear:both"></div>
<div class="wenzi">
  ${product.productDes}
</div>    
  

  </div>

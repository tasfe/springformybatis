<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@page import="com.hedgehog.domain.*"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://ckeditor.com" prefix="ckeditor" %>
<br/><br/>
<form:form modelAttribute="webproduct" enctype="multipart/form-data" onSubmit="return Validate();">
<table border="0" cellspacing="1" cellpadding="0" class="table" style="width:100%;" align="left">
<tr class="tr">
    <td colspan="2" class="td">添加产品
    </td>    
  </tr>  
  <tr class="tr">
    <td class="td" style="width:18%;">产品名称</td>
    <td><form:input path="productName" cssStyle="width:200px;" /><span class="required">* 必填</span>
                       <form:errors path="productName" cssClass="error" /> </td>
  </tr>
  <tr class="tr" style="display:none;">
    <td class="td" style="width:18%;">自定义属性</td>
    <td>    
    <form:checkboxes path="productFlag" items="${sortlist}"/>
                       <form:errors path="productFlag" cssClass="error" /> </td>
  </tr>
  <tr class="tr">
    <td class="td">产品类别</td>
    <td>
    <form:select path="productClass" cssStyle="width:100px;">
                    <form:option value="">请选择类别</form:option>
                    <form:options items="${nclist}" itemValue="pcid" itemLabel="pcName"/>
                    </form:select>
                    <span class="required">* 必填</span>
                    <form:errors path="productClass" cssClass="error" /> 
     </td>
  </tr>
  <tr class="tr">
    <td class="td">产品图片</td>
    <td>
    
                       <table>
                    <tr>
                    <td>
                    <form:hidden path="productThumbs" />
    <form:input path="fileData" type="file"/>    
                       <form:errors path="fileData" cssClass="error" /> 
                    </td>
                        <td style="padding-left:50px;">
                        <%
                        if(((web_product)request.getAttribute("webproduct")).getProductThumbs()!="")
                        {
                        %>
                        <img src="${webproduct.productThumbs}" width="100" height="60" />
                        <%
                        }                        
                         %>                        
                        </td>
                    </tr>
                    </table>    </td>
  </tr>
  <tr class="tr">
    <td class="td">市场价格</td>
    <td><form:input path="productMarket" cssStyle="width:200px;" />
                       <form:errors path="productMarket" cssClass="error" /> </td>
  </tr>
  <tr class="tr">
    <td class="td">优惠价格</td>
    <td><form:input path="productPromote" cssStyle="width:200px;"/>
                       <form:errors path="productPromote" cssClass="error" /> </td>
  </tr>
  
  <tr class="tr">
    <td class="td" colspan="2"><form:textarea path="productDes"/>
    <span class="required">* 必填</span>
    <form:errors path="productDes" cssClass="error" />
                        </td>
  </tr>  
  
  

  <tr class="tr">
    <td colspan="2" style="text-align:center;" class="td"><input type="submit" name="Button1" value="确定" /> &nbsp;
                     <input id="Reset1" class="button_bak" type="reset" value="重填" /></td>    
  </tr>  
</table>
</form:form>
<!--<ckeditor:replace  replace="productContent" basePath="../ckeditor/" />-->
<script type="text/javascript">//<![CDATA[
window.CKEDITOR_BASEPATH='../../../ckeditor/';
//]]></script>
<script type="text/javascript" src="../../../ckeditor/ckeditor.js?t=B37D54V"></script>
<script type="text/javascript" src="../../../ckfinder/ckfinder.js"></script>
<script type="text/javascript"> 
<!--
                function BrowseServer(inputId)
                {
                var finder = new CKFinder() ;
                finder.basePath = '../../../inc/ckfinder/';  //导入CKFinder的路径
                finder.selectActionFunction = SetFileField; //设置文件被选中时的函数
                finder.selectActionData = inputId;  //接收地址的input ID
                finder.popup() ;
                }
                
                //文件选中时执行
                function SetFileField(fileUrl,data)
                {
                    document.getElementById(data["selectActionData"]).value = fileUrl ;
                }
                function Validate()
				  {
					 var image =document.getElementById("fileData").value;
					 if(image!=''){
						  var checkimg = image.toLowerCase();
						  if (!checkimg.match(/(\.jpg|\.png|\.JPG|\.PNG|\.jpeg|\.JPEG)$/)){
							  alert("Please enter  Image  File Extensions .jpg,.png,.jpeg");
							  document.getElementById("fileData").focus();
							  return false;
						    }
						 }
					 return true;
				 }			
                // -->
            </script>   
<script type="text/javascript">//<![CDATA[
var editor=CKEDITOR.replace('productDes');
//,{toolbar : 'Basic'  }
// Just call CKFinder.setupCKEditor and pass the CKEditor instance as the first argument.
	// The second parameter (optional), is the path for the CKFinder installation (default = "/ckfinder/").
	CKFinder.setupCKEditor( editor, '../../../ckfinder/' ) ;

	// It is also possible to pass an object with selected CKFinder properties as a second argument.
	// CKFinder.setupCKEditor( editor, { basePath : '../', skin : 'v1' } ) ;
//]]></script>

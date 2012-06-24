<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@page import="com.hedgehog.domain.*"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://ckeditor.com" prefix="ckeditor" %>
<spring:url var="rpath" value="/resources/manager" />
<!-- 头部菜单 Start -->
	        <table border='0' cellpadding='0' cellspacing='0' width='100%' align='center'>
              <tr>
                <td class='menubar_title'><img border='0' src='${rpath}/images/ICON/applist.gif' align='absmiddle' hspace='3' vspace='3'>&nbsp;产品列表管理</td>
                <td class='menubar_readme_text' valign='bottom'><img src='${rpath}/images/ICON/office.gif' align='absMiddle' border='0' />&nbsp;帮助？</td>
              </tr>
              <tr>
                <td height='27px' class='menubar_function_text'>目前操作功能：编辑产品</td>
                <td class='menubar_menu_td' align='right'><table border="0" cellspacing="0" cellpadding="0"><tr><td class="menubar_button" id="button_0" OnClick="JavaScript:window.location.href='List';" OnMouseOut="javascript:MenuOnMouseOver(this);" OnMouseOver="javascript:MenuOnMouseOut(this);"><img border="0" align="texttop" src="${rpath}/images/ICON/list.gif">&nbsp;列表产品</td></tr></table></td>
              </tr>
              <tr><td height='5px' colspan='2'></td></tr>
            </table>
        <!-- 头部菜单 End -->
        
    <!-- 选项卡 Start -->
        <TABLE cellSpacing=0 cellPadding=0 width='100%' align=center border=0>   
        <TBODY>   
	        <TR>     
		        <TD style='PADDING-LEFT: 2px; HEIGHT: 22px' background='${rpath}/images/Menu/tab_top_bg.gif'>
			        <TABLE cellSpacing=0 cellPadding=0 border=0>
				        <TBODY><TR>
                                    <!--按钮　Start-->
                                    <TD >
	        <TABLE height=22 cellSpacing=0 cellPadding=0 border=0>
		        <TBODY>
                       <TR>
				         <TD width=3><IMG id=tabImgLeft__0 height=22 src='${rpath}/images/Menu/tab_unactive_left.gif'  width=3></TD>
				         <TD class=tab id=tabLabel__0 onclick='javascript:tabClick(0,1)' background='${rpath}/images/Menu/tab_unactive_bg.gif' UNSELECTABLE='on'>编辑产品</TD>
				         <TD width=3><IMG id=tabImgRight__0 height=22 src='${rpath}/images/Menu/tab_unactive_right.gif' width=3></TD>
			           </TR>
		        </TBODY>
	        </TABLE>
        </TD>
                                    <!--按钮 End-->
						        </TR>
				        </TBODY>
			        </TABLE>
		        </TD>
	        </TR>
	        <TR>
	        <TD bgColor=#ffffff>           
		        <TABLE cellSpacing=0 cellPadding=0 width='100%' border=0>
		        <TBODY>
		        <TR>
			        <TD width=1 background='${rpath}/images/Menu/tab_bg.gif'><IMG  height=1 src='${rpath}/images/Menu/tab_bg.gif'  width=1></TD>
			        <TD style='PADDING-RIGHT: 15px; PADDING-LEFT: 15px; PADDING-BOTTOM: 15px; PADDING-TOP: 15px; HEIGHT: 100px' vAlign=top>
        
        <!--内容框Start--><DIV id='tabContent__0'>
        <form:form modelAttribute="product" enctype="multipart/form-data" onSubmit="return Validate();">        
    <table width="100%" border="0" cellspacing="1" cellpadding="3" align="center">
  
  <tr>
    <td width="18%" class="table_body">产品名称</td>
    <td width="82%" class="table_none"><form:input path="productName" cssStyle="width:200px;" /><span class="required">* 必填</span>
    <form:errors path="productName" cssClass="error" /></td>
  </tr>
  <tr>
    <td class="table_body">自定义属性</td>
    <td class="table_none"><form:checkboxes path="productFlag" items="${sortlist}"/>
                       <form:errors path="productFlag" cssClass="error" /> </td>
  </tr>
  <tr>
    <td class="table_body">产品类别</td>
    <td class="table_none"><form:select path="productClass" cssStyle="width:100px;">
                    <form:option value="">请选择类别</form:option>
                    <form:options items="${nclist}" itemValue="pcid" itemLabel="pcName"/>
                    </form:select>
                    <span class="required">* 必填</span>
                    <form:errors path="productClass" cssClass="error" />  </td>
  </tr>
  <tr>
    <td class="table_body">产品图片</td>
    <td class="table_none">
    <table>
                    <tr>
                    <td>
    <form:hidden path="productThumbs" />
    <form:input path="fileData" type="file"/>    
                       <form:errors path="fileData" cssClass="error" /> 
                    </td>
                        <td style="padding-left:50px;">
                        <c:if test="${! empty product.productThumbs}"><img src="${product.productThumbs}" width="100" height="60" /></c:if>
                                           
                        </td>
                    </tr>
                    </table></td>
  </tr>
  <tr>
    <td class="table_body" style="width: 18%">市场价格</td>
    <td class="table_none"><form:input path="productMarket" cssStyle="width:200px;" />
                       <form:errors path="productMarket" cssClass="error" />                  
                    </td>
  </tr>
  
  <tr>
    <td class="table_body">优惠价格</td>
    <td class="table_none"><form:input path="productPromote" cssStyle="width:200px;"/>
                       <form:errors path="productPromote" cssClass="error" /> </td>
  </tr>
  <tr>
    
    <td class="table_none" colspan="2"><form:textarea path="productDes"/>
    <span class="required">* 必填</span>
    <form:errors path="productDes" cssClass="error" /> </td>
  </tr> 

  
  <tr>
    <td colspan="2" style="text-align:center;"><input type="submit" name="Button1" class="button_bak" value="确定" /> &nbsp;

<input id="Reset1" class="button_bak" type="reset" value="重填" /></td>
    
  </tr>
  
</table>
</form:form>
        
        </DIV><!--内容框End-->
			        </TD>
			        <TD width=1 background='${rpath}/images/Menu/tab_bg.gif'><IMG height=1 src='${rpath}/images/Menu/tab_bg.gif'  width=1></TD>
		        </TR>
		        </TBODY>
		        </TABLE>
	        </TD>
	        </TR>
	        <TR>
		        <TD background='${rpath}/images/Menu/tab_bg.gif' bgColor='#ffffff'><IMG height=1 src='${rpath}/images/Menu/tab_bg.gif' width='1'></TD>
	        </TR>
        </TBODY>
        </TABLE>
        <!--选项卡 End-->
        <!--<ckeditor:replace  replace="productContent" basePath="../ckeditor/" />-->
<script type="text/javascript">//<![CDATA[
window.CKEDITOR_BASEPATH='../../../../../ckeditor/';
//]]></script>
<script type="text/javascript" src="../../../../../ckeditor/ckeditor.js?t=B37D54V"></script>
<script type="text/javascript" src="../../../../../ckfinder/ckfinder.js"></script>
<script type="text/javascript"> 
<!--
                function BrowseServer(inputId)
                {
                var finder = new CKFinder() ;
                finder.basePath = '../../../../../inc/ckfinder/';  //导入CKFinder的路径
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
	CKFinder.setupCKEditor( editor, '../../../../../ckfinder/' ) ;

	// It is also possible to pass an object with selected CKFinder properties as a second argument.
	// CKFinder.setupCKEditor( editor, { basePath : '../', skin : 'v1' } ) ;
//]]></script>
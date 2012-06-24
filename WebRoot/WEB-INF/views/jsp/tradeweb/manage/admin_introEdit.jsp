<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@page import="com.hedgehog.domain.*"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://ckeditor.com" prefix="ckeditor" %>
<br/><br/>
<form:form modelAttribute="webcommoninfo">
<table border="0" cellspacing="1" cellpadding="0" class="table" style="width:100%;" align="left">
<tr class="tr">
    <td colspan="2" class="td">添加公司介绍
    </td>    
  </tr>  
  <tr class="tr">
    <td class="td" style="width:18%;">名称</td>
    <td><form:input path="cmmName" cssStyle="width:200px;" /><span class="required">* 必填</span>
                       <form:errors path="cmmName" cssClass="error" /> </td>
  </tr>
  
  <tr class="tr">
    <td class="td" colspan="2"><form:textarea path="cmmVallue"/>
    <span class="required">* 必填</span>
    <form:errors path="cmmVallue" cssClass="error" />
                        </td>
  </tr>  
  
  <tr class="tr">
    <td colspan="2" style="text-align:center;" class="td"><input type="submit" name="Button1" value="确定" /> &nbsp;
                     <input id="Reset1" class="button_bak" type="reset" value="重填" /></td>    
  </tr>  
</table>
</form:form>
<!--<ckeditor:replace  replace="newsContent" basePath="../ckeditor/" />-->
<script type="text/javascript">//<![CDATA[
window.CKEDITOR_BASEPATH='../../../ckeditor/';
//]]></script>
<script type="text/javascript" src="../../../ckeditor/ckeditor.js?t=B37D54V"></script>
<script type="text/javascript" src="../../../ckfinder/ckfinder.js"></script>
<script type="text/javascript">//<![CDATA[
var editor=CKEDITOR.replace('cmmVallue');
//,{toolbar : 'Basic'  }
// Just call CKFinder.setupCKEditor and pass the CKEditor instance as the first argument.
	// The second parameter (optional), is the path for the CKFinder installation (default = "/ckfinder/").
	CKFinder.setupCKEditor( editor, '../../../ckfinder/' ) ;

	// It is also possible to pass an object with selected CKFinder properties as a second argument.
	// CKFinder.setupCKEditor( editor, { basePath : '../', skin : 'v1' } ) ;
//]]></script>


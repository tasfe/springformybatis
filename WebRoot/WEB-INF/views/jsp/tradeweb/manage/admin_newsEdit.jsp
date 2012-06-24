<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@page import="com.hedgehog.domain.*"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://ckeditor.com" prefix="ckeditor" %>
<br/><br/>
<form:form modelAttribute="webnews">
<table border="0" cellspacing="1" cellpadding="0" class="table" style="width:100%;" align="left">
<tr class="tr">
    <td colspan="2" class="td">添加新闻
    </td>    
  </tr>  
  <tr class="tr">
    <td class="td" style="width:18%;">标题</td>
    <td><form:input path="newsTitle" cssStyle="width:200px;" /><span class="required">* 必填</span>
                       <form:errors path="newsTitle" cssClass="error" /> </td>
  </tr>
  <tr class="tr" style="display:none;">
    <td class="td" style="width:18%;">自定义属性</td>
    <td>    
    <form:checkboxes path="newsFlag" items="${sortlist}"/>
                       <form:errors path="newsFlag" cssClass="error" /> </td>
  </tr>
  <tr class="tr">
    <td class="td">类别</td>
    <td>
    <form:select path="newsClass" cssStyle="width:100px;">
                    <form:option value="">请选择类别</form:option>
                    <form:options items="${nclist}" itemValue="newsclassid" itemLabel="ncName"/>
                    </form:select>
                    <span class="required">* 必填</span>
                    <form:errors path="newsClass" cssClass="error" /> 
     </td>
  </tr>
  <tr class="tr">
    <td class="td">来源</td>
    <td><form:input path="newsSource" cssStyle="width:200px;" />
                       <form:errors path="newsSource" cssClass="error" /> </td>
  </tr>
  
  <tr class="tr">
    <td class="td" colspan="2"><form:textarea path="newsContent"/>
    <span class="required">* 必填</span>
    <form:errors path="newsContent" cssClass="error" />
                        </td>
  </tr>  
  <tr class="tr">
    <td class="td">摘要</td>
    <td><form:textarea path="newsSummery" rows="5" cols="50"/>
                       <form:errors path="newsSummery" cssClass="error" /> </td>
  </tr>
  <tr class="tr">
    <td class="td">Tags标签</td>
    <td><form:input path="newsKeywords" cssStyle="width:200px;" />
                       <form:errors path="newsKeywords" cssClass="error" /> </td>
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
var editor=CKEDITOR.replace('newsContent');
//,{toolbar : 'Basic'  }
// Just call CKFinder.setupCKEditor and pass the CKEditor instance as the first argument.
	// The second parameter (optional), is the path for the CKFinder installation (default = "/ckfinder/").
	CKFinder.setupCKEditor( editor, '../../../ckfinder/' ) ;

	// It is also possible to pass an object with selected CKFinder properties as a second argument.
	// CKFinder.setupCKEditor( editor, { basePath : '../', skin : 'v1' } ) ;
//]]></script>

<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@page import="com.hedgehog.domain.*"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<spring:url var="rpath" value="/resources/manager" />
<script type="text/javascript" src="/resources/js/jquery-1.4.4.min.js"></script>
<script type="text/javascript">
var $j=jQuery.noConflict(); 
jQuery().ready(function(){
	//$j("#wCity").attr("disabled","disabled");
	$j("#classinfoParentclass").change(function(){
		if($j.trim($j("#classinfoParentclass").val())!="")
		{		    
		    getVal($j("#classinfoParentclass").val()); 
		}
		else
		{
		    var ds_id = $j("#classinfoClass"); 
		    $j("option",ds_id).remove(); 
		    var option = "<option value=''>请选择子类</option>"; 
		    ds_id.append(option);  
		    $j("#classinfoClass").attr("disabled","disabled");
		}
   });
   if($j.trim($j("#classinfoParentclass").val())!="")
		{		    
		    getVal($j("#classinfoParentclass").val()); 
		}
		else
		{
		    var ds_id = $j("#classinfoClass"); 
		    $j("option",ds_id).remove(); 
		    var option = "<option value=''>请选择子类</option>"; 
		    ds_id.append(option);  
		    $j("#classinfoClass").attr("disabled","disabled");
		}		
});
function getVal(e)
{
$j.getJSON("/Manager/Module/FrameWork/ProjectInfo/BIZ_CLASSINFO/getlistByparent?id="+e+"&timestamp=" + (new Date()).getTime(),function(responseText)
    {
     //alert(responseText);
     var ds_id = $j("#classinfoClass"); 
     ds_id.removeAttr("disabled");
     $j("option",ds_id).remove(); //ds_id.empty()
     $j.each(responseText, function(i,item){
       //alert(item.cicName) 
       //alert(${classinfo.classinfoClass});
       //判断是否为null
       <c:choose>
 <c:when test="${! empty classinfo.classinfoClass}">
if(item.cicid==${classinfo.classinfoClass})
       {
       var option = "<option value='"+item.cicid+"' selected='selected'>"+item.cicName+"</option>"; 
       ds_id.append(option);
       }
       else
       {
       var option = "<option value='"+item.cicid+"'>"+item.cicName+"</option>"; 
        ds_id.append(option);       
       }       
</c:when>
<c:otherwise>
var option = "<option value='"+item.cicid+"'>"+item.cicName+"</option>"; 
        ds_id.append(option);       
</c:otherwise>
 </c:choose>
       
     })      
    });
  
}
</script>
<!-- 头部菜单 Start -->
	        <table border='0' cellpadding='0' cellspacing='0' width='100%' align='center'>
              <tr>
                <td class='menubar_title'><img border='0' src='${rpath}/images/ICON/applist.gif' align='absmiddle' hspace='3' vspace='3'>&nbsp;分类信息管理</td>
                <td class='menubar_readme_text' valign='bottom'><img src='${rpath}/images/ICON/office.gif' align='absMiddle' border='0' />&nbsp;帮助？</td>
              </tr>
              <tr>
                <td height='27px' class='menubar_function_text'>目前操作功能：编辑分类信息</td>
                <td class='menubar_menu_td' align='right'><table border="0" cellspacing="0" cellpadding="0"><tr><td class="menubar_button" id="button_0" OnClick="JavaScript:window.location.href='List';" OnMouseOut="javascript:MenuOnMouseOver(this);" OnMouseOver="javascript:MenuOnMouseOut(this);"><img border="0" align="texttop" src="${rpath}/images/ICON/list.gif">&nbsp;列表分类信息</td></tr></table></td>
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
				         <TD class=tab id=tabLabel__0 onclick='javascript:tabClick(0,1)' background='${rpath}/images/Menu/tab_unactive_bg.gif' UNSELECTABLE='on'>编辑分类信息</TD>
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
        <form:form modelAttribute="classinfo" enctype="multipart/form-data" onSubmit="return Validate();">        
<table width="100%" border="0" cellspacing="1" cellpadding="3" align="center">  
<tr>
    <td class="table_body" style="width: 18%">标题</td>
    <td class="table_none" style="width: 82%">    
    <form:input path="classinfoTitle" cssStyle="width:250px;" /><span class="required">* 必填</span>
                       <form:errors path="classinfoTitle" cssClass="error" />              
                    </td>
  </tr>
  <tr>
    <td class="table_body">类型</td>
    <td class="table_none"><form:select path="classinfoParentclass" cssStyle="width:120px;">
                    <form:option value="">请选择类型</form:option>
                    <form:options items="${cicplist}" itemValue="cicid" itemLabel="cicName"/>
                    </form:select>
                    <form:select path="classinfoClass" cssStyle="width:120px;">
                    <form:option value="">请选择类型</form:option>                    
                    </form:select>   
                    <span class="required">* 必选</span>
                    <form:errors path="classinfoParentclass" cssClass="error" />
                    <form:errors path="classinfoClass" cssClass="error" />  
                    </td>
  </tr>
  <tr>
    <td class="table_body">描述</td>
    <td class="table_none"><form:textarea path="classinfoDes" rows="8" cols="50" /><span class="required">* 必填</span>
                       <form:errors path="classinfoDes" cssClass="error" /> </td>
  </tr>
  
  <tr>
    <td class="table_body">图片</td>
    <td class="table_none">
    <table>
                    <tr>
                    <td>
                    <form:hidden path="classinfoPic" />                      
    
    <form:input path="fileData" type="file"/>    
                       <form:errors path="fileData" cssClass="error" /><form:errors path="classinfoPic" cssClass="error" />
                    </td>
                        <td style="padding-left:50px;">
                        <%
                        if(((biz_classinfo)request.getAttribute("classinfo")).getClassinfoPic()!="")
                        {
                        %>
                        <img src="${classinfo.classinfoPic}" width="100" height="60"/>
                        <%
                        }                        
                         %>                        
                        </td>
                    </tr>
                    </table>        
   
                        </td>
  </tr>
  <tr>
    <td class="table_body">价格</td>
    <td class="table_none"><form:input path="classinfoPrice" cssStyle="width:100px;" /><span class="required">* 必填</span>
                       <form:errors path="classinfoPrice" cssClass="error" /> </td>
  </tr>
  <tr class="table_title">
    <td colspan="2">联系信息</td>
    
  </tr>
  <tr>
    <td class="table_body">姓名</td>
    <td class="table_none"><form:input path="classinfoName" cssStyle="width:100px;" />
                       <form:errors path="classinfoName" cssClass="error" /> </td>
  </tr>
  <tr>
    <td class="table_body">地址</td>
    <td class="table_none"><form:input path="classinfoAddr" cssStyle="width:250px;" /><span class="required">* 必填</span>
                       <form:errors path="classinfoAddr" cssClass="error" /> </td>
  </tr>
  <tr>
    <td class="table_body">邮编</td>
    <td class="table_none"><form:input path="classinfoCode" cssStyle="width:100px;" />
                       <form:errors path="classinfoCode" cssClass="error" /> </td>
  </tr>
  <tr>
    <td class="table_body">电话</td>
    <td class="table_none"><form:input path="classinfoTel" cssStyle="width:100px;" /><span class="required">* 必填</span>
                       <form:errors path="classinfoTel" cssClass="error" /> </td>
  </tr>
  <tr>
    <td class="table_body">即时通信</td>
    <td class="table_none"><form:input path="classinfoIcq" cssStyle="width:100px;" />
                       <form:errors path="classinfoIcq" cssClass="error" /> </td>
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
        <script type="text/javascript"> 
        <!--               
                
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

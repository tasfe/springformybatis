<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<spring:url var="rpath" value="/resources/manager" />
<script type="text/javascript" src="/resources/js/jquery-1.4.4.min.js"></script>
<script type="text/javascript">
var $j=jQuery.noConflict(); 
jQuery().ready(function(){

	//$j("#wCity").attr("disabled","disabled");
	$j("#wProvince").change(function(){
		if($j.trim($j("#wProvince").val())!="")
		{
		    
		    getVal($j("#wProvince").val()); 
		}
		else
		{
		    var ds_id = $j("#membercity"); 
		    $j("option",ds_id).remove(); 
		    var option = "<option value=''>请选择城市</option>"; 
		    ds_id.append(option);  
		    $j("#membercity").attr("disabled","disabled");
		}
   }); 
   
     if($j.trim($j("#wProvince").val())!="")
		{		    
		    getVal($j("#wProvince").val()); 
		}
		else
		{
		    var ds_id = $j("#membercity"); 
		    $j("option",ds_id).remove(); 
		    var option = "<option value=''>请选择城市</option>"; 
		    ds_id.append(option);  
		    $j("#membercity").attr("disabled","disabled");
		}
		
		//等级
		//$j("#membercity").attr("disabled","disabled");
	$j("#memberPrank").change(function(){
		if($j.trim($j("#memberPrank").val())!="")
		{
		    
		    getVal2($j("#memberPrank").val()); 
		}
		else
		{
		    var ds_id = $j("#memberRank"); 
		    $j("option",ds_id).remove(); 
		    var option = "<option value=''>请选择子类</option>"; 
		    ds_id.append(option);  
		    $j("#memberRank").attr("disabled","disabled");
		}
   }); 
   
     if($j.trim($j("#memberPrank").val())!="")
		{		    
		    getVal2($j("#memberPrank").val()); 
		}
		else
		{
		    var ds_id = $j("#memberRank"); 
		    $j("option",ds_id).remove(); 
		    var option = "<option value=''>请选择子类</option>"; 
		    ds_id.append(option);  
		    $j("#memberRank").attr("disabled","disabled");
		}
});
function getVal(e)
{

$j.getJSON("/member/getlistBypro?id="+e+"&timestamp=" + (new Date()).getTime(),function(responseText)
    {
    //alert("真实姓名"+${member.memberRealname});
    //alert("企业名称"+${member.memberCname});
    
    //alert("联系电话"+${member.memberTel});
    
    //alert("城市"+${member.membercity});
    
    //alert("用户名"+${member.memberName});
    
       
    //alert("会员等级"+${member.memberRank});
     var ds_id = $j("#membercity"); 
     ds_id.removeAttr("disabled");
     $j("option",ds_id).remove(); //ds_id.empty()
     $j.each(responseText, function(i,item){
       //alert(item.cityName) 
       
       <c:choose>
 <c:when test="${! empty member.membercity}">
     if(item.cityid==${member.membercity})
       {
       var option = "<option value='"+item.cityid+"' selected='selected'>"+item.cityName+"</option>"; 
        ds_id.append(option);    
       }
       else
       {
       var option = "<option value='"+item.cityid+"'>"+item.cityName+"</option>"; 
        ds_id.append(option);    
       }
 </c:when>
<c:otherwise>
var option = "<option value='"+item.cityid+"'>"+item.cityName+"</option>"; 
        ds_id.append(option);        
</c:otherwise>
 </c:choose>       
           
     })      
    });
  
}     
function getVal2(e)
{
$j.getJSON("/Manager/Module/FrameWork/ProjectInfo/BIZ_MEMBER/getlistByprank?id="+e+"&timestamp=" + (new Date()).getTime(),function(responseText)
    {
     var ds_id = $j("#memberRank"); 
     ds_id.removeAttr("disabled");
     $j("option",ds_id).remove(); //ds_id.empty()
     $j.each(responseText, function(i,item){
       //alert(item.cityName) 
       
       <c:choose>
 <c:when test="${! empty member.memberRank}">
       if(item.rankid==${member.memberRank})
       {
       var option = "<option value='"+item.rankid+"' selected='selected'>"+item.rankName+"</option>"; 
        ds_id.append(option); 
       }
       else
       {
       var option = "<option value='"+item.rankid+"'>"+item.rankName+"</option>"; 
        ds_id.append(option); 
       }
 </c:when>
<c:otherwise>
var option = "<option value='"+item.rankid+"'>"+item.rankName+"</option>"; 
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
                <td class='menubar_title'><img border='0' src='${rpath}/images/ICON/applist.gif' align='absmiddle' hspace='3' vspace='3'>&nbsp;会员列表管理</td>
                <td class='menubar_readme_text' valign='bottom'><img src='${rpath}/images/ICON/office.gif' align='absMiddle' border='0' />&nbsp;帮助？</td>
              </tr>
              <tr>
                <td height='27px' class='menubar_function_text'>目前操作功能：编辑会员</td>
                <td class='menubar_menu_td' align='right'><table border="0" cellspacing="0" cellpadding="0"><tr><td class="menubar_button" id="button_0" OnClick="JavaScript:window.location.href='List';" OnMouseOut="javascript:MenuOnMouseOver(this);" OnMouseOver="javascript:MenuOnMouseOut(this);"><img border="0" align="texttop" src="${rpath}/images/ICON/list.gif">&nbsp;列表会员</td></tr></table></td>
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
				         <TD class=tab id=tabLabel__0 onclick='javascript:tabClick(0,1)' background='${rpath}/images/Menu/tab_unactive_bg.gif' UNSELECTABLE='on'>编辑会员</TD>
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
        <form:form modelAttribute="member">
        <form:hidden path="checkcode" />
    <table width="100%" border="0" cellspacing="1" cellpadding="3" align="center">
  <tr class="table_title">
    <td colspan="2">基本登录资料</td>
    
  </tr>
<tr>
    <td class="table_body" style="width: 18%">所属地区</td>
    <td class="table_none"><form:select path="wProvince" cssStyle="width:100px;">
                    <form:option value="">请选择省份</form:option>
                    <form:options items="${prolist}" itemValue="provinceid" itemLabel="provinceName"/>
                    </form:select>
                   <form:select path="membercity" cssStyle="width:100px;">
                    <form:option value="">请选择城市</form:option>                    
                    </form:select>
                    <span class="required">* 必选</span>
                    <form:errors path="wProvince" cssClass="error" />  
                    <form:errors path="membercity" cssClass="error" />                    
                    </td>
  </tr>
  <tr>
    <td class="table_body">用户名</td>
    <td class="table_none"><form:input path="memberName" cssStyle="width:100px;" /><span class="required">* 必填</span>
                       <form:errors path="memberName" cssClass="error" /> (用户名不能修改)</td>
  </tr>
  <tr>
    <td class="table_body">密码</td>
    <td class="table_none"><form:password path="memberPwd" cssStyle="width:100px;" /><span class="required">* 必填</span>
                       <form:errors path="memberPwd" cssClass="error" /> </td>
  </tr>  
  
  <tr class="table_title">
    <td colspan="2">姓名和联系方式</td>
    
  </tr>
  <tr>
    <td class="table_body">真实姓名</td>
    <td class="table_none"><form:input path="memberRealname" cssStyle="width:100px;" /><span class="required">* 必填</span>
                       <form:errors path="memberRealname" cssClass="error" /> </td>
  </tr>
  <tr>
    <td class="table_body">联系电话</td>
    <td class="table_none"><form:input path="memberTel" cssStyle="width:100px;" /><span class="required">* 必填</span>
                       <form:errors path="memberTel" cssClass="error" /> </td>
  </tr>
  <tr>
    <td class="table_body">企业名称</td>
    <td class="table_none"><form:input path="memberCname" cssStyle="width:320px;" />
                       <form:errors path="memberCname" cssClass="error" /> </td>
  </tr>
  <tr>
    <td class="table_body">QQ</td>
    <td class="table_none"><form:input path="memberQq" cssStyle="width:100px;" />
                       <form:errors path="memberQq" cssClass="error" /> </td>
  </tr>
  <tr>
    <td class="table_body">Email</td>
    <td class="table_none"><form:input path="memberEmail" cssStyle="width:150px;" />
                       <form:errors path="memberEmail" cssClass="error" /> </td>
  </tr>
  <tr class="table_title">
    <td colspan="2">高级设置</td>
    
  </tr>
  <tr>
    <td class="table_body">会员等级</td>
    <td class="table_none">
    <form:select path="memberPrank" cssStyle="width:100px;">
                    <form:option value="">请选择等级</form:option>
                    <form:options items="${pranklist}" itemValue="prankid" itemLabel="prankName"/>
                    </form:select>
                   <form:select path="memberRank" cssStyle="width:100px;">
                    <form:option value="">请选择子级</form:option>                    
                    </form:select>
                    <span class="required">* 必选</span>
                    <form:errors path="memberPrank" cssClass="error" />  
                    <form:errors path="memberRank" cssClass="error" />                   
                      </td>
  </tr>
  <tr>
    <td class="table_body">是否锁定</td>
    <td class="table_none">    
    锁定<form:radiobutton path="memberLock" value="0"/>&nbsp;&nbsp;&nbsp;&nbsp;解锁<form:radiobutton path="memberLock" value="1"/>
     <span class="required">* 必填</span>    
     <form:errors path="memberLock" cssClass="error" /> </td>
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

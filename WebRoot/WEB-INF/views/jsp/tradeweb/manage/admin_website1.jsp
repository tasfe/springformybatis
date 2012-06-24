<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<br/><br/>
<%
String username=(String)request.getAttribute("username");
 %>
<TABLE width="100%" height="100%" border=0 cellPadding=0 cellSpacing=0>
                      
                        <TBODY>
                          <TR> 
                            <TD vAlign=top align=left bgColor=#ffffff> 
                              <table width="100%" border="0" cellpadding="0" cellspacing="1" bgcolor="#A4B9D7">
                                <tr> 
                                  <td height="0" valign="top">
<table width="100%" border="0" cellspacing="0" cellpadding="0">
                                      <tr> 
                                        <td height="40"> <table width="100%" border="0" cellspacing="0" cellpadding="0">
                                            <tr>
                                              <td height="30" valign="bottom"> 
                                                <table border="0" cellspacing="0" cellpadding="0">
                                                  <tr> 
                                                    <td width="0"><IMG height=21 id=itab_0 src="/resources/admin/images/tab_7.gif" 
            width=9></td>
                                                    <td width="100" align="center" valign="baseline" background="/resources/admin/images/tab_b1.gif"><a href="admin_website2"><font color="#FFFFFF">自由首页</font></a></td>
                                                    <td width="0"><IMG height=21 id=itab_2 src="/resources/admin/images/tab_5.gif" 
            width=9></td>
                                                    <td width="100" align="center" valign="baseline" background="/resources/admin/images/tab_b1.gif"><a href="admin_website"><font color="#FFFFFF">常规属性</font></a></td>
                                                    <td width="0"><IMG height=21 id=itab_4 src="/resources/admin/images/tab_2.gif" 
            width=9></td>
            <td width="100" align="center" valign="baseline" background="/resources/admin/images/tab_b2.gif">网站脚注</td>
                                                    <td width="0"><IMG height=21 id=itab_4 src="/resources/admin/images/tab_2.gif" 
            width=9></td>
                                                    <td width="80" align="center" valign="baseline" background="/resources/admin/images/tab_b1.gif"><a href="admin_friendlink"><font color="#FFFFFF">友情链接</font></a></td>
                                                    <td width="9%"><IMG height=21 id=itab_8 src="/resources/admin/images/tab_3.gif" 
            width=9></td>
                                                  </tr>
                                                </table>
                                              </td>
                                            </tr>
                                          </table> 
                                          <table width="100%" border="0" cellspacing="0" cellpadding="0">
                                            <tr> 
                                              <td height="397" valign="top" bgcolor="#FFFFFF"><table width="100%" border="0" cellspacing="0" cellpadding="0">
                                                <tr> 
                                                  <td>&nbsp;</td>
                                                </tr>
                                                <tr> 
                                                  <td align="center"> <table width="98%" border="0" cellspacing="0" cellpadding="0">
                                                      <tr> 
                                                        <td><fieldset>
                                                          <legend><strong>网站脚注(FootNote)</strong></legend>
                                                          
                                                          <table width="100%" border="0" cellspacing="0" cellpadding="0">
                                                            <tr> 
                                                              <td align="center"> 
                                                           <form:form modelAttribute="website">
                                                                  <table width="100%" border="0" cellpadding="1" cellspacing="1" align="center">
                                                                    <tr valign="middle"> 
                                                                      <td align="left"> 
                                                                        <form:textarea path="wFootnote"/>
                                                                        </td>
                                                                    </tr>
                                                                    <tr height="25"> 
                                                                      <td align="center" valign="middle"><input type="submit" name="Submit1" value=" 编 辑 " id="Submit1"> 
                                                                        &nbsp; 
                                                                        <input type="reset" name="Submit2" value=" 取 消 "></td>
                                                                    </tr>
                                                                  </table>
                                                                </form:form></td>
                                                            </tr>
                                                          </table>
                                                          </fieldset></td>
                                                      </tr>
                                                    </table></td>
                                                </tr>
                                                <tr> 
                                                  <td>&nbsp;</td>
                                                </tr>                                                
                                              </table></td>
                                            </tr>
                                          </table>
										  
										  </td>
                                      </tr>
                                    </table>
                                  </td>
                                </tr>
                              </table> 
                            </TD>
                          </TR>
                        </TBODY>                    
                      </TABLE>
                      <!--<ckeditor:replace  replace="productContent" basePath="../ckeditor/" />-->
<script type="text/javascript">//<![CDATA[
window.CKEDITOR_BASEPATH='../../../ckeditor/';
//]]></script>
<script type="text/javascript" src="../../../ckeditor/ckeditor.js?t=B37D54V"></script>
<script type="text/javascript" src="../../../ckfinder/ckfinder.js"></script>
<script type="text/javascript">//<![CDATA[
var editor=CKEDITOR.replace('wFootnote',{toolbar : 'Basic'  });
// Just call CKFinder.setupCKEditor and pass the CKEditor instance as the first argument.
	// The second parameter (optional), is the path for the CKFinder installation (default = "/ckfinder/").
	CKFinder.setupCKEditor( editor, '../../../ckfinder/' ) ;

	// It is also possible to pass an object with selected CKFinder properties as a second argument.
	// CKFinder.setupCKEditor( editor, { basePath : '../', skin : 'v1' } ) ;
//]]></script>
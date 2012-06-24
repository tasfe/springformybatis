<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<br/><br/>
<%
String username=(String)request.getAttribute("username");
 %>
<TABLE width="100%" height="100%" border=0 cellPadding=0 cellSpacing=0>
                      <form:form modelAttribute="website" enctype="multipart/form-data" >
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
                                                    <td width="100" align="center" valign="baseline" background="/resources/admin/images/tab_b2.gif">常规属性</td>
                                                    <td width="0"><IMG height=21 id=itab_4 src="/resources/admin/images/tab_2.gif" 
            width=9></td>
            <td width="100" align="center" valign="baseline" background="/resources/admin/images/tab_b1.gif"><a href="admin_website1"><font color="#FFFFFF">网站脚注</font></a></td>
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
                                                    <td align="center"> <table width="85%" border="0" cellspacing="0" cellpadding="0">
                                                        <tr> 
                                                          <td><fieldset>
                                                            <legend><strong>网站标志(Logo)</strong></legend>                                                            
                                                            <table width="100%" border="0" cellspacing="0" cellpadding="0">
                                                            <tr> 
                                                                <td align="center">
																<c:choose>
 <c:when test="${! empty website.wLogo}">
<img src="/resources/files/userfiles/<%=username%>/${website.wLogo}" style="width:667px;height:65px"/>
</c:when>
<c:otherwise>
<img src="/resources/template/company/images/jqlb_03.jpg" style="width:667px;height:65px"/>
</c:otherwise>
 </c:choose>
																
																
																</td>
                                                              </tr>
                                                              <tr> 
                                                                <td height="30"> 
                                                                  单击标志时打开链接： 
                                                                  <form:input path="wLogohref"/><form:errors path="wLogohref" cssClass="error" />
                                                                  </td>
                                                              </tr>
                                                              <tr> 
                                                                <td height="30">鼠标放上时显示文字： 
                                                                <form:input path="wLogotitle"/><form:errors path="wLogotitle" cssClass="error" />
                                                                  </td>
                                                              </tr>
                                                              <tr> 
                                                                <td height="30">上传我的标志： 
                                                                <form:hidden path="wLogo" />                                                               
                                                                 <form:input path="wLogofileData" type="file" /><form:errors path="wLogofileData" cssClass="error" /> 
                                                                 </td>
                                                              </tr>
                                                            </table>
                                                            </fieldset>
                                                            &nbsp;</td>
                                                        </tr>
                                                      </table></td>
                                                  </tr>
                                                  <tr style="display:none;"> 
                                                    <td>&nbsp;</td>
                                                  </tr>
                                                  <tr style="display:none;"> 
                                                    <td align="center"><table width="85%" border="0" cellspacing="0" cellpadding="0">
                                                        <tr> 
                                                          <td><fieldset>
                                                            <legend><strong>网站名称(Company)</strong></legend>
                                                            <table width="100%" border="0" cellspacing="0" cellpadding="0">
                                                              <tr> 
                                                                <td width="13%" align="center">
                                                                
                                                                <c:choose>
 <c:when test="${! empty website.wCompany}">
 <img src="/resources/files/userfiles/${username}/${website.wCompany}" width="172" height="45" hspace="20" vspace="15"/>
</c:when>
<c:otherwise>
<img src="/resources/template/company/images/jqlb_10.jpg" width="172" height="45" hspace="20" vspace="15"/>
</c:otherwise>
 </c:choose>
</td>
                                                                <td width="87%"><table width="100%" border="0" cellspacing="0" cellpadding="0">
                                                                    <tr> 
                                                                      <td height="40">网站名称： 
                                                                      <form:input path="wCompanytext"/><form:errors path="wCompanytext" cssClass="error" />
                                                                        
                                                                      </td>
                                                                    </tr>
                                                                    <tr> 
                                                                      <td>上传网站名称图片：<br>
                                                                      <form:hidden path="wCompany" />  
                                                                        &nbsp;<form:input path="wCompanyfileData" type="file"/><form:errors path="wCompanyfileData" cssClass="error" /> </td>
                                                                    </tr>
                                                                    <tr> 
                                                                      <td height="30">
                                                                        <form:checkbox path="wUsercomtext" value="1" />
                                                                        <form:errors path="wUsercomtext" cssClass="error" />
                                                                        只使用文字</td>
                                                                    </tr>
                                                                  </table></td>
                                                              </tr>
                                                            </table>
                                                            </fieldset>
                                                            </td>
                                                        </tr>
                                                      </table></td>
                                                  </tr>
                                                  <tr> 
                                                    <td>&nbsp;</td>
                                                  </tr>
                                                  <tr> 
                                                    <td align="center"> <table width="85%" border="0" cellspacing="0" cellpadding="0">
                                                        <tr> 
                                                          <td><fieldset>
                                                            <legend><strong>网站广告宣传横幅(Banner)</strong></legend>
                                                            <table width="100%" border="0" cellspacing="0" cellpadding="0">
                                                              <tr> 
                                                                <td align="center">
																<c:choose>
 <c:when test="${! empty website.wBanner}">
<img src="/resources/files/userfiles/<%=username%>/${website.wBanner}" style="width:667px;height:65px" id="Banner">
</c:when>
<c:otherwise>
<img src="/resources/template/company/images/jqlb_06.jpg" style="width:667px;height:65px"/>
</c:otherwise>
 </c:choose>
																
																
																</td>
                                                              </tr>
                                                              <tr> 
                                                                <td height="40" align="center"> 
                                                                  上传广告宣传横幅： 
                                                                  <form:hidden path="wBanner" />  
                                                                  <form:input path="wBannerfileData" type="file"/><form:errors path="wBannerfileData" cssClass="error" />
                                                                  [标准尺寸<font color="#FF0000">468*60</font>] 
                                                                </td>
                                                              </tr>
                                                            </table>
                                                            </fieldset>
                                                            &nbsp;</td>
                                                        </tr>
                                                      </table></td>
                                                  </tr>
                                                  <tr> 
                                                    <td height="40" align="center"> 
                                                      <input type="submit" name="Submit" value=" 保存设置 ">                                                      
                                                      <input type="button" name="Submit22" value=" 上一步 " onClick="location='Admin_SetMenu.asp'">
                                                      <input type="button" name="Submit222" value=" 下一步 " onClick="location='Admin_website1.asp'"></td>
                                                  </tr>
                                                </table></td>
                                            </tr>
                                          </table></td>
                                      </tr>
                                    </table>
                                  </td>
                                </tr>
                              </table> 
                            </TD>
                          </TR>
                        </TBODY>
                    </form:form>
                      </TABLE>

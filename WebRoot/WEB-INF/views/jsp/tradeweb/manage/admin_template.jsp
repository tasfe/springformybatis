<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@page import="com.hedgehog.domain.*"%>
<br/><br/>
<%
String username=(String)request.getAttribute("username");
biz_templet templet=(biz_templet)request.getAttribute("templet");
%>
<table width="100%" border="0" cellspacing="0" cellpadding="0" class="table">
  <tr class="tr">    
    <td class="td">你当前选择的模板是：</td>    
  </tr>
  </table> 
  <div style="text-align:center;">
  <img src="/resources/files/templet/<%=templet.getTempletCode()%>.jpg" width="300px" height="220px"/>
  <br/>
  <%=templet.getTempletclass().getTcName()%>：<%=templet.getTempletName()%><br/>
  <input type="button" onclick="location='/<%=username%>/manage/admin_templatesel'" value="我不要这个，我要换"></input>
  </div>

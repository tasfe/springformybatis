<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@page import="com.hedgehog.domain.sys_Applications"%>
<%@page import="com.hedgehog.domain.sys_Module"%>
<%@page import="java.util.List"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<spring:url var="rpath" value="/resources/manager" />
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>-后台管理</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
    
    <style type="text/css">
                .ttl { CURSOR: pointer; COLOR: #ffffff; PADDING-TOP: 4px }
                A:active{COLOR: #000000;TEXT-DECORATION: none}
                A:hover{COLOR: #000000;TEXT-DECORATION: none}
                A:link{COLOR: #000000;TEXT-DECORATION: none}
                A:visited{COLOR: #000000;TEXT-DECORATION: none}
                TD {
	            FONT-SIZE: 12px; FONT-FAMILY: "Verdana", "Arial", "细明体", "sans-serif"
                }
.table_body {	
BACKGROUND-COLOR: #EDF1F8;
height:18px;
CURSOR: pointer; 
}

.table_none {	
BACKGROUND-COLOR: #FFFFFF;
height:18px;
CURSOR: pointer; 
}

			</style>

    <script language="javascript">
	        function showHide(obj){
		        var oStyle = document.getElementById(obj).style;
		        oStyle.display == "none" ? oStyle.display = "block" : oStyle.display = "none";
	        }
    </script>

    
  </head>
  
  <body bgcolor="#9aadcd" leftmargin="0" topmargin="0">

    <br>
 <% 
//List<sys_Module> list=(List<sys_Module>)request.getAttribute("menu"); 
 List<sys_Applications> list=(List<sys_Applications>)request.getAttribute("menu"); 
 if(list.size()>0)
 {
	 for (sys_Applications app:list)
	 {
	    List<sys_Module> list_parentmodule=app.getList_module();//父模块
		if(list_parentmodule.size()>0)
		{
			for(sys_Module pm: list_parentmodule)
			{
			//父循环开始
			%>
			
			<table cellspacing="0" cellpadding="0" width="159" align="center" border="0">

                <tr>

                    <td width="23">

                        <img height="25" src="${rpath}/images/Menu/box_topleft.gif" width="23"></td>

                    <td class="ttl" onclick="JavaScript:showHide('<%="M_"+pm.getModuleid()%>');" width="129"

                        background="${rpath}/images/Menu/box_topbg.gif">                       

                        <%=pm.getmCname()%>

                    </td>

                    <td width="7">

                        <img height="25" src="${rpath}/images/Menu/box_topright.gif" width="7"></td>

                </tr>

            </table>
			
			<%
			    List<sys_Module> list_childmodule=pm.getList_submodule();//子模块
				if(list_childmodule.size()>0)
				{
				//开始
				%>
				<table id="<%="M_"+pm.getModuleid()%>" style="display: none" cellspacing="0" cellpadding="0"

                width="159" align="center" border="0">

                <tr>

                    <td background='${rpath}/images/Menu/box_bg.gif' height="0px" width='159' colspan='3'>

                        <table width="157" border="0" cellpadding="2" cellspacing="1">

                            <tbody>
                            <%
					for(sys_Module subm:list_childmodule)
					{
					%>					
					
					<tr>

                                            <td class="table_none" onclick="javascript:NowShow('<%="M_"+subm.getModuleid()%>','<%=subm.getmDirectory()%>');" onmousemove="javascript:TDOverORIn('<%="M_"+subm.getModuleid()%>');" onmouseout="javascript:TDOverOROut('<%="M_"+subm.getModuleid()%>');" id="<%="M_"+subm.getModuleid()%>">

                                                <img height='7' hspace='5' src='${rpath}/images/Menu/arrow.gif' width='5' align="bottom">

									            <%=subm.getmCname()%>

                                            </td>

                                        </tr>
					<%
					}
					//结尾
					%>
					 </tbody>

                        </table>

                    </td>

                </tr>

            </table>
					<%
				}
				//父循环结尾
				%>
				<table cellspacing="0" cellpadding="0" width="159" align="center" border="0">

                <tr>

                    <td colspan="3">

                        <img height='10' src='${rpath}/images/Menu/box_bottom.gif' width='159'></td>

                </tr>

            </table>
				<%
			}
		} 
	 } 
 } 
  %>
</body>

</html>
<script language="javascript">
    var NowClickName="";
    
        function NowShow(TopMenuName,Url)
    {
        document.getElementById(TopMenuName).className  = "table_body";
        if (NowClickName!="" &&NowClickName!=TopMenuName)
            document.getElementById(NowClickName).className  = "table_none"; 
        NowClickName = TopMenuName;
        //var o=window.open(url); 
       window.parent.frames["mainFrame"].location=Url;
       //parment.mainFrame.src=Url;
    }
    
    function TDOverOROut(iname)
    {
        if (NowClickName!=iname)
        {

            document.getElementById(iname).className = "table_none";

        }
    }
        function TDOverORIn(iname)
    {
        if (NowClickName != iname)
        {
            document.getElementById(iname).className = "table_body";
        }
    }
</script>

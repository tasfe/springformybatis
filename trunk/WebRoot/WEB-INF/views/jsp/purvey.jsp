<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@page import="com.hedgehog.domain.*"%>
<!--最新供应信息开始-->
<div  style="clear:both"></div>

<div class="gyxx_left_top"><span>最新供应信息</span><a href="/purvey/list/1">更多>></a> </div>
<div class="gyxx_right_top"><p>推荐供应信息</p></div>

<div class="gyxx_bottom">
<div class="gyxx_bottom_left">
<ul>

<%
List<web_supplyinfo> list_supplyinfo=(List<web_supplyinfo>)request.getAttribute("list_supplyinfo1");
  if(list_supplyinfo.size()>0)
  {
  Iterator<web_supplyinfo> it=list_supplyinfo.iterator();  
  web_supplyinfo supplyinfo=null;
  while(it.hasNext())
  {    
    supplyinfo=(web_supplyinfo)it.next();
    %>
<li><span><a href="/city/<%=supplyinfo.getMenu().getMember().getWebsite().getCity().getCityCode()%>" target="_blank"><%=supplyinfo.getMenu().getMember().getWebsite().getCity().getCityName()%></a></span> 
<a id="link" href="/<%=supplyinfo.getMenu().getMember().getMemberName()%>/purvey/<%=supplyinfo.getSupplyinfoMenuid()%>/<%=supplyinfo.getSupplyinfoSc()%>/<%=supplyinfo.getSupplyinfoid()%>" target="_blank">  <span id="gq_left">【供】</span><%=supplyinfo.getSupplyinfoTitle()%></a></li>

    <%
    }
}
 %>
 </ul>
  </div>
<div class="gyxx_bottom_right" >
<ul>
<%
List<web_supplyinfo> list_supplyinfo1_tujian=(List<web_supplyinfo>)request.getAttribute("list_supplyinfo1_tuijian");
  if(list_supplyinfo1_tujian.size()>0)
  {
  Iterator<web_supplyinfo> it=list_supplyinfo1_tujian.iterator();  
  web_supplyinfo supplyinfo=null;
  while(it.hasNext())
  {    
    supplyinfo=(web_supplyinfo)it.next();
    %>
<li><span><a href="/city/<%=supplyinfo.getMenu().getMember().getWebsite().getCity().getCityCode()%>" target="_blank"><%=supplyinfo.getMenu().getMember().getWebsite().getCity().getCityName()%></a></span> 
<a id="link" href="/<%=supplyinfo.getMenu().getMember().getMemberName()%>/purvey/<%=supplyinfo.getSupplyinfoMenuid()%>/<%=supplyinfo.getSupplyinfoSc()%>/<%=supplyinfo.getSupplyinfoid()%>" target="_blank">  <span id="gq_left">【供】</span><%=supplyinfo.getSupplyinfoTitle()%></a></li>

    <%
    }
}
 %>
</ul>
</div>
  
 </div>



<div style="clear:both"></div>
<div class="zxgyxx_bottom">
</div>
<!--最新供应信息结束-->
<div class="guanggao"><img src="/resources/images/guanggao2.png" /></div>
<div class="guanggao2"><img src="/resources/images/guanggao3.png" /></div>

<!--最新求购信息开始-->
<div class="gyxx_left_top"><span>最新求购信息</span> <a href="/purvey/list/2">更多>></a></div>
<div class="gyxx_right_top"><p>推荐求购信息</p></div>

<div class="gyxx_bottom">
<div class="gyxx_bottom_left">
<ul>
<%
List<web_supplyinfo> list_supplyinfo2=(List<web_supplyinfo>)request.getAttribute("list_supplyinfo2");
  if(list_supplyinfo2.size()>0)
  {
  Iterator<web_supplyinfo> it=list_supplyinfo2.iterator();  
  web_supplyinfo supplyinfo=null;
  while(it.hasNext())
  {    
    supplyinfo=(web_supplyinfo)it.next();
    %>
<li><span><a href="/city/<%=supplyinfo.getMenu().getMember().getWebsite().getCity().getCityCode()%>" target="_blank"><%=supplyinfo.getMenu().getMember().getWebsite().getCity().getCityName()%></a></span> 
<a id="link" href="/<%=supplyinfo.getMenu().getMember().getMemberName()%>/purvey/<%=supplyinfo.getSupplyinfoMenuid()%>/<%=supplyinfo.getSupplyinfoSc()%>/<%=supplyinfo.getSupplyinfoid()%>" target="_blank">  <span id="gq_left">【供】</span><%=supplyinfo.getSupplyinfoTitle()%></a></li>

    <%
    }
}
%>
</ul>
  </div>
<div class="gyxx_bottom_right" >
<ul>
<%
List<web_supplyinfo> list_supplyinfo2_tujian=(List<web_supplyinfo>)request.getAttribute("list_supplyinfo2_tuijian");
  if(list_supplyinfo2_tujian.size()>0)
  {
  Iterator<web_supplyinfo> it=list_supplyinfo2_tujian.iterator();  
  web_supplyinfo supplyinfo=null;
  while(it.hasNext())
  {    
    supplyinfo=(web_supplyinfo)it.next();
    %>
<li><span><a href="/city/<%=supplyinfo.getMenu().getMember().getWebsite().getCity().getCityCode()%>" target="_blank"><%=supplyinfo.getMenu().getMember().getWebsite().getCity().getCityName()%></a></span> 
<a id="link" href="/<%=supplyinfo.getMenu().getMember().getMemberName()%>/purvey/<%=supplyinfo.getSupplyinfoMenuid()%>/<%=supplyinfo.getSupplyinfoSc()%>/<%=supplyinfo.getSupplyinfoid()%>" target="_blank">  <span id="gq_left">【求】</span><%=supplyinfo.getSupplyinfoTitle()%></a></li>

    <%
    }
}
 %>
</ul>
</div>
  
 </div>



<div style="clear:both"></div>
<div class="zxgyxx_bottom">
</div>
<!--最新信息求购结束-->
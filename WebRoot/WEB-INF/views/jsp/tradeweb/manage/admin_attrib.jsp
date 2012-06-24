<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
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
		    var ds_id = $j("#wCity"); 
		    $j("option",ds_id).remove(); 
		    var option = "<option value=''>请选择城市</option>"; 
		    ds_id.append(option);  
		    $j("#wCity").attr("disabled","disabled");
		}
   }); 
   
     if($j.trim($j("#wProvince").val())!="")
		{		    
		    getVal($j("#wProvince").val()); 
		}
		else
		{
		    var ds_id = $j("#wCity"); 
		    $j("option",ds_id).remove(); 
		    var option = "<option value=''>请选择城市</option>"; 
		    ds_id.append(option);  
		    $j("#wCity").attr("disabled","disabled");
		}
});
function getVal(e)
{

$j.getJSON("/member/getlistBypro?id="+e+"&timestamp=" + (new Date()).getTime(),function(responseText)
    {
     var ds_id = $j("#wCity"); 
     ds_id.removeAttr("disabled");
     $j("option",ds_id).remove(); //ds_id.empty()
     $j.each(responseText, function(i,item){
       //alert(item.cityName) 
       //alert(${website.wCity});
       if(item.cityid==${website.wCity})
       {
       var option = "<option value='"+item.cityid+"' selected='selected'>"+item.cityName+"</option>"; 
        ds_id.append(option);  
       }
       else
       {
       var option = "<option value='"+item.cityid+"'>"+item.cityName+"</option>"; 
        ds_id.append(option);  
       }
          
     })      
    });
  
}
    </script>
    <br/><br/>
<form:form modelAttribute="website">
<table width="100%" border="0" cellspacing="1" cellpadding="0" align="center" class="table">
  <tr class="tr">
    <td colspan="2" class="td">网站基本信息</td>    
  </tr>  
  <tr class="tr">
    <td width="20%" class="td">企业名称</td>
    <td width="80%"><form:input path="wComname" cssStyle="width:200px;" /><span class="required">* 必填</span>
                       <form:errors path="wComname" cssClass="error" />
</td>
  </tr>
  <tr class="tr">
    <td class="td">网站标题</td>
    <td>
<form:input path="wTitle" cssStyle="width:200px;" /><span class="required">* 必填</span>
                       <form:errors path="wTitle" cssClass="error" />
</td>
  </tr>
  <tr class="tr">
    <td class="td">所属行业</td>
    <td><form:select path="wBcomtype" cssStyle="width:150px;">
                    <form:option value="">请选择行业</form:option>                    
                    <form:option value="工业设备">工业设备</form:option>
                     <form:option   value="化工及日用化学品">化工及日用化学品</form:option>
                                                  <form:option 
                                value="广告、策划">广告、策划</form:option>
                                                  <form:option 
                                value="公用服务事业">公用服务事业</form:option>
                                                  <form:option 
                                value="党政机关行业">党政机关行业</form:option>
                                                  <form:option 
                                value="通讯产品">通讯产品</form:option>
                                                  <form:option 
                                value="中介、人才交流">中介、人才交流</form:option>
                                                  <form:option 
                                value="化妆与养护">化妆与养护</form:option>
                                                  <form:option 
                                value="家具、木材">家具、木材</form:option>
                                                  <form:option 
                                value="环保行业">环保行业</form:option>
                                                  <form:option 
                                value="保险、福利">保险、福利</form:option>
                                                  <form:option 
                                value="摄影摄像用品">摄影摄像用品</form:option>
                                                  <form:option 
                                value="律师事务所、信息咨询">律师事务所、信息咨询</form:option>
                                                  <form:option 
                                value="贸易与代理">贸易与代理</form:option>
                                                  <form:option 
                                value="医药保健">医药保健</form:option>
                                                  <form:option 
                                value="建筑与装饰">建筑与装饰</form:option>
                                                  <form:option 
                                value="房地产">房地产</form:option>
                                                  <form:option 
                                value="电脑、软件、网络">电脑、软件、网络</form:option>
                                                  <form:option 
                                value="食品与饮料">食品与饮料</form:option>
                                                  <form:option 
                                value="农、林、牧、副、渔">农、林、牧、副、渔</form:option>
                                                  <form:option 
                                value="能源行业">能源行业</form:option>
                                                  <form:option 
                                value="艺术、工艺、收藏品">艺术、工艺、收藏品</form:option>
                                                  <form:option 
                                value="玩具和宠物">玩具和宠物</form:option>
                                                  <form:option 
                                value="办公用品">办公用品</form:option>
                                                  <form:option 
                                value="包装、印刷">包装、印刷</form:option>
                                                  <form:option 
                                value="教育、就业、移民">教育、就业、移民</form:option>
                                                  <form:option 
                                value="商展、会议">商展、会议</form:option>
                                                  <form:option 
                                value="安全、保安设备">安全、保安设备</form:option>
                                                  <form:option 
                                value="冶金矿产">冶金矿产</form:option>
                                                  <form:option 
                                value="体育用品与运动服饰">体育用品与运动服饰</form:option>
                                                  <form:option 
                                value="儿童、妇女用品">儿童、妇女用品</form:option>
                                                  <form:option 
                                value="家用电器">家用电器</form:option>
                                                  <form:option 
                                value="模具、模料">模具、模料</form:option>
                                                  <form:option 
                                value="家居用品、日常用品">家居用品、日常用品</form:option>
                                                  <form:option 
                                value="玻璃陶瓷">玻璃陶瓷</form:option>
                                                  <form:option 
                                value="电子产品">电子产品</form:option>
                                                  <form:option 
                                value="邮政、电信">邮政、电信</form:option>
                                                  <form:option 
                                value="服装、纺织、皮革">服装、纺织、皮革</form:option>
                                                  <form:option 
                                value="城市建设事业">城市建设事业</form:option>
                                                  <form:option 
                                value="科技开发">科技开发</form:option>
                                                  <form:option 
                                value="其他行业">其他行业</form:option>                    
                    </form:select><span class="required">* 必选</span>
                    <form:errors path="wBcomtype" cssClass="error" />
                    </td>
  </tr> 
  <tr class="tr">
    <td class="td">所属地区</td>
    <td><form:select path="wProvince" cssStyle="width:100px;">
                    <form:option value="">请选择省份</form:option>
                    <form:options items="${prolist}" itemValue="provinceid" itemLabel="provinceName"/>
                    </form:select>
                   <form:select path="wCity" cssStyle="width:100px;">
                    <form:option value="">请选择城市</form:option>                    
                    </form:select>
                    <span class="required">* 必选</span>
                    <form:errors path="wProvince" cssClass="error" />  
                    <form:errors path="wCity" cssClass="error" />   </td>
  </tr>
  <tr class="tr">
    <td colspan="2" class="td">联系方式</td>
    
  </tr>
  
  <tr class="tr">
    <td>地址</td>
    <td>
    <form:input path="wAddress" cssStyle="width:200px;" /><span class="required">* 必填</span>
                       <form:errors path="wAddress" cssClass="error" />
    </td>
  </tr>
  <tr class="tr">
    <td class="td">邮编</td>
    <td>
    <form:input path="wZip" cssStyle="width:100px;" /><span class="required">* 必填</span>
                       <form:errors path="wZip" cssClass="error" />
    </td>
  </tr>
  <tr class="tr">
    <td class="td">电话</td>
    <td>
<form:input path="wTel" cssStyle="width:100px;" /><span class="required">* 必填</span>
                       <form:errors path="wTel" cssClass="error" />
</td>
  </tr>
  <tr class="tr">
    <td class="td">传真</td>
    <td>
    <form:input path="wFax" cssStyle="width:100px;" />
                       <form:errors path="wFax" cssClass="error" />
    </td>
  </tr>
  <tr class="tr">
    <td class="td">邮件</td>
    <td>
<form:input path="wMail" cssStyle="width:200px;" /><span class="required">* 必填</span>
                       <form:errors path="wMail" cssClass="error" />
</td>
  </tr>
  
  
  <tr class="tr">
    <td colspan="2" style="text-align:center;" class="td"><input type="submit" name="Button1" value="确定" /> &nbsp;

<input id="Reset1" class="button_bak" type="reset" value="重填" />

</td>    
  </tr>  
</table>
</form:form>

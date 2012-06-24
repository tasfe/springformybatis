<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<style type="text/css">
<!--
a:link {
	text-decoration: none;
}
a:visited {
	text-decoration: none;
}
a:hover {
	text-decoration: none;
}
a:active {
	text-decoration: none;
}
ul li{list-style-type:none;}

table{width:600px; background-color:blue;font-size:12px;}
tr{ background-color:#FFFFFF;}
td{height:25px;}
.error{color:red;font-size:12px;}
.required{color:red;font-size:12px;}
td{padding-left:3px;}
-->
</style>
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
       var option = "<option value='"+item.cityid+"'>"+item.cityName+"</option>"; 
        ds_id.append(option);     
     })      
    });
  
}     
        $j(function(){           
            $j('#kaptchaImage').click(function () {//生成验证码  
             $j(this).hide().attr('src', '/captcha-image?' + Math.floor(Math.random()*100) ).fadeIn(); })      
                  });   
        
       </script> 

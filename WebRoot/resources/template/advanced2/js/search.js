 
    
	
	var searchtype="1";
	
	
	function setindexpage(value)
	{
	    value.style.behavior='url(#default#homepage)';
	    value.setHomePage('search.114chn.com');
	}
	
	
	function addFavorite()
	{
	    window.external.addFavorite('http://search.114chn.com','中国114黄页');
	}

        
         function searchSubmit()
        {  
             value = document.getElementById("114chnkey").value;
             

              if(value=="请输入您要找的产品信息关键字" || value=="请输入您要找的公司名" || value=="请输入您要找的求购信息查询关键词" || value=="请输入您要找的分类信息查询关键词")
              {  
                document.getElementById("114chnkey").value="";	
                value="";
              }
            
            if(document.getElementById("infoareaid")!=null)
            {
                areaid=document.getElementById("infoareaid").value;
            }
            else
            {
                areaid="";
            }
            
            
            if(document.getElementById("infocategoryid")!=null)
            {
                categoryid=document.getElementById("infocategoryid").value;
            }
            else
            {
                categoryid="";
            }
            
            
            if(document.getElementById("infolevelid")!=null)
            {
                levelid=document.getElementById("infolevelid").value;
            }
            else
            {
                levelid="";
            }
            
            
            if(value.length>=2)
            {
                newUrl="/searchresult.aspx?type="+searchtype+"&key="+encodeURI(value.toLowerCase().replace("script","").replace("}",""));                
                
                if(areaid!="")
                {
                     newUrl = newUrl + "&areaid="+areaid;
                }
                
                if(categoryid!="")
                {
                    newUrl = newUrl + "&categoryid="+categoryid;
                }
                
                if(levelid!="")
                {
                    newUrl = newUrl + "&levelid="+levelid;
                }
              
                newUrl = newUrl + "&page=1";

                window.location.href= newUrl;
            }
            else
            {
                alert("搜索关键词的长度不能小于2个字符！");
                  document.getElementById("114chnkey").focus();
            }
           
        }
        
       
        
        function SetSearchType(stype)
        {
            searchtype=stype;
            
          
            for(var i=1;i<=4;i++)
            {
                var searchname="SearchType"+i;               
                
                if(stype==i)
                {
                   document.getElementById(searchname).className="currentsearch";
                }
                else
                {
                    document.getElementById(searchname).className="searchlist";
                }
           }
           document.getElementById("114chnkey").className="key1";
           if(searchtype==1)
           {
             document.getElementById("114chnkey").value="请输入您要找的产品信息关键字";
           }
           if(searchtype==2)
           {
             document.getElementById("114chnkey").value="请输入您要找的公司名";
           }
           if(searchtype==3)
           {
             document.getElementById("114chnkey").value="请输入您要找的求购信息查询关键词";
           }
           if(searchtype==4)
           {
             document.getElementById("114chnkey").value="请输入您要找的分类信息查询关键词";
           }
           
          /*
           
           if(document.getElementById("114chnkey")!=null)
           {           
                document.getElementById("114chnkey").focus();
                document.getElementById("114chnkey").select();
           }
           
          */
          
          
        }
        
        
 function btnkeypress(event)
{
    
    var code = 0;
    code = event.keyCode;
    if (code==13)
    {
        event.keyCode = 0;

        searchSubmit();
    }
}



function  AutoTxt()
{

  document.getElementById("114chnkey").focus();           
  //$("114chnkey").select(); 
  
  keyvalue= document.getElementById("114chnkey").value;
  if(keyvalue=="请输入您要找的产品信息关键字" || keyvalue=="请输入您要找的公司名" || keyvalue=="请输入您要找的求购信息查询关键词" || keyvalue=="请输入您要找的分类信息查询关键词")
  {  
    document.getElementById("114chnkey").value="";	
  }
  document.getElementById("114chnkey").className="key1_changefontcolor";
}



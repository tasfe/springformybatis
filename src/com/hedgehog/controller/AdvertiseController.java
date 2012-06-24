package com.hedgehog.controller;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hedgehog.domain.biz_city;

@Controller
public class AdvertiseController {
	
	@RequestMapping(value="/advertise", method = RequestMethod.GET)	
	@ResponseBody  
    public String getlistBypro(@RequestParam(value="id", required=true) String proid)
	{	
//	  //String returnText="user has registered 中文乱码";	
      	
	  return "/resources/images/123.jpg";	
	}
	@RequestMapping(value = "/handle31")
	public void handle31(OutputStream os,HttpServletRequest request) throws IOException{
	       //Resource res = new ClassPathResource("/image.jpg");//读取类路径下的图片文件
	      String path=request.getSession().getServletContext().getRealPath("/");
	      path=path+"/resources/psu.jpg";
	       File f = new File(path);
	       InputStream in = new FileInputStream(f); 
	       BufferedInputStream bufferedinputstream = new BufferedInputStream(in);
	       FileCopyUtils.copy(bufferedinputstream, os);//将图片写到输出流中
	}


}

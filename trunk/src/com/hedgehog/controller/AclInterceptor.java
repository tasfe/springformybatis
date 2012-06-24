package com.hedgehog.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang.StringUtils;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class AclInterceptor extends HandlerInterceptorAdapter{
	public boolean preHandle(HttpServletRequest request,   
            HttpServletResponse response, Object handler) throws Exception { 
		String currentUri = request.getRequestURI();   
		System.out.println("µ±“π∑√Œ “≥√Ê£∫"+currentUri);
		//((MultiActionController)handler)
		//StringUtils.isBlank("");
		return true;
		
	}
	

}

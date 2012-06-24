package com.hedgehog.controller;

import org.springframework.ui.ModelMap;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.context.request.WebRequestInterceptor;

public class SpittleBackingBeanInterceptor implements WebRequestInterceptor{

	public void afterCompletion(WebRequest arg0, Exception arg1)
			throws Exception {
		// TODO Auto-generated method stub
		
	}

	public void postHandle(WebRequest arg0, ModelMap arg1) throws Exception {
		// TODO Auto-generated method stub
		
		
	}

	public void preHandle(WebRequest request) throws Exception {
		// TODO Auto-generated method stub
		//System.out.println("访问上下文路径："+request.getContextPath());
		//request.getUserPrincipal()
		
		
	}

}

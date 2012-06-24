/**
 * 
 */
package com.hedgehog.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * @author Administrator
 *
 */
public class PerformanceHandlerInterceptor implements HandlerInterceptor {

	private final Log log = LogFactory.getLog(PerformanceHandlerInterceptor.class);
	private static final String START_TIME = "PERF_START";
	public void afterCompletion(HttpServletRequest arg0,
			HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {
		// TODO Auto-generated method stub
		Long startTime = (Long)arg0.getAttribute(START_TIME);
        if(startTime!=null) {
            long last = System.currentTimeMillis() - startTime.longValue();
            String uri = arg0.getRequestURI();
            String query = arg0.getQueryString();
            if(query!=null)
                uri = uri + '?' + query;
            log.info("URL: " + uri);
            log.info("Execute: " + last + "ms.");
        }		
	}

	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1,
			Object arg2, ModelAndView arg3) throws Exception {
		// TODO Auto-generated method stub
		
	}

	public boolean preHandle(HttpServletRequest arg0, HttpServletResponse arg1,
			Object arg2) throws Exception {
		// TODO Auto-generated method stub
		arg0.setAttribute(START_TIME, System.currentTimeMillis());
		String currentUri = arg0.getRequestURI(); 
		System.out.println("当夜访问页面："+currentUri+"被拦截");
        return false;


	}

}

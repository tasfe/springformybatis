package com.hedgehog.controller;
import org.springframework.validation.Validator; 
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Errors;

import com.hedgehog.domain.*;


public class ProNewsValidator  implements Validator{
	public boolean supports(Class clazz) { 
		System.out.println("ProNewsValidator 这里有木有");
		//return clazz.isAssignableFrom(ProNew.class); 
		return ProNew.class.isAssignableFrom(clazz);

	    //return clazz.equals(ProNew.class); 
	    //return true;
	} 
	//对输入数据进行验证 import org.springframework.validation.ValidationUtils;
	public void validate(Object obj, Errors errors) {
		ProNew news=(ProNew)obj;
		//应用国际化与本地化？ 应该是直接写在这里 字符串形式
		ValidationUtils.rejectIfEmpty(errors, "newsTitle", "error.title.required","标题不能为空");
		ValidationUtils.rejectIfEmpty(errors, "newsContent", "error.Content.required","内容不能为空");
		ValidationUtils.rejectIfEmpty(errors, "newsNesortId", "error.Content.required","请选择类别");
		//if("".equals(news.getNewsTitle()))
		//{			
		//	errors.rejectValue("newsTitle", "usernameerror", null, "用户名不正确"); 
		//}
	}

}

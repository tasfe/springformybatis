package com.hedgehog.controller;
import org.springframework.validation.Validator; 
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Errors;

import com.hedgehog.domain.*;


public class ProNewsValidator  implements Validator{
	public boolean supports(Class clazz) { 
		System.out.println("ProNewsValidator ������ľ��");
		//return clazz.isAssignableFrom(ProNew.class); 
		return ProNew.class.isAssignableFrom(clazz);

	    //return clazz.equals(ProNew.class); 
	    //return true;
	} 
	//���������ݽ�����֤ import org.springframework.validation.ValidationUtils;
	public void validate(Object obj, Errors errors) {
		ProNew news=(ProNew)obj;
		//Ӧ�ù��ʻ��뱾�ػ��� Ӧ����ֱ��д������ �ַ�����ʽ
		ValidationUtils.rejectIfEmpty(errors, "newsTitle", "error.title.required","���ⲻ��Ϊ��");
		ValidationUtils.rejectIfEmpty(errors, "newsContent", "error.Content.required","���ݲ���Ϊ��");
		ValidationUtils.rejectIfEmpty(errors, "newsNesortId", "error.Content.required","��ѡ�����");
		//if("".equals(news.getNewsTitle()))
		//{			
		//	errors.rejectValue("newsTitle", "usernameerror", null, "�û�������ȷ"); 
		//}
	}

}

package com.sap.aish.util;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.stereotype.Component;
import org.springframework.validation.beanvalidation.LocaleContextMessageInterpolator;

@Component
public class MyUtil {

	private static MessageSource messageSource;
	
	@Autowired
	public MyUtil(MessageSource messageSource){
		this.messageSource=messageSource;
	}
	
	public static String getI18nMessage(String messageKey,Object... messageArgs){
		return messageSource.getMessage(messageKey, messageArgs, LocaleContextHolder.getLocale());
	}
	
	public static String getRandomUUID(){
		return UUID.randomUUID().toString();
	}
	
	
}

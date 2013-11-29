package com.xhsoft.framework.base.utils;

import java.io.Serializable;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;

public class AppServiceHelper implements Serializable{

	/** serialVersionUID */
	private static final long serialVersionUID = 112735968718231017L;
	
	private static final Log logger = LogFactory.getLog(AppServiceHelper.class);
	
	private AppServiceHelper(){
		
	}
	
	private static ApplicationContext appContext;

	public static void setAppContext(ApplicationContext appContext) {
		AppServiceHelper.appContext = appContext;
	}
	
	public static Object findBean(String beanId){
		Object bean = null;
		try {
			bean = appContext.getBean(beanId);
		} catch (BeansException e) {
			e.printStackTrace();
		}
		return bean;
	}

}

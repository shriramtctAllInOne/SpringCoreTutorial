package com.spring.aop.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * this program shows how to use args in aop .
 * 
 * Args used if a class method accept argument of class type.
 * 
 * @author Ram
 *
 */
public class MainApp {
	
	public static void main(){
		ApplicationContext appContext = new ClassPathXmlApplicationContext("AOPBeanEx.xml");
		MessageImpl message = (MessageImpl) appContext.getBean("message");
		message.showMsg1();			
	}
	
	
	
	public static void main(String [] args)
	{
		
		main();
		//main1();


	}
	
}

package com.tnsif.messageapp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("service.xml");
		MessageService ms=(MessageService)ctx.getBean("emailService");
		ms.getService();

	}

}

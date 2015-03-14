package com.caveofprogramming.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/caveofprogramming/resources/beans.xml");
		
		Logger logger = context.getBean(Logger.class);
		
		logger.writeConsole("Hello there");
		logger.writeFile("Hi again!");
		
		((ClassPathXmlApplicationContext) context).close();
	}

}

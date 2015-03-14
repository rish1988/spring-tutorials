package com.caveofprogramming.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/caveofprogramming/resources/bean.xml");
		
		Robot robot = ctx.getBean(Robot.class);
		robot.speak();
		
		((ClassPathXmlApplicationContext) ctx).close();
	}
}

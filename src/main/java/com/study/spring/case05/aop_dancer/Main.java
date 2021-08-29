package com.study.spring.case05.aop_dancer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		// Java 配置
		//ApplicationContext ctx = new AnnotationConfigApplicationContext(AOPConfig.class);
		ApplicationContext ctx = new ClassPathXmlApplicationContext("aop-Dancer.xml");
		Performance performance = ctx.getBean("dancer", Performance.class);
		try {
			performance.perform();
		} catch (Exception e) {
			System.out.println(e);
			// 轉換跑道
			// 舞者轉唱歌
			Singer singer = (Singer)performance;
			singer.sing();
		}
		
	}
}

package com.study.spring.case06.tx;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.study.spring.case06.tx.controller.BookController;

public class BuyManyBooks {
	public static void main(String[] args) {
		
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("jdbc-config.xml");
		JdbcTemplate jdbcTemplate = ctx.getBean("jdbcTemplate", JdbcTemplate.class);
		
		BookController bookController=ctx.getBean("bookControllerImpl",BookController.class);
		int wid=1;
		int bid=1;
		bookController.buyBooks(wid, bid,bid,bid);
		
		
	}
}

package com.study.spring.case06.tx;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.study.spring.case06.tx.controller.BookController;

public class BuyBook {
	public static void main(String[] args) {
		
		// [{wid=1, money=100}]
		// [{sid=1, bid=1, amount=3}]
				
		// Wallet 1 要買 Book 1 ($80)
		// 執行 bookController(1, 1);
				
		// [{wid=1, money=20}]
		// [{sid=1, bid=1, amount=2}]
		ApplicationContext ctx = new ClassPathXmlApplicationContext("jdbc-config.xml");
		JdbcTemplate jdbcTemplate = ctx.getBean("jdbcTemplate", JdbcTemplate.class);
		
		BookController bookController=ctx.getBean("bookControllerImpl",BookController.class);
		int wid=1;
		int bid=1;
		bookController.buyBook(wid, bid);
		
		
	}
}

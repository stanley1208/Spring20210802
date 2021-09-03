package com.study.spring.case06.tx.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.study.spring.case06.tx.exception.InufficientAmount;
import com.study.spring.case06.tx.exception.InufficientQuantity;
import com.study.spring.case06.tx.service.BookService;

@Controller
public class BookControllerImpl implements BookController{
	
	@Autowired
	private BookService bookService;
	
	@Override
	public void buyBook(Integer wid, Integer bid) {
		try {
			bookService.buyOne(wid, bid);
			System.out.println("butBook ok");
		} catch (InufficientAmount | InufficientQuantity e) {
			System.out.println(e);
		}
	}	
	


	@Override
	public void buyBooks(Integer wid, Integer... bids){
		try {
			bookService.ButMany(wid, bids);
			System.out.println("buy many books ok");
	
		} catch (InufficientAmount | InufficientQuantity e) {
			System.out.println(e);
		}
		}
	
}

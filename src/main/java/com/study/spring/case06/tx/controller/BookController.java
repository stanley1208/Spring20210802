package com.study.spring.case06.tx.controller;

public interface BookController {
	void buyBook(Integer wid,Integer bid);
	void buyBooks(Integer wid,Integer... bid);
};

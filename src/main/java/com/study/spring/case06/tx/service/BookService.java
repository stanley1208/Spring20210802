package com.study.spring.case06.tx.service;

public interface BookService {
	void buyOne(Integer wid,Integer bid);
	void ButMany(Integer wid,Integer... bid);
}

package com.study.spring.case06.tx.controller;

import com.study.spring.case06.tx.exception.InufficientAmount;
import com.study.spring.case06.tx.exception.InufficientQuantity;

public interface BookController {
	void buyBook(Integer wid,Integer bid);
	void buyBooks(Integer wid,Integer... bids);
};

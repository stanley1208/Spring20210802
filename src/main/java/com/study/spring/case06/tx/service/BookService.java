package com.study.spring.case06.tx.service;

import com.study.spring.case06.tx.exception.InufficientAmount;
import com.study.spring.case06.tx.exception.InufficientQuantity;

public interface BookService {
	void buyOne(Integer wid,Integer bid)throws InufficientAmount,InufficientQuantity;
	void ButMany(Integer wid,Integer... bids)throws InufficientAmount,InufficientQuantity;
}

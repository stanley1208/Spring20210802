package com.study.spring.case06.tx.dao;

import com.study.spring.case06.tx.exception.InufficientAmount;
import com.study.spring.case06.tx.exception.InufficientQuantity;

public interface BookDao {
	Integer getPrice(Integer bid);
	Integer updateStock(Integer bid)throws InufficientQuantity;
	Integer updateWallet(Integer wid,Integer money)throws InufficientAmount;//扣掉金額
	
}

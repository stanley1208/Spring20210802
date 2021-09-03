package com.study.spring.case06.tx.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.study.spring.case06.tx.dao.BookDao;
import com.study.spring.case06.tx.exception.InufficientAmount;
import com.study.spring.case06.tx.exception.InufficientQuantity;

@Service
public class BookServiceImpl implements BookService{
	
	@Autowired
	private BookDao bookDao;
	
	@Transactional(
			rollbackFor = {InufficientAmount.class,InufficientQuantity.class},
			noRollbackFor = {RuntimeException.class}
	)
	@Override
	public void buyOne(Integer wid, Integer bid) throws InufficientAmount,InufficientQuantity{
		int price=bookDao.getPrice(bid);
		bookDao.updateStock(bid);//減去庫存
		
		bookDao.updateWallet(wid, price);//錢包減去的金額
		
	}
	
	@Transactional(
			
	)
	
	
	@Override
	public void ButMany(Integer wid, Integer... bids) throws InufficientAmount,InufficientQuantity{
		for(int bid:bids) {
			buyOne(wid, wid);
		}
		
	}
	
}

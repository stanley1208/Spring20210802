package com.study.spring.case06.tx.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.study.spring.case06.tx.exception.InufficientAmount;
import com.study.spring.case06.tx.exception.InufficientQuantity;

@Repository
public class BookDaoImpl implements BookDao {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public Integer getPrice(Integer bid) {
		String sql = "Select price from book where bid=? ";
		Object[] args = new Object[]{bid};
		return jdbcTemplate.queryForObject(sql, args, Integer.class);
	}

	
	@Override
	public Integer updateStock(Integer bid) throws InufficientQuantity{
		//檢查庫存
		String sql="Select amount from stock where bid=?";
		Object[] args=new Object[] {bid};
		      
		int amount=jdbcTemplate.queryForObject(sql, args,Integer.class);
		if(amount<=0) {
			throw new InufficientQuantity();
		}
		//修改庫存
		sql = "update stock set amount = amount - 1 where bid=? ";
		return jdbcTemplate.update(sql, args);
	}
	
	
	@Override
	public Integer updateWallet(Integer wid, Integer money) throws InufficientAmount{
		//檢查餘額是否足夠
		
		String sql="Select money from wallet where wid=?";
		Object[] args=new Object[] {wid};
				      
		int walletmoney=jdbcTemplate.queryForObject(sql, args,Integer.class);
		if(walletmoney<=money) {
			throw new InufficientAmount();
		}		
		
		//修改餘額
		sql = "update wallet set money = money - ? where wid=?";
		args = new Object[]{money, wid};
		return jdbcTemplate.update(sql, args);
	}
	
}
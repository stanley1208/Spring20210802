package com.study.spring.case06.tx.exception;

public class InufficientQuantity extends Throwable{
	public InufficientQuantity() {
		super("Stock 書本庫存數量不足");
	}
}

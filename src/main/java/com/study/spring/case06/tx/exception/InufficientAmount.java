package com.study.spring.case06.tx.exception;

public class InufficientAmount extends Throwable{
	public InufficientAmount() {
		super("Wallet 餘額不足");
	}
}

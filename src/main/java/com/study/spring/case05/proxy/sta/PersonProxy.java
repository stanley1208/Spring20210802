package com.study.spring.case05.proxy.sta;

//靜態代理
public class PersonProxy implements Person {
	private Person person;
	
	public PersonProxy(Person person) {
		this.person = person;
	}

	@Override
	public void work() {
		// 前-公用方法
		System.out.println("戴口罩");
		try {
			// 代理調用-業務方法
			person.work();
		} catch (Exception e) {
			// 例外公用方法
			System.out.println("買口罩");
		}
		// 後-公用方法
		System.out.println("脱口罩");
	}
	
} 

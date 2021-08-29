package com.study.spring.case06.jdbc;

import java.util.List;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class SelectEmp {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("jdbc-config.xml");
		JdbcTemplate jdbcTemplate = ctx.getBean("jdbcTemplate", JdbcTemplate.class);
		
		// 多筆查詢
		String sql = "select eid, ename, age, createtime from emp";
		List<Map<String, Object>> emps = jdbcTemplate.queryForList(sql);
		for(Map<String, Object> emp : emps) {
			//System.out.println(emp);
			System.out.println(emp.get("ename"));
		}
		
		// 單筆單欄查詢
		// 現在 emp 資料表中有幾筆資料 ?
		sql = "select count(*) from emp";
		Integer count = jdbcTemplate.queryForObject(sql, Integer.class);
		System.out.println("資料筆數: " + count);
	}

}

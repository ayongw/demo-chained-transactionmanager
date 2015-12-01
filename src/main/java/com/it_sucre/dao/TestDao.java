package com.it_sucre.dao;

import org.apache.log4j.Logger;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.it_sucre.entity.TestEntity;

@Repository
public class TestDao {
	/**
	 * Logger for this class
	 */
	private static final Logger logger = Logger.getLogger(TestDao.class);

	@Autowired
	JdbcTemplate jdbcTemplate;

	@Autowired
	JdbcTemplate jdbcTemplate2;

	public void test() {
		List<String> testEntitys = jdbcTemplate.queryForList(
				"select name from test", String.class);
//		int i = 1/0; // 测试是否回滚
		System.out.println(testEntitys);
	}

	public void test2() {
		jdbcTemplate2.update("update test set name=?", "test for rollback");
	}

}

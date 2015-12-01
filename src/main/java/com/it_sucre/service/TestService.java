package com.it_sucre.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.it_sucre.dao.TestDao;

@Service
public class TestService {

	@Autowired
	TestDao testDao;

	@Transactional(rollbackFor = Exception.class, propagation = Propagation.REQUIRED)
	public void test() {
//		testDao.test2();
		testDao.test();
	}

}

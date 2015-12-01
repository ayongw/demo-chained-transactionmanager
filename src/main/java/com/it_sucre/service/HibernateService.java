package com.it_sucre.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.it_sucre.dao.HibernateDao;

@Service
public class HibernateService {

	@Autowired
	HibernateDao hibernateDao;
	
	@Transactional(value = "transactionManager",propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
	public void test() {
		hibernateDao.test();
		hibernateDao.test2();
	}
	
	
}

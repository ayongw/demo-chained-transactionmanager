package com.it_sucre.dao;

import javax.annotation.Resource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.it_sucre.entity.TestEntity;

@Repository
public class HibernateDao {

	@Autowired
	SessionFactory sessionFactory;
	
	@Resource(name = "sessionFactory2")
	SessionFactory sessionFactory2;
	
	public void test() {
		Session session = sessionFactory.openSession();
		session.persist(new TestEntity("hibernate"));
	}
	
	public void test2() {
		Session session = sessionFactory2.openSession();
//		int i = 1/0;
		session.persist(new TestEntity("hibernate"));
	}
	
	
}

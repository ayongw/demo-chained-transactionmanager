package com.it_sucre.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:/spring-hibernate-context.xml")
public class HibernateServiceTest {

	@Autowired
	HibernateService service;
	
	@Test
	public void test() {
		service.test();
	}
	
}

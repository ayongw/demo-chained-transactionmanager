package com.it_sucre.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "test")
public class TestEntity {

	@Id
	int id;
	
	String name;
	
	public TestEntity() {
	}
	
	public TestEntity(String name) {
		this.name = name;
	}
	
	
}

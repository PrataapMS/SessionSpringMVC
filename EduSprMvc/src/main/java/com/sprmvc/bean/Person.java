package com.sprmvc.bean;

public class Person {
	
	private String firstName;
	private Integer age;
	
	
	
	public Person() {
		super();
		this.firstName = null;
		this.age = null;
	}

	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public Integer getAge() {
		return age;
	}
	
	public void setAge(Integer age) {
		this.age = age;
	}
	
	

}

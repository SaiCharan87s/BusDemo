package com.lti.model;

public class Passenger {
	int passengerId;
	String pname;
	int age;
	
	public Passenger() {
		
	}

	public Passenger(int passengerId, String pname, int age) {
		super();
		this.passengerId = passengerId;
		this.pname = pname;
		this.age = age;
	}

	public int getPassengerId() {
		return passengerId;
	}

	public void setPassengerId(int passengerId) {
		this.passengerId = passengerId;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
	

}

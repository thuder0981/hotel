package com.test.bean;

public class User {
	private String name;
	private String passwd;
	

	public void setName(String name) {
		this.name = name;
	}
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	public String getName(){
		return this.name;
	}
	public String getPasswd(){
		return this.passwd;
	}

}

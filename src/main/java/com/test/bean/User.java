package com.test.bean;

public class User {
	private String name;
	private String passwd;

	public void SetName(String szName) {
		this.name = szName;
	}
	public void SetPasswd(String szPasswd) {
		this.passwd = szPasswd;
	}
	public String GetName(){
		return this.name;
	}
	public String GetPasswd(){
		return this.passwd;
	}

}

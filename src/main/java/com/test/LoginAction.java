package com.test;

import com.opensymphony.xwork2.ActionSupport;
import com.test.bean.User;

@SuppressWarnings("serial")
public class LoginAction extends ActionSupport{
	
	private User user;
	
	public String execute() throws Exception{
		addActionMessage( user.GetName() );
		return SUCCESS;
	}
 	public User getUser(){
 		return this.user;
 	}
 	public void setUser( User user){
 		this.user = user;
 	}
}

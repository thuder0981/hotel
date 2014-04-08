package com.test;

import com.opensymphony.xwork2.ActionSupport;
import com.test.bean.User;

@SuppressWarnings("serial")
public class LoginAction extends ActionSupport{
	
	private User user;
	
	public String execute() throws Exception{
		return SUCCESS;
	}
 	
}

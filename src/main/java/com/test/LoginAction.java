package com.test;

import com.opensymphony.xwork2.ActionSupport;
import com.test.bean.User;

@SuppressWarnings("serial")
public class LoginAction extends ActionSupport {
	private static final long serialVersionUID = -389833745243649130L;
	private User user;

	public String execute() throws Exception {
		if( "admin".equals(this.user.getName()) && "admin".equals(this.user.getPasswd()) ){
			addActionMessage( this.user.getName() );
			return SUCCESS;
		}else{
		}
		addActionMessage("Login failed!! Please reenter your name & passwd") ;
		return INPUT;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public User getUser() {
		return this.user;
	}
}

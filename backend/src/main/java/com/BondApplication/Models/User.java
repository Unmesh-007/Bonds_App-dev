package com.BondApplication.Models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TeamX")
public class User {
	@Id
	@Column
	long userId;
	@Column
	String userName ;
	@Column
	String userEmail;
	@Column
	String userRole;
	public User() {
		
	}
	public User(long userId, String userName, String userEmail, String userRole) {
		this.userId = userId;
		this.userName = userName;
		this.userEmail = userEmail;
		this.userRole = userRole;
	}
	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public String getUserRole() {
		return userRole;
	}
	public void setUserRole(String userRole) {
		this.userRole = userRole;
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", userEmail=" + userEmail + ", userRole="
				+ userRole + "]";
	}
	
	
	
	
}

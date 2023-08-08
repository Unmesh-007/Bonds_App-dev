package com.BondApplication.Models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Book")
public class Books {

	@Id
	@Column
	long userId;
	@Column
	String bookName ;
	
	public Books() {
		
	}
	
	public Books(long userId, String bookName) {
		super();
		this.userId = userId;
		this.bookName = bookName;
	}



	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	
}

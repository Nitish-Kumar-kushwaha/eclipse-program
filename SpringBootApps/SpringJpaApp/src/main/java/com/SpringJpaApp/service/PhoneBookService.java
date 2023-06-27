package com.SpringJpaApp.service;

import java.util.List;

import com.SpringJpaApp.model.PhoneBook;

public interface PhoneBookService {

	/*
	 * Declare some metod for curd operations 
	 */
	
	public String AddPhoneBook(PhoneBook pb);
	public List<PhoneBook> ShowAll();
	public PhoneBook SearchPhone(int cid);
	public String UpdatePhoneBook(PhoneBook pb);
	public String DeletePhoneBook(int cid);
	
}

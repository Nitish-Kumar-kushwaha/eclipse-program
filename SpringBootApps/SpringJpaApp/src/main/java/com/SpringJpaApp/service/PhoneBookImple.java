package com.SpringJpaApp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SpringJpaApp.model.PhoneBook;
import com.SpringJpaApp.reposotries.PhoneBookRepo;

@Service
public class PhoneBookImple implements PhoneBookService{
	 @Autowired
	PhoneBookRepo pbr;

	@Override
	public String AddPhoneBook(PhoneBook pb) {
		
		PhoneBook p = pbr.save(pb);
		
		if(p!= null)
			return "Sucess";
		else
			return "Error";
	}

	@Override
	public List<PhoneBook> ShowAll() {
		
		List<PhoneBook> allcustomers = pbr.findAll();
		
		return allcustomers;
	}

	@Override
	public PhoneBook SearchPhone(int cid) {
		
		Optional<PhoneBook> pbook = pbr.findById(cid);
		
		if(pbook.isPresent()) {
			return pbook.get();
		}
		
		return null;
	}

	@Override
	public String UpdatePhoneBook(PhoneBook pb) {
		
		PhoneBook pbs = pbr.saveAndFlush(pb);
		
		if(pbs!= null)
			return "Success";
		
		return "Fail";
	}

	@Override
	public String DeletePhoneBook(int cid) {
		
		Optional<PhoneBook> pbook = pbr.findById(cid);
		
		if(pbook.isPresent()) {
			pbr.deleteById(cid);
			return"Success";
		}
		
		return "Fail";
	}

}

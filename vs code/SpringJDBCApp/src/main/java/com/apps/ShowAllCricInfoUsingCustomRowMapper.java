package com.apps;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.beans.Cricket;
import com.beans.CricketInfo;
import com.beans.CricketOperations;

public class ShowAllCricInfoUsingCustomRowMapper {
	
	public static void main(String[] args) {
		ApplicationContext app = new ClassPathXmlApplicationContext("config.xml");
		
		CricketOperations crkOperations = (CricketOperations)app.getBean("CricketObj");
		
		List <CricketInfo> call = crkOperations.findAll();
		
		for(CricketInfo c : call) {
			System.out.println(c.getCkrno() + "\t"+ c.getCrkName()+ "\t"+ c.getGame() + "\t"+ c.getRuns());
		}
		
		
	}
}
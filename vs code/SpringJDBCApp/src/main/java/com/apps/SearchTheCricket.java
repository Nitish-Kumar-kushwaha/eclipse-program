package com.apps;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.beans.Cricket;
import com.beans.CricketOperations;

public class SearchTheCricket {
	
	public static void main(String[] args) {
		ApplicationContext app = new ClassPathXmlApplicationContext("config.xml");
		
		CricketOperations crkOperations = (CricketOperations)app.getBean("CricketObj");
		
		System.out.println("Entre the customer number to be search : ");
		Scanner sc = new Scanner(System.in);
		
		int cno = sc.nextInt();
		
		
		
		Cricket crk = crkOperations.SearchCricketInfo(cno);
		
		if(crk != null) {
			System.out.println(crk.getCrkName() + "\t" + crk.getTypeofgame() + "\t" + crk.getRuns());
		}
		else {
			System.out.println("Not found");
		}
		
		
	}
}
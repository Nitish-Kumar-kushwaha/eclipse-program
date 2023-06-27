package com.apps;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.beans.Cricket;
import com.beans.CricketOperations;

public class CricketApp {
	
	public static void main(String[] args) {
		ApplicationContext app = new ClassPathXmlApplicationContext("config.xml");
		
		CricketOperations crkOperations = (CricketOperations)app.getBean("CricketObj");
		
		Cricket crk = new Cricket();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Cricket Name : ");
		crk.setCrkName(sc.next());
		
		System.out.println("Type of game ");
		crk.setTypeofgame(sc.next());
		
		System.out.println("Runes : ");
		crk.setRuns(sc.nextInt());
		
		int res = crkOperations.AddCricketrsDetails(crk);
		
		if(res>= 1) {
			System.out.println("Cricketrs details are added to database");
		}
		else {
			System.out.println("Error!!!!");
		}
	}
}
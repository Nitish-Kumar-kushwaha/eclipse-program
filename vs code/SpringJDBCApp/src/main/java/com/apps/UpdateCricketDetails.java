package com.apps;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.beans.Cricket;
import com.beans.CricketOperations;

public class UpdateCricketDetails {
	
	public static void main(String[] args) {
		ApplicationContext app = new ClassPathXmlApplicationContext("config.xml");
		
		CricketOperations crkOperations = (CricketOperations)app.getBean("CricketObj");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Cno number of crickert to update");
		int cno = sc.nextInt();
		
		Cricket crk = crkOperations.SearchCricketInfo(cno);
		if(crk != null) {
			System.out.println("Deatils :");
			System.out.println(crk.getCno() + "\t" + crk.getCrkName() + "\t" + crk.getTypeofgame()+ "\t"+crk.getRuns());
			System.out.println("Now enter the name to be upadte for " + cno + " ");
			String name = sc.next();
			crk.setCrkName(name);
			
			int res = crkOperations.updateCricketDetails(crk);
			if(res>0) {
				System.out.println("updated ");
			}
			else {
				System.out.println("not updated");
			}
			
		}
		else {
			System.out.println("not found criketer for  " + cno);
		}
		
		
	}
}
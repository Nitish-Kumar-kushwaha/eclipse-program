package com.demo;
import java.io.*;
import java.util.Scanner;
public class FileWrite {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		
		Scanner  sc = new Scanner(System.in);
		
		String loc = "/home/nitish/Desktop/java-Eclipse /firstHelloWorld/src/com/demo/file1.txt";
		FileWriter fp = new FileWriter(loc);
		String str = sc.nextLine();
		fp.append(str);
		System.out.println("data appende");
		fp.close();
		FileReader fileReader  = new FileReader(loc);
		
		
		int str1 = fileReader.read();
		System.out.println((char)str1);
		
		while(str1 != -1) {
			str1 = fileReader.read();
			System.out.println((char)str1);
		}
	

	}

}

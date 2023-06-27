package javaAndOops;
import java.lang.*;
import java.util.*;

public class HigestPlacement {
	
	public static void placements(int cse , int ece, int mech) {
		if(cse>ece || cse>mech) {
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the number of student plased in CSE");
		int cse = sc.nextInt();
		System.out.println("entre the student placed in ECE");
		int ece = sc.nextInt();
		System.out.println("entre the student place in MECH");
		int mech = sc.nextInt();
		
		if(cse<0 || ece<0 || mech<0) {
			System.out.println("Invalid input");
			System.exit(0);
		}
		

	}

}

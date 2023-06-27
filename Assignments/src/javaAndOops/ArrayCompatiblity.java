package javaAndOops;

import java.util.*;
import java.lang.*;

public class ArrayCompatiblity {
	public static void compatiility(int arr1[], int arr2[]) {
		if(arr1.length != arr2.length)
			System.out.println("Array is not compatable");
		else {
			for(int i=0; i<arr1.length; i++){
				if(arr1[i]<arr2[i]) {
					System.out.println("Array is not compatable");
					return;
				}
			}
			System.out.println("array is compatable");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the size of array");
		 int m = sc.nextInt();
		 if(m<=0)
			 throw new ArithmeticException("invalid size");

		 int arr1[] = new int[m];
		 System.out.println("enter the elements of array-1");
		 for(int i=0; i<arr1.length;i++)
			 arr1[i] = sc.nextInt();
		 
		 System.out.println("enter the size of array");
		 int n= sc.nextInt();
		 if(n<=0)
			 throw new ArithmeticException("invalid size");
		 int arr2[] = new int[n];
		 System.out.println("enter the elements of array-2");
		 for(int i=0; i<arr2.length; i++)
			 arr2[i] = sc.nextInt();
		 
		 compatiility(arr1, arr2);

		 
	}

}

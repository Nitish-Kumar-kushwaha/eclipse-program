package com.TestingPractise;

public class Calculation {
	
	public int Addition(int a, int b) {
		return (a+b);
	}
	
	public int findMax(int arr[]) {
		
		int res = arr[0];
		for(int i=1; i<arr.length;i++) {
			if(res<arr[i]) {
				res = arr[i];
			}
		}
		
		return res;
	}
	public static void main(String[] args) {
		Calculation c = new Calculation();
		System.out.println(c.Addition(-5, 5));
	}

}

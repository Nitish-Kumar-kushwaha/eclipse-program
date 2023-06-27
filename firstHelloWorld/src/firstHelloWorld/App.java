package firstHelloWorld;

import java.util.*; 
import java.lang.*;


public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the entities \n");
		
		
		int x = sc.nextInt();
		int y= sc.nextInt();
		
		@SuppressWarnings("unused")
		int z = (x>y)?x:y;
		
		System.out.println("hello nitish" + Math.PI);

	}

}

package firstHelloWorld;
import java.util.*;
import java.lang.*;

public class Palindrme {
	static int ans=0;
	public static int revrseNum(int n) {
		
		if(n==0) {
			return ans;
		}
		if(n>0){
			int temp = n%10;
			ans = ans*10+temp;
			revrseNum(n/10);
		}
		return ans;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("enter the value "+"\t");
		int n = sc.nextInt();
		
		int original = n;
		int rev =0;
		
		while(n>0) {
			int r = n%10;
			rev = rev*10+r;
			n=n/10;
		}
		System.out.println(revrseNum(original));

	}

}

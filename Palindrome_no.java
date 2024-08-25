package Assignment_2;

import java.util.Scanner;

public class Palindrome_no {

	public static void main(String[] args) {
		int  n,c=0,a=0,r=0;
		System.out.println("Enter any number");
		Scanner obj=new Scanner(System.in);
		n=obj.nextInt();
		
		c=n;
		
		do {
			r=c%10;
			c=c/10;
			a=a*10+r;
		}
		while(c>0); {
			if(a == n) {
				System.out.println("Palindrome Number");
			}
			   else {
				   System.out.println("Not palindrome");
			    }
		}
		
	}

}

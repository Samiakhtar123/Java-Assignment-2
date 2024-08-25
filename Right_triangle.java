package Assignment_2;

import java.util.Scanner;

public class Right_triangle {

	public static void main(String[] args) {
		int num;
		System.out.println("Enter the lines for triangle");
		
		Scanner sc=new Scanner (System.in);
		num=sc.nextInt();
		
		for(int i=1; i<=num; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			  }
			System.out.println();
		}
	}
}

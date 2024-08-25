package Assignment_2;

import java.util.Scanner;

public class left_triangle {

	public static void main(String[] args) {
		int num;
		
		System.out.println("Enter the lines for triagle");
		Scanner sc=new Scanner (System.in);
		num=sc.nextInt();
		
		for(int i=1; i<=num; i++) {
			for(int j=num-i; j>=i; j--) {
				System.out.print("");
			}
			for(int k=1; k<=i; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}

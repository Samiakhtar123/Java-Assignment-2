package Assignment_2;

import java.util.Scanner;

public class Pyramid {

	public static void main(String[] args) {
		int num;
		
		System.out.println("Enter the lines for Pyramid");
		
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		
		for(int i=1; i<=num; i++) {
			for(int j=num-i; j>-1; j--) {
				System.out.print(" ");
			}
			for(int k=1; k<=i; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}

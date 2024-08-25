package Assignment_2;

import java.util.Scanner;

public class Grade_Student {

	public static void main(String[] args) {
		int maths,science,english,Avg;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the maths marks");
		maths=sc.nextInt();
		
		System.out.println("Enter the science marks");
		science=sc.nextInt();
		
		System.out.println("Enter the english marks");
		english=sc.nextInt();
		
		Avg = (science+maths+english)/3;
		
		if (Avg > 90) {
			System.out.println("topper");
		}
		else if (Avg > 60){
			System.out.println("pass");
		}
		else if(Avg <= 40){
			System.out.println("fail");
		}
	}

}

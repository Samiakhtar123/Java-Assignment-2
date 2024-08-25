package Assignment_2;

import java.util.Scanner;

public class Tables_numer {

	public static void main(String[] args) {
		int num;
		
		System.out.println("Enter Any Number");
		
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		
		for(int i=1; i<=10; i++) {
			System.out.println(i + "*" +num + "=" + num*i);
		}
	}

}

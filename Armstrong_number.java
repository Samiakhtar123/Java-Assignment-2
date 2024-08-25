package Assignment_2;

import java.util.Scanner;

public class Armstrong_number {

	public static void main(String[] args) {
        int num,c,rem,arm=0;
        System.out.println("Enter any Number");
        
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();
        
        c=num;
        while(num>0)
        {
        	rem=num%10;
        	arm=(rem*rem*rem)+arm;
        	num=num/10;
        }
        if(arm == c) {
        	System.out.println("The Number is Armstrong");
        }
        else {
        	System.out.println("the number is not Armstrong");
        }
	}

}

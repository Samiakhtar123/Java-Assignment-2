package Assignment_2;

import java.util.Scanner;

public class Largest_3Num {

	public static void main(String[] args) {
         int a,b,c;
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter the first num");
         a=sc.nextInt();
        
         System.out.println("Enter the Second num"); 
         b=sc.nextInt();
        
         System.out.println("Enter the third num"); 
         c=sc.nextInt();
        
         
         if(a>b && a>c) {
        	 System.out.println("a is greatest");
         }
         else if(b>c && b>a){
        	 System.out.println("b is greatest");
         }
         else if(c>a && c>b) {
        	 System.out.println("c is greatest");
         }
         else {
        	 System.out.println("Either any two values or all the three values are equal");
         }
	}

}

package Assignment_2;

import java.util.Scanner;

public class Switch_case {

	public static void main(String[] args) {
		int month;
		
		System.out.println("Enter the number of month");
		
		Scanner sc=new Scanner(System.in);
		month=sc.nextInt();
		
		switch(month) {
		
		case 1:
			System.out.println("january = 31 days");
			break;
		
	    case 2:
		    System.out.println("february = 28/29 days");
		    break;
	    
        case 3:
	         System.out.println("March = 31 days");
	         break;

        case 4:
	         System.out.println("April = 30 days");
	         break;

        case 5:
	          System.out.println("May = 31 days");
	          break;

         case 6:
	          System.out.println("june = 30 days");
	          break;

         case 7:
	          System.out.println("july = 31 days");
	          break;

          case 8:
	           System.out.println("August = 31 days");
	           break;

           case 9:
	           System.out.println("September = 30 days");
	           break;

           case 10:
	           System.out.println("October = 31 days");
	           break;

            case 11:
	            System.out.println("November = 30 days");
	            break;
	         
            case 12:
            	System.out.println("December = 31 days");
            	break;
            default: 
                System.out.println("Invalid input! Please enter month number between 1-12");
	            
}
		
		
		
	}

}

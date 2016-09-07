import java.util.Scanner;
public class Switch {

	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in) ;
		System.out.println("Input number of days: ");
		int input =keyboard.nextInt();
		  
	        String NumberOfDays = null;
	        switch (input) 
	        {
	        
	            case 30:  NumberOfDays = "September April June November";
	                     break;
	            case 31:  NumberOfDays = "Jan March May July August October December";
	           	         break;
	            case 9:  NumberOfDays = "No months with 9 days";
      	         break;

	        }
	       
	        System.out.println("the months are  " +NumberOfDays);
	}

}

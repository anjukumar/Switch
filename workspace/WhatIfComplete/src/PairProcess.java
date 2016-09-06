import java.util.Scanner;

public class PairProcess {
	public static void main(String[] args) {
		int num1, num2;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print( "First Number? :" );
		num1 = keyboard.nextInt();
		
		System.out.print( "Last Number?  :" );
		num2 = keyboard.nextInt();
		
		double sum = num1 +num2;
		double avg = sum/2;
		double prod = num1*num2;
		
		if(sum>=200)
			System.out.println("The sum is :  " +sum + "*");
		else
			System.out.println("The sum is :  " +sum);
		System.out.println("Average:  " +avg);
		System.out.println("Product:  " +prod);
	keyboard.close();
	}
	
}
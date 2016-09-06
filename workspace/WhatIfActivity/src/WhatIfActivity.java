import java.util.Scanner;
public class WhatIfActivity {

	public static void main(String[] args) {
	//(which includes customer number, name, sales amount and a tax code)
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Input cust name: ");
		String name = keyboard.nextLine();
		
		System.out.println("Input sales amount: ");
		double sales = keyboard.nextDouble();
		
		System.out.println("Cust ID: ");
		int ID = keyboard.nextInt();
		
		System.out.println("Input tax rate: ");
		String tax = keyboard.next();
		
		double total;
		
		if (tax.equals("NRM"))
				{
					 total = sales + sales*0.6;
				}
				
				else if (tax.equals("BIZ"))
				{
					 total = sales + sales*0.3;
				}
		
				else 
				{
					 total = sales;
				}

		System.out.println(" Customer ID :  " +ID + "\n Customer Name :  " + name + "\n Tax Code : " +tax + "\n sales amount :" +sales + "\n Total Amount owed " +total);
		keyboard.close();
	}

}

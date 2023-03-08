//
// Copyright (c) 2023 Promineo Tech
// Author:  Promineo Tech Academic Team
// Subject:  Variables & Operations Lab
// Java Week 01 Lab  
//
package Week1;

public class VariablesandOperations {

	public static void main(String[] args) {

		// 1. Create a variable to hold the quantity of 
		//		available plane seats left on a flight		
		int planeSeats = 5;
		
		// 2. Create a variable to hold the cost of groceries at checkout
		double groceryCost = 10;
		
		// 3. Create a variable to hold a person's middle initial
		char middleInitial = 'S';
	
		// 4. Create a variable to hold true if it's hot outside 
		//		and false if it's cold outside
		int hotTemp = 90;
		boolean tempOutside = hotTemp == 90;
		
		
		// 5. Create a variable to hold a customer's first name
		String firstName = "Boy";
		
		// 6. Create a variable to hold a street address
		String streetAddress = "1500 Lerner Avenue";

		// 7. Print all variables to the console
		System.out.println(planeSeats);
		System.out.println(groceryCost);
		System.out.println(middleInitial);
		System.out.println(tempOutside);
		System.out.println(firstName);
		System.out.println(streetAddress);

		// 8. A customer booked 2 plane seats, 
		//		remove 2 seats from the available seats variable
		int remainingPlaneSeats = planeSeats - 2;
		System.out.println(remainingPlaneSeats);

		// 9. Impulse candy bar purchase, add 2.15 to the grocery total
		// 		costOfGroceries = costOfGroceries + 2.15;
		groceryCost = groceryCost + 2.15;
		System.out.println(groceryCost);

		// 10.  The birth certificate was printed incorrectly, 
		//		change the middle initial to something else
		middleInitial = 'J';
		System.out.println(middleInitial);
		

		// 11.  The season has changed, update the hot outside 
		//			variable to be opposite of what it was
		tempOutside = hotTemp == 30;
		System.out.println(tempOutside);

		// 12.  Create a new variable called full name using the customer's first name, 
		//			the middle initial, and a last name of your choice
		String fullName = firstName + " " + middleInitial + " " + "Bawang";
		System.out.println(fullName);

		// 13.  Print a line to the console that introduces the customer and says they live
		// 			at the address variable
		System.out.println("Hello " + fullName + ", " + "you live at " + streetAddress + ".");
		
		
	}
}

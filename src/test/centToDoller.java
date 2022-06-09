package test;

import java.util.Scanner;

public class centToDoller {

//	Write a program that takes in an input number of cents. The program will write out the number of dollars and cents, like this:
//
//		Input the cents: 324
//
//		Expected Output :
//
//		The value is 3 dollars and 24 cents.
//
//		Note: Use integer arithmetic and avoid floating-point arithmetic.
	
// cent‚ğdollar‚É•ÏŠ·
	 public static void main(String[] args) {
		int cent = 0;
		int dollar;
		double amount;
		
		Scanner scanner = new Scanner(System.in);
		// amount‚Ì“ü—Í
		System.out.print( "amountF" );
		amount = scanner.nextInt();
   		// cent‚ğ100‚ÅŠ„‚é
		dollar = (int) Math.round(amount / 100);
		cent = (int) (amount - (dollar * 100));
		System.out.println(dollar + "and" + cent);	
    	}
}

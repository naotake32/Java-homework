package test;

import java.util.Scanner;

public class addingUpIntegers {
//		Write a program that adds up integers that the user enters.
//		First the programs asks how many numbers will be added up. 
//		Then the program prompts the user for each number.
//		Finally it prints the sum. Sample output:
//		How many integers will be added? 
//		5 Enter an integer: 3 Enter an integer: 4 Enter an integer: -4 Enter an integer: -3 Enter an integer: 7
//
//		Expected Output :
//
//		The sum is 7
	
	public static void main(String[] args) {
		int counter = 0;
		int curr = 0;
		int inputtedValue;
		Scanner scanner = new Scanner(System.in);
		
		
		while(counter <= 4) {
		System.out.print("Enter the integer:");
		inputtedValue= scanner.nextInt();
		curr += inputtedValue;
		counter ++;
	}
		System.out.println(curr);
	}
}

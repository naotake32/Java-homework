package test;

import java.util.Scanner;

public class runOfIntegers {
//	Write a program that asks the user for a starting value and an ending value and then writes all the integers (inclusive) between those two values.
//
//	Input the start: 3 Input the End: 9
//
//	Expected Output :
//
//	3 4 5 6 7 8 9
	public static void main(String[] args) {
		int startVal = 0;
		int endVal = 0;
		Scanner scanner1 = new Scanner(System.in);
		System.out.print("Enter the start:");
		startVal= scanner1.nextInt(); 
		
		Scanner scanner2 = new Scanner(System.in);
		System.out.print("Enter the end:");
		endVal= scanner2.nextInt(); 
		
		while( startVal <= endVal ) {
			System.out.println(startVal);
			startVal++;
		}
	}
}

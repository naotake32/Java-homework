package test;

import java.util.Scanner;

public class sumOfSequentialIntegers {
//	Write a program that asks the user for N and then sum all the integers (inclusive) between 1 and N.
//
//	Input the N: 10
//
//	Expected Output :
//
//	The sum of 1 to 10 is 55
	public static void main(String[] args) {
	
	int endNum = 0;
	int currSum = 0;
	int counter = 0;
	
	Scanner scanner = new Scanner(System.in);
	System.out.print("Enter a number:");
	endNum = scanner.nextInt();
	
	while(counter <= endNum) {
		currSum += counter;
		counter++;
	}
	System.out.print(currSum);
}
}

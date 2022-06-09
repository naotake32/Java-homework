package test;

import java.util.Scanner;

public class wordEcho {
//		Write a program that asks the user to enter a word. The program will then repeat the word for as many times as its characters: Sample Output:
//
//		Enter a word: Hello
//
//		Expected Output :
//
//		Hello Hello Hello Hello Hello
	
	 public static void main(String[] args) {
		 String inputtedStr;
		 int counter = 0;
		 
		 Scanner scanner = new Scanner(System.in);
		 System.out.print("Enter the word:");
		 inputtedStr= scanner.nextLine(); 
		 
		 int strLength = inputtedStr.length();
		 
		 while(counter < strLength) {
			 System.out.println(inputtedStr);
			 counter++;
		 }
}
}

package test;

import java.util.Scanner;

//Write a program that takes a number as input and prints its multiplication table up to 10. Sample Output:
//
//	Input a number: 9
//
//	Expected Output :
//
//	9 x 1 = 9 9 x 2 = 18 9 x 3 = 27 ... 9 x 10 = 90
//

	 public class multipleTable {
	    	public static void main( String[] args ) {
	    		Scanner scan = new Scanner(System.in);
	    		
	    		System.out.println("enter a number");
	    		
	    		int num = scan.nextInt();
	    		
	    		for(int i = 1; i < 11;i++) {
	    			System.out.printf("%d * %d = %d%n", num, i, (num * i));
	    		}
	    		
	    		scan.close();
			    	}
			    }

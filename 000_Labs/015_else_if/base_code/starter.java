/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		// 
		System.out.println("Input an integer, 1-1000: ");
		int num1 = sc.nextInt();
		int y = (int)(Math.random() *1000);
		if (num1==y){
			System.out.println("you guessed the right random number");
			System.out.println("the random number was: " + y);
		}
		else if(num1 > y){
			System.out.print("Your number was greater than the random number");
			System.out.println("The random number was: " + y);
		}
		else if(num1 < y){
			System.out.print("Your number was less than the random number");
			System.out.println("The random number was: " + y);
		}
	}
}

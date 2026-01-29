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
		System.out.println("Input an integer: ");
		int num1 = sc.nextInt();
		int y = (int)(Math.random() *1000);
		if (num1!=y){
			System.out.println("you didnt get the random number");
			System.out.println("the random number was: " + y);
		}
		else{
			System.out.println("This is the right guess" + y + "was the random number");
		}
		
		
		
		
	}
}

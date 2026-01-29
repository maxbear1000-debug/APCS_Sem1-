/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		System.out.print("I love to learn coding remotely."); 
		System.out.println("Please input your first number: ");
		int first = sc.nextInt();
		System.out.println("Please input your second number: ");
		int second = sc.nextInt();
		System.out.println("Please input your third number: ");
		int third = sc.nextInt();
		
		if(first > second && first > third){
			System.out.println(first + " is larger than " + second + " & " + third);
		}
		if(second > first && second > third){
			System.out.println(second + " is larger than " + first + " & " + third);
		}
		if(third > first && third > second){
			System.out.println(third + " is larger than " + second + " & " + third);
		}
	}
}

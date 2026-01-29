/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		// 
		System.out.println("Enter 2 numbers to create a range for your random number");
		System.out.println("Please enter an integer: "); 
		int num1 = sc.nextInt();
		System.out.println("Please enter another integer (bigger than the first): "); 
		int num2 = sc.nextInt();
		
		
		while(num2<num1){
			System.out.println("input  a new integer because your second is not greter then your first");
			num2 = sc.nextInt();
		}
		
		
		
		
		System.out.println("Your range in " + num1 + " to " + num2);
			// 
		System.out.println("Here are 5 numbers generated in that range: " );
		System.out.print(((int)(Math.random()*num2-num1)+num1) + ", ");
		System.out.print(((int)(Math.random()*num2-num1)+num1) + ", ");
		System.out.print(((int)(Math.random()*num2-num1)+num1) + ", ");
		System.out.print(((int)(Math.random()*num2-num1)+num1) + ", ");
		System.out.print(((int)(Math.random()*num2-num1)+num1) + ", ");
	
	}
}

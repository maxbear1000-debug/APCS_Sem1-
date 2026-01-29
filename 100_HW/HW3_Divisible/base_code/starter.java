/*
 *	Author:
 *  Date:
 * 	Collaborator: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter an integer: ");
		int num1 = sc.nextInt();
		System.out.print("Enter an integer: ");
		int num2 = sc.nextInt();
		
		if(num1%2 == 0){
			System.out.println(num1 + " is an even number");
		}
		else{
			System.out.println(num1 + " is not an even number");
		}
		System.out.println("");

		
		if(num2%2 == 0){
			System.out.println(num2 + " is an even number");
		}
		else{
			System.out.println(num2 + " is not an even number");
		}
		
		System.out.println("");

		
		if(num1%5 ==0 ){
			System.out.println(num1+ " is divisible by and 5");
		}
		else{
			System.out.println(num1 + " is not divisible 5");
		}
		if(num1%4 ==0 ){
			System.out.println(num1+ " is divisible by and 4");
		}
		else{
			System.out.println(num1 + " is not divisible 4");
		}
		if(num1%3 ==0 ){
			System.out.println(num1+ " is divisible by 3");
		}
		else{
			System.out.println(num1 + " is not divisible 3");
		}

		System.out.println("");
		System.out.println("-----------------------");
		System.out.println("");

		
		if(num2%5 ==0 ){
			System.out.println(num2+ " is divisible by and 5");
		}
		else{
			System.out.println(num2 + " is not divisible 5");
		}
		if(num2%4 ==0 ){
			System.out.println(num2+ " is divisible by 4");
		}
		else{
			System.out.println(num2 + " is not divisible 4");
		}
		if(num2%3 ==0 ){
			System.out.println(num2+ " is divisible by and 3");
		}
		else{
			System.out.println(num2 + " is not divisible 3");
		}

	}
}

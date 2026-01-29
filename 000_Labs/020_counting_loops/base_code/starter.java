/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc = new Scanner(System.in);
		System.out.println("What is your name");
		String name = sc.nextLine();
		System.out.println("How many times should I repeat this code");
		int time = sc.nextInt();
		int z = 0;
		
		while(z<time){
			System.out.println(name);
			z +=1; 
			
		}


		
	}
}

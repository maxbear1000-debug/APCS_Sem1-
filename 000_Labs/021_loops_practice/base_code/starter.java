/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc = new Scanner(System.in);


		while(true){
			System.out.println("What is your gues for a number between 1-1000"); 	
			int time = sc.nextInt();
			int y = (int)(Math.random() * 999)+1;
			if(time>y){
				System.out.println("To big try again!!!!!");
			}
			else if(time<y){
				System.out.println("To low try again!!!!!");
			}
			else if(time==y){
				System.out.println("Correct !!!!!!!");
			}
		}


		
	}
}

/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static int exponent(int a, int b){
		int x = 1;
		while(b!=0){
			x = a*x;
			b = b-1;
		}
		return x; 
	}
	
	public static void main(String args[]) {
		// Your code goes below here
		System.out.println(exponent(3,4));


		
	}
}

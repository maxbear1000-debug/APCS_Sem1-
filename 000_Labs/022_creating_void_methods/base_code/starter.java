/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void print2(String a, String b){
		System.out.println( a + " " + b);
	}
	

	public static void main(String args[]) {
		// Your code goes below ere
		Scanner sc = new Scanner(System.in);
		System.out.println("Give me a sentence");
		String sent1 = sc.nextLine();
		System.out.println("Give me a sentence");
		String sent2 = sc.nextLine();
		print2(sent1,sent2);

		
	}
}

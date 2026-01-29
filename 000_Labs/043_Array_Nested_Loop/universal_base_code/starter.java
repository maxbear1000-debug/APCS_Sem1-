/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc = new Scanner(System.in);

		System.out.println("Give me a number: ");
		int fart = sc.nextInt();
		
		System.out.println("give me a number of rows");
		int rows = sc.nextInt();
		
		System.out.println("give ma number of coloumbs");
		int coloms = sc.nextInt();
		
		int[][] arr = new int[rows][coloms];
		for(int r = 0; r < arr.length; r++){
			for(int c = 0; c <arr[0].length; c ++){
				arr[r][c] = fart; 
			}
			
		}
		

		
	}
}

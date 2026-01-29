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
		int [] fart = new int[1000];
		int i = 0;
		while(i < fart.length){
			fart[i] = (int)(Math.random()*50);
			System.out.println(fart[i]); 
			i++; 
			
		}
		
		
		
	}
}

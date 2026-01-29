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
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE; 
		int [] fart = new int[(int)(Math.random()*149 + 51)];
		for(int i = 0; i < fart.length; i++){
			fart[i] = (int)(Math.random()*100);
		}
		
		for( int k = 0; k < fart.length;k++ ){
			if(fart[k]<min){
				min = fart[k];
			}
		}
		
		for( int k = 0; k < fart.length;k++){
			if(fart[k]>max){
				max = fart[k];
			}
		}
		
		
		
		System.out.println(min);
		System.out.println(max);
		int c = 0;
		for(int y = 0; y<fart.length; y++){
			c=c+fart[y];    
		
			
		}
		System.out.println(c/fart.length);
		
		
		
		
		
	}
}

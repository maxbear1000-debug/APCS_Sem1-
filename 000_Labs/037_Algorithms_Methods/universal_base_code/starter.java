/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	
	public static void toStringArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
        	System.out.println(arr[i]);
		}
	}
	
	
	public static int getArrayAverage(int[] arr) {
		int sum = 0;
		 
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		 }
		
		return sum / arr.length;  
	}
	
	public static int getArrayMax(int [] arr){
		int max = 0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] > max){
				max = arr[i]; 
				
			
			}
		}
		return max; 
	}
	
	public static int getArrayMin(int [] arr){
		int max = 100;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] < max){
				max = arr[i]; 
				
			
			}
		}
		return max; 
	}
	
	
	
	
	public static void main(String args[]) {
		// Your code goes below here
		int [] fartpoop = new int [1000];
		for(int i = 0; i < fartpoop.length; i++){
			fartpoop[i] = (int)(Math.random()*100);
		}
		toStringArray(fartpoop);
		System.out.println("_______________________________________________");
		System.out.println(getArrayAverage(fartpoop)); 
		System.out.println("_______________________________________________");

		System.out.println(getArrayMax(fartpoop));
		System.out.println("_______________________________________________");

		System.out.println(getArrayMin(fartpoop));
		
		
	}

	
	
	
}

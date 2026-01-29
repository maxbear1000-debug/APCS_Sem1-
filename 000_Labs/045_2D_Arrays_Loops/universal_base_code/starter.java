/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void printArr(int r, int [][] arr){
		int sum = 0; 
        for (int i = 0; i < arr.length; i++) {
                sum += arr[r][i];
        }
        
		System.out.println(" the average for row" + r + "is " + sum/arr.length);
	}
	
	
	public static int totalavg(int [][] arr){
		int sum = 0;
		int count = 0;
		for (int r = 0; r < arr.length; r++) {
            for (int c = 0; c < arr[r].length; c++) {
                sum += arr[r][c];
                count++;
            }
        }
        
        int totalavg = sum/arr.length/arr.length;
        return totalavg;
		
	}
	
	
	
	public static void print2DArray(int[][] arr) {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                System.out.print(arr[row][col] + " ");
            }
            System.out.println(); 
        }
	
	public static void main(String args[]) {
		// Your code goes below here
		
		
		
		
		
		
		
		
		
		
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Give me the number of rows you want: ");
		int row = sc.nextInt();
		System.out.println("Give me the number of coloms you want:  ");
		int col = sc.nextInt();
		int [][] twodarr = new int[row][col];
		
		
		
	}
}

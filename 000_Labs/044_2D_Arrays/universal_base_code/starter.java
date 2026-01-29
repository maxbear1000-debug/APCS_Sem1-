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
		int[][] numeros = {
            {2, 4, 6},
            {8, 3, 12},
            {14, 13, 8}
        };

        int sum = 0;
        int count = 0;

        for (int r = 0; r < numeros.length; r++) {
            for (int c = 0; c < numeros[r].length; c++) {
                sum += numeros[r][c];
                count++;
            }
        }
        
        System.out.println(sum/numeros.length/3);
        
        
        
        
        
	}    
}

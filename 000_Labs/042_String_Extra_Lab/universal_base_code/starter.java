/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
        
        
        System.out.println("Tell me a phrase ... .. :)");
        String whattheysade = sc.nextLine();
        
        System.out.println("original... is ....  " + whattheysade);
        
        int end = whattheysade.length();
        
        String x= ""; 
        
        for (int i = whattheysade.length() - 1; i >= 0; i--) {
            if (whattheysade.substring(i, i+1).equals(" ")) {
                x += whattheysade.substring(i+1, end) + " ";
                end = i; 
            }
        }

        x += whattheysade.substring(0, end);

        System.out.println("backwards words... is  🤣 " + x);
        
    }
}
        
        
        
        
		
	
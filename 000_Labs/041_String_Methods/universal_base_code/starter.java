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
		BaseClass test = new BaseClass();
		System.out.println("Please enter your full name prety please");
        String fullName = sc.nextLine();

        int spaceIndex = fullName.indexOf(" ");

        int length = fullName.length();

        String lastName = fullName.substring(spaceIndex + 1, length);

        System.out.println("the last nameis " + lastName);

		
	}
}

/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		System.out.println("Enter a word or number:");
        String input = sc.nextLine();

        System.out.println("original... is .... " + input);

        String backwards = "";

        for (int i = input.length() - 1; i >= 0; i--) {
            backwards += input.substring(i, i + 1);
        }

        System.out.println("backwards... is .... " + backwards);
	}
}

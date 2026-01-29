/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		System.out.println("Would you like to be a Wizard, Warrior, or Rogue?:  "); 
		String choice = sc.nextLine();
		if(choice.equals("Wizard")){
			System.out.println("You've chosen the Wizard! Excelsior! ");
		}
		else if(choice.equals("Warrior")){
			System.out.println("You've chosen the Warrior! For honor! ");
		}
		else if(choice.equals("Rogue")){
			System.out.println("You've chosen the Rogue! How cunning! ");
		}
		
	}
}

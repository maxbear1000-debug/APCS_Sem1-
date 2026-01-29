/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Dog dog1 = new Dog("Six");
		dog1.setAge(7);
		
		Dog dog2 = new Dog("Tyranosauras", "rex");
		
		boolean dog1Sleeping = dog1.isSleeping();
        if (dog1Sleeping) {
            System.out.println(dog1.getName() + " is asleep.");
        } else {
            dog1.bark();
        }

		boolean dog2Sleeping = dog2.isSleeping();
        if (dog2Sleeping) {
            System.out.println(dog2.getName() + " is asleep.");
            if (!dog1Sleeping) {
                dog2.bark();
            }
        } else {
            if (!dog1Sleeping) {
                dog2.bark();
            }
        }
		
		
		
		
		
		
	}
}

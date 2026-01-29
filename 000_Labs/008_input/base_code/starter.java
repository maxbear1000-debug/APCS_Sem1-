/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		System.out.println(" What is your name: ");
        String name = sc.nextLine();
        System.out.println("What is your age: ");
        int age = sc.nextInt();
        System.out.println("Birthday month (1-12) ");
        int month = sc.nextInt();
        System.out.println("What is your Birth Date: ");
        int date = sc.nextInt();
        System.out.println("What is your birth year: ");
        int year = sc.nextInt();
        System.out.println("How much is a buck fifty: ");
        double buck = sc.nextDouble();
        System.out.println("Your name is " + name + "you wer born on " + date + "/" + month + "/" + year);
        System.out.println(" You are " + age + "years old !!");
        System.out.println(" You have $" + buck + " dollars in your wallet"); 
        
        
        
	}
}

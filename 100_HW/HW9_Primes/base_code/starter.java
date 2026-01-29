/*
 *	Author:
 *  Date:
*/

import java.util.Scanner;

class starter {
	
	public static boolean checkPrime(int number) {
        int divisor = 2;
        while (divisor < number) {
            if (number % divisor == 0) {
                return false; // Not prime
            }
            divisor++;
        }
        return true; // Prime
    }

    // Method 2: printPrimes
    public static void printPrimes(int maxNumber) {
        int current = 2;
        while (current < maxNumber) {
            if (checkPrime(current)) {
                System.out.println(current);
            }
            current++;
        }
    }

	
	
	
	
	
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);

		System.out.print("I love to learn coding remotely.");
		System.out.println("enter and intgerg/ whole number:  ");
		int number1 = sc.nextInt();
		System.out.println("Prime numbers less than " + number1 + ":");
        printPrimes(number1);

		
		
		
		
		
		
	}
}

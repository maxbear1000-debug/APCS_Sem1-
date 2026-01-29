/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Please enter a number: ");
		double number = sc.nextDouble();
		System.out.println("Here are the next five numbers: ");
		System.out.println(number+ ","+(number+1)+","+ (number+2)+ ","+(number+3) +","+(number+4) +","+ (number+5) );
		System.out.println("Here are the next five multiples of " + number);
		System.out.println(number+ ","+ (number*2)+ ","+ (number*3)+ ","+ (number*4) + ","+ (number*5));
		System.out.println("Here is the number divided by 100" );
		System.out.println((number/100));
		System.out.println("Here is the number divided by 100" );
		System.out.println((number/10));

	}
}

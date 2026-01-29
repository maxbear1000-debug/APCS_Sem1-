/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.*;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
		System.out.println("---------------- This is an ATM ------------------");
		BankAccount x = new BankAccount();
		x.displayAccountInfo();
		x.checkBalance();
		
		BankAccount y = new BankAccount("jimmy");
		y.displayAccountInfo();
		y.checkBalance(); 
		
		BankAccount z = new BankAccount("bob", 5000);
		z.displayAccountInfo();
		z.checkBalance();
	}
}

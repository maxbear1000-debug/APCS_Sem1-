/*
 *	Author:
 *  Date:
 * 	Collaborator(s):
*/
import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Employee michael = new Employee();
		michael.employeeToString();
		
		Employee two = new Employee(1987, "Dwight" , "Schrute", 4416.66);
		Employee three = new Employee(2474, "JIm" , "Halbert", 4416.66);
		Employee four = new Employee(2011, "Pam" , "Beesly", 2500.0);
		Employee five = new Employee(6941, "Andrew" , "Ghassemian", 100.08);
		
		two.raiseSalary(223);
l		four.raiseSalary(3242);
		five.raiseSalary(2332);
		
		two.employeeToString();
		three.employeeToString();
		four.employeeToString();
		five.employeeToString();
		
		
		
		
		
		
		
		
	}
}

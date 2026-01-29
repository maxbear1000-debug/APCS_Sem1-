/*
 *	Author:  
 *  Date: 
*/

package pkg;
import java.util.*;

public class BankAccount {
	
	
	private String owner;
	private int accountNumber;
	private static int nextAccount = (int)((Math.random()*950)+50);
	private	double balance;
	private	boolean isActive;
	// -------CONSTRUCTORS-------
	
	public  BankAccount(){
		owner = "unknown";
		accountNumber = nextAccount;
		nextAccount ++;
		balance = 0.0;
		isActive = true; 
	}
	 
	public  BankAccount(String own){
		owner = own;
		accountNumber = nextAccount;
		nextAccount ++;
		balance = 0.0;
		isActive = true; 
	}
	
	public BankAccount(String own, double bala){
		owner = own;
		accountNumber = nextAccount;
		nextAccount ++;
		balance = bala;
		isActive = true;
	}
	
	
	

	// -------METHODS-------
	
	public void checkbalance(){
		System.out.println(balance);
	}

	public void displayAccountInfo(){
		System.out.println(owner);
		System.out.println(accountNumber);
		System.out.println(balance);
		System.out.println(isActive);
		
	}
	
	public String getOwner(){
		return owner;
	}
	public void setOwner(String change){
		owner = change;
	}
	
	public void closeAccount(){
		isActive = false; 
		
	}
	
	public double depositMoney(double deposit){
		balance = balance + deposit;
		return balance;
	}
	
	public double wilthdrawMoney(double withdraw){
		balance = balance - withdraw;
		return balance;
	}
	
	

}
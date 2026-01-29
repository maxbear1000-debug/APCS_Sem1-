/*
 *	Author:
 *  Date:
 * 	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Slot Machine Rules: "); 
		System.out.println("1. Each player starts with $100."); 
		System.out.println("2. Input a wager less than your total amount of money.");
		System.out.println("3. The slot machine will roll 3 numbers from 1 to 10.");
		System.out.println("   a. If two numbers match, you double your money.");
		System.out.println("   b. If three numbers match, you triple your money.");
		System.out.println("   c. If none match, you lose your money.");
		System.out.println("--------------------------------------------------");
		System.out.println();
		int money = 100;
		while(true){
			System.out.println("Would you like to play the slots? (Yes/yes/Y/y)"); 
			String choice = sc.nextLine(); 
			if(choice.equals("y") || choice.equals("Y") || choice.equals("yes") || choice.equals("Yes")){
				

				System.out.println("You have $" + money + ". How much would you like to wager? ");
				int amount = sc.nextInt();
				System.out.println("Great Lets Play !!");
				System.out.println("Your roles are: ");
				System.out.println("__________________");
				int role1 = (int)(Math.random() * 10)+1;
				int role2 = (int)(Math.random() * 10)+1;
				int role3 = (int)(Math.random() * 10)+1;
				System.out.println("| " + role1 + " | " + role2 + " | " + role3 + " |"); 
				System.out.println("__________________");
				if( role1 == role2 || role1 == role3 || role2 == role3){
					System.out.println("You have won ༼ つ ◕‿◕ ༽つ");
					money = (2*amount)+(money-amount);
					System.out.println("You now have $" + money);
				}
				else if( role1==role2 && role2==role3){
					System.out.println("You have one the Jackpot !!!");
					money = (2*amount)+(money-amount);
					System.out.println("You noe have $" + money);
				}
				else{
					System.out.println("You didnt win but... You can play again maybe if you dont have zero dollars "); 
					money = money-amount; 
					System.out.println("You still have $" + money +" remaining"); 
					if(money <=0){
						System.out.println("You are broke and have no money money");
						break;
					}
					
				}
			}
				 
			
			else if(choice.equals("n") || choice.equals("N") || choice.equals("no") || choice.equals("No")){
				System.out.println("Okay bye");
				break; 
			}
			
		}
		System.out.println("");

		
		
	}
}

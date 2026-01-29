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
		System.out.println("What is your name:  "); 
		String name = sc.nextLine();
		System.out.println("What is your title: ex. thunderspawn498");
		String title = sc.nextLine();
		System.out.println("Would you like to be a fragger or igl or support:");
		String choice = sc.nextLine();
		//
		if(choice.equals("fragger") || choice.equals("Fragger")){
			System.out.println();
			System.out.println("You have chosen Fragger; You will be the team's \nbest fighter, responsible for securing eliminations,\nwinning fights, and capitalizing on opponent mistakes,\noften by using superior mechanics, awareness, and \ncommunication");
			System.out.println();
			int money = 20;
			System.out.println();
			
			System.out.println("You have 20 skill points to spend in the following: Strength, Dexterity, Intelligence, and Charisma. Spend them wisely.");
			System.out.println("Strength (1-10): ");
			int strength = sc.nextInt();
			if(strength <10 && strength >= 0){
				money = money - strength;
				System.out.println("You have " + money + "Left over ");
			}
			else{
				System.out.println("That was not within the given range 😠 I wil give you one more try");
				System.out.println("Strength (1-10): ");
				strength = sc.nextInt();
				money = money - strength;
				System.out.println("You have " + money + " dollars Left over ");
			}
			
			
			System.out.println("Dexterity (1-10): ");
			int dexterity = sc.nextInt();

			if(dexterity <10 && dexterity >= 0){
				money = money - dexterity;
				System.out.println("You have " + money + "Left over ");
			}
			else{
				System.out.println("That was not within the given range 😠 I wil give you one more try");
				System.out.println("Strength (1-10): ");
				dexterity = sc.nextInt();
				money = money - dexterity;
				System.out.println("You have " + money + " dollars Left over ");
			}
			
			System.out.println("Intelligence (1-10): ");
			int intel = sc.nextInt();

			if(intel <10 && intel >= 0){
				money = money - intel;
				System.out.println("You have " + money + "Left over ");
			}
			else{
				System.out.println("That was not within the given range 😠 I wil give you one more try");
				System.out.println("Strength (1-10): ");
				intel = sc.nextInt();
				money = money - intel;
				System.out.println("You have " + money + " dollars Left over ");
			}
			
			System.out.println("Charisma (1-10): ");
			int chari = sc.nextInt();

			if(chari <10 && chari >= 0){
				money = money - chari;
				System.out.println("You have " + money + "Left over ");
			}
			else{
				System.out.println("That was not within the given range 😠 I wil give you one more try");
				System.out.println("Strength (1-10): ");
				chari = sc.nextInt();
				money = money - chari;
				System.out.println("You have " + money + " dollars Left over ");
			}
			System.out.println();
			System.out.println("------------------------------------------------");
			System.out.println("You are " +name+  " the " +title + " of cvhs");
			System.out.println("You are a " +choice+ " with the following stats");
			System.out.println("Strength: " + strength);
			System.out.println("Dexterity: " + dexterity);
			System.out.println("Strength: " + strength);
			System.out.println("Intelligence: " + intel);
			System.out.println("Charisma: " + chari);
		}
			/////////////////
			/////////////////////
			
			
		if(choice.equals("igl") || choice.equals("Igl")){
			System.out.println();
			System.out.println("You have chosen IGL; You will be making all/nthe key decisions for the team, including where to land, /nwhen to rotate to the next zone, when to fight, /nand overall game strategy");
			System.out.println();
			int money2 = 20;
			System.out.println();
			
			System.out.println("You have 20 skill points to spend in the following: Strength, Dexterity, Intelligence, and Charisma. Spend them wisely.");
			System.out.println("Strength (1-10): ");
			int strength2 = sc.nextInt();
			if(strength2 <10 && strength2 >= 0){
				money2 = money2 - strength2;
				System.out.println("You have " + money2 + "Left over ");
			}
			else{
				System.out.println("That was not within the given range 😠 I wil give you one more try");
				System.out.println("Strength (1-10): ");
				strength2 = sc.nextInt();
				money2 = money2 - strength2;
				System.out.println("You have " + money2 + " dollars Left over ");
			}
			
			
			System.out.println("Dexterity (1-10): ");
			int dexterity2 = sc.nextInt();

			if(dexterity2 <10 && dexterity2 >= 0){
				money2 = money2 - dexterity2;
				System.out.println("You have " + money2 + "Left over ");
			}
			else{
				System.out.println("That was not within the given range 😠 I wil give you one more try");
				System.out.println("Strength (1-10): ");
				dexterity2 = sc.nextInt();
				money2 = money2 - dexterity2;
				System.out.println("You have " + money2 + " dollars Left over ");
			}
			
			System.out.println("Intelligence (1-10): ");
			int intel2 = sc.nextInt();

			if(intel2 <10 && intel2 >= 0){
				money2 = money2 - intel2;
				System.out.println("You have " + money2 + "Left over ");
			}
			else{
				System.out.println("That was not within the given range 😠 I wil give you one more try");
				System.out.println("Strength (1-10): ");
				intel2 = sc.nextInt();
				money2 = money2 - intel2;
				System.out.println("You have " + money2 + " dollars Left over ");
			}
			
			System.out.println("Charisma (1-10): ");
			int chari2 = sc.nextInt();

			if(chari2 <10 && chari2 >= 0){
				money2 = money2 - chari2;
				System.out.println("You have " + money2 + "Left over ");
			}
			else{
				System.out.println("That was not within the given range 😠 I wil give you one more try");
				System.out.println("Strength (1-10): ");
				chari2 = sc.nextInt();
				money2 = money2 - chari2;
				System.out.println("You have " + money2 + " dollars Left over ");
			}
			System.out.println();
			System.out.println("------------------------------------------------");
			System.out.println("You are " +name+  " the " +title + " of cvhs");
			System.out.println("You are a " +choice+ " with the following stats");
			System.out.println("Strength: " + strength2);
			System.out.println("Dexterity: " + dexterity2);
			System.out.println("Strength: " + strength2);
			System.out.println("Intelligence: " + intel2);
			System.out.println("Charisma: " + chari2);	
		}
		
		
		//////////////////////
		////////////////////
		
		if(choice.equals("support") || choice.equals("Support")){
			System.out.println();
			System.out.println("You have chosen IGL; You will be making all/nthe key decisions for the team, including where to land, /nwhen to rotate to the next zone, when to fight, /nand overall game strategy");
			System.out.println();
			int money3 = 20;
			System.out.println();
			
			System.out.println("You have 20 skill points to spend in the following: Strength, Dexterity, Intelligence, and Charisma. Spend them wisely.");
			System.out.println("Strength (1-10): ");
			int strength3 = sc.nextInt();
			if(strength3 <10 && strength3 >= 0){
				money3 = money3 - strength3;
				System.out.println("You have " + money3 + "Left over ");
			}
			else{
				System.out.println("That was not within the given range 😠 I wil give you one more try");
				System.out.println("Strength (1-10): ");
				strength3 = sc.nextInt();
				money3 = money3 - strength3;
				System.out.println("You have " + money3 + " dollars Left over ");
			}
			
			
			System.out.println("Dexterity (1-10): ");
			int dexterity3 = sc.nextInt();

			if(dexterity3 <10 && dexterity3c >= 0){
				money3 = money3 - dexterity3;
				System.out.println("You have " + money3 + "Left over ");
			}
			else{
				System.out.println("That was not within the given range 😠 I wil give you one more try");
				System.out.println("Strength (1-10): ");
				dexterity3 = sc.nextInt();
				money3 = money3 - dexterity3;
				System.out.println("You have " + money3 + " dollars Left over ");
			}
			
			System.out.println("Intelligence (1-10): ");
			int intel3 = sc.nextInt();

			if(intel3 <10 && intel3 >= 0){
				money3 = money3 - intel3;
				System.out.println("You have " + money3 + "Left over ");
			}
			else{
				System.out.println("That was not within the given range 😠 I wil give you one more try");
				System.out.println("Strength (1-10): ");
				intel3 = sc.nextInt();
				money3 = money3 - intel3;
				System.out.println("You have " + money3 + " dollars Left over ");
			}
			
			System.out.println("Charisma (1-10): ");
			int chari3 = sc.nextInt();

			if(chari3 <10 && chari3 >= 0){
				money3 = money3 - chari3;
				System.out.println("You have " + money3 + "Left over ");
			}
			else{
				System.out.println("That was not within the given range 😠 I wil give you one more try");
				System.out.println("Strength (1-10): ");
				chari3= sc.nextInt();
				money3= money3 - chari3;
				System.out.println("You have " + money3 + " dollars Left over ");
			}
			System.out.println();
			System.out.println("------------------------------------------------");
			System.out.println("You are " +name+  " the " +title + " of cvhs");
			System.out.println("You are a " +choice+ " with the following stats");
			System.out.println("Strength: " + strength3);
			System.out.println("Dexterity: " + dexterity3);
			System.out.println("Strength: " + strength3);
			System.out.println("Intelligence: " + intel3);
			System.out.println("Charisma: " + chari3);	
		}
		
		
	
	}
}

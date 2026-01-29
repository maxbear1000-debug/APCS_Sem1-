/*
 *	Author:
 *  Date:
 * 	Collaborator:
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		System.out.println("The goal of the game is to guess a word with two hints! ");
		int y = (int)(Math.random() * 2)+0;
		if (y==1){
			System.out.println("THe frist hint is; it is an animal : ");
			String gues1 = sc.nextLine();
			if (gues1.equals("hippo") || gues1.equals("Hippo")){
				System.out.println("good guess, you are correct😥"); 
			}
			else{
				System.out.println("WRong🤣");
				System.out.println("Your next hint is that the animals is a mammal");
				String gues2 = sc.nextLine();
				if (gues2.equals("hippo") || gues2.equals("Hippo")){
					System.out.println("ok you got it right");
				}
				else{
					System.out.println("WORNNG !! 😅");
				}
			}
		}	
			
			
			
		if (y==2){
			System.out.println("THe frist hint is; it is a food : ");
			String gues10 = sc.nextLine();
			if (gues10.equals("hotdog") || gues10.equals("Hotdog")){
				System.out.println("good guess, you are correct😥"); 
			}
			else{
				System.out.println("WRong🤣");
				System.out.println("Your next hint is that the food is available at Costco");
				String gues20 = sc.nextLine();
				if (gues20.equals("hotdog") || gues20.equals("Hotdog")){
					System.out.println("ok you got it right");
				}
				else{
					System.out.println("WORNNG !! 😅");
				}
			}		
		}
		if (y==0){
			System.out.println("THe frist hint is; is it a videogame : ");
			String gues11 = sc.nextLine();
			if (gues11.equals("fortnite") || gues11.equals("FOrtnite")){
				System.out.println("good guess, you are correct😥"); 
			}
			else{
				System.out.println("WRong🤣");
				System.out.println("Your next hint is that the game has \nicon skins of youtrubers like sypher pk");
				String gues22 = sc.nextLine();
				if (gues22.equals("fortnite") || gues22.equals("Fortnite")){
					System.out.println("ok you got it right");
				}
				else{
					System.out.println("WORNNG !! 😅");
				}
			}		
		}
		
		
		
		
		
		
		
	}
}

/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.*;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Wizard[] x = new Wizard[100]; 
		Warrior[] y = new Warrior[100];
		for(int l = 0; l<100; l++){
			x[l] = new Wizard();
			y[l] = new Warrior();
		}
		int wizIndex = 0;
		int warIndex = 0; 
		while(warIndex < 100 && wizIndex < 100){
			Wizard wiz= x[wizIndex];
			Warrior war = y[warIndex];
			wiz.attack(war);
			if (war.isDead()){
				wizIndex++; 
			}
			if(wiz.isDead()){
				warIndex++; 
			}
			
			
			
		}
		if(warIndex>= 100){
			System.out.println("The warrirors won with" + (100-warIndex) + " left");
		}
		
		if(wizIndex>=100){
			System.out.println("The wizards won with " + (100-wizIndex) + " left");
		}
		else{
			System.out.println("Draw ");
		}
		
		
		
		
	}
}

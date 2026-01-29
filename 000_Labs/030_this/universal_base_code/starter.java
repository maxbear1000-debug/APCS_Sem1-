/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static String randName(){
		int rand = (int)(Math.random()*7);
		switch(rand){
			case 0: return "Dopey"; 
			case 1: return "Bashful";
			case 2: return "Grumpy";
			case 3: return "Sleepy";
			case 4: return "Sneezy";
			case 5: return "Happy";
			case 6: return "Doc";
            default: return "Happy";
		}
	}

	public static void main(String args[]) {
		// Your code goes below here
		int age = (int)(Math.random()*67)+41;
		String name1 = randName();
		String name = randName();

		
		
		PooleDwarf test = new PooleDwarf(name1,age);
		PooleDwarf test2 = new PooleDwarf(name,age);
		PooleDwarf test3 = new PooleDwarf(name,age);
		PooleDwarf test4 = new PooleDwarf(name,age);
		PooleDwarf test5 = new PooleDwarf(name,age);
		PooleDwarf test6 = new PooleDwarf(name,age);
		PooleDwarf test7 = new PooleDwarf(name,age);

		
		int count = 0;
		
		if(test2.isSameName(name1)){
			count++;
		}
		if(test3.isSameName(name1)){
			count++;
		}
		if(test4.isSameName(name1)){
			count++;
		}
		if(test5.isSameName(name1)){
			count++;
		}
		if(test6.isSameName(name1)){
			count++;
		}
		if(test7.isSameName(name1)){
			count++;
		}
		
		if(count>0){
			System.out.println(" found" + count+ " times" + name1);
			
			
		}
		else{
			System.out.println("no duplications");
		}
		
		
	}
}

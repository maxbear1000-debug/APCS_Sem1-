/*
 *	Author:
 *  Date:
 * 	Collaborator(s): 
*/

import java.util.*;

class starter {
	public static void main(String args[]) {
		System.out.println("_____________________________________");
		System.out.println("These are 20 numbers");
		int [] arr = new int[20];
		for (int p = 0; p < arr.length; i++){
			arr[p] = (int)((Math.random()*10)+1);
			System.out.println(arr[p]);
		}
		System.out.println("_____________________________________");
		int dupes = 0;
		int rand = (int)((Math.random()*10)+1);
		System.out.println("The random number to poolk for its"+ rand);
		for(int k = 0; k <arr.length; k++){
			if(arr[k]==rand){
				System.out.println("Splicateion found in index"+k);
				dupes++;
			}
		}
		System.out.println("Total number of duplicate for" + rand+ "is " + dupes); 
		System.out.println("_____________________________________");
		System.out.println("Looking for two in a row: ");
		for (int l = 0; l<arr.length; l++){
			if(arr[l]==arr[l+1]){
				System.out.println("Two in a row found in indexes" +l + "and " + (l+1) + "The number i s" + arr[l]);
				
			}
			
			
			
		}
		
		
		
	}
}

/*
 *	Author:  
 *  Date: 
*/

import java.util.*;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		/*
			Create a program that creates a crossword puzzle hiding 1 word given by the user!

			1. Take a word from the user
			2. Create a 2D String array with a size of 5 larger than the word size in both directions
			3. Choose what direction the word should hide in
				- Vertical, Horizontal, Diagonal
				- EXTRA: Choose if the word should hide forward or backwards
			4. For each letter in the word, hide it into a spot in the 2D array
				- This spot should be chosen randomly within the bounds of the 2D array
			5. Once the word is stored in the array, fill up the rest of the array
				- Note what value is stored in the String array and replacing non-filled values with random letters
				- Given the letters array, choose a random letter to populate it with
			6. Print out the crossword puzzle!
			7. Ask a friend to find the word!
		*/

		String[] letters = {
            "a","b","c","d","e","f","g","h","i","j",
            "k","l","m","n","o","p","q","r","s","t",
            "u","v","w","x","y","z"
        };
		
		
		System.out.println( "Give me a word please :)  : ");
		String word = sc.nextLine();
		int size = word.length();
		String[][] map = new String[size+6][size+6];
        int randomvalue = (int)(Math.random()*3);
        
		int row = (int)(Math.random()*(size - word.length()));
		int col = (int)(Math.random()*(size - word.length()));
		
		for (int i = 0; i < word.length(); i++) {
			if (randomvalue == 0) { // flatttttt
				map[row][col + i] = word.substring(i, i + 1);
			}
			else if (randomvalue == 1) { // point down 
				map[row + i][col] = word.substring(i, i + 1);
			}
			else { // fdiagonal
				map[row + i][col + i] = word.substring(i, i + 1);
			}
		}
        
		// basically just fillws the grid with nuthig
		for (int r = 0; r < map.length; r++) {
			for (int c = 0; c < map.length; c++) {
				if (map[r][c] == null) {
				    map[r][c] = letters[(int)(Math.random()*letters.length)];
				}
			}
		}
		
		
		for(String[] roow:map){
			
			for(String letter:roow){
				System.out.print(letter + " ");
			}
			System.out.println();
		}
        
	
	}
}



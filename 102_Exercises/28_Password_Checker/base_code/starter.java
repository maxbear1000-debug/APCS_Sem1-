import java.util.*;
import java.io.*;

class starter {
	public static void main(String args[]) throws Exception {
		//Creating File instance to reference text file in Java
        File text = new File("./passwords.txt");			// This file must be in the same folder as your java/class files.
     
        //Creating Scanner instance to read File in Java
        Scanner numLines = new Scanner(text);			// Scanner for counting number of lines
        Scanner sc = new Scanner(text);					// New Scanner for taking in the lines.
     
	 	// Count number of lines in text file.
		int count = 0; 
        while(numLines.hasNextLine()){		//Checks if there's a nextLine, breaks if none found.
			numLines.nextLine();
            count++;
        }  
		
		String [] passwords = new String[count];		// This is the array you will be using.

        //Reading each line of the file using Scanner class
		int i = 0;
        while(sc.hasNextLine()){		//Checks if there's a nextLine, breaks if none found.
            String line = sc.nextLine();
            passwords[i] = line;
			i++;
        }  

		/* ----------------------------------------------------------------------------------------- */
		// Start here, use the array passwords
		int one = 0;
		int two = 0;
		int three = 0; 
	    int four = 0;
        for (int p = 0 ; p < passwords.length; p++) {
            boolean one1 = false;
		    boolean two2 = false;
            if(passwords[p].length() >= 8){
                one += 1;
                one1 =true;
   
            }
            if(passwords[p].contains("!") || passwords[p].contains("@") || passwords[p].contains("#") || passwords[p].contains("$") || passwords[p].contains("%")|| passwords[p].contains("^")|| passwords[p].contains("&") || passwords[p].contains("*") || passwords[p].contains("+") ){
                two += 1;
                two2 = true; 
            }
            
            if(one1 == true && two2 == true){
                three +=1; 
                
                
            }
            if(one1 == false && two2 == false){
                four+=1; 
            }
            
        }
        System.out.println("There are " + one + " passwords with a strength levelo of 1 with 8 characters");
        System.out.println("There are " + (two-three) + " passwords with a strength 2 with a special symbol.");
        System.out.println("There are " + three + " passwords with a strength 3 wiht both"); 
		System.out.println(" there are " + four);
	}
}

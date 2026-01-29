/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("give my a word or snetnce in lowercase ..... or else.... ");
        String fart = sc.nextLine();

        String finish = "";
        int zero = 0;

        for (int x = 0; x < fart.length(); x++) {
            String whatiotisrn = fart.substring(x, x + 1);

            if (whatiotisrn.equals(" ")) {
                finish += " ";
                zero = 0; 
            } 
            else {
                if (zero % 2 == 0) {
                    finish += whatiotisrn.toLowerCase();
                } 
                
                else {
                    finish += whatiotisrn.toUpperCase();
                }
                zero++;
            }
        }

        System.out.println(finish);
    }
}
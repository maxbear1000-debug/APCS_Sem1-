/*
 *	Author: Max Perez
 *  Date: October 11
 *	Collaborator(s): N/A
*/

import pkg.*;
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// Your code goes be  blow here
		Scanner sc = new Scanner(System.in);

		
		String encrypted = "6v lvp u5vuy5 y1z5 qpsqy5r";
		String decrypted = Cipher.encode(encrypted);
		System.out.println(decrypted);
		
		String encrypted2 = "sv8vq17r 1r q25 85rq";
		String decrypted2 = Cipher.encode(encrypted2);
		System.out.println(decrypted2);
		
		String encrypted3 = "q25 z5l qv wpx85s f 1r gg";
		String decrypted3 = Cipher.encode(encrypted3);
		System.out.println(decrypted3);
		
		String encrypted4 = "z8r8v 6yzzc 64r8 oys sx z8r8v 6y4z6 ty 18t oys 9yqz";
		String decrypted4 = Cipher.keyedEncode(encrypted4,33);
		System.out.println(decrypted4);
		
		String encrypted5 = "29y4 v4 v2q9w1r 05sr5l wpx85s 1r z5l qv d";
		String decrypted5 = Cipher.encode(encrypted5);
		System.out.println(decrypted5);
		
		String encrypted6 = "a8 1oy 92 1kx rxdj in 4";
		String decrypted6 = Cipher.keyedEncode(encrypted6,8);
		System.out.println(decrypted6);
		
		String encrypted7 = "12xgx2cy g3d e98e6c3 gzc 4s bgv2z8xc vgz8gf5c 3g4cy";
		String decrypted7 = Cipher.keyedEncode(encrypted7,29);
		System.out.println(decrypted7);
		
		String encrypted8 = "lvpo5 rp775rr4pyyl 7vxuy5q56 q25 41srq r57q1vw";
		String decrypted8 = Cipher.encode(encrypted8);
		System.out.println(decrypted8);
		
		String encrypted9 = "u4y i1e i5 i6ita5c 314c1i66e1 i5f by6i5 hea5c zbi58 u4y";
		String decrypted9 = Cipher.keyedEncode(encrypted9,27);
		System.out.println(decrypted9);
		
		String encrypted10 = "amlb mfhp7fcj jlgq fo tap s9a bjlslql aflipa lb hlg9b 210z t9ct";
		String decrypted10 = Cipher.keyedEncode(encrypted10,21);
		System.out.println(decrypted10);
		
		System.out.println("What is your sentence");
		String sent1 = sc.nextLine();
		String sent2 = Cipher.keyedEncode(sent1, 34);
		System.out.println("Your new cipher is " + sent2);
		
		System.out.println("");

		System.out.println("Your cipher yo need to solve is:  ");
		System.out.println(Cipher.keyedEncode("i like burgers", 32));

		
	}
}

/*
   * Author:
   * Date:
   * Collaborator(s):
*/
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Tell me a phrase ....");
		String h = sc.nextLine();
		String biran  = " ";
		boolean fart = false; 

		while(h.indexOf(" ") != - 1){
			int space = h.indexOf(" ");
			String Stringword = h.substring(0, space);
			if(Stringword.substring(0,1).equals("a") || Stringword.substring(0,1).equals("e") || Stringword.substring(0,1).equals("i") || Stringword.substring(0,1).equals("o") || Stringword.substring(0,1).equals("u")){
				Stringword = Stringword + "way";
			}
			
			
			
			if(!(Stringword.substring(0,1).equals("a") || Stringword.substring(0,1).equals("e") || Stringword.substring(0,1).equals("i") || Stringword.substring(0,1).equals("o") || Stringword.substring(0,1).equals("u"))){
				Stringword = Stringword.substring(1) + Stringword.substring(0,1) + "ay"; 
				fart = true;
			}
			
			if(fart == true){
				if(Stringword.substring(0,1).equals("a") || Stringword.substring(0,1).equals("e") || Stringword.substring(0,1).equals("i") || Stringword.substring(0,1).equals("o") || Stringword.substring(0,1).equals("u")){
					Stringword = Stringword.substring(2) + Stringword.substring(0,2) + "ay"; 
				}
			}
			
			
			
			h = h.substring(space+1);
			biran = biran +" " + Stringword;
		}
		
		
		
		
		
		
		if(h.substring(0,1).equals("a") || h.substring(0,1).equals("e") || h.substring(0,1).equals("i") || h.substring(0,1).equals("o") || h.substring(0,1).equals("u")){
				h = h + "way";
			}
			else{
				h = h.substring(1) + h.substring(0,1) + "ay"; 
			}
		
		
		System.out.println(biran + " "+ h);
		
		
	}
}

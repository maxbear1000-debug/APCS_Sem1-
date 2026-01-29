/*
    Lecture note example - Input!!
*/
import java.util.Scanner;

class LectureInput{
    public static void main(String args[]) {
        // Your Code Goes here!
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Java Cafe");
        System.out.println("Here is our menu: ");
        
        double item1Price = 2.50;
        double item2Price = 3.40;
        double item3Price = 23.40; 
        System.out.println("1. coconut water $" + item1Price);
        System.out.println("2. soda  $" + item2Price);
        System.out.println("3. lemonade $" + item3Price);
        
        
        System.out.println(" What is your name for the order");
        String name = sc.nextLine();
        
        System.out.println(" how much coconute water do you want");
        int quantity1 = sc.nextInt();

        System.out.println(" how much soda  do you want");
        int quantity2 = sc.nextInt();
        
        System.out.println(" how much lemonade  do you want");
        int quantity3 = sc.nextInt();
        
        
        double total1 = item1Price * quantity1;         
        double total2 = item2Price * quantity2; 
        double total3 = item3Price * quantity3; 
        double currentTotal = total1+total2 +total3;
        
        System.out.println(" Your current total is 👀 $" + currentTotal);
        System.out.println(" What percent do you want to tip");
        double tipPercent = sc.nextDouble();
        
        double tip = currentTotal * (tipPercent/100); 
        double grandtotal = currentTotal + tip; 
        
        System.out.println("----------------------------------------------------");
        System.out.println(name + "'s reciept");
        System.out.println(quantity1 + "* cocounet water is $" + total1);
        System.out.println(quantity2 + "* soda is $" + total2);
        System.out.println(quantity3 + "* lemonade  is $" + total3);
        System.out.println( "Tip" + "(" + tipPercent + ") = " + tip );
        System.out.println("Grand Total = $" + grandtotal);
        System.out.println("----------------------------------------------------");



	}
}

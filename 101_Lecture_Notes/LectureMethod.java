/* 
    Lecture note example - Methods
*/
import java.util.Scanner;
class LectureMethod{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Number1: ");
        int num1 = sc.nextInt();
        System.out.println("Number2: ");
        int num2 = sc.nextInt();
        int s = superultimatemethod(num1);
        System.out.println(num1+ " sqaured is equal too ................"+ s);
        int m = absvlu(num1);
        int poop = absvlu(num2);
        System.out.println(m +"    "+ poop);

    }
    
    public static int superultimatemethod(int a){
        int answer = a*a;
        return answer;
        
    }
    public static int absvlu(int a){
        if(a<0){
            return a*(-1);
        }
        else{
            return a;
        }
        
    }
    
}
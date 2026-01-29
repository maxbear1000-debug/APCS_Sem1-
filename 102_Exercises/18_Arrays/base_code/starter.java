/*
 *	Author:
 *  Date:
*/
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		  int[] array1 = new int[1001];
        int[] array2 = new int[1001];

        int i = 0;
        while (i < array1.length) {
            array1[i] = 3 * (i + 1);
            i++;
        }

        int j = 0;
        while (j < array2.length) {
            array2[j] = 1000 - j;
            j++;
        }

        System.out.println("Array 1 Values:");
        int k = 0;
        while (k < array1.length) {
            System.out.println("Index " + k + " Value " + array1[k]);
            k++;
        }

        System.out.println("\nArray 2 Values:");
        int m = 0;
        while (m < array2.length) {
            System.out.println("Index " + m + " Value " + array2[m]);
            m++;
        }	 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
	}
}

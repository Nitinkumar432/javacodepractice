package javaclass;

import java.util.Scanner;

public class farray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.print("Enter the number of elements in the array: ");
        int n = s.nextInt();
        int[] arr = new int[n];
        
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
    
// 1 6 0001 0110
// 2 5 0010 0101
// 3 4 0011 0100 
        int res = 0;
        for (int i = 0; i < n; i++) {
            res = res ^ arr[i];
        }
        
        System.out.println("Result of XORing all elements: " + res);

        s.close();
    }
}

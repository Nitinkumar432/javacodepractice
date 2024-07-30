package javaclass;

import java.util.Scanner;

public class decrementanumberby1 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int n = s.nextInt();
        
        // Decrement the number by 1 using bit manipulation
        int k = n & ~1;;
        
        System.out.println("Decremented number: " + k);
    }
}

package javaclass;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class CancelOutPairs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        
        Set<Integer> set = new HashSet<>();
        
        for (int num : arr) {
            if (set.contains(num)) {
                set.remove(num); 
            } else {
                set.add(num); 
            }
        }
        

        System.out.println("Numbers that do not have pairs:");
        for (int num : set) {
            System.out.println(num);
        }
        System.out.println(8 ^101);
        //20 - 
        

        scanner.close();
    }
    
  
}

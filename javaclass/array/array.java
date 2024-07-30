package javaclass.array;
import java.util.*;


public class array {
    public static void main(String[] args) {
        int[] arr=new int[5];
        Arrays.fill(arr,2,4,-1);
        String[] sr=new String[10];
        Arrays.fill(sr,"nitin");
        System.out.println(Arrays.toString(sr));
        for(int i : arr){
            System.out.println(i);
        }
    }
    
    
}

package javaclass;
import java.util.*;
public class reversebits {
    public static void main(String[] args) {
        Scanner scnr=new Scanner(System.in);
        System.out.println("enter x:");
        int x=scnr.nextInt();
        int b=0;
        while (x!=0){
            b|=( x &1);
            x>>=1;
            b<<=1;
        }
        System.out.println(b);
    }
}
    


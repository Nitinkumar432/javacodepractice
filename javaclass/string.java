package javaclass;
import java.util.*;
public class string {
    public static void main(String[] args) {
        String st1=new  String("hello");
        String st2=new  String("hello");
        if(st1==st2){
            System.out.println("same");
        }else{
            System.out.println("not same");
        }
        for(int i=0;i<st1.length();i++){
            System.err.println(st1.charAt(i));


        }
        System.err.println(st1.substring(1,st1.length()-1));
        String m="hello";
        m.concat("world");
        System.err.println(m);
        
        
        
    }//ans is not same bcoz they are not comparing value it comparing object;
    
    
}

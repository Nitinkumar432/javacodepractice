package javaclass.array;
import java.util.*;
public class duplicatearr {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int[] arr={1,1,2,2,3,3,5};
        for(int i=1;i<arr.length;i++){
            if(arr[i]==arr[i-1]){
                arr[i-1]=arr[i];
                arr[i]=-1;
            }

        }
        for(int i: arr){
            if(i!=-1){
                System.out.println(i);
            }
        }




        
    }
    
}

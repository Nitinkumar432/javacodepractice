package javaclass.array;
import java.util.*;
public class rotata {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7};
        int d=arr.length;
        int k=2;
        int[] temp=new int[d];
        for(int i=0;i<d;i++){
            temp[(i+d-k)%d]=arr[i];
        }
        // for(int i=0;i<k;i++){
        //     temp[i]=arr[i];
        // }
        // int s=0;
        // for(int i=k;i<d;i++ ){
        //     arr[i-d]=arr[i];
        // }
        // s=0;
        // for(int i=d-k;i<d;i++){
        //     arr[i]=temp[s++];
        // }

       
        System.out.println(Arrays.toString(temp));

    }
    
}

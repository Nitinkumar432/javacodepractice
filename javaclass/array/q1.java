package javaclass.array;
import java.util.*;
public class q1 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int[] arr=new int[10];
        int[] temp=new int[10];
        
        Arrays.fill(temp,-1);
        for(int i=0;i<10;i++){
            arr[i]=s.nextInt();

        }
        int si=0;
        int x;
        
        for(int i : arr){
            if(i%2==0){
                temp[si++]=i;
            }
        }
        x=si;
    
        Arrays.sort(temp,0,si);
        Arrays.sort(temp,si,x+1);
        for(int i : arr){
            if(i%2!=0){
                temp[x++]=i;
            }
        }
        System.out.println(Arrays.toString(temp));
        s.close();


    }
    
}

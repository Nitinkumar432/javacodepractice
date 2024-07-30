package javaclass.Arraylist;
import java.util.*;
public class implementation {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        ArrayList<Integer>list=new ArrayList<>();
        int n=s.nextInt();
        for(int i=0;i<n;i++){
            list.add(s.nextInt());
        }
        Collections.sort(list);
        for(int i : list){
            System.out.print(i+" ");
        }
        // System.out.println(list );
        

        // System.out.println(list);

    }
    
}

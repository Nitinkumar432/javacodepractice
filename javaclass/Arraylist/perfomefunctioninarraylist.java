package javaclass.Arraylist;
import java.util.*;

public class perfomefunctioninarraylist {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        ArrayList<Integer>list=new ArrayList<>();
        int n=s.nextInt();
        for(int i=0;i<n;i++){
            list.add(s.nextInt());
        }
        //soert arraylist ArrayList<Integer>list=new ArrayList<>();
        Collections.sort(list);
        for(int i : list){
            System.out.print(i+" ");
        }
        //perfome all function like remove(by index by value) and display element llike remove add display
        System.out.println();
        System.out.println("enter index to remove");
        int index=s.nextInt();
        //removing value by index
        list.remove(index);
        for(int i : list){
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("enter value to remove");
        int value=s.nextInt();
        //removing element by value
        list.remove(Integer.valueOf(value));
        for(int i : list){
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("enter value to add");
        int addvalue=s.nextInt();
        // element to add in Array List
        list.add(addvalue);
        for(int i : list){
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("enter index to add");
        // add element with prooper by thier index
        int addindex=s.nextInt();
        list.add(addindex,addvalue);
        for(int i : list){
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("enter index to display");
        int displayindex=s.nextInt();
        System.out.println(list.get(displayindex));
        
        
   
        // System.out.println(list);
        

        // System.out.println(list);

    }
    
}



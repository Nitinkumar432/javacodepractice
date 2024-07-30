package javaclass;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class listsort {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        List<int> list = new ArrayList<>();
        
      for(int i=0;i<n;i++){

      }
        
        while (true) {
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("exit")) {
                break;
            }
            list.add(input);
        }
        
        System.out.println("You have entered the following strings:");
        for (String str : list) {
            System.out.println(str);
        }
        
        scanner.close();
    }
}

    
}

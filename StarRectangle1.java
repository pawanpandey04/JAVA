package Pattern_printing;

import java.util.Scanner;

public class StarRectangle1 {
       public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int column = sc.nextInt();
        for(int i=1;i<=rows;i++){          // kitna line print higa
            for(int j=1;j<=column;j++){       //har line m kitna print hoga
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    
}
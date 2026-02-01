package if_else;

import java.util.Scanner;

public class AbsoluteValue {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("a number : ");
        int a = sc.nextInt();
        if(a>0){                              // if(a<0) a = -a
            System.out.println(a);
        }
        else System.out.println(-a);

    }
}
package if_else;

import java.util.Scanner;

public class IntegerOrNot {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number : ");
        double a = sc.nextDouble();
        //int x = (int)a;
        //if(a-x == 0)
        if(a-(int)a == 0) System.out.println("integer number");
        else System.out.println("not integer number");
    }
}

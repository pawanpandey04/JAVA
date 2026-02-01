package if_else;

import java.util.Scanner;

public class FourDigitNumberOrNot {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number : ");
        int a = sc.nextInt();
        if(a>999 && a<10000){
            System.out.println("It is four digit number");
        }
        else System.out.println("It is not four digit number");

    }
}
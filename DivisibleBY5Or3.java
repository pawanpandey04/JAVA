package if_else;

// Take a positive intege input and tell if it is divisible by 5 or 3.

import java.util.Scanner;

public class DivisibleBY5Or3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        int n = sc.nextInt();
        if(n%3==0 || n%5==0){
            System.out.println("it is divisible by 5 or 3");
        }
        else System.out.println("it is not divisible by 5 or 3");
    }
}

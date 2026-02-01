package if_else;

// Take 3 positive integers input and print the greatest of them.

import java.util.Scanner;

public class GreatestOfPrintInput {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number : ");
        int a = sc.nextInt();
        System.out.println("Enter 2nd number : ");
        int b = sc.nextInt();
        System.out.println("Enter 3rd number : ");
        int c = sc.nextInt();
        if(a>b && a>c){
            System.out.println("A is greatest number ");
        }
        else if (b>a && b>c){
            System.out.println(" B is greatest number");
        }
        else System.out.println("C is greatest number");
    }
}
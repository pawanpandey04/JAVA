package if_else;

// Take 3 positive integers input and tell if they can be the sides of a triangle or not

import java.util.Scanner;

public class sideOfTriangle {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 1st side : ");
        int a = sc.nextInt();
        System.out.println("enter 2nd side : ");
        int b = sc.nextInt();
        System.out.println("enter 3rd side : ");
        int c = sc.nextInt();
        if(a+b>c && b+c>a && c+a>b){
            System.out.println("This is a side of triangle ");
        }
        else System.out.println("this is not a sides of triangle ");
    }
}
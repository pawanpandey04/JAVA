package basic_java;

import java.util.Scanner;

public class Percentege {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter p number : ");
        double p = sc.nextInt();
        System.out.println("enter r number : ");
        double r = sc.nextInt();
        System.out.println("enter t number : ");
        double t = sc.nextInt();
        double si = p*r*t/100.0;
        System.out.println(si);
    }
}

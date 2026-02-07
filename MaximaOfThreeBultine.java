package Methods;

// Find the maximam of three number

import java.util.Scanner;

public class MaximaOfThreeBultine {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println(Math.max(Math.max(a,b),c));
        sc.close();
    }
    
}
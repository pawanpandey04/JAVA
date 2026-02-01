package if_else;

import java.util.Scanner;

public class TernaryInVariavle {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter nuber : ");
        int n = sc.nextInt();
//        int pawan ;
//        if(n>=0) pawan = 100;
//        else pawan = 0;
        int pawan = (n >= 0) ? 100 : 0;
        System.out.println(pawan);
    }
}
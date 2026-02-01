package if_else;

//  If cost of price and sellling price of an iteam is input through the keyboard. Write a program to determine
//  wheather the seller has made profit or incurred loss or no profit no loss. Also determine how much pr0fit
//  HE made or loss he incurred

import java.util.Scanner;

public class CpSp {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter cp number : ");
        int cp = sc.nextInt();
        System.out.println("Enter sp number : ");
        int sp = sc.nextInt();
        if(sp>cp){
            System.out.println("profit is " +(sp-cp));
        }
        else if(sp == cp) {
            System.out.println("no profit no loss " +(sp-cp));
        }
        else System.out.println("loss " +(cp-sp));
    }
}
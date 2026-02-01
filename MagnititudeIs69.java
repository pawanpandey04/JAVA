package if_else;

//  Take integer input and tell if its magnitude is smaller than 69 or not.


import java.util.Scanner;

public class MagnititudeIs69 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter numbeer : ");
        int n = sc.nextInt();
        if(n<0){
            System.out.println(-n);
        }
        else System.out.println(n);
    }
}
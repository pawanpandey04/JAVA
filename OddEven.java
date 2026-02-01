package if_else;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number : ");
        int n = sc.nextInt();
        if(n%2 == 0) {
            System.out.println("even number"); // kitna hu output ikh skte h line by line
        }
        else{
            System.out.println("odd number");
        }
    }
}
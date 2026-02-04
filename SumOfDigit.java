package loops;

// Print sum of digits of a number.

import java.util.Scanner;

public class SumOfDigit {
    public static void main(String[] ags){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter numer : ");
        int n = sc.nextInt();
        int sum = 0;
        while(n!= 0){
            sum += (n%10);
            n/= 10;
        }
        System.out.println((sum>0) ? sum : -sum);

        sc.close();
    }
    
}
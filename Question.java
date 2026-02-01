package if_else;

// Take a positive integer input and print:
// ____ if number is divisible by 5 (____ = riya)
// _____ if number is divisible by 3 (___ = Pawan)
// _____ if number is divisible by 5 & 3 both (___ = harshit)
// _____ if number is not divisible by 5 or 3  (___ = harsh)

import java.util.Scanner;

public class Question {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        int n = sc.nextInt();
        if (n%5 == 0 && n%3 ==0){
            System.out.println("harshit");
        }

        else if (n%3 == 0){
            System.out.println("Pawan");
        }
        else if (n%5 == 0){
            System.out.println("Riya");
        }
        else System.out.println("harsh");
    }
}
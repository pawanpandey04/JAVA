package loops;

import java.util.Scanner;

// 1
// n
// 2
// n-1
// 3
// .....
public class NSequenceInQuestion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        System.out.println("The sequence is : ");
        int i=1;
        int j =n;
        while(i<=j){
            System.out.print(i);
            if(i!=j){
                System.out.print(", "+j);
            }
            if(i<j-1){
                System.out.print(", ");
            }
            i++;
            j++;
        }
    }
    
}
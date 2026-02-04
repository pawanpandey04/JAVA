package loops;

//Display this ap - 2,5,8,11...... upto 'n'.

import java.util.Scanner;

public class Ap2ToNNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter numbeer : ");
        int n = sc.nextInt();
        for(int i=2;i<=3*n-1;i=i+3){
            System.out.print(i+" ");;
        }
    }
    
}
package loops;
// print this series - 99,95,91,87....upto all term which are positive

import java.util.Scanner;

public class Ap99ToPositiveNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int n = sc.nextInt();
        for(int i=99;i>0;i=i-4){
            System.out.print(i+" ");
        }
    }
    
}

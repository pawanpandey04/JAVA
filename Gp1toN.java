package loops;

import java.util.Scanner;

// Display this gp - 1,2,4,8..... upto 'n' terms.

public class Gp1toN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 1;
        for(int i=1;i<=n;i++){
            System.out.print(a+" ");
            a=a*2;
        }
    }
    
}

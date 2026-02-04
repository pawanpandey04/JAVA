
package loops;

import java.util.Scanner;

public class CompositeNumber {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter number : ");
        int n = sc.nextInt();
        boolean flag = true;
        for(int i=2;i<=n-1;i++){
            if(n%i == 0){
                flag = false;
                break;
            }
            }
            if(n==1) System.out.println("Neither prime nor composite");
            else if(flag == false) System.out.println("composite Number");
            else System.out.println("Prime number ");
        }
    }
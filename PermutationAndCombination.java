package Methods;

import java.util.Scanner;

// import java.util.Scanner;

// // Take 'n' and 'r' as input and print nCr and nPr
// // nCr = n!/r!(n-r!)

// public class PermutationAndCombination {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int r = sc.nextInt();

//          int nfact = 1;
//         for(int i=1; i<=n; i++){
//             nfact *= i;
//         }
//         int rfact = 1;
//         for(int i=1; i<=r; i++){
//             rfact *= i;
//         }
//         int nrfact = 1;
//          for(int i=1; i<=n-r; i++){
//              nrfact *=i;
//          }
//          int ncr = nfact/(rfact*nrfact);
//          System.out.println(ncr);
//          sc.close();
//     }
    
// }



public class PermutationAndCombination{
    public static int fact(int x){
        int f =1;
        for(int i=1;i<=x;i++){
            f *= i;
        }
        return f;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        int ncr = fact(n)/(fact(r)*fact(n-r));
        int npr = fact(n)/fact(n-r);
        System.out.println(ncr+" "+npr);
        sc.close();
    }
}
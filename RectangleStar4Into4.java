package Pattern_printing;

import java.util.Scanner;

public class RectangleStar4Into4 {
//      public static void main(String[] args) {
//         for(int i=1;i<=4;i++){
//             for(int j=1;j<=4;j++){
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//     }
// }


public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    for(int i =1; i<=n; i++){
        for(int j=1; j<=n; j++){
            System.out.print("* ");
        }
        System.out.println();
      }
   }
}
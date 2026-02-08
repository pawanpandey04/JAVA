package Pattern_printing;

// public class UltaNumberTriangle {
//     public static void main(String[] args) {
//         for(int i=1;i<=5;i++){
//             for (int j=1;j<=5+1-i;j++){
//                 System.out.print(j+" ");
//             }
//             System.out.println();
//         }
//     }
    
// }





public class UltaNumberTriangle {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            for(int j=i;j<=5;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
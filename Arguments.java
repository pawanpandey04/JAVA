package Methods;

// public class Arguments {
//     public static void sum(int a, int b, int c){
//         System.out.println(a+b);
//     }
//     public static void main(String[] args) {
//          sum(5, 8,4);              // Arguments
//          sum(5,9,-3);
//     }
    
// }



public class Arguments {
    public static void max(int a,int b,int c){
        if(a>=b && a>=c) System.out.println(a);
        else if(b>=a && b>=c) System.out.println(b);
        else System.out.println(c);
    }
    public static void main(String[] args) {
        max(45,34,40);
    }
}
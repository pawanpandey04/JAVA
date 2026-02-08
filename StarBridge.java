package Pattern_printing;

public class StarBridge {
    public static void main(String[] args){
        for(int l=1;l<=2*5-1;l++){
            System.out.print("* ");
        }
        System.out.println();
      int nsp=1;
      for(int i=1;i<=5-1;i++){
        for(int j=1;j<=5-i;j++){
            System.out.print("*"+" ");
        }
        for(int k=1;k<=nsp;k++){
            System.out.print(" "+" ");
        }
        for(int m=1;m<=5-i;m++){
            System.out.print("*"+" ");
        }
        nsp +=2;
        System.out.println();
      }
    }
    
}
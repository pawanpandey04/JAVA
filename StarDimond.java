package Pattern_printing;


public class StarDimond {
    public static void main(String[] args) {
        int nsp=5-1, nst =1;
        for(int i=1;i<=5;i++){
            for(int j=1;j<=nsp;j++){
                System.out.print(" "+" ");
            }
            for(int k=1;k<=nst;k++){
                System.out.print("*"+" ");
            }
            nsp--;
            nst +=2;
            System.out.println();
        }
        nsp =1;
        nst =2*5-3;
        for(int i=1;i<=5-1;i++){
            for(int j=1;j<=nsp;j++){
                System.out.print(" "+" ");
            }
            for(int k=1;k<=nst;k++){
                System.out.print("*"+" ");
            }
            nsp++;
            nst -=2;
            System.out.println();
        }
    }
}
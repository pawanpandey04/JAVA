package Pattern_printing;

public class RhombusStar {
    public static void main(String[] args) {
        for(int i=1;i<=4;i++){
            for(int j=1;j<=4-i;j++){
                if((i+j)%2==0) System.out.print("  ");
            }
            for(int k=1;k<=4;k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    
}
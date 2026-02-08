package Pattern_printing;

public class Hw {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                if(i==j) System.out.print("  ");
            }
            for(int k=1;k<=5;k++){
                if((i+k)==6) System.out.print("* "); 
            }
            System.out.println();
        }
    }
    
}
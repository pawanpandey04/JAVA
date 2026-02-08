package Pattern_printing;

public class AlphabetUltaTriangle {
    public static void main(String[] args) {
        for(int i=1;i<=4;i++){
            for(int j=1;j<=4+1-i;j++){
                System.out.print((char)(j+96)+" ");
            }
            System.out.println();
        }
    }
    
}
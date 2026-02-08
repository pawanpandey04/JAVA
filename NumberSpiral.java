package Pattern_printing;

public class NumberSpiral {
    public static void main(String[]args){
        for(int i=1;i<=2*7-1;i++){
            for(int j=1;j<=2*7-1;j++){
                int a = i, b=j;
                if(i>7) a=2*7-i;
                if(j>7) b=2*7-j;
                System.out.print(Math.min(a,b)+" ");
                // System.out.print(Math.min(i,j)+" ");
                //         OR
                // if(i<j) System.out.print(i+" ");
                // else System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    
}
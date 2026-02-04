package loops;

//  Printf 1 to 100 even number.

import java.util.Scanner;

public class OneTo100EvenNumber {
    public static void main(String[] args) {
            for(int i=1;i<=100;i++){
                if(i%2 == 0){
                    System.out.print(i+" ");
                }
            }
    }
}
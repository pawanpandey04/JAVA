package loops;

public class EvenNumber1To100 {
    public static void main(String[] args) {
        for(int i=1;i<=100;i++){
            if(i%2 == 0) continue; // skip thisbittration
            System.out.print(i + " ");
        }
    }
    
}
package loops;

// Print all alphabets withtheir corresponding ASCII values.

public class AlphabetsAsciiValue {
    
    public static void main(String[] args) {
        for(int i=65;i<=90;i++){
            // System.out.println((char)i+" " +i);   // A 65
            System.out.println(i+" "+(char)i);       // 65 A
        }
    }
}
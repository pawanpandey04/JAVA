package Methods;
// Question  
// karan();
// Shravan();
// System.out.println("Ajay");
// Shrsvan();


    public class SyntaxCallFunctin {


    public static void shravan(){
    karan();
    System.out.println("khushi");
}
    public static void main(String[] args) {
        riyanshi();
        
    }
    public static void karan(){
        System.out.println("Yashika");
    }
    public static void riyanshi(){
        karan();
        shravan();
        System.out.println("Ajay");
        shravan();
    }
}
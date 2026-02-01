import java.util.Scanner;
public class ArthematicOperation {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter sides : ");
        double a = sc.nextDouble();
        double area = a * a;
        System.out.println(area);
    }
}
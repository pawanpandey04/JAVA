package if_else;

// Take length and breadth of rectangle as input and write a program to find wheather the area of rectangle
// is greater than its perimeter
//    Area of rectangle = l*b
//    perimeter of rectangle = 2*(l+b)

import java.util.Scanner;

public class AreaOfTriangleVSperimeter {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length : ");
        int l = sc.nextInt();
        System.out.println("Enter breadth : ");
        int b = sc.nextInt();
        if (l*b > 2*(l+b)){
            System.out.println("Area of rectangle > Perimeter of rectangle");
        }
        else System.out.println("Perimeter of rectangle > Area of rectangle");
    }
}
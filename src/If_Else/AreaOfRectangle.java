package If_Else;

import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Length of the rectangle: ");
        double l = input.nextInt();
        System.out.print("Enter the Width of the rectangle: ");
        double b = input.nextInt();
        double area = l*b;

        if ((l*b) > (2*(l+b)) ) {
            System.out.println("Area of Rectangle is greater than the Perimeter of the rectangle");
        } else{
            System.out.println("Area of Rectangle is smaller than the Perimeter of the rectangle");
        }
    }
}

package If_Else;

import java.util.Scanner;

public class SideOfATriangle {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter the first Side: ");
            int num1 = input.nextInt();
            System.out.print("Enter the second Side: ");
            int num2 = input.nextInt();
            System.out.print("Enter the third Side: ");
            int num3 = input.nextInt();
            if ((num1 + num2) >num3 && (num2 + num3) > num1 && (num3 + num1) > num2)
                System.out.print("Valid Triange");
            else System.out.println("Invalid Triange ");
        }
}

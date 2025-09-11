package If_Else;

import java.util.Scanner;

public class GreatestOfThree {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of x: ");
        int x = sc.nextInt();
        System.out.print("Enter the value of y: ");
        int y = sc.nextInt();
        System.out.print("Enter the value of z: ");
        int z = sc.nextInt();
//        if (x >= y && x >= z) System.out.println("X is greater");
//        else if (y >= x && y >= z) System.out.println("Y is greater");
//        else System.out.println("Z is greater");
        /*SECOND METHOD*/
        if(x>=y) {
            if(x>=z) System.out.println("X is Greater");
            else  //c > a
                System.out.println("Z is Greater");
        } else { // b > a
            if(y >=z) System.out.println("Y is Greater");
            else // c > b
                System.out.println("Z is Greater");
        }
    }
}

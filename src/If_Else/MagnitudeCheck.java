package If_Else;

import java.util.Scanner;

public class MagnitudeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int num = sc.nextInt();
        if(Math.abs(num) < 69) {
            System.out.println("The magnitude of " + num + "is smaller than 69.");
        } else {
            System.out.println("The magnitude of " + num + " is not smaller than 69.");
        }
        sc.close();
    }
}

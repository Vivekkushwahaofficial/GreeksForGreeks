package If_Else;

import java.util.Scanner;

//public class FourDigitNumber {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        if (n > 999 && n < 10000) {
//            System.out.println("It is a Four Digit Number");
//        }
//        else {
//            System.out.println("It is not a Four Digit Number");
//        }
//    }
//}
public class FourDigitNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        if (n % 5 == 0 || n % 3 == 0)
            System.out.print("Divisible by 5 or 3: ");
        else
            System.out.print("Not divisible by 3 or 5: ");
    }
}



package If_Else;

import java.util.*;

//public class OddEven {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter number");
//        int n = sc.nextInt();
//        if (n % 2 == 0) {
//            System.out.println("Even number");
//        } else {
//            System.out.println("Odd number");
//        }
//    }
//}
//public class OddEven {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter number");
//        int n = sc.nextInt();
//        if (n % 2 == 0) System.out.println("Even number");
//        else System.out.println("Odd number");
//    }
//}
public class OddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num % 5 == 0) {
            System.out.println("Divisible by 5");
        } else  {
            System.out.println("Not divisible by 5");
        }
    }
}


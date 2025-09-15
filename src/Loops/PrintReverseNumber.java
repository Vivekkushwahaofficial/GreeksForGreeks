package Loops;
import java.util.Scanner;
//public class PrintReverseNumber {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int r = 0;
//        while(n != 0){
//        r *= 10;
//        r += n % 10;
//        n /= 10;
//        }
//        System.out.println(r);
//    }
//}
public class PrintReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = 0, sum = 0;
        while (n != 0) {
            int digit = n % 10;
            r = r * 10 + digit;
            sum += digit;
            n = n / 10;
        }
        System.out.println(r);
        System.out.println(sum);
    }
}


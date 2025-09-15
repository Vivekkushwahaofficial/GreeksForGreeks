package Loops;

import java.util.Scanner;

public class PowerLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int pow = 1;
        for (int i=1; i<=a; i++) {
            pow *= a;
        }
        System.out.println(pow);
    }
}

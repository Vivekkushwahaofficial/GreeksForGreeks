package Loops;

import java.util.Scanner;

public class DecreasingLoop {
    public static void main(String[] args) {
        System.out.print("Enter Number : ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for(int i=n; i>=0; i--) {
            System.out.print(i+" ");
        }
    }
}

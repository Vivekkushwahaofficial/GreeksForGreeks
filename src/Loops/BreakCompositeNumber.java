package Loops;

import java.util.Scanner;

public class BreakCompositeNumber {
    public static void main(String[] args) {
        System.out.print("Enter Number : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=2; i<=n-1; i++) {
            if(n%i==0) {
                System.out.println("Composite Number");
                break;
            }
        }
    }
}


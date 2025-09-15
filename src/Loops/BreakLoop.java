package Loops;

import java.util.Scanner;

public class BreakLoop {
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int n = sc.nextInt();
        boolean flag = true;
      for(int i=2; i<=Math.sqrt(n); i++) {
//        for(int i = 2; i<=n-1; i++) {
            if(n%i==0) {
                flag = false;
                break;
            }
        }
        if(n==1) System.out.println("Neither Prime nor Composite");
//        else if(flag==false) System.out.println("Composite Number");
//        else System.out.println("Prime Number");
        else if(!flag) System.out.println("Composite Number");
        else System.out.println("Prime Number");
    }
}

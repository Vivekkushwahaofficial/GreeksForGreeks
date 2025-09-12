package Loops;

import java.util.Scanner;

public class BreakLoop {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int n = sc.nextInt();
        boolean flag = true;
        for(int i = 2; i<=n-1; i++) {
            if(n%i==0) {
                flag = false;
                break;
            }
        }
//        if(flag==false) System.out.println("Composite Number");
//        if(flag==true) System.out.println("Prime Number");
        if(!flag) System.out.println("Composite Number");
        if(flag) System.out.println("Prime Number");
    }
}

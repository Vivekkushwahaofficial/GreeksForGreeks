package If_Else;

import java.util.Scanner;

public class TernaryBasic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int n = sc.nextInt();
//        if(n%2==0) System.out.println("Even");
//        else System.out.println("Odd");
//        condition ? sach : jhoot
        System.out.println(n % 2 == 0 ? "Even" : "Odd");
    }
}

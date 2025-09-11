package If_Else;

import java.util.Scanner;

public class StudentName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int n = sc.nextInt();
        System.out.print("Student Name : ");
        if (n % 5 == 0 && n % 3 == 0) {
            System.out.println("Riya");
        } else if (n % 3 == 0) {
            System.out.println("Ranu");
        } else if(n % 5 == 0) {
            System.out.println("Aproova");
        } else {
            System.out.println("Isha");
        }
    }
}

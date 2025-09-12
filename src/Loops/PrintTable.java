package Loops;

import java.util.Scanner;

//public class PrintTable {
//    public static void main(String[] args) {
//        System.out.print("Enter Number : ");
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        for( int i=12; i<=n; i++){
//            if(i%12 == 0) System.out.println(i+ " ");
//        }
//    }
//}
//public class PrintTable {
//    public static void main(String[] args) {
//        int n = 10;
//        for( int i=1; i<=n; i++){
//            System.out.print(12 * i+" ");
//        }
//    }
//}
//public class PrintTable {
//    public static void main(String[] args) {
//        int n = 120;
//        for( int i=12; i<=n; i=i+12){
//            System.out.print(i+" ");
//        }
//    }
//}
public class PrintTable {
    public static void main(String[] args) {
        int n = 100;
        for(int i = 3; i<n; i++){
            if(i%3==0) System.out.println(i);
        }
    }
}

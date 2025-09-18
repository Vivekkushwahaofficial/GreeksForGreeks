package Pattern_Printing;
import java.util.*;
//public class StarTriangleHorizontallyFlipped {
//    public static void main(String [] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        for(int i=1; i<=n; i++){
////            for(int j=1; j<=n-i; j++) {
//            for(int j=1; j<=n+1-i; j++){
//                System.out.print("*" + " ");
//            }
//            System.out.println();
//        }
//    }
//}

//public class StarTriangleHorizontallyFlipped {
//    public static void main(String [] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int a = n;
//        for(int i=1; i<=n; i++){
//            for(int j=1; j<=a; j++){
//                System.out.print("*6" + " ");
//            }
//            a--;
//            System.out.println();
//        }
//    }
//}

//public class StarTriangleHorizontallyFlipped {
//    public static void main(String [] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        for(int i=1; i<=n; i++){
//            for(int j=1; j<=n+1-i; j++){
//                System.out.print(j + " ");
//            }
//            System.out.println();
//        }
//    }
//}
//public class StarTriangleHorizontallyFlipped {
//    public static void main(String [] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        for(int i=1; i<=n; i++){
//            for(int j=1; j<=n+1-i; j++){
//                System.out.print((char)(i+ 64)+ " ");
//            }
//            System.out.println();
//        }
//    }
//}
//public class StarTriangleHorizontallyFlipped {
//    public static void main(String [] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        for(int i=1; i<=n; i++){
//            for(int j=1; j<=n+1-i; j++){
//                System.out.print((char)(j +96) + " ");
//            }
//            System.out.println();
//        }
//    }
//}
public class StarTriangleHorizontallyFlipped {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = n;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=a; j++){
                System.out.print((char)(i+64) + " ");
            }
            a--;
            System.out.println();
        }
    }
}



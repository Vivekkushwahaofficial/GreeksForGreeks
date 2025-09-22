package Pattern_Printing;

//public class OddTriangle {
//    public static void main(String [] args) {
////        int n = 6;
////        for(int i=1; i<=n; i++) {
////            for(int j=1; j<=i; j++) {
////                System.out.print(2*j-1+" ");
////            }
////            System.out.println();
////        }
//        int n=6;
//        for(int i=1; i<=n; i++){
//            int b=1;
//            for(int j=1; j<=i; j++) {
//                System.out.print(b + " ");
//                b += 2;
//            }
//            System.out.println();
//        }
//    }
//}
public class OddTriangle {
    public static void main(String [] args) {
        int n = 5, a = 1;
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=i; j++) {
                System.out.print(a + " ");
                a += 2;
            }
            System.out.println();
        }
    }
}

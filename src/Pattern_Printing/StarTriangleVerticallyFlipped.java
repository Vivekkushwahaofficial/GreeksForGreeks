package Pattern_Printing;

//public class StarTriangleVerticallyFlipped {
//    public static void main(String [] args) {
//        int n = 6;
//        for(int i=1; i<=n; i++) {
//            for(int j= i+1; j<=n; j++) {
//                System.out.print(" " + " ");
//            }
//            for(int j=1; j<=i; j++) {
//                System.out.print("*" + " ");
//            }
//            System.out.println();
//        }
//    }
//}

//public class StarTriangleVerticallyFlipped {
//    public static void main(String [] args) {
//        int n = 6;
//        for(int i=1; i<=n; i++) {
//            for(int j=1; j<=n; j++) {
//                if(i+j > n) System.out.print("* ");
//                else System.out.print("  ");
//            }
//            System.out.println();
//        }
//    }
//}

//public class StarTriangleVerticallyFlipped {
//    public static void main(String [] args) {
//        int n = 6;
//        for(int i=1; i<=n; i++) {
//            for(int j=1; j<=n+1-i; j++) {
//                System.out.print("  ");
//            }
//            for(int j=1; j<=i; j++) {  // Star loop
//                System.out.print("* ");
//                }
//            System.out.println();
//        }
//    }
//}
public class StarTriangleVerticallyFlipped {
    public static void main(String [] args) {
        int n = 6;
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=n-i; j++) { // Space loop
                System.out.print("  ");
            }
            for(int j=1; j<=i; j++) {  // Star loop
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

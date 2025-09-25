package Arrays;

//public class OutputArray {
//    public static void main(String [] args){
//        int[] arr = {5,-8,2,67,43,-97};
//        for(int i=0; i<=5; i++){
//            System.out.print(arr[i]+" ");
//        }
////        System.out.println(arr[0]);
////        System.out.println(arr[1]);
////        System.out.println(arr[2]);
////        System.out.println(arr[3]);
////        System.out.println(arr[4]);
////        System.out.println(arr[5]);
//      }
//}
    import java.util.*;
public class OutputArray {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
//        int[] arr = {33,44,55,66,77,88,99};
//        int n = arr.length;
//        System.out.println(n);
//        for(int i=0; i<n; i++){
//            System.out.print(arr[i]+" ");
//        }
        int[] Vivek = new int[7];
////        Default values
//        for(int i=0; i<7; i++){
//            System.out.print(Vivek[i]+" ");
//        }
//        Input
        for(int i=0; i<7; i++) {
            Vivek[i] = sc.nextInt();
        }
//        Print
        for(int i=0; i<7; i++){
            System.out.print(Vivek[i]+" ");
            System.out.print(2*Vivek[i]+" ");
        }
    }
}

package Arrays;
import java.util.*;
//public class UpdatedArray {
//    public static void main(String[] args) {
//        int arr[] = {10,20,30,40,50,60};
//        for(int i=0; i<arr.length; i++){
//            if(i%2 == 1) arr[i] *= 2;
//            else arr[i] += 10;
//        }
//        System.out.println(Arrays.toString(arr));
//    }
//}
public class UpdatedArray {
    public static void main(String[] args) {
        int arr[] = {3,7,3,-7,8};
        print(arr);
        for(int i=0; i<arr.length; i++){
            if(i%2 == 1) arr[i] *= 2;
            else arr[i] += 10;
        }
        print(arr);
    }
    public static void print(int arr[]){
        System.out.println(Arrays.toString(arr));
//        for(int i=0; i<arr.length; i++){
//            System.out.print(arr[i]+" ");
//        }
//        System.out.println();
    }
}

package Arrays;
import java.util.*;
//public class LinearSearch {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int arr[] = {10,20,30,40,50,60};
//        int target = sc.nextInt();
//        boolean flag = false;
//        for(int i=0; i<arr.length; i++){
//            if (arr[i] == target){
//                flag = true;
//                break;
//            }
//        }
//        if(flag) System.out.println("Target exists in Array");
//        else System.out.println("Target missing in Array");
//    }
//}
public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {10,20,30,40,50,60};
        int target = sc.nextInt();
        int found = -1;  //-1 means target array me nahi hai
        for(int i=0; i<arr.length; i++){
            if (arr[i] == target){
                found = i; // any no. except -1 means target array me hai
                break;
            }
        }
        if(found!= -1) System.out.println("Target exists in Array "+ found);
        else System.out.println("Target missing in Array");
    }
}

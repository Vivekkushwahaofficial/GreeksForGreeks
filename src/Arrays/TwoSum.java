package Arrays;
import java.util.*;
public class TwoSum {
    public static void main(String[] args) {
        int arr[] = {2,5,1,9,4,3};
        int target = 3;

        boolean result = twoSum(arr, target);
        System.out.println("Two sum "+ result);
    }
    public static boolean twoSum (int arr[], int target) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] == target) {
                return true;
            }
        }
    }
        return false;
    }
}

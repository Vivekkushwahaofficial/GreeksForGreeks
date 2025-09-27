package Arrays;

public class LinearSearch {
    public static void main(String[] args) {
        int arr[] = {10,20,30,40,50,60};
        int target = 40;
        for(int i=0; i<arr.length; i++)
            if(arr[i] == target) System.out.println("Target Exist in Array");
        else System.out.println("Target Not Found");
    }

}

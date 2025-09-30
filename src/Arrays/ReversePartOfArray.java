package Arrays;

public class ReversePartOfArray {
    public static void main(String[] args) {
        int arr[] = {3,4,5,6,7,8,9};
//        int n = arr.length;
        int i=3, j=5-1;
        while(i < j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        for(int ele : arr) System.out.print(ele+" ");
    }
}

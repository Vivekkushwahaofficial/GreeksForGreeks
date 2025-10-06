package Arrays;

import java.util.Arrays;

public class Segrate_0and_1 {
    public static void main(String[] args) {
        int arr[] = {0,1,0,0,0,1,0};
        int n = arr.length;
        int i=0, j=n-1;
        while(i<j){
            if(arr[i]==0) i++;
            else if (arr[j]==1) j--;
            else {
                arr[i]=0;
                arr[j]=1;
                i++;
                j--;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}

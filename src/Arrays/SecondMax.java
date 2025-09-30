package Arrays;

public class SecondMax {
    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 40, 50, 60,};
        int max = Integer.MIN_VALUE;
        int smax = Integer.MIN_VALUE;
//        Calculate max
        for(int i=0; i<arr.length; i++){
            if(arr[i] > max) max = arr[i];
        }
//        Calculate Second max
        for(int i=0; i<arr.length; i++){
            if(arr[i] > smax && arr[i] != max) smax = arr[i];
        }
        System.out.println(max);
        System.out.println(smax);
    }
}

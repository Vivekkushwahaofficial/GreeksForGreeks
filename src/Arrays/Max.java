package Arrays;

public class Max {
    public static void main(String [] args){
        int[] arr = {4,7,6,5,-5, 66,7};
//        int max = arr[0];
        int max = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++) {
            if (arr[i] > max) max = arr[i];
        }
            System.out.print(max);
    }
}

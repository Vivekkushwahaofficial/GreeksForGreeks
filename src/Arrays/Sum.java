package Arrays;
public class Sum {
    public static void main(String [] args){
        int[] arr = {-5,9,4,5,-7};
        int sum = 0;
        for(int i=0; i<arr.length; i++){
            sum += arr[i];
        }
        System.out.print(sum);
    }
}


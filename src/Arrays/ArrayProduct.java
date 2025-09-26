package Arrays;

public class ArrayProduct {
    public static void main(String [] args){
        int[] arr = {-6, 4, 6, 6, 5};
        int prod = 1;
        for(int i=0; i<arr.length; i++){
            prod *= arr[i];
        }
        System.out.println(prod);
    }
}

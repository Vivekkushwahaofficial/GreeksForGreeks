package Arrays;

import java.util.*;

public class PassingArrayToMethods {
    public static void main(String[] args) {
        int[] x = {10,23,33,22};
        System.out.println(x[2]);
        change(x);
        System.out.println(x[2]);
    }
    public static void change(int[] y){
        y[2] = 30;
//        System.out.println(Arrays.toString(y));
    }
}

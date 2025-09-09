package If_Else;
import java.util.Scanner;
//    public class AbsoluteValue {
//    public static void main(String[] args) {
//        Scanner sv = new Scanner(System.in);
//        System.out.println("Enter Number : ");
//        int n = sv.nextInt();
//        if(n>=0) System.out.println(n);
//        else System.out.println(-n);
//    }
//}
public class AbsoluteValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number : ");
        double n = sc.nextDouble(); //n = 3.14
        int x = (int)n; //x = 3
        if(n-x == 0) System.out.println("It is Integer");
        else System.out.println("not an Integer");
    }
}


package If_Else;

import java.util.Scanner;

//public class ProfitLoss {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a cp: ");
//        int cp = sc.nextInt();
//        System.out.println("Enter a sp : ");
//        int sp = sc.nextInt();
//        if (cp == sp) {
//            System.out.println("No Profit No loss");
//        }
//        if (sp > cp) {
//            System.out.println("Profit");
//        } else {
//            System.out.println("Loss");
//        }
//        if(sp > cp) System.out.println("Profit is " + (sp-cp));
//        if(cp > sp) System.out.println("Profit is " + (cp-sp));
//        if(sp == cp) System.out.println("No Profit No Loss");
//}
    public class ProfitLoss {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a cp: ");
            float cp = sc.nextInt();
            System.out.println("Enter a sp : ");
            float sp = sc.nextInt();
            if (sp > cp) System.out.println("Profit is " + ((sp - cp) / 100));
            if (cp > sp) System.out.println("Profit is " + ((cp - sp) / 100));
            if (sp == cp) System.out.println("No Profit No Loss");
        }
}
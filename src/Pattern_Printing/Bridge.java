package Pattern_Printing;

public class Bridge {
    public static void main(String [] args){
        int n = 5;
        for(int i=1; i<=2*n-1; i++){
            System.out.print("* ");
        }
        System.out.println();
        int nsp = 1;
        for(int i=1; i<=n-1; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print("* ");
            }
            for(int j=1; j<=nsp; j++){
                System.out.print(" "+" ");
            }
            for(int j=1; j<=n-i; j++) {
                System.out.print("* ");
            }
            nsp += 2;
            System.out.println();
        }
    }
}

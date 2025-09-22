package Pattern_Printing;

public class EvenTriangle {
    public static void main(String [] args) {
        int n = 7, a = 0; // here we take a = 2 then printing from 2
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=i; j++) {
                System.out.print(a + " ");
                a += 2;
            }
            System.out.println();
        }
    }
}

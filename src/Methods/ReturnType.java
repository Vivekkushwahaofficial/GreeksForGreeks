package Methods;
// jaha return aa jata h waha code khtm ho jata h
//public class ReturnType {
//    public static int prasun(){
//        System.out.println("Basu");
//        return 5;
//    }
//    public static void main(String [] args){
////        System.out.println(prasun());
//        prasun();
//    }
//}
//public class ReturnType{
//    public static int prasun(int a){
//        System.out.println("Babu");
//        if(a>0) return 5;
//        else return 10;
//    }
//    public static void main(String [] args) {
//        int x = prasun(7);
//        System.out.println(3+x);
//    }
//}
public class ReturnType{
    public static int max(int a, int b, int c){
        if(a>=b && a>=c) return a;
        else if(b>=a && b>=c) return b;
        else return c;
    }
    public static void main(String [] args){
        System.out.println(max(4,2,9));
    }
}


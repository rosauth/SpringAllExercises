package Day2;

public class Latihan7 {
    static double maxNumber(double a, double b){
        if (a>b){
            return a;
        }else {
            return b;
        }
    }
    static double maxNumber(int a, int b){
        if (a>b){
            return a;
        }else {
            return b;
        }
    }
    static int maxNumber(int a, int b, int c){
        if (a>b){
            return c;
        }else {
            return b;
        }
    }

    public static void main(String[] args) {
        System.out.println(maxNumber(10, 20));
        System.out.println(maxNumber(20.0, 7.5));
        System.out.println(maxNumber(1, 7, 4));
    }
}

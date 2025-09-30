package DSA.Recursion;

public class Recursion1 {


    public static void main(String[] args) {
        int n=3;
        printtoN(n);

    }

    private static void printtoN(int n) {
        if(n==0){
            return;
        }
        printtoN(n-1);
        System.out.println(n);

    }
}

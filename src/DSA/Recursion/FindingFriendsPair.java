package DSA.Recursion;

public class FindingFriendsPair {


    public static int Function(int n){
        if(n == 1 || n==2){
            return n;
        }
        return Function(n-1)+(n-1)*Function(n-2);
    }

    public static void main(String[] args) {
        System.out.println(Function(5));
    }
}

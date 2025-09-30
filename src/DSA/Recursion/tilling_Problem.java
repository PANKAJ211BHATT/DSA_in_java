package DSA.Recursion;

public class tilling_Problem {
        public static int TilesProblem(int n ){
            if(n==1 ){
                return 2;
            }
            else if(n==2){
                return 5;
            }
            return TilesProblem(n-1) + TilesProblem(n-2);
        }

    public static void main(String[] args) {
        System.out.println(TilesProblem(4));
    }

}

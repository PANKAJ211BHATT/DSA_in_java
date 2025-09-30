package DSA.Backtracking;

public class FindPermutation {
    public static void permutation(String str, String ans ){
        //base case
        if(str.length() == 0){
            System.out.println(ans);
            return;
        }

        //Recusive call
        for(int i =0; i < str.length(); i++){
            char ch = str.charAt(i);
            String str2= str.substring(0,i) + str.substring(i+1);
            permutation(str2,ans+ch);
        }
    }

    public static void main(String[] args) {
        permutation("abc","");
    }
}

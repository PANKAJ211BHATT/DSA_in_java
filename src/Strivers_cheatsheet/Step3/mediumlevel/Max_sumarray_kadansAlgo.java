package Strivers_cheatsheet.Step3.mediumlevel;

public class Max_sumarray_kadansAlgo {
    public static int maxSumArray(int [] arr){
        int CS=0;
        int MS= Integer.MIN_VALUE;
        for(int i : arr){
            CS=CS+i;
            if(CS < 0 ){
                CS=0; 
            }
            
            MS = Math.max(CS,MS);
        }
        return MS;
    }
    public static void main(String[] args) {
        int []arr={-2,-3,4,-1,-2,1,5,-3};
        System.out.println(maxSumArray(arr));
    }
}

package Strivers_cheatsheet.Step3.mediumlevel;

public class Rearrange_Array_Elements_by_Sign {
    public static int [] rearrange_Array_Elements_by_Sign(int [] arr , int n ) {
       int [] arr2 = new int[n];
       int positiveIndex = 0;
       int negitiveIndex = 1;
       for (int i : arr){
           if(i>0){
               arr2[positiveIndex] = i;
               positiveIndex+=2;
           }
           else{
               arr2[negitiveIndex] = i;
               negitiveIndex+=2;
           }
       }
       return arr2;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,-3,1,-2,-3}; // 2 positives, 4 negatives
        int n = arr.length;
        for (int i : arr){
            System.out.print(i+" ");
        }
        int [] r = rearrange_Array_Elements_by_Sign(arr,n);
        System.out.println();
        for (int i : r){
            System.out.print(i+" ");
        }
    }
}

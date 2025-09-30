package DSA.Arrays;

import java.util.HashMap;
import java.util.Map;

public class SumOfTwo {
    //better approch using hashmap
//    public static boolean sum_of_two_by_HashMap(int [] arr , int Target){
//        Map <Integer,Integer> hashmap = new HashMap<>();
//
//        for (int i =0 ; i< arr.length ; i++){
//            hashmap.put(arr[i],i);
//        }
//
//        for (int i = 0; i < arr.length; i++) {
//            if(hashmap.containsKey(Target-arr[i])){
//                return true;
//            }
//        }
//        return false;
//
//    }
    public static boolean sum_of_two_Pointer(int [] arr , int Target){
        int start = 0, end =  arr.length - 1  ;
        while(start < end)
        {
            if (arr[start] + arr[end] == Target){
                return true;
            } else if (arr[start] + arr[end] > Target) end--;
            else start++;

        }
        return false;
    }

    public static void main(String[] args) {
        int[] sortedArr = {3, 5, 7, 12, 14, 18, 23, 27, 33, 38, 42, 56, 60, 67, 70, 75, 81, 89, 91, 99};
        System.out.println(sum_of_two_Pointer(sortedArr,94));

    }
}

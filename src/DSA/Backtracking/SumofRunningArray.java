package DSA.Backtracking;

import static DSA.Backtracking.Array.printArray;

public class SumofRunningArray {
    public static int[] runningSum(int[] nums) {
        int[] arr = new int[nums.length];
        arr[0] = nums[0];
        sumOfArray(nums,1,arr);
        return arr;
    }
    public static void sumOfArray(int[] nums, int i ,int [] arr){
        if(i == nums.length){
            return ;
        }

        arr[i] = arr[i-1]+nums[i];
        sumOfArray(nums,i+1,arr);
    }

    public static void main(String[] args) {
            int[] nums = {1,2,3,4};
            int[] arr = runningSum(nums);
            printArray(arr);
    }
}

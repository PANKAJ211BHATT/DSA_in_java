package Strivers_cheatsheet.Step4.Lec1;

public class Minimum_element_in_Rotated_Sorted_Array {
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 0, 1, 2, 3};
        System.out.println(findMin(arr));
    }
    public static int findMin(int[] nums) {
        int low = 0;
        int high = nums.length-1;

        int min = Integer.MAX_VALUE;
        while(low<=high){
            int mid  = low+(high-low)/2;

            if(nums[low]<=nums[mid]){
                min  = Math.min(min,nums[low]);
                low = mid+1;
            }
            else{
                min = Math.min(min,nums[mid]);
                high = mid-1;
            }
        }
        return min;
    }
}

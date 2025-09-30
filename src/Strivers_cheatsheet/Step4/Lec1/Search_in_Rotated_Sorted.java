package Strivers_cheatsheet.Step4.Lec1;

public class Search_in_Rotated_Sorted {
    public static void main(String[] args) {
        
        int[] arr = {6,8,1,2,4};

        int target = 2;

        // Call your function here
        int result = search(arr,target);
        // Print result

        if (result != -1 ) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found");
        }
    }



    public static int search(int[] nums, int target) {
        int start= 0;
        int end = nums.length-1;

        while(start <= end){
            int mid = start+(end-start)/2;

            if(nums[mid] == target){
                return mid;
            }
            if (nums[start] == nums[mid] && nums[mid] == nums[end]) {
                start++;
                end--;
            }
            else if(nums[start] <= nums[mid]){
                if(nums[start] <= target && target < nums[mid] ){
                    end = mid-1;
                }
                else{
                    start = mid+1;
                }
            }
            else{
                if(nums[mid]<target && target <= nums[end]){
                    start = mid + 1;
                }
                else{
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
}

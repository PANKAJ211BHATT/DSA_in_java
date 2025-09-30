package Strivers_cheatsheet.Step4.Lec1;

public class BinarySearch {
    public static void main(String[] args) {
        // Sorted array for binary search
        int[] arr = {-1,0,3,5,9,12};

        int target = 2;

        // Call your function here
        int result = binarySearch(arr, target);

        // Print result
        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found");
        }
    }
    // 👉 You will implement this function
    public static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length-1;
        int mid =0;

        while(start<=end){
            mid = start + (end - start) / 2;
            if(arr[mid] == target){
                return mid;
            }
            else if(arr[mid]<target){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return -1;
    }

    public static class Floor_and_Ceil_in_Sorted_Array {
        public static void main(String[] args) {
            int[] arr = {3, 4, 4, 7, 8, 10};
            int target = 8;
            int [] arr2 = floorandceiling(arr,target);
            for (int i : arr2){
                System.out.println(i);
            }
        }
        public static int[] floorandceiling(int [] arr , int target){
            int [] result = new int[2];
            int start =0;
            int end = arr.length-1;
            while(start <= end){
                int mid = start + (end - start) / 2;

                if (arr[mid] == target){
                   result[0]=result[1]=arr[mid];
                   return result;
                } else if (arr[mid]< target) {
                    result[0]= arr[mid];
                    start=mid+1;
                }else{
                    result[1] = arr[mid];
                    end = mid-1;
                }
            }
            return result;
        }

    }
}

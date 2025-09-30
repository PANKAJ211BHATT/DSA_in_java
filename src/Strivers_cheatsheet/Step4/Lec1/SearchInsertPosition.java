package Strivers_cheatsheet.Step4.Lec1;

public class SearchInsertPosition {
    public static void main(String[] args) {
        // Sorted array
        int[] arr = {1, 3, 5, 6};
        int target = 4;  // element to search / insert

        // Call your function
        int index = searchInsert(arr, target);

        // Print result
        System.out.println("Insert position of " + target + " is: " + index);
    }

    // 👉 You will implement this function
    public static int searchInsert(int[] arr, int target) {
        int start = 0;
        int end = arr.length-1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return start;
    }
}


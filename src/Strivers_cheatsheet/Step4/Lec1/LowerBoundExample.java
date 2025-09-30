package Strivers_cheatsheet.Step4.Lec1;

public class LowerBoundExample {
    public static void main(String[] args) {
        // Sorted array
        int[] arr = {5,10,15};
        int x = 11;  // element we want to find lower bound for

        // Call your function
        int index = lowerBound(arr, x);

        // Print result
        System.out.println("Lower bound index of " + x + " is: " + index);
    }

    // 👉 You will implement this function
    public static int lowerBound(int[] arr, int x) {
        int start =0;
        int end = arr.length -1;
        int ans = arr.length;

        while(start<= end){
            int mid = (start+end)/2;
            if(arr[mid] >= x){
                ans = mid;
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return ans;
    }
}


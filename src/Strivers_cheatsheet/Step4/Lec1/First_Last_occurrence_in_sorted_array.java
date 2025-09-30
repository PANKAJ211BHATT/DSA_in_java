package Strivers_cheatsheet.Step4.Lec1;

public class First_Last_occurrence_in_sorted_array {
    public static void main(String[] args) {
        int [] arr = {5, 7, 7, 8, 8, 10};
        int target =8;
        int [] numb = searchRange(arr,target);
        for(int i : numb){
            System.out.println(i);
        }
    }
    public static int[] searchRange(int[] arr, int target) {
        int first = firstNumber(arr,target);
        int last = lastNumber(arr,target);
        return new int[] {first,last};
    }
    public static int firstNumber(int[] arr, int target){
        int start = 0 ;
        int end = arr.length-1;
        int first = -1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(arr[mid] == target){
                first = mid;
                end = mid-1;
            }
            else if(arr[mid]>target){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return first;
    }
    public static int lastNumber(int[] arr, int target){
        int start = 0 ;
        int end = arr.length-1;
        int last  =-1 ;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(arr[mid] == target){
                last = mid;
                start = mid+1;
            }
            else if(arr[mid]>target){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return last;
    }
}


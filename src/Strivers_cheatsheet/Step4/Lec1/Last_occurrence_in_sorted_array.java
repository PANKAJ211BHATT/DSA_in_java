package Strivers_cheatsheet.Step4.Lec1;

public class Last_occurrence_in_sorted_array {
    public static void main(String[] args) {
        int [] arr = {3,4,13,13,13,20,40};
        int target = 4;
        System.out.println(Last_occurrence(arr , target));
    }
    public static int Last_occurrence(int arr[] , int target){
        int start = 0;
        int end = arr.length-1;
        int last_occ =-1 ;
        while(start<=end){
            int mid = start + (end - start)/2;
            if(arr[mid] == target){
                last_occ = mid;
                start = mid+1;
            }
            else if (arr[mid] < target){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return last_occ;
    }

}

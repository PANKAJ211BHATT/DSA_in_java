package DSA.Arrays;

public class BinarySearch {
    public static int binarySearch(int [] arr,int target ){
        int start =0 ;
        int end  =arr.length-1;

        while(start <= end ){
            int mid= start + (end - start) / 2;
            if(arr[mid] == target){
                return mid+1;
            }
            else if (arr[mid]>target){
                end = mid-1;
            }
            else if (arr[mid]< target){
                start = mid+1;
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        int target = 56;
        int [] arr  = {2, 5, 8, 12, 16, 23, 38, 56, 72, 91};
        int start = 0;
        int end  = arr.length-1;

        System.out.println(
                binarySearch(arr, target)
        );

    }
}

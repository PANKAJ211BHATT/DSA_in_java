package DSA.Arrays;

public class LinearSearch {

    public static int linearSearch(int [] arr , int target){
        for(int i = 0 ; i < arr.length ; i++){
            if (arr[i] == target){
                return  i+1;
            }

        }
        return -1;
    }
    public static void main(String[] args) {
        int target = 3;
        int [] arr  = {
                12, 87, 45, 33, 76, 59, 21, 90, 3, 68,
                41, 25, 97, 14, 62, 38, 80, 5, 49, 73,
                27, 36, 88, 19, 66, 31, 54, 7, 92, 43,
                10, 70, 29, 84, 16, 60, 35, 99, 8, 47,
                23, 64, 50, 6, 95, 18, 72, 40, 58, 32
        };
        System.out.println( linearSearch(arr, target));
    }
}

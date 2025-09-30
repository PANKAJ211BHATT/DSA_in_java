package DSA.Arrays;

public class LargestNumber {

    public static int largestNumber(int [] arr ){
        int max = -1;
        for (int j : arr) {
            if (j > max) {
                max = j;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int [] arr  = {
                12, 87, 45, 33, 76, 59, 201, 90, 3, 68,
                41, 25, 97, 14, 62, 38, 80, 5, 49, 73,
                27, 36, 88, 19, 66, 31, 54, 7, 92, 43,
                10, 70, 29, 84, 16, 60, 35, 99, 8, 47,
                23, 64, 50, 6, 95, 18, 72, 40, 58, 32
        };
        System.out.println( largestNumber(arr));
    }
}

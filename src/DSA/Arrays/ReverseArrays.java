package DSA.Arrays;

public class ReverseArrays {
    public static void reverseArray(int [] arr){
        int start =0;
        int end  = arr.length-1;
        int temp =0;
        while(start<end){
            temp= arr[end];
            arr[end]= arr[start];
            arr[start] = temp;

            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        int [] arr  = {2, 5, 8, 12, 16, 23, 38, 56, 72, 91};
        for (int n : arr) {
            System.out.print(n + " , ");
        }
        reverseArray(arr);
        System.out.println();
        for(int n : arr){
            System.out.print(n + " , ");
        }
    }
}

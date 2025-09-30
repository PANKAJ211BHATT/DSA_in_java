package DSA.Backtracking;

public class Array {
    private static void myarray(int[]arr,int n){
        if(n == arr.length) return;
        arr[n] = n+1;

        System.out.println();
        myarray(arr,n+1);
        arr[n] = arr[n]-2;
    }
    public static void printArray(int []array){
        for (int i : array  )
            System.out.print(i + " ");

    }


    public static void main(String[] args) {
        int n=5;
        int array [] = new int[5];
        myarray(array,0);
        printArray(array);
}}

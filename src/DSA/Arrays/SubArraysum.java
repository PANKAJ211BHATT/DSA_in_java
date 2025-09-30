package DSA.Arrays;

public class SubArraysum {
    public static void subarrays(int [] arr){
        int max=0;
        int sum=0;
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length ; j++) {
                for (int k = i; k <= j; k++) {
                    sum=+ arr[k];
                }
                if (max<sum){
                    max=sum;
                }

            }

        }
        System.out.println(max);
    }
    public static void main(String[] args) {
        int [] arr  = {2, 4, 6, 8,10};
        subarrays(arr);
    }
}

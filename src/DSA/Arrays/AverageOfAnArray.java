package DSA.Arrays;

public class AverageOfAnArray {
    public static double average(int [] arr){
        int sum=0;
        for(int num : arr){
            sum+=num;
        }
        return  (double) (sum/arr.length);
    }
    public static void main(String[] args) {
        int [] arr = {2, 55, 85, 656, 52, 554, 545, 5, 2};
        double answer =average(arr);
        System.out.println(String.format("%.2f",answer));

    }
}

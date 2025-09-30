package DSA.Arrays;

public class AlternativePrint {
    public static void alterPrint(int[] arr) {
        for (int i = 0; i < arr.length; i += 2) {
            System.out.println(arr[i]);

        }
    }
        public static void main (String[]args){
            int[] arr = {10, 20, 30, 40, 50};
            alterPrint(arr);
        }

}
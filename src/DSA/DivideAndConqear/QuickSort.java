package DSA.DivideAndConqear;

public class QuickSort {
    public static void QuickSortAlgo(int[] arr, int si , int ei){
        if(si>=ei){
            return;
        }
        int pix = Partician(arr,si,ei);
        QuickSortAlgo(arr, si, pix-1);
        QuickSortAlgo(arr, pix+1, ei);
    }
    public static int Partician(int[] arr, int si , int ei){
        int pivit = arr[ei];

        int j = si-1;
        for(int i=si; i<ei ; i++){
            if(arr[i] <= pivit){
                j++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
            j++;
            int temp = arr[j];
            arr[j] = arr[ei];
            arr[ei] = temp;

            return j;

        }
    public static void PrintArray(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        int[] arr = {363,2,23,7,9,636,88,32};
        PrintArray(arr);
        QuickSortAlgo(arr,0, arr.length-1);
        PrintArray(arr);
    }
}

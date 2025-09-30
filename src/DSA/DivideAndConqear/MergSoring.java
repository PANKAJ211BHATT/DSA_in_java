package DSA.DivideAndConqear;

public class MergSoring {
    public static void MergSoringAlgo(int[] arr, int si , int ei ){
        if(si>=ei){
            return ;
        }
        int mid  = si+(ei-si)/2;
        MergSoringAlgo(arr,si,mid);
        MergSoringAlgo(arr,mid+1,ei);
        Merge(arr,si,mid,ei);

    }
    public static void Merge(int[] arr, int si ,int mid, int ei ){
        int merged [] = new int[ei - si + 1];
        int idx1 = si;
        int idx2 = mid+1;
        int idx3 = 0;

        while(idx1 <= mid && idx2 <=ei ){
            if(arr[idx1] <= arr[idx2]){
                merged[idx3++] = arr[idx1++];
            }
            else{
                merged[idx3++] = arr[idx2++];
            }
        }
        while(idx1 <= mid){
            merged[idx3++] = arr[idx1++];
        }

        while (idx2 <= ei){
            merged[idx3++] = arr[idx2++];
        }

        for(int i = 0 ,j=si; i < merged.length ; i++,j++){
            arr[j] = merged[i];
        }
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
        MergSoringAlgo(arr,0, arr.length-1);
        PrintArray(arr);
    }
}

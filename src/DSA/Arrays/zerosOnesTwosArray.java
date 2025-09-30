package DSA.Arrays;

public class zerosOnesTwosArray {
    public static void SortArray(int [ ] arr ){
        int low =0, mid = 0 , high = arr.length-1;
        int temp = 0;
        while(mid<=high){
            if(arr[mid] == 0){
                temp = arr[mid];
                arr[mid] = arr[low];
                arr[low] = temp;
                low++;
                mid++;
            }
            else if(arr[mid] == 2){
                temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;
                high--;
            }
            else{
                mid++;
            }
        }

    }
    public static void main(String[] args) {
        int[] arr = {
                0, 2, 1, 0, 1, 2, 0, 1, 1, 2,
                2, 0, 1, 0, 2, 1, 2, 0, 0, 1,
                1, 2, 0, 2, 1, 0, 1, 2, 2, 0,
                0, 1, 1, 2, 0, 2, 1, 0, 1, 2,
                2, 1, 0, 0, 1, 2, 1, 0, 2, 1
        };

        for(int num : arr){
            System.out.print(num);
        }
        System.out.println();


        SortArray(arr);
        for(int num : arr){
            System.out.print(num);
        }
    }
}

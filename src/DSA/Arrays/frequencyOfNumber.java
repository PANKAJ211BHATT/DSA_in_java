package DSA.Arrays;
import java.util.HashMap;
import java.util.Map;

public class frequencyOfNumber {
    public static int freq(int[] arr , int key){
        Map<Integer,Integer> frqmap = new HashMap<>();

        for(int num : arr){
            frqmap.put(num,frqmap.getOrDefault(num,0)+1);
        }

        return frqmap.get(key);
    }
    public static void main(String[] args) {
        int [] arr = {1,2,2,1,4,3,3,3,3,2,1,1,1,5,1,1,1,1,1,1};
        System.out.println(freq(arr , 1));

    }
}

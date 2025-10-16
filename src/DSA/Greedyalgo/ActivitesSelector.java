package DSA.Greedyalgo;

import java.util.ArrayList;
import java.util.List;

public class ActivitesSelector {
    public static void main(String[] args){
        int start[] ={1,3,0,5,8,5};
        int end[] = {2,4,6,7,9,9};
        
        
        int max = 0;
        ArrayList<Integer> arr = new ArrayList<>();
        
        max = 1;
        arr.add(0);
        int lastend = end[0];
        for(int i = 1; i<end.length; i++){
            if(start[i]>=lastend){
                max++;
                arr.add(i);
                lastend= end[i];
            }
        }
        System.out.println(max);
        for( int i : arr){
            System.out.print("A"+i+" ");
        }
        
    }
}

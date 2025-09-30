package Strivers_cheatsheet.Step3.mediumlevel;

import java.util.ArrayList;
import java.util.List;

public class LeadersInArray {
    public static ArrayList<Integer> leadersInArray(int [] arr){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(arr[arr.length-1]);
        int max = arr[arr.length-1];
        for (int i = arr.length -2; i >=0 ; i--) {
            if (arr[i] > max) {
                list.add(arr[i]);
                max = arr[i];
            }
        }
        return list;
    }
    public static void main(String[] args) {
        int[] arr = {16,4, 3, 5, 2};
        ArrayList<Integer> list = leadersInArray(arr);

        for (int i : list){
            System.out.print(i + " ");
        }
    }
}

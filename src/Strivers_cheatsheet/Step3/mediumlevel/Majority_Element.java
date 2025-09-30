package Strivers_cheatsheet.Step3.mediumlevel;

public class Majority_Element {
    public static int majority_element(int [] num){
        int count =0;
        int element = 0 ;
        for (int j : num) {
            if (count == 0) {
                element = j;
            }
            if (element == j) {
                count++;
            } else {
                count--;
            }
        }
        return element;

    }
    public static void main(String[] args) {
       int [] numb= {2,2,1,1,1,2,2};
       System.out.println(majority_element(numb));

    }
}

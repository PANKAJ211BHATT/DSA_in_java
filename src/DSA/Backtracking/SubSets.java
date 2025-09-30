package DSA.Backtracking;
import java.util.ArrayList;
import java.util.List;

public class SubSets {
    private static void backtrack(int[] nums, int start, List<Integer> current, List<List<Integer>> result){
        //base case
        if(start == nums.length){
            result.add(new ArrayList<>(current));
            return;
        }
        //recursive calls
        backtrack(nums,start+1,current,result);
        current.add(nums[start]);
        backtrack(nums,start+1,current,result);
        current.remove(current.size() - 1);
    }

    public static void main(String[] args) {
        List<List<Integer>> result = new ArrayList<>();
        int[] nums = {1, 2, 3};
        backtrack(nums,0,new ArrayList<>(),result);
        for (List<Integer> subset : result) {
            System.out.println(subset);
        }
    }
}

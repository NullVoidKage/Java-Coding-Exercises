package LeetCode;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ConcatenationArray {
    public static void main(String[] args) {
        int[] nums = {1, 2, 1};
        getConcatenation(nums, 3);
    }

    public static int[] getConcatenation(int[] nums, int num) {
        int[] ans = new int[nums.length*2];
        int n = nums.length;
        for(int i = 0;i<nums.length;i++) {
            ans[i] = nums[i];
            ans[i + n] = nums[i];
        }
        for(int list: ans) {
            System.out.print(list);
        }
        return ans;
    }
    public static int[] getConcatenations(int[] nums) {
        Collection<String> collection = new ArrayList<>();

        Collections.addAll(collection, "A", "B", "C");
        
        int[] ans = new int[nums.length*2];
        for(int i=0;i<nums.length;i++) {
            ans[i] = nums[i];
            ans[i+nums.length] = nums[i];
        }

        for(int list: ans) {
            System.out.print(list);
        }
        return ans;
    }


}

package LeetCode;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicate {
    public static void main(String[] args) {
        int[] nums = {1,1,2};
        System.out.println(removeDuplicates(nums));

    }

    public static int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        Set<Integer> set = new HashSet<>();
        int k = 0; // index to track unique elements

        for (int num : nums) {
            if (!set.contains(num)) {
                set.add(num);
                nums[k++] = num; // update nums array with unique elements
            }
        }

        return k;


    }
}

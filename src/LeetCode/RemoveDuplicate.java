package LeetCode;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicate {
    public static void main(String[] args) {
        int[] nums = {0,1,1,2,2};
        System.out.println(removeDuplicate(nums));

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

    public static int removeDuplicate(int[] nums) {
        int j = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }

    public static int removeDuplicate2(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if(i < nums.length-1 && nums[i]==nums[i+1]) {
                nums[count] = nums[i];
                count++;
            }
        }
        return count;
    }
}

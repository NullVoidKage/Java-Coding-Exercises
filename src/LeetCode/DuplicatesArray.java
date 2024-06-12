package LeetCode;

import java.util.HashSet;
import java.util.Set;

public class DuplicatesArray {
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        // 0,1,2,3,4
        // i1 = 0
        // i2 = 0
//        removeDuplicates(nums);
        removeDuplicates2(nums);
    }

    public static int removeDuplicates(int[] nums) {
        int j = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[j] = nums[i];
                j++;
            }
        }
        System.out.println(j);
        return j;
    }

    public static void removeDuplicates2(int[] nums) {
        Set<Integer> integerSet = new HashSet<>();
        for(Integer list: nums){
            integerSet.add(list);
        }
        System.out.println(integerSet);
    }
}

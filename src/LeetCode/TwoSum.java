package LeetCode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class TwoSum {
    public static void main(String[] args) {
        TwoSum twoSum = new TwoSum();
        int[] nums =  {0, 2, 4, 5};
        List<Integer> integers = List.of(1, 2, 3, 4 ,5 );

        System.out.println(t2Sum(integers, 9));
//        twoSum.twoSum(nums, 9);
//        System.out.println(twoSum.twoSum(nums, 9));
    }


    public int[] twoSum(int[] nums, int target) {
        // {0, 2, 4, 5}
        // target = 9
        // [2, 3]

        for (int i = 0; i < nums.length-1;i++) {
            for (int j = i + 1; j < nums.length ; j++){
                if(nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};

    }

    public static List<Integer> t2Sum(List<Integer> integers, int target) {

        for(int i=0;i<integers.size();i++){
            for(int j=i+1;j<integers.size();j++){
                if(integers.get(i) + integers.get(j)==target){
                    return List.of(integers.get(i), integers.get(j));
                }
            }
        }

        return List.of();
    }

    public static void largest(List<Integer> integers) {
        int max = Collections.max(integers);
        System.out.println(max);
    }
}



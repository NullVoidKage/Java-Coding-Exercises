package ExerciseTrial;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindDuplicate {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 1,4, 2,  3);
        int[] arr = {1, 11, 2, 3, 1};
//        List<Integer> list = getRepeatingNumbers(nums);
        duplicate(arr);
    }

    public static List<Integer> getRepeatingNumbers
            (final List<Integer> givenList) {
        List<Integer> listRepeat = new ArrayList<>();
        for (int i = 0; i < givenList.size(); i++) {
            for (int j = i + 1; j < givenList.size(); j++) {
                if (givenList.get(i).equals(givenList.get(j))) {
                    System.out.println(givenList.get(i) +  " " +givenList.get(j));
                    listRepeat.add(givenList.get(i));
                }
            }
        }
        return listRepeat;
    }

    public static void duplicate(int[] nums) {
        for(int i=0;i<nums.length;i++){
            for(int j = i+1;j<nums.length;j++) {
                if(nums[i]==nums[j]){
                    System.out.println("DUPLICATE " + nums[i] + " | " + nums[j]);
                }
            }
        }
    }
}

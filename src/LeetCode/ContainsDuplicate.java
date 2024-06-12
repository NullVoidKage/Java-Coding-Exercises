package LeetCode;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] num = {1, 2, 3, 4, 11, 11};
//        String s = "SATRING";
//        s.length();
        if (containsDuplicate(num)) {
            System.out.println("TRUE");
        } else {
            System.out.println("FALSE");
        }
    }

    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> list = new HashSet<>();
        for(Integer numList : nums){
            if(list.contains(numList)){
                System.out.println(numList);
                return true;
            } else {
                list.add(numList);
            }
        }
        System.out.println(list);
        return false;
    }


}

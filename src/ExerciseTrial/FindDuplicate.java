package ExerciseTrial;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FindDuplicate {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("apple", "banana", "apple", "orange", "banana", "grape");

        // Find duplicates using streams
        //                .filter(entry -> entry.getValue() > 1) // Filter entries with count > 1
//        List<String> duplicates = new ArrayList<>(list.stream()
//                .collect(Collectors.groupingBy(e -> e, Collectors.counting())) // Group by element and count occurrences
//                .keySet()); // Collect results into a list

//        System.out.println("Duplicates: " + duplicates);
//        List<Integer> nums = Arrays.asList(1, 1,4, 2,  3);
        int[] arr = {1, 11, 2, 3, 2, 3, 3};
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

    public static int duplicate(int[] nums) {
        int count = 0;
        for(int i=0;i<nums.length;i++){
            for(int j = i+1;j<nums.length;j++) {
                if(nums[i]==nums[j]){
                    count++;
                }
            }
        }
        System.out.println(count);
        return count;
    }
}

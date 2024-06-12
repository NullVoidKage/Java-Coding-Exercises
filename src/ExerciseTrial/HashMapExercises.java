package ExerciseTrial;

import java.util.*;

public class HashMapExercises {
    public static void main(String[] args) {
//        duplicateHashMap();
        duplicateHashSet();
    }

    private static void duplicateHashMap() {
        List<Integer> integerList = Arrays.asList(11, 12, 31, 43, 21, -1, 11, 12, 3, 9, 10);

        Map<Integer, Integer> integerMap = new HashMap<>();
        List<Integer> duplicateValue = new ArrayList<>();
//        System.out.println(integerMap.ad);
        for(Integer num : integerList) {
            if(integerMap.containsKey(num)) {
                duplicateValue.add(num);
                System.out.println("CONTAINS KEY");
            } else {
                integerMap.put(num,1);
            }
        }

        System.out.println("Duplicates: " + duplicateValue);

    }


    private static boolean duplicateHashSet() {
        List<Integer> list = Arrays.asList(1, 4, 12, 5, 99, 21, 12);
        Set<Integer> set = new HashSet<>();

        for(Integer setList: list) {
            if(set.contains(setList)){

                return true;
            } else {
                set.add(setList);
            }
        }
        return false;
    }

            
}

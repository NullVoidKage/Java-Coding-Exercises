package Exercises;

import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

public class FindDuplicateTwo {
    public static void main(String[] args) {
        List<Integer> integers = List.of(1, 2,3,4,1,2,2);
        System.out.println(countHowMany(integers));
//        List<String> strings = List.of("Nicko", "Nicko", "Nicko", "Ratbu");
//        System.out.print(duplicateTwo(strings));

    }

    public static int countHowMany(List<Integer> list) {
        int count = 0;
        for(int i = 0;i<list.size();i++) {
            for(int j=i+1;j<list.size();j++) {
                if(list.get(i)==list.get(j)) {
                    System.out.println(list.get(i) + " | " + list.get(j));
                    count++;
                }
            }
        }
        return count;
    }

    public static int duplicate(List<Integer> list) {
        Set<Integer> set = new HashSet<>();
        int dupliCount = 0;

        for(Integer i : list) {
            if(!set.add(i)) {
                // if (!set.add(i)): The add method of a Set returns false
                // if the element is already present in the Set. If this happens,
                // the element is a duplicate, and the counter is incremented.
                dupliCount++;
            }
        }
        System.out.println(dupliCount);

        return dupliCount;

    }


    public static int duplicateTwo(List<String> list) {
        Set<String> set = new HashSet<>();
        int dupliCount = 0;

        for(String s : list) {
            if(!set.add(s)) {
                dupliCount++;
            }
        }

        return dupliCount;
    }
}

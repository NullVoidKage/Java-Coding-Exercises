package Exercises;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MergeTwoSortedList {
    public static void main(String[] args) {
        List<Integer> integers1 = List.of(1, 2, 3, 4, 5);
        List<Integer> integers2 = List.of(6, 7, 8, 9, 10);
        mergeTwoSortedList(integers1, integers2);

    }


    private static void mergeTwoSortedList(List<Integer> list1,
                                           List<Integer> list2) {
        List<List<Integer>> result = new ArrayList<>();
        result.add(list1);
        result.add(list2);


        System.out.println(result.stream().flatMap(List::stream).collect(Collectors.toList()));;
    }
}

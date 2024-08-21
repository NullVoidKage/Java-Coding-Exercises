package Exercises;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MissingNumber {
    public static void main(String[] args) {
        List<Integer> integers = List.of(0,1, 4, 2, 5, 3,6,7,9);
        missingNumber(integers);
    }


    private static List<Integer> missingNumber(List<Integer> num) {
        List<Integer> sorted = num.stream().sorted().collect(Collectors.toList());
        List<Integer> result = new ArrayList<>();
        for(int i=0;i<sorted.size();i++) {
            if(sorted.get(i)!=i){
                result.add(i);
                break;
            }
        }
        System.out.println(result);
        return result;

    }
}

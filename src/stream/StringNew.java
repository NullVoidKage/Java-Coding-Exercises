package stream;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StringNew {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("Worl11d", "wORLd",
                "", " ", null, "XXX", "xxx");
        long count = strings.stream()
                .filter(Objects::nonNull)
                .flatMapToInt(String::chars)
                .filter(Character::isDigit)
                .count();


        List<List<Integer>> listOfLists = Arrays.asList(
                Arrays.asList(1, 2, 3),
                Arrays.asList(4, 5, 6),
                Arrays.asList(7, 8, 9)
        );

//        List<Double> doubles = listOfLists.stream()
//                    .flatMapToDouble`(list -> list.stream().mapToDouble(Integer::doubleValue))
//                .boxed()
////                .boxed()
//                .collect(Collectors.toList());

//        System.out.println(doubles);

        String name = "sas";


        System.out.println(count);
        List<String> stringList = strings.stream()
                .filter(Objects::nonNull)
                .map(String::trim)
                .filter(s -> !s.isEmpty())
                .map(s -> s.substring(0, 1).toUpperCase()
                        + s.substring(1).toLowerCase())
                .distinct()
                .sorted()
                .collect(Collectors.toList());

        System.out.println(stringList);
    }

    public static void listOfString(String string) {
        string.chars()
                .mapToObj(item -> (char) item)
                .collect(Collectors.groupingBy(Function.identity(),
                        Collectors.counting()))
                .forEach((character, c) ->
                        System.out.println("Count " + c + " Character " +character));

        //


    }
    private static int checkNumber(List<String> strings) {
        int count = 0;
        for (String s : strings) {
            if (s != null && !s.isEmpty()) {
                for (char c : s.toCharArray()) {
                    if (Character.isDigit(c)) {
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
        return count;
    }

}

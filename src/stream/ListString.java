package stream;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ListString {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>(Arrays.asList(
                "eXZ    xample", "Test", "java", "stream", "EXAMPLE", null, "", "apple", "banana", "apple", " id", " ID"
        ));

        List<Integer> integers = new ArrayList<>(Arrays.asList(
                4, 5, 6, 71, 1, 2, -1
        ));
        example();

//        System.out.println(getStringStandard(strings));
//        List<String> result = strings.stream()
//                .filter(Objects::nonNull)  // Remove null values
//                .map(String::trim)  // Trim leading and trailing whitespace
//                .filter(s -> !s.isEmpty())  // Remove empty strings after trimming
//                .map(s -> s.substring(0, 1).toUpperCase() + s.substring(1).toLowerCase())  // Capitalize first letter
//                .distinct()  // Remove duplicates
//                .sorted()  // Sort the list
//                .collect(Collectors.toList());
//        System.out.println(result);

    }


    private static List<String> getList(List<String> stringList) {
        // Remove null values
        // Trim leading and trailing
        // Remove empty strings after trimming
        // Capitalize first letter
        // Remove duplicates
        // Sort the list
        return stringList.stream()
                .filter(Objects::nonNull)
                .map(String::trim)
                .filter(s ->!s.isEmpty())
                .map(s-> s.substring(0,1).toUpperCase() + s.substring(1).toLowerCase())

                .distinct()
                .sorted()
                .collect(Collectors.toList());

    }

    private static List<String> getStringStandard(List<String> stringList)  {
        String[] sa = new String[stringList.toArray().length];
        sa = stringList.toArray(sa);
        List<String> stringArrayList = new ArrayList<>(Arrays.asList(sa)); //Convert array to list

        List<String> strings = new ArrayList<>();
        Set<String> stringSet = new HashSet<>();

        for (String s : stringList) {
            if (s != null) {
                String trimmed = s.trim(); // Trim first

                if (!trimmed.isEmpty() && stringSet.add(trimmed)) {
                    String capitalized = trimmed.substring(0, 1).toUpperCase() + trimmed.substring(1).toLowerCase();
                    strings.add(capitalized); // Add the trimmed string
                }
            }
        }

        return sortList(strings);
    }

    private static List<String> sortList(List<String> strings) {
        List<String> stringList;
        stringList = strings.stream().sorted().collect(Collectors.toList());
       return stringList;
    }

    private static void example() {
        List<String> strings = new ArrayList<>(Arrays.asList("ZebrA", "ManGo", "Afaik", "Dick", null, "", " Dick", "{}sa"));
        List<String> strings2 = new ArrayList<>(Arrays.asList("ZebrA", "ManGo", "Afaik", "Dick", null, "", " Dick", "{}sa"));

        List<String> stringList = new ArrayList<>();
//
//        stringList = strings.stream()
//                .filter(Objects::nonNull)
//                .map(String::trim)
//                .map(s -> !s.isEmpty())
//                .map(s -> s.substring(0,1).toLowerCase() + s.substring(1).toUpperCase())
//                .distinct()
//                .sorted()
//                .collect(Collectors.toList());

        List<List<String>> lists = Arrays.asList(
                Arrays.asList("Jeff", "Bezos"),
                Arrays.asList("Bill", "Gates"),
                Arrays.asList("Mark", null),
                Arrays.asList("Nicko", " Uchiha"));

        List<String> lists1 = new ArrayList<>();
        lists1 = lists.stream()
                .flatMap(Collection::stream)
                .filter(Objects::nonNull)
                .map(String::trim)
                .distinct()
                .sorted()
                .collect(Collectors.toList());
        System.out.println(lists1);
        String name = "dasdsad ";

    }
// try {
//        // Your transactional code here
//        transactionManager.commit(status);
//    } catch (Exception e) {
//        transactionManager.rollback(status);
//        throw e;
//    }


    private static void sample(List<String> strings){
        List<String> stringList = new ArrayList<>();

        stringList = strings.stream()
                .filter(Objects::nonNull)
                .filter(s->!s.isEmpty())
                .map(String::trim)
                .distinct()
                .sorted()
                .collect(Collectors.toList());
        String s = "SSS";
    }
}


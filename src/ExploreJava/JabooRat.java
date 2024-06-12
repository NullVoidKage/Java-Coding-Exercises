package ExploreJava;

import java.util.*;

public class JabooRat {
    public static void main(String[] args) {
        List<String> nameList = List.of("EAT",
                "PAN", "NAP", "EATN", "TAE");
        List<Integer> key = new ArrayList<>();
        List<String> value = new ArrayList<>();

        Map<Integer, String> stringMap = new HashMap<>();
        int length = nameList.toArray().length;
        for(int i =0;i<length;i++) {
            key.add(nameList.get(i).length());
            value.add(nameList.get(i));
//            stringMap.put(nameList.get(i).length(), nameList.get(i));
        }
        System.out.println(key);
        System.out.println(value);
//        for(Map.Entry<Integer, String> map : stringMap.entrySet()) {
//            String value = map.getValue();
//            Integer key = map.getKey();
//            System.out.println(value);
//            System.out.println(key);
//        }
//        System.out.println(getValues(stringMap));
    }

    public static List getValues(Map map){
        return new ArrayList(map.values());
    }

    public static List getKey(Map map){
        return new ArrayList(map.keySet());
    }
}

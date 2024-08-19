package ExploreJava;

import java.util.List;

public class Lambda {
    public static void main(String[] args) {
        List<String> nameList = List.of("Sasuke",
                "Itachi", "Obito", "Madara", "Shisui");

        nameList.forEach(names -> {

            names.lines();
            System.out.println(names);
        });
    }
}

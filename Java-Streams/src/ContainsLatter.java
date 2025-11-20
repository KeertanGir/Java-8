

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ContainsLatter {
    public ContainsLatter() {
    }

    public static void main(String[] args) {
        List<String> list = new ArrayList();
        list.add("Chander");
        list.add("Sunny");
        list.add("Raghveer");
        list.add("Keertan");
        Stream<String> stream = list.stream();
        List<String> names = (List)stream.filter((name) -> name.contains("a")).collect(Collectors.toList());
        System.out.println(list);
        System.out.println(names);
    }
}

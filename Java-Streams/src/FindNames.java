//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FindNames {
    public FindNames() {
    }

    public static void main(String[] args) {
        List<String> lis = new ArrayList();
        lis.add("Keertan");
        lis.add("Rohit");
        lis.add("Ram");
        lis.add("Keertan Gir");
        Stream<String> stream = lis.stream();
        List<String> names = (List)stream.filter((name) -> name.startsWith("R")).map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(lis);
        System.out.println(names);
    }
}

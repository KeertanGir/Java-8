//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ToLowerCase {
    public ToLowerCase() {
    }

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList(List.of("KEERTAN", "CHANDER", "RAM"));
        List<String> names = (List)list.stream().map(String::toLowerCase).collect(Collectors.toList());
        System.out.println(list);
        System.out.println(names);
    }
}

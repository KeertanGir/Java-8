//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class countName {
    public countName() {
    }

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList(List.of("Keertan", "Kiran", "Chander", "Kartik"));
        Stream<String> stream = list.stream();
        long count = stream.filter((name) -> name.equals("Keertan")).count();
        System.out.println(count);
    }
}

//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class findEven {
    public findEven() {
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11));
        Stream<Integer> stream = list.stream();
        List<Integer> odd = (List)stream.filter((n) -> n % 2 != 0).collect(Collectors.toList());
        stream.close();
        Stream<Integer> stream2 = list.stream();
        List<Integer> even = stream2.filter((n) -> n % 2 == 0).toList();
        System.out.println("Orignal : " + String.valueOf(list));
        System.out.println("Odd Numbers : " + String.valueOf(odd));
        System.out.println("Even Numbers : " + String.valueOf(even));
    }
}

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Sorting {
    public static void main(String[] args) {
        ArrayList<Integer> lis = new ArrayList<>(List.of(3,9,2,34,12,4,1,2));
        Stream<Integer> stream = lis.stream();
        List<Integer> sorted = stream.sorted().toList();
        System.out.println(lis);
        System.out.println(sorted);
    }
}

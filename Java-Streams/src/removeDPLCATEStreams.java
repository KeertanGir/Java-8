import java.util.ArrayList;
import java.util.List;

public class removeDPLCATEStreams {
    public static void main(String [] args){
        ArrayList<Integer> list = new ArrayList<>(List.of(1,2,2,3,3,4,4,5,5,6,6));
        List<Integer> newList = list.stream().distinct().toList();
        System.out.println(list);
        System.out.println(newList);

    }
}

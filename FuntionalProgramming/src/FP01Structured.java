import java.util.List;

public class FP01Structured {

    public static void main(String[] args) {
        printNumberInStructure(List.of(12,23,112,34,234,12,34,56,78,65));
    }

    private static void printNumberInStructure(List<Integer> numbers) {
        for(int number: numbers){
            System.out.println(number);
        }
    }
}

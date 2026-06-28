import java.util.List;

public class FP01Funtional {

    public static void main(String[] args) {
        printNumberInFuntional(List.of(12,23,112,34,234,12,34,56,78,65));
    }

    private static void print(int number){
        System.out.println(number);
    }

    private static void printNumberInFuntional(List<Integer> numbers) {
        numbers.stream()
                .forEach(FP01Funtional::print);
                // method reference
    }

}

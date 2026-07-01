import java.util.List;

public class FP01Funtional {

    public static void main(String[] args) {
        printNumberInFuntional(List.of(12,23,112,34,234,12,34,56,78,65));
    }

    private static void print(int number){
        System.out.println(number);
    }

//    private static boolean isEven(int number){
//        return number%2 ==0;
//    }

    private static void printNumberInFuntional(List<Integer> numbers) {
        numbers.stream()
//                .filter(FP01Funtional::isEven) // Used With the Function
                .filter(number -> number%2 ==0) // lambda expression
                .forEach(FP01Funtional::print); // Method Reference
                // method reference
    }

}

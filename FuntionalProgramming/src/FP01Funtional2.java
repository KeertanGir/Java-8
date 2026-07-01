import java.util.List;

public class FP01Funtional2 {


//    Exercise no : 2
//    Print names Indiviual

    public static void main(String[] args) {
        printFuntionalNames(List.of( "Palak" ,"Keertan", "Jeewan", "Aneel", "Rohan", "Lakesh", "Parhsnat"));
    }

//    private static void print( String name ){
//        System.out.println(name);
//    }

    private static void printFuntionalNames(List<String> names) {
        names.stream().forEach(System.out::println);
    }

}

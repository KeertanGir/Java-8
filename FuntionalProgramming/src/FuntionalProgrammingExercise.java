import java.util.List;

public class FuntionalProgrammingExercise {

    public static void main(String [] args){

        List<Integer> numbers = List.of(1,23,123,324,1,2,1,2,31,23,12,2,2,1,44);
        printOdds(numbers);

//        ----------------------------------------------------------------

        List<String> courses = List.of("Spring", "Spring Boot", "API", "Docker", "kubernaties", "Java" );
        printCourses(courses);

//        ----------------------------------------------------------------
        printSpringCourses(courses);
//        ----------------------------------------------------------------
        printCoursesWithFourLegth(courses);
//        ----------------------------------------------------------------
        printCubesOfEvenNumbers(numbers);
//        ----------------------------------------------------------------
        printCoursesLenghths(courses);

    }



//    Exercise no : 1
//          Print Only Odd Numbers

    private static void printOdds(List<Integer> numbers) {
        System.out.println("--------------------------------------------");
        numbers.stream()
                .filter(number -> number%2!=0)
                .forEach(System.out::println);
    }

//    Exercise no : 2
//          Print All The Courses
    private static void printCourses(List<String> courses) {
        System.out.println("--------------------------------------------");
        courses.stream()
                .forEach(System.out::println);
    }

//    Exercise No : 3
//        Print Spring Courses

    private static void printSpringCourses(List<String> courses) {
        System.out.println("--------------------------------------------");
        courses.stream()
                .filter(course -> course.contains("Spring"))
                .forEach(System.out::println);
    }

//    Exercise no : 4
//        Print Only courses With length at least 4
    private static void printCoursesWithFourLegth(List<String> courses) {
        System.out.println("--------------------------------------------");
        courses.stream()
                .filter(course -> course.length() >= 4)
                .forEach(System.out::println);
    }

//    Exercise no : 5
//    print the cubes of the numbers.
    private static void printCubesOfEvenNumbers(List<Integer> numbers) {
        System.out.println("--------------------------------------------");
        numbers.stream()
                .filter(number -> number%2 ==0)
                .map(number -> ((number * number )* number))
                .forEach(System.out::println);
    }

//  Exercise no : 6
//    print the lengths Of all courses

    private static void printCoursesLenghths(List<String> courses) {

        System.out.println("--------------------------------------------");
        courses.stream()
                .map(course -> course + " " +  course.length())
                .forEach(System.out::println);

    }

}

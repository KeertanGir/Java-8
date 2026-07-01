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

    }



//    Exercise no : 1
//          Print Only Odd Numbers

    private static void printOdds(List<Integer> numbers) {
        numbers.stream()
                .filter(number -> number%2!=0)
                .forEach(System.out::println);
    }

//    Exercise no : 2
//          Print All The Courses
    private static void printCourses(List<String> courses) {
        courses.stream()
                .forEach(System.out::println);
    }

//    Exercise No : 3
//        Print Spring Courses

    private static void printSpringCourses(List<String> courses) {
        courses.stream()
                .filter(course -> course.contains("Spring"))
                .forEach(System.out::println);
    }

//    Exercise no : 4
//        Print Only courses With length at least 4
    private static void printCoursesWithFourLegth(List<String> courses) {
        courses.stream()
                .filter(course -> course.length() >= 4)
                .forEach(System.out::println);
    }

}

package Lacture;

public class Main {
    public static void main(String[] args) {
        System.out.println("My System Starts....");
//        Runnable --> It is the Functional Interface
//        Comparable --> It is the Functional Interface

//        Seprate class Implementaions

         myInterfImp mi = new myInterfImp();
         mi.sayHello();


//        Anonymous Class Implementation
        myInteface i = new myInteface(){

            @Override
            public void sayHello() {
                System.out.println("Hello My name is Keertan This is Anonymous Class!");
            }
        };

        i.sayHello();


//        Using Lemda Functions

         myInteface lmd = () -> {
             System.out.println("This is First Time Im Using Lemda");
         };

         lmd.sayHello();


         SumOfTwo Sum = (  a ,  b) ->  a+b;
        System.out.println(Sum.sum(12,5));
        System.out.println(Sum.sum(17,4));

        LengthOfString ls = (str) -> str.length();
        System.out.println( "Length Of String is : "+ ls.lengthOfString("Keertan Is Learning Lambda in Java 8"));

    }
}

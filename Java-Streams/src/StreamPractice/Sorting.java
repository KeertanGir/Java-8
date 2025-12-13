package StreamPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sorting {
    public static void main(String [] args){
        ArrayList<Integer> list = new ArrayList(List.of(12,12,3,1,24,15,19,10));

        List<Integer> sortedList = list.stream().sorted((a,b) -> b-a ).toList();
        System.out.println(sortedList);


        students st1 = new students(101, "Keertan");
        students st2 = new students(102, "Rahul");
        students st3 = new students(103, "Chander");
        students st4 = new students(104, "Rahul");

        ArrayList<students> list2 = new ArrayList<>();

        list2.add(st1);
        list2.add(st2);
        list2.add(st3);
        list2.add(st4);

        System.out.println(list2);
//        ArrayList<students> desList = list2.stream().sorted((a,b) -> b.id - a.id).toList();
        Collections.sort(list2 , (a,b)-> b.id - a.id);
        System.out.println(list2);


    }
}


class students{
    int id;
    String name;

    students(int id, String name){
        this.id = id;
        this.name = name;
    }

    public String toString(){
        return this.id +" : " + this.name ;
    }
}
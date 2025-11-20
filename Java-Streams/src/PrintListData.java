//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.ArrayList;
import java.util.Scanner;

public class PrintListData {
    public PrintListData() {
    }

    public static void main(String[] args) {
        ArrayList<String> lis = new ArrayList();
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < 5; ++i) {
            System.out.println("Enter any Color : ");
            lis.add(sc.next());
        }

        for(int i = 0; i < 5; ++i) {
            System.out.println((String)lis.get(i));
        }

    }
}

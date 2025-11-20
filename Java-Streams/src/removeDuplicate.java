//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.ArrayList;

public class removeDuplicate {
    public removeDuplicate() {
    }

    public static void main(String[] args) {
        ArrayList<String> lis = new ArrayList();
        lis.add("White");
        lis.add("Black");
        lis.add("Green");
        lis.add("Green");
        lis.add("White");
        lis.add("Black");
        lis.add("Green");
        lis.add("Green");
        ArrayList<String> lis2 = new ArrayList();

        for(String li : lis) {
            if (!lis2.contains(li)) {
                lis2.add(li);
            }
        }

        System.out.println(lis);
        System.out.println(lis2);
    }
}

//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.Arrays;
import java.util.List;

public class squreOfEach {
    public squreOfEach() {
    }

    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 2, 4, 5, 10);
        List<Integer> sqr = nums.stream().map((n) -> n * n).toList();
        System.out.println(nums);
        System.out.println(sqr);
    }
}

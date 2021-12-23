package JavaCore.Level5.Lesson9.StaticModifiers.part1;

import java.util.HashMap;
import java.util.Map;

/*
Static modifiers: part 1

*/

public class Solution {
    public static Map<Double, String> labels = new HashMap<>();

    static {
        labels.put(1.2, "label1");
        labels.put(2.2, "label2");
        labels.put(3.2, "label3");
        labels.put(4.2, "label4");
        labels.put(5.2, "label5");
    }

    public static void main(String[] args) {
        System.out.println(labels);
    }
}

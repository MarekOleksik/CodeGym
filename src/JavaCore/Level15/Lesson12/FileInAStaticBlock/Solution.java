package JavaCore.Level15.Lesson12.FileInAStaticBlock;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

/*
File in a static block

*/

public class Solution {
    public static List<String> lines = new ArrayList<>();

    static {
        try {
            BufferedReader input = new BufferedReader(new FileReader(Statics.FILE_NAME));
            String line = "";
            while ((line = input.readLine()) != null) {
                lines.add(line);
            }
        }
        catch (Exception e) {
            e.printStackTrace();
            }
    }

    public static void main(String[] args) {
        System.out.println(lines);
    }
}

package JavaCore.Level15.Lesson12.MasteringTheStaticBlock;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Mastering the static block

*/

public class Solution {
    public static void main(String[] args) {

    }

    static {
        try {
            reset();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static CanFly result;

    public static void reset() throws IOException {
        //write your code here
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String input = bufferedReader.readLine();

        if ("helicopter".equals(input)) {
            result = new Helicopter();
        } else if ("plane".equals(input)) {
            result = new Plane(Integer.parseInt(bufferedReader.readLine()));
        }
        bufferedReader.close();
    }
}

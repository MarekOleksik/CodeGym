package JavaCore.Level14.Lesson8.GreatestCommonDivisor;

/*
GCD

*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Integer firstLine = Integer.valueOf(reader.readLine());
        Integer secondLine = Integer.valueOf(reader.readLine());

        if (firstLine <= 0 || secondLine <= 0) throw new Exception();

        System.out.println(findGCD(firstLine, secondLine));
    }

    public static int findGCD(int a, int b) {
        if (b == 0)
            return a;
        return findGCD(b, a % b);
    }
}

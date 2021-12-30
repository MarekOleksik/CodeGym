package JavaCore.Level15.Lesson12.Factorial;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;

/*
Factorial

*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int input = Integer.parseInt(reader.readLine());
        reader.close();

        System.out.println(factorial(input));
    }

    public static String factorial(int n) {
        BigDecimal fact;
        if (n < 0) {
            fact = new BigDecimal("0");
        } else {
            fact = new BigDecimal("1");
            for (int i = 1; i <= n; i++) {
                fact = fact.multiply(new BigDecimal(String.valueOf(i)));
            }
        }
        String result = String.valueOf(fact);
        return result;
    }
}

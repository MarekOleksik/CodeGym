package JavaCore.Level5.Lesson12.DifferentMethodsForDifferentTypes;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/*
Different methods for different types

*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //write your code here

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String input = bufferedReader.readLine();
        while (!input.equals("exit")) {
            if (input.matches("[-+]?\\d*\\.?\\d+") && input.contains(".")) {
                print(Double.parseDouble(input));
            } else if (input.matches("[-+]?\\d*\\.?\\d+") && Integer.parseInt(input) > 0 && Integer.parseInt(input) < 128) {
                print(Short.parseShort(input));
            } else if (input.matches("[-+]?\\d*\\.?\\d+") && (Integer.parseInt(input) >= 128 || Integer.parseInt(input) <= 0)) {
                print(Integer.parseInt(input));
            } else {
                print(input);
            }
            input = bufferedReader.readLine();
        }
    }

    public static void print(Double value) {
        System.out.println("This is a Double. Value: " + value);
    }

    public static void print(String value) {
        System.out.println("This is a String. Value: " + value);
    }

    public static void print(short value) {
        System.out.println("This is a short. Value: " + value);
    }

    public static void print(Integer value) {
        System.out.println("This is an Integer. Value: " + value);
    }
}

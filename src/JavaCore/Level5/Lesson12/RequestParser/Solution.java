package JavaCore.Level5.Lesson12.RequestParser;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Request parser

*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //write your code here
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String URL = bufferedReader.readLine();
        String[] params = URL.split("\\?");
        String[] outputParams = params[1].split("&");
        String output = "";
        String value = "";

        for (String p : outputParams) {
            String[] temp = p.split("=");
            output += temp[0] + " ";
            if (temp[0].equals("obj")) {
                value = temp[1];
            }
        }

        System.out.println(output.substring(0,output.length()-1));

        if (!value.isEmpty()) {
            try {
                alert(Double.parseDouble(value));
            } catch (Exception e) {
                alert(value);
            }
        }
    }

    public static void alert(double value) {
        System.out.println("double: " + value);
    }

    public static void alert(String value) {
        System.out.println("String: " + value);
    }
}

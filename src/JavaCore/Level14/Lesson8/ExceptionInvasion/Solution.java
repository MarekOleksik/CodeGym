package JavaCore.Level14.Lesson8.ExceptionInvasion;

import java.util.ArrayList;
import java.util.List;

/*
Exception invasion

*/

public class Solution {
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args) {
        initExceptions();

        for (Exception exception : exceptions) {
            System.out.println(exception);
        }
    }

    private static void initExceptions() {   // The first exception
        try {
            float i = 1 / 0;

        } catch (Exception e) {
            exceptions.add(e);
        }
        //write your code here
        exceptions.add(new RuntimeException());
        exceptions.add(new NoSuchMethodException());
        exceptions.add(new ArrayStoreException());
        exceptions.add(new ArrayIndexOutOfBoundsException());
        exceptions.add(new ClassNotFoundException());
        exceptions.add(new IndexOutOfBoundsException());
        exceptions.add(new IllegalStateException());
        exceptions.add(new NumberFormatException());
        exceptions.add(new IllegalThreadStateException());
    }
}

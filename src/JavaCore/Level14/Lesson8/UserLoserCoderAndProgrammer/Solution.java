package JavaCore.Level14.Lesson8.UserLoserCoderAndProgrammer;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import JavaCore.Level14.Lesson8.UserLoserCoderAndProgrammer.Person;

/*
User, loser, coder and programmer

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Person person = null;
        String key;

        // Here's the loop for reading the keys. Item 1
        while (isStringMatch(key = reader.readLine())) {
            // Create an object. Item 2
            switch (key) {
                case "user":
                    person = new Person.User();
                    break;
                case "loser":
                    person = new Person.Loser();
                    break;
                case "coder":
                    person = new Person.Coder();
                    break;
                case "programmer":
                    person = new Person.Programmer();
                    break;
            }
            doWork(person); // Call doWork
        }

    }

    private static boolean isStringMatch(String input) {
        return "user".equals(input) || "loser".equals(input) || "coder".equals(input) || "programmer".equals(input);
    }

    public static void doWork(Person person) {
        // Item 3
        if (person instanceof Person.User) {
            Person.User user = (Person.User) person;
            user.live();
        } else if (person instanceof Person.Programmer) {
            Person.Programmer programmer = (Person.Programmer) person;
            programmer.enjoy();
        } else if (person instanceof Person.Coder) {
            Person.Coder coder = (Person.Coder) person;
            coder.writeCode();
        } else if (person instanceof Person.Loser) {
            Person.Loser loser = (Person.Loser) person;
            loser.doNothing();
        }
    }


}

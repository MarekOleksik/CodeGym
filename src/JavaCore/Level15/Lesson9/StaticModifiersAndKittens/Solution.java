package JavaCore.Level15.Lesson9.StaticModifiersAndKittens;

/*
Static modifiers and kittens

*/

public class Solution {
    public static Cat cat;

    static {
        cat = new Cat();
        cat.name = "Tom";
        System.out.println(cat.name);
    }

    public static void main(String[] args) {

    }

    public static class Cat {
        public String name;
    }
}

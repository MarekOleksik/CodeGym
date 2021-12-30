package JavaCore.Level15.Lesson2.OOP_ArrangeInterfaces;

/*
OOP: Arrange interfaces

*/

public class Solution {
    public static void main(String[] args) {

    }

    public interface Movable {
        boolean isMovable();
    }

    public interface Sellable {
        Object getAllowedAction(String name);
    }

    public interface Discountable {
        Object getAllowedAction();
    }

    public static class Clothes implements Movable, Sellable, Discountable {

        public  boolean isMovable() {
            return true;
        }

        public  Object getAllowedAction() {
            return "object";
        }

        public  Object getAllowedAction(String action) {
            return "object " + action;
        }


    }
}

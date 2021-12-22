package JavaCore.Level5.Lesson2.OOP_AnimalInheritance;

/*
OOP: Animal inheritance

*/

public class Solution {
    // Add the Goose and Dragon classes here
    public static class Goose extends SmallAnimal {
        public String getSize() {
            SmallAnimal small = new SmallAnimal();
            return "A goose is small, " + small.getSize();
        }
    }

    public static class Dragon extends BigAnimal {
        public String getSize() {
            BigAnimal big = new BigAnimal();
            return "A dragon is big, " + big.getSize();
        }
    }

    public static void main(String[] args) {

    }

    public static class BigAnimal {
        protected String getSize() {
            return "like a dinosaur";
        }
    }

    public static class SmallAnimal {
        String getSize() {
            return "like a cat";
        }
    }
}

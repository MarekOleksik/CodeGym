package JavaCore.Level15.Lesson6.TheSimplestCode.part2;

/*
The simplest code: part 2

*/

public class Solution {
    public static void main(String[] args) {
        SiamCat coco = new SiamCat("Coco");
        NakedCat nakedCoco = coco.shave();
    }

    public static class NakedCat {
    }

    public static class NormalCat extends NakedCat {

        public NormalCat() {
        }

        public NormalCat(String name) {
            System.out.println("My name is " + name);
        }

        public NakedCat shave() {
            return this;
        }
    }

    public static class SiamCat extends NormalCat {
        public SiamCat(String name) {
            super(name);
        }
    }
}

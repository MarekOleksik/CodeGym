package JavaCore.Level16.Lesson10.NoInterruptNoDice;

/*
No interrupt, no dice?

*/

public class Solution {
    public static boolean isClockRun = true;

    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(new TestThread());
        t.start();
        Thread.sleep(3000);
        ourInterrupt();
    }

    public static void ourInterrupt() {
        isClockRun = false;
    }

    public static class TestThread implements Runnable {
        public void run() {
            while (isClockRun) {
                try {
                    System.out.println("he-he");
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                }
            }
        }
    }
}

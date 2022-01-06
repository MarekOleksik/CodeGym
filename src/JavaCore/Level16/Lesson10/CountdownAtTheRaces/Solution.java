package JavaCore.Level16.Lesson10.CountdownAtTheRaces;

/*
Countdown at the races

*/

public class Solution {
    public static volatile int numSeconds = 3;

    public static void main(String[] args) throws InterruptedException {
        RacingClock clock = new RacingClock();
        //write your code here
        String result = "";
        if (numSeconds <= 3) {
            result = "Go!";
        } else {
            result = "Interrupted!";
        }
        Thread.sleep(3500);
        clock.interrupt();
        System.out.print(result);
    }

    public static class RacingClock extends Thread {
        public RacingClock() {
            start();
        }

        public void run() {
            //write your code here
            while (numSeconds > 0) {
                System.out.print(numSeconds + " ");
                numSeconds--;
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

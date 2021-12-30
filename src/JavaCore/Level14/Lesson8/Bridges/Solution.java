package JavaCore.Level14.Lesson8.Bridges;

/*
Bridges

*/

public class Solution {
    public static void main(String[] args) {
        println(new WaterBridge());
        println(new SuspensionBridge());
    }

    // Add println method here
    public static void println(Bridge bridge) {
        System.out.println(bridge.getCarsCount());
    }
}


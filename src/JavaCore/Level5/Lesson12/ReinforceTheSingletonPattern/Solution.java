package JavaCore.Level5.Lesson12.ReinforceTheSingletonPattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Reinforce the singleton pattern

*/

public class Solution {
    public static void main(String[] args) {

    }

    public static Planet thePlanet;

    // Add static block here
    static {
        try {
            readKeyFromConsoleAndInitPlanet();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void readKeyFromConsoleAndInitPlanet() throws IOException {
        // Implement step #5 here
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String input = bufferedReader.readLine();

        switch (input) {
            case Planet.SUN: {
                thePlanet = Sun.getInstance();
            }
            break;
            case Planet.MOON: {
                thePlanet = Moon.getInstance();
            }
            break;
            case Planet.EARTH: {
                thePlanet = Earth.getInstance();
            }
            break;
            default: thePlanet = null;
        }
    }
}

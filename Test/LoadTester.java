package travelinc.Test;

import java.io.File;

import travelinc.Subway.*;


public class LoadTester {
    public static void main(String[] args) {
        try {
            SubwayLoader loader = new SubwayLoader();
            Subway objectville = loader.loadFromFile(new File("ObjectVilleSubway.txt"));
            System.out.println("process complete");

            System.out.println("Testing stations...");
            if (objectville.hasStation("Head First Labs") &&
            objectville.hasStation("CSS Center") &&
            objectville.hasStation("SimUDuck Lake")) {
            System.out.println("...station test passed successfully.");
            } else {
            System.out.println("...station test FAILED.");
            System.exit(-1);
            }

        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
    }
}

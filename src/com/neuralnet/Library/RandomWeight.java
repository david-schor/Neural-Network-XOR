package com.neuralnet.Library;

import java.util.Random;

public class RandomWeight {

    private static double min = 0.1;
    private static double max = 2.0;

    public static double setWeight() {

        Random r = new Random();
        return min + (max - min) * r.nextDouble();

    }
}

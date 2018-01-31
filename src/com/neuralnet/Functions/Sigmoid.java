package com.neuralnet.Functions;

import java.util.ArrayList;
import java.util.List;

public class Sigmoid {

    private List<Double> weights = new ArrayList<>();

    public Sigmoid() {}

    public Sigmoid(double weight) {
        weights.add(weight);
    }

    public void addWeight(double weight) {
        weights.add(weight);
    }

    public double calcOutput() {

        double calculated = 0;

        for(int i = 0; i < weights.size(); i++) {
            calculated += weights.get(i);
        }

        return calculated;
    }

    public double calcSigmoid(double input) {
        return (1/( 1 + Math.pow(Math.E,(-1*input))));
    }

    public static double calcDeritative(double result) {
        double f = 1/(1+Math.exp(-result));
        return (f * (1 - (1/(1+Math.exp(-result)))));
    }

}

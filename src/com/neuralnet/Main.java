package com.neuralnet;

public class Main {

    private static double MINWEIGHT = 0.1;
    private static double MAXWEIGHT = 2.0;

    public static void main(String[] args) {

        Layer inputLayer = new Layer(null);
        Neuron inputOne = new Neuron();
        Neuron inputTwo = new Neuron();

        inputOne.setInput(1);
        inputTwo.setInput(1);

        inputLayer.addNeuron(inputOne);
        inputLayer.addNeuron(inputTwo);

        Layer hiddenLayer = new Layer(inputLayer);
        Neuron hiddenOne = new Neuron();
        Neuron hiddenTwo = new Neuron();
        Neuron hiddenThree = new Neuron();

        hiddenLayer.addNeuron(hiddenOne, randomWeights());
        hiddenLayer.addNeuron(hiddenTwo, randomWeights());
        hiddenLayer.addNeuron(hiddenThree, randomWeights());

    }

    private static double[] randomWeights(){

        return new double[]{MINWEIGHT + Math.random( ) * MAXWEIGHT, MINWEIGHT + Math.random( ) * MAXWEIGHT};
    }
}

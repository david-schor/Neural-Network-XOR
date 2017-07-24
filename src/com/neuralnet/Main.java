package com.neuralnet;

public class Main {

    private static double MINWEIGHT = 0.1;
    private static double MAXWEIGHT = 2.0;

    public static void main(String[] args) {

        //Input Neurons and Layer
        Layer inputLayer = new Layer(null);
        Neuron inputOne = new Neuron();
        Neuron inputTwo = new Neuron();

        inputOne.setInput(1);
        inputTwo.setInput(1);

        inputLayer.addNeuron(inputOne);
        inputLayer.addNeuron(inputTwo);

        System.out.println(inputLayer.getNeurons());

        //Hidden Neurons and Layer
        Layer hiddenLayer = new Layer(inputLayer);
        Neuron hiddenOne = new Neuron();
        Neuron hiddenTwo = new Neuron();
        Neuron hiddenThree = new Neuron();

        hiddenLayer.addNeuron(new Sigmoid(hiddenOne, randomWeights()));
        hiddenLayer.addNeuron(new Sigmoid(hiddenTwo, randomWeights()));
        hiddenLayer.addNeuron(new Sigmoid(hiddenThree, randomWeights()));

        System.out.println(hiddenLayer.getNeurons());
        System.out.println(hiddenLayer.getSynapses());

        //Result Neurons and Layer
        Layer resultLayer = new Layer(hiddenLayer);
        Neuron result = new Neuron();

        resultLayer.addNeuron(new Sigmoid(result, randomWeights()));

        System.out.println(resultLayer.getNeurons());
        System.out.println(resultLayer.getSynapses());

        Sigmoid sigmoid = new Sigmoid();
        System.out.println(sigmoid.calcSigmoid(hiddenLayer.getNeurons().get(0).getInput() + hiddenLayer.getSynapses().get(0).getWeight() * hiddenLayer.getNeurons().get(1).getInput() + hiddenLayer.getSynapses().get(1).getWeight() * hiddenLayer.getNeurons().get(2).getInput() + hiddenLayer.getSynapses().get(2).getWeight()));

    }

    private static double[] randomWeights(){

        return new double[]{MINWEIGHT + Math.random( ) * MAXWEIGHT, MINWEIGHT + Math.random( ) * MAXWEIGHT};
    }
}

package com.neuralnet;

public class Synapse {

    private Neuron neuron;
    private double weight;

    public Synapse(Neuron neuron, double weight){
        this.neuron = neuron;
        this.weight = weight;
    }

}

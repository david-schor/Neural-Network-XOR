package com.neuralnet;

import java.util.ArrayList;
import java.util.List;

public class Synapse {

    private Neuron neuron;
    private double weight;

    public Synapse(Neuron neuron, double weight){
        this.neuron = neuron;
        this.weight = weight;
    }

    public double getWeight(){
        return weight;
    }

    public Neuron getNeuron(){
        return neuron;
    }

}

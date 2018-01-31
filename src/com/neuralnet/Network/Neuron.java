package com.neuralnet.Network;

import java.util.ArrayList;
import java.util.List;

public class Neuron {

    private double input;
    private List<Synapse> synapses = new ArrayList<>();

    public Neuron() {}

    public Neuron(double input) {
        this.input = input;
    }

    public void setSynapse(Synapse synapse){
        synapses.add(synapse);
    }

    public List<Synapse> getSynapses(){
        return this.synapses;
    }

    public void setInput(double input){
        this.input = input;
    }

    public double getInput(){
        return this.input;
    }

}

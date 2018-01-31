package com.neuralnet.Network;

public class Synapse {

    private double weight;

    public Synapse(double weight) {
        this.weight = weight;
    }

    public void setWeight(double weight){
        this.weight = weight;
    }

    public double getWeight(){
        return this.weight;
    }

}

package com.neuralnet;

public class Sigmoid {

    private Neuron neuron;
    private double weight[];
    private int i = 0;
    private int x = 0;

    public Sigmoid(){
    }

    public Sigmoid(Neuron neuron, double weight[]){
        this.neuron = neuron;
        this.weight = weight;
    }

    public double calcOutput(){
        return 1 * weight[0] + 1 * weight[1];
    }

    public double calcSigmoid(double x){ //calcOutput = x
        return (1/( 1 + Math.pow(Math.E,(-1*x))));
    }

    public double getWeight(){

        i = x;

        if (i == 0){
            x = 1;
            return weight[i];
        }

        if(i == 1){
            x = 0;
            return weight[i];
        }

        return i;

    }

    public Neuron getNeuron(){
        return neuron;
    }

}

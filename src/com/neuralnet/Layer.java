package com.neuralnet;

import java.util.ArrayList;
import java.util.List;

public class Layer {

    private List<Neuron> neurons = new ArrayList<>();
    private Layer prevLayer;

    public Layer(Layer prevLayrer){
        this.prevLayer = prevLayrer;
    }

    public List<Neuron>  getNeurons(){
        return neurons;
    }

    public void addNeuron(Neuron neuron){
        neurons.add(neuron);

        //Create Synapse

    }

    public void addNeuron(Neuron neuron, double[] weight){
        neurons.add(neuron);

        if(prevLayer != null){

            //Create Synapse

        }
    }

}

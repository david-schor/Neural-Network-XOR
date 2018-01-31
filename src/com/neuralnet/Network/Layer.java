package com.neuralnet.Network;

import java.util.ArrayList;
import java.util.List;

public class Layer {

    private List<Neuron> neurons = new ArrayList<>();
    private Layer prevLayer;

    public Layer(Layer prevLayer){
        this.prevLayer = prevLayer;
    }

    public void addNeuron(Neuron neuron){
        neurons.add(neuron);
    }

    public List<Neuron> getNeurons(){
        return neurons;
    }

}

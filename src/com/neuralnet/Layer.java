package com.neuralnet;

import java.util.ArrayList;
import java.util.List;

public class Layer {

    private List<Neuron> neurons = new ArrayList<>();
    private List<Synapse> synapses = new ArrayList<>();
    private Layer prevLayer;

    public Layer(Layer prevLayrer){
        this.prevLayer = prevLayrer;
    }

    public void addNeuron(Neuron neuron){
        neurons.add(neuron);
    }

    public void addNeuron(Sigmoid sigmoid){

        neurons.add(sigmoid.getNeuron());

        sigmoid.getNeuron().setInput(sigmoid.calcSigmoid(sigmoid.calcOutput()));

        System.out.println("Neuron: " + sigmoid.getNeuron() + " || Input: " + sigmoid.getNeuron().getInput());

        for(Neuron prevLayerNeuron : prevLayer.getNeurons()){
            Synapse synapse = new Synapse(prevLayerNeuron, sigmoid.getWeight());
            synapses.add(synapse);
            System.out.println("Synapse: " + synapse + " || Weight: " + synapse.getWeight());
        }

    }

    public List<Neuron> getNeurons(){
        return neurons;
    }

    public List<Synapse> getSynapses(){
        return synapses;
    }


}

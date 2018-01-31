package com.neuralnet.Steps;

import com.neuralnet.Network.Layer;
import com.neuralnet.Network.Neuron;
import com.neuralnet.Network.Synapse;
import com.neuralnet.Library.RandomWeight;

import java.util.ArrayList;
import java.util.List;

public class Setup {

    private static List<Layer> layers = new ArrayList<>();
    private static List<Neuron> neurons = new ArrayList<>();

    public static int target = 0;

    public static void setup(int cnt_l, int cnt_in, int cnt_hn, int cnt_rn) {

        setLayers(cnt_l);
        setInputNeurons(cnt_in);
        setHiddenNeurons(cnt_hn);
        setResultNeurons(cnt_rn);
        //readCSV();
        //setLearningGrad();
        //setFunction();
        addSynapses();

    }

    public static void setLayers(int count) {

        int i = 0;

        while(i < count) {
            switch(i) {
                case 0:
                    Layer lf = new Layer(null);
                    layers.add(lf);
                    break;
                default:
                    Layer ld = new Layer(layers.get(layers.size() - 1));
                    layers.add(ld);
                    break;
            }
            i++;
        }
    }

    public static void setInputNeurons(int count) {

        int i = 0;

        while(i < count) {
            Neuron n = new Neuron();
            layers.get(0).addNeuron(n);
            neurons.add(n);

            i++;
        }
    }

    public static void setHiddenNeurons(int count) {

        int x = 1;
        int i = 0;
        int max = layers.size() - 2;

        while(x <= max) {

            while(i < count) {
                Neuron n = new Neuron();
                layers.get(x).addNeuron(n);
                neurons.add(n);

                i++;
            }
            i = 0;
            x++;
        }
    }

    public static void setResultNeurons(int count) {

        int i = 0;

        while(i < count) {
            Neuron n = new Neuron();
            layers.get(layers.size() - 1).addNeuron(n);
            neurons.add(n);

            i++;
        }

    }

    public static void addSynapses(){

        int x = 1;
        int max = layers.size() - 1;

        while(x <= max) {
            for(Neuron n : layers.get(x-1).getNeurons()) {
                for (Neuron neuron : layers.get(x).getNeurons()) {
                    Synapse synapse = new Synapse(RandomWeight.setWeight());
                    neuron.setSynapse(synapse);
                }
            }
            x++;
        }
    }

    public static void setTarget(int tar) {
        target = tar;
    }

    public static List<Layer> getLayers(){
        return layers;
    }

}

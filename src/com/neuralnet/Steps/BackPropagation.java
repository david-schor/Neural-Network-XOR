package com.neuralnet.Steps;

import com.neuralnet.Main;
import com.neuralnet.Network.Layer;
import com.neuralnet.Network.Neuron;
import com.neuralnet.Network.Synapse;

import java.util.ArrayList;
import java.util.List;
import static com.neuralnet.Functions.Sigmoid.*;


public class BackPropagation extends Setup {

    private double result;
    private double error;

    private double deltaSum;
    private static List<Double> synapsess = new ArrayList<>();
    private static List<Double> neuronss = new ArrayList<>();
    private static List<Double> mimimiinput = new ArrayList<>();
    private static List<Double> mimimiweight = new ArrayList<>();
    private static List<Double> lastone = new ArrayList<>();

    Result r = new Result();

    public void start() {
        calcError();
        changeResultWeight();
        changeHiddenWeight();
        changeWeight();

        synapsess.clear();
        neuronss.clear();
        mimimiinput.clear();
        mimimiweight.clear();
        lastone.clear();
    }

    public void calcError() {
        result = r.getResult();

        error = target - result;

        deltaSum = calcDeritative(result) * error;
    }

    public void changeResultWeight(){
        Layer lastLayer = getLayers().get(getLayers().size() - 1);

        for(Neuron neuron : lastLayer.getNeurons()){
            double test = deltaSum / neuron.getInput();

            for(Synapse synapse : neuron.getSynapses()){
                double syn = synapse.getWeight();
                synapse.setWeight(syn + test);
            }
        }

    }

    public void changeHiddenWeight(){
        Layer l1 = getLayers().get(getLayers().size() - 1);
        Layer l2 = getLayers().get(getLayers().size() - 2);

        for(Neuron neuron : l1.getNeurons()){
            for(Synapse synapse : neuron.getSynapses()){
                synapsess.add(synapse.getWeight());
            }
        }

        for(Neuron neuron : l2.getNeurons()){
            neuronss.add(neuron.getInput());
        }

        for(Double input : neuronss){
            mimimiinput.add(calcDeritative(input));
        }

        for(Double weight : synapsess){
            mimimiweight.add(deltaSum / weight);
        }



        for (int i = 0; i < mimimiweight.size(); i++)
        {
            lastone.add(mimimiweight.get(i) * mimimiinput.get(i));
        }


    }

    public void changeWeight(){

        Layer layer = getLayers().get(getLayers().size() - 2);
        List<Synapse> everweight = new ArrayList<>();

        List<Double> sec = new ArrayList<>();

        for(Neuron neuron : layer.getNeurons()){
            for (Synapse synapse : neuron.getSynapses()) {
                everweight.add(synapse);
            }
        }

        while(sec.size() != everweight.size()) {
            for (Double d : lastone) {
                sec.add(d);
            }
        }



        for (int i = 0; i < everweight.size(); i++) {
            everweight.get(i).setWeight(everweight.get(i).getWeight() + sec.get(i));
        }
    }
}

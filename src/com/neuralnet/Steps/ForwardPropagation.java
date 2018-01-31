package com.neuralnet.Steps;

import com.neuralnet.Functions.Sigmoid;
import com.neuralnet.Network.Layer;
import com.neuralnet.Network.Neuron;
import com.neuralnet.Network.Synapse;

import java.util.ArrayList;
import java.util.List;

public class ForwardPropagation extends Setup {

    public void start() {

        for(int i = 1; i < getLayers().size(); i++) {
            Layer layer = getLayers().get(i);
            for (Neuron neuron : layer.getNeurons()) {

                List<Double> weights = new ArrayList<>();
                Sigmoid sigmoid = new Sigmoid();

                for (Synapse synapse : neuron.getSynapses()) {
                    weights.add(synapse.getWeight());
                }

                for (double weight : weights) {
                    sigmoid.addWeight(weight);
                }

                neuron.setInput(sigmoid.calcSigmoid(sigmoid.calcOutput()));

            }
        }
    }
}

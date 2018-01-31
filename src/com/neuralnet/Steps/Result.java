package com.neuralnet.Steps;

import com.neuralnet.Functions.Sigmoid;
import com.neuralnet.Network.Layer;

import java.util.ArrayList;
import java.util.List;

public class Result extends Setup {

    private double result;

    private List<Double> calcs = new ArrayList<>();

    public double getResult() {

        Sigmoid s = new Sigmoid();

        // Second Last Item!
        Layer secondLayer = getLayers().get(getLayers().size() - 2);

        // Last Item
        Layer lastLayer = getLayers().get(getLayers().size() - 1);

        for (int i = 0; i < secondLayer.getNeurons().size(); i++)
        {
            calcs.add(secondLayer.getNeurons().get(i).getInput() * lastLayer.getNeurons().get(0).getSynapses().get(i).getWeight());
        }

        for(int i = 0; i < calcs.size(); i++)
            result += calcs.get(i);

        calcs.clear();

        return s.calcSigmoid(result);
    }
}

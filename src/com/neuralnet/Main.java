package com.neuralnet;

import com.neuralnet.Network.Neuron;
import com.neuralnet.Steps.Result;
import com.neuralnet.Steps.*;

public class Main extends Setup {

    // Min. Layer = 3 | Min. Neuron per Layer = 1
    public static int setLayers = 3;
    public static int setInputNeurons = 2;
    public static int setHiddenNeurons = 3;
    public static int setResultNeurons = 1;

    public static void main(String[] args) {


        // WAS FEHLT:
        // - BIAS
        // - learning-rate
        // - Input setzen + Result! Mit CSV Datei!

        // Als nächstes:
        // - CSV Reader
        // - Learning-rate
        // - BIAS
        // - ALLES ein bisschen Verbessern und verschönern!!!
        // - Kommentieren : Öffentlich freundlich


        // Setup
        Setup.setup(setLayers, setInputNeurons, setHiddenNeurons, setResultNeurons);

        for(Neuron n : getLayers().get(0).getNeurons()){
            n.setInput(0);
        }

        Setup.setTarget(1);

        // Loop - Calculate Result
        BackPropagation bp = new BackPropagation();
        Result r = new Result();
        ForwardPropagation fp = new ForwardPropagation();

        int p = 0;

        while(p < 15) {

            fp.start();
            bp.start();

            System.out.println("RESULT: " + r.getResult());
            System.out.println("----------------");

            p++;
        }
    }
}

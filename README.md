## Neural Network XOR
This is a simple neural network in Java which learns XOR calculations.

## What exactly does the NN?
This NN is just for testing and learning. It's perfect if you unterstood how a NN functions and want to know how to develop it.
This simple NN calculate every XOR-Operation. The NN knows nothing and learns per iteration.

## Explanation
The NN has 3 Layers:
The Input-Layer, the Hidden-Layer and the Output-Layer.

### Input-Layer
The Input-Layer has 2 Neurons for the Input. Look at the following table:
 <table>
      <tr>
        <th>Input 1</th>
        <th>Input 2</th>
        <th>Result</th>
      </tr>
      <tr>
        <td>0</td>
        <td>0</td>
        <td>0</td>
      </tr>
      <tr>
        <td>1</td>
        <td>0</td>
        <td>1</td>
      </tr>
      <tr>
        <td>0</td>
        <td>1</td>
        <td>1</td>
      </tr>
      <tr>
        <td>1</td>
        <td>1</td>
        <td>0</td>
      </tr>
 </table>
 
 ### Hidden-Layer
 The Hidden-Layer has 3 Neurons. All big calculations happens in this Layer. Without it, it wouldn't be possible that the NN can learn. 
 I use the Sigmoid-Activationsfunction, because i know how it works and it's simple.
 
 ### Output-Layer
 In the Output-Layer it has only 1 Neuron. This is because it only needs 1 output and not more. It checks the calculation with the value we want.
 <b>Example:</b> Our Input is 0 and 1. So our Output should be 1. But in the first iteration the NN will not calculate 1 because it knows nothing. so we need to compare the calculation with the result we want. 

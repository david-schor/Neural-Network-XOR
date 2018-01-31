package com.neuralnet.Library;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CSVReader {

    public List<String[]> reader() {
        BufferedReader br = null;
        String line = "";
        File csvFile = new File("training_data.cvs").getAbsoluteFile();
        List<String[]> content = new ArrayList<>();

        try {
            br = new BufferedReader(new FileReader(csvFile));
            while ((line = br.readLine()) != null) {

                content.add(line.split(","));
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return content;
    }
}

package com.company;

import java.awt.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Write the code here
    }
    static List<String>getRecords(String filename){
        List<String>records = new ArrayList<>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(filename));
            String line;
            while ((line = reader.readLine()) != null){
                records.add(line);
            }
            reader.close();
            return records;

        }catch (Exception e){
            System.err.println("An Error Occurred in the extraction of data");
            e.printStackTrace();
            return null;
        }
    }

}

package com.company;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import static com.company.Graph.addEdge;
import static com.company.Graph.printGraph;

public class Main {
    public static void main(String[] args) {
        //Write the code here
        SimpleTree.BinarySearchTree binarySearchTree = new SimpleTree.BinarySearchTree();
        if (binarySearchTree.isBST())
            System.out.println("Is BST");
        else
            System.out.println("Its not BST");

        /*
        int V = 5;
        Graph.Graphh graphh = new Graph.Graphh(V);
        addEdge(graphh, 0, 1);
        addEdge(graphh, 2, 4);
        addEdge(graphh, 3, 2);
        addEdge(graphh, 1, 4);

        printGraph(graphh);
        */
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

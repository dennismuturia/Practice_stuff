package com.company;

import java.util.LinkedList;

public class Graph {
    static class Graphh{
        //First lets learn on how to create a graph
        //Create a vertice
        int V;
        LinkedList<Integer> adListArray[];

        //Create a constructor
        Graphh(int V){
            this.V = V;

            //DEfine the size of the array as number of vertices
            adListArray = new LinkedList[V];

            //Create a new list for each vertex such as the adjacent nodes that can be stored
            for (int i = 0; i <V; i++){
                adListArray[i] = new LinkedList<>();
            }
        }
    }
    static void addEdge(Graphh graph, int src, int dest){
        //Add  an edge from src to dest
        graph.adListArray[src].add(dest);

        //The graphh is unidirected, add an edge from dest to src also
        graph.adListArray[dest].add(src);
    }
    static  void printGraph(Graphh graphh){
        for (int v =0; v < graphh.V; v++){
            System.out.println("Adjacency list of vertices" + v);
            System.out.print("head");
            for(Integer pCrawl: graphh.adListArray[v]){
                System.out.print(" -> "+ pCrawl);
            }
            System.out.println("\n");
        }
    }
}



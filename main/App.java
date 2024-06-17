package main;

import shortestPath.Algorithm;
import graph.Edge;
import graph.Vertex;

import java.util.ArrayList;
import java.util.List;

public class App {


    public static void main(String[] args){
        List<Vertex> graph = new ArrayList<>();

        Vertex v0 = new Vertex("S");
        Vertex v1 = new Vertex("A");
        Vertex v2 = new Vertex("B");
        Vertex v3 = new Vertex("C");
        Vertex v4 = new Vertex("D");
        Vertex v5 = new Vertex("E");

        v0.setNeighbours(new Edge(v1,1));
        v0.setNeighbours(new Edge(v3,2));
        v1.setNeighbours(new Edge(v2,6));
        v2.setNeighbours(new Edge(v4,1));
        v2.setNeighbours(new Edge(v5,2));
        v3.setNeighbours(new Edge(v1,4));
        v3.setNeighbours(new Edge(v4,3));
        v4.setNeighbours(new Edge(v5, 1));

        graph.add(v0);
        graph.add(v1);
        graph.add(v2);
        graph.add(v3);
        graph.add(v4);
        graph.add(v5);

        Algorithm algorithm = new Algorithm(graph);
        algorithm.compute();
        Vertex sink = v5;

        while(sink != null){
            System.out.println(sink + " ---" + sink.getMinDistance() + "--> " + sink.getPredecessor());
            sink = sink.getPredecessor();
        }
    }

}

package shortestPath;

import graph.Edge;
import graph.Vertex;
import topologicalOrdering.TopologicalOrdering;

import java.util.Deque;
import java.util.List;

public class Algorithm {

    private TopologicalOrdering topologicalOrdering;

    public Algorithm(List<Vertex> graph){
        this.topologicalOrdering = new TopologicalOrdering(graph);
        graph.get(0).setMinDistance(0);
    }

    public void compute(){
        Deque<Vertex> topologicalOrder = topologicalOrdering.getStack();
        while(!topologicalOrder.isEmpty()){
            Vertex u = topologicalOrder.pop();
            for(Edge e : u.getNeighbours()){
                Vertex v = e.getTarget();
                if(v.getMinDistance() > u.getMinDistance() + e.getWeight()){
                    v.setMinDistance(u.getMinDistance() + e.getWeight());
                    v.setPredecessor(u);
                }
            }
        }
    }
}

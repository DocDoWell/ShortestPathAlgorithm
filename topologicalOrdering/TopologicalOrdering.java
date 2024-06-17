package topologicalOrdering;

import graph.Edge;
import graph.Vertex;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;

public class TopologicalOrdering {

    private Deque<Vertex> stack;

    public TopologicalOrdering(List<Vertex> graph) {
        this.stack = new ArrayDeque<>();

        for(int i=0; i< graph.size(); i++){
            if(!graph.get(i).isVisited()){
                depthFirstSearch(graph.get(i));
            }
        }

    }

    public void depthFirstSearch(Vertex vertex){
        vertex.setVisited(true);
        for(Edge edge : vertex.getNeighbours()){
            if(!edge.getTarget().isVisited()){
                depthFirstSearch(edge.getTarget());
            }
        }
        stack.push(vertex);
    }

    public Deque<Vertex> getStack() {
        return stack;
    }
}

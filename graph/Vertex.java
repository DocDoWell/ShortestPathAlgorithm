package graph;

import java.util.ArrayList;
import java.util.List;

public class Vertex {
    private String name;
    private boolean visited;
    private int minDistance;
    private Vertex predecessor;
    private List<Edge> neighbours;

    public Vertex(String name){
        this.name = name;
        minDistance = Integer.MAX_VALUE;
        this.neighbours = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMinDistance() {
        return minDistance;
    }

    public void setMinDistance(int minDistance) {
        this.minDistance = minDistance;
    }

    public Vertex getPredecessor() {
        return predecessor;
    }

    public void setPredecessor(Vertex predecessor) {
        this.predecessor = predecessor;
    }

    public List<Edge> getNeighbours() {
        return neighbours;
    }

    public void setNeighbours(Edge neighbour) {
        this.neighbours.add(neighbour);
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    @Override
    public String toString() {
        return name + "-" + predecessor;
    }
}

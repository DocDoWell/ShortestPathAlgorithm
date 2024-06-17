# ShortestPathAlgorithm
Implementation of the shortest path shortestPath in Java. Note, this is not for general graphs but DAGs only. It exploits the fact that dogs enable topological ordering to generate the shortest path in O(V+E) where V is number of vertices and E is number of edges.

Note it assumes that the first Vertex in the Arraylist is the source and the last one in the arraylist is the sink.
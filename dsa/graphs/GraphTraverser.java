

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class GraphTraverser {


    public static void depthFirstSearch(Vertex start, ArrayList<Vertex> visitedVertices){
        System.out.println(start.getData());

        for(Edge e: start.getEdges()){
            Vertex neighbor = e.getEnd();

            if(!visitedVertices.contains(neighbor)){
                visitedVertices.add(neighbor);
                GraphTraverser.depthFirstSearch(neighbor, visitedVertices);
            }
        }


    }
    public static void breadthFirstSearch(Vertex start, ArrayList<Vertex> visitedVertices){
        Queue<Vertex> visitedQueue = new LinkedList<Vertex>();
        visitedQueue.add(start);
        while(!visitedQueue.isEmpty()){
            Vertex current = visitedQueue.remove();
            System.out.println(current.getData());
            for(Edge e: current.getEdges()){
                Vertex neighbor = e.getEnd();

                if(!visitedVertices.contains(neighbor)){
                    visitedVertices.add(neighbor);
                    visitedQueue.add(neighbor);
                }
            }
        }    
	}
    
    public static void main(String[] args){
        System.out.println("----Graph Traverser DFS-----");
        TestGraph testDFS = new TestGraph();
        Vertex startingVertexDFS = testDFS.getStartingVertex();
        ArrayList<Vertex> visitedVerticesDFS = new ArrayList<Vertex>();
        visitedVerticesDFS.add(startingVertexDFS);

        GraphTraverser.depthFirstSearch(startingVertexDFS, visitedVerticesDFS);

        System.out.println("----Graph Traverser BFS-----");

        TestGraph testBFS = new TestGraph();
        Vertex startingVertexBFS = testBFS.getStartingVertex();
        ArrayList<Vertex> visitedVerticesBFS = new ArrayList<Vertex>();
        visitedVerticesBFS.add(startingVertexBFS);

        GraphTraverser.breadthFirstSearch(startingVertexBFS, visitedVerticesBFS);

    }
    
}

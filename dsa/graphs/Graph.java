

import java.util.ArrayList;

public class Graph{
    private ArrayList<Vertex> vertices;
    private boolean isWeighted;
    private boolean isDirected;

    public Graph(boolean inputIsWeighted, boolean inputIsDirected){
        this.isWeighted = inputIsWeighted;
        this.isDirected = inputIsDirected;
        this.vertices = new ArrayList<Vertex>();
    }

    public Vertex addVertex(String value){
        Vertex newVertex = new Vertex(value);
        this.vertices.add(newVertex);
        return newVertex;
    }

    public void addEdge(Vertex vertex1, Vertex vertex2, Integer weight){
        if(!isWeighted){
            weight = null;
        }

        vertex1.addEdge(vertex2, weight);

        if(!isDirected){
            vertex2.addEdge(vertex1, weight);
        }
        
    }

    public void removeEdge(Vertex vertex1,Vertex vertex2){
        vertex1.removeEdge(vertex2);

        if(!isDirected){
            vertex2.removeEdge(vertex1);
        }
    }

    public void removeVertex(Vertex vertex) {
        this.vertices.remove(vertex);
    }

    public ArrayList<Vertex> getVertices() {
		return this.vertices;
	}

	public boolean isWeighted() {
		return this.isWeighted;
	}

	public boolean isDirected() {
		return this.isDirected;
	}

	public Vertex getVertexByValue(String value) {
		for(Vertex v: this.vertices) { 
			if (v.getData() == value) {
				return v;
			}
		}

		return null;
	}
	
	public void print() {
		for(Vertex v: this.vertices) {
			v.print(isWeighted);
		}
	}


    public static void main(String []args){
        Graph busStops = new Graph(true, true);
        Vertex thirupapliur = busStops.addVertex("Thirupapuliur");
        Vertex oldTown = busStops.addVertex("OldTown");

        busStops.addEdge(thirupapliur, oldTown,4900);

        busStops.print();

    }
}

public class Edge{
    private Vertex startVertex;
    private Vertex endVertex;
    private Integer weight;

    public Edge(Vertex startV, Vertex endV, Integer inputWeight){
        this.startVertex = startV;
        this.endVertex = endV;
        this.weight = inputWeight;
    }

    public Vertex getStart(){
        return this.startVertex;
    }

    public Vertex getEnd(){
        return this.endVertex;
    }

    public Integer getWeight(){
        return this.weight;
    }

}
package graph;

public abstract class Edge {

    /**
     * 1er noeud
     */
    protected Vertex vertex1;

    /**
     * 2eme noeud
     */
    protected Vertex vertex2;

    /**
     * Nom de l'arc
     */
    protected String label;

    public Edge(Vertex vertex1, Vertex vertex2, String label) {
        this.vertex1 = vertex1;
        this.vertex2 = vertex2;
        this.label = label;
    }

    public Vertex getVertex1() {
        return vertex1;
    }

    public void setVertex1(Vertex vertex1) {
        this.vertex1 = vertex1;
    }

    public Vertex getVertex2() {
        return vertex2;
    }

    public void setVertex2(Vertex vertex2) {
        this.vertex2 = vertex2;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }
}

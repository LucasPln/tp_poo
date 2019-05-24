package graph;

public class UndirectedEdge extends Edge {

    /**
     * Constructeur d'un arc orienté
     * @param vertex1 1er noeud
     * @param vertex2 2eme noeud
     * @param label nom de l'arc*
     */
    public UndirectedEdge(Vertex vertex1, Vertex vertex2, String label) {
        super(vertex1, vertex2, label);
    }
}

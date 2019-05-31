package graph;

public class DirectedEdge extends Edge{

    /**
     * Vrai si vertex1 = début, sinon Faux
     */
    private Boolean direction;

    /**
     * Constructeur d'un arc orienté
     * @param vertex1 1er noeud
     * @param vertex2 2eme noeud
     * @param label nom de l'arc
     * @param direction indique le sens de l'arc
     */
    public DirectedEdge(Vertex vertex1, Vertex vertex2, String label, Boolean direction) {
        super(vertex1, vertex2, label);
        this.direction = direction;
    }

    /**
     * Revoie la direction de l'arc
     * @return Boolean : Si True : vertex1 -> vertex2, Faux pour l'inverse
     */
    public Boolean getDirection() {
        return direction;
    }

    /**
     * Permet de changer l'orientation de l'arc
     * @param direction La direction de l'arc : Si True : vertex1 -> vertex2, Faux pour l'inverse
     */
    public void setDirection(Boolean direction) {
        this.direction = direction;
    }
}

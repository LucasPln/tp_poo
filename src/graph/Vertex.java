package graph;

public class Vertex {

    /**
     * Nom du noeud
     */
    private String label;

    /**
     * Constructeur d'un Noeud
     * @param label
     */
    public Vertex(String label) {
        this.label = label;
    }

    /**
     * Retourne le nom du noeud
     * @return String : le nom du noeud
     */
    public String getLabel() {
        return label;
    }

    /**
     * Permet de modifier le nom du noeud
     * @param label Le nouveau nom du noeud
     */
    public void setLabel(String label) {
        this.label = label;
    }
}

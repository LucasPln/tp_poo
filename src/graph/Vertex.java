package graph;
import java.io.Serializable;

public class Vertex implements Serializable{

    /**
     * Nom du noeud
     */
    private String label;
    private Vertex[] voisins;

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

    /***
     * Permet d'initialisier le tableau de voisins du Vertex
     * @param tabVoisins Le tableau de vertex qui sont les voisins
     */
    public void setVoisins(Vertex[] tabVoisins){
        this.voisins = tabVoisins;
    }

    /**
     * Permet de retourner tous les voisins du Vertex dans un tableau de Vertex
     * @return Veretx[] Le tableau de vertex voisins
     */
    public Vertex[] getVoisins(){
        return this.voisins;
    }

    public void addVoisin(Vertex vertex){
        int i = 0 ;

        while(i < this.voisins.length && this.voisins[i] != null){
            i++;
        }

        if(i < this.voisins.length){
            this.voisins[i] = vertex;
        }
    }
}

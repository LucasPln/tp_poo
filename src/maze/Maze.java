package maze;

import src.graph.*;

public class Maze{

    private GraphImpl graph;
    private int hauteur;
    private int largeur;


    public Maze(int hauteur, int largeur, Vertex depart, Vertex arrive, Vertex[] noeudEBox){
        
    }

    /**
     * Permet de savoir si on peut aller d'un point A à un point B
     * @param depart Noeud de départ
     * @param arrive Noeud d'arrive
     * @return Boolean :
     */
    public Boolean deplacer(Vertex depart, Vertex arrive){
        return true;
    }
    

}
package graph;


public interface Graph{

    /**
     * Ajoute un noeud au graph
     * @param vertex Le noeud à ajouter
     */
    public void addVertex(Vertex vertex);

    /**
     * Ajoute un arc au graph
     * @param edge L'arc à ajouter
     */
    public void addEdge(Edge edge);

    /**
     * Permet de savoir s'il existe un arc entre deux noeuds
     * @param vertex1 Le premier noeud
     * @param vertex2 Le deuxième noeud
     * @return Boolean : Vrai s'il existe un arc, Faux sinon
     */
    public Boolean existEdgeBetween(Vertex vertex1, Vertex vertex2);

    /**
     * Permet de savoir le nombre de sommet dansle graphe
     * @return int : le nombre de sommet dans le graphe
     */
    public int numbOfVertex();

    /**
     * Permet de savoir de nombre d'arc dans le graphe
     * @return int : le nombre d'arc dans le graphe
     */
    public int numbOfEdge();

    /**
     * Permet de savoir le nombre d'arc pour un sommet donné
     * @param vertex : Le sommet
     * @return int : Le nombre d'arc pour le sommet donné
     */
    public int numbOfEdgeByVertex(Vertex vertex);

    /**
     * Permet de savoir si un noeud est dans le graphe
     * @param vertex Le noeud a testé
     * @return Boolean : Vrai si le noeud est dans le graphe, faux sinon
     */
    public Boolean vertexIsIn(Vertex vertex);

}

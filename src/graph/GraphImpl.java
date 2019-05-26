package graph;

public class GraphImpl implements Graph {

    private Vertex[] tabNoeud;
    private Boolean isDirected;

    public GraphImpl(int taille, Boolean isDirected){
        this.tabNoeud = new Vertex[taille];
        this.isDirected = isDirected;
    }

    public GraphImpl(Vertex[] tabNoeud, Boolean isDirected){
        this.tabNoeud = tabNoeud;
        this.isDirected = isDirected;
        for (Vertex vertex : this.tabNoeud){
            vertex.setVoisins(new Vertex[this.tabNoeud.length]);
        }
    }


    public GraphImpl(Vertex[] tabNoeud, Edge[] tabEdge, Boolean isDirected){
        this.tabNoeud = tabNoeud;
        this.isDirected = isDirected;

        for (Vertex vertex : this.tabNoeud){
            vertex.setVoisins(new Vertex[this.tabNoeud.length]);
        }

        for (Edge edge : tabEdge){
            addEdge(edge);
        }
    }

    @Override
    public void addVertex(Vertex vertex) {
        if(this.numbOfVertex() == this.tabNoeud.length){
            System.out.println("Ajout impossible : graphe déja rempli");
        } else {
            for (Vertex noeud : this.tabNoeud){
                if(noeud == null){
                    noeud = vertex;
                    noeud.setVoisins(new Vertex[this.tabNoeud.length]);
                }
            }
        }
    }

    @Override
    public void addEdge(Edge edge) {
        if(this.vertexIsIn(edge.getVertex1()) && this.vertexIsIn(edge.getVertex2())){
            if(this.isDirected){
                if(edge instanceof DirectedEdge){
                    DirectedEdge directedEdge = (DirectedEdge) edge;
                    if(directedEdge.getDirection()){
                        directedEdge.getVertex1().addVoisin(directedEdge.getVertex2());
                    } else {
                        directedEdge.getVertex2().addVoisin(directedEdge.getVertex1());
                    }
                }
            } else {
                
                edge.getVertex1().addVoisin(edge.getVertex2());
                edge.getVertex2().addVoisin(edge.getVertex1());
                
            }
        }
    }

    @Override
    public Boolean existEdgeBetween(Vertex vertex1, Vertex vertex2) {
        Boolean aVoisin = false;
        
        for (Vertex noeud : vertex1.getVoisins()){
            if (noeud.equals(vertex2)){
                aVoisin = true;
            }
        }
        return aVoisin;
    }

    @Override
    public int numbOfVertex() {
        int result = 0;

        for (Vertex vertex : this.tabNoeud){
            if(vertex != null) result += 1;
        }

        return result;
    }

    @Override
    public int numbOfEdge() {
        int result = 0;

        for (Vertex vertex : this.tabNoeud){
            for (Vertex vertexVoisin : vertex.getVoisins()){
                if(vertexVoisin != null) result += 1;
            }
        }

        if(this.isDirected){
            return result;
        } else {
            return (result/2);
        }
        
    }

    @Override
    public int numbOfEdgeByVertex(Vertex vertex) {
        int result = 0;

        for (Vertex vertexVoisin : vertex.getVoisins()){
            if(vertexVoisin != null) result += 1;
        }

        return result;
    }

    @Override
    public Boolean vertexIsIn(Vertex vertex){
        int i = 0;

        while(!vertex.equals(this.tabNoeud[i]) && i < this.tabNoeud.length){
            i++;
        }

        return (i < this.tabNoeud.length);
    }

    public Boolean getIsDirected(){
        return this.isDirected;
    }

    public void setIsDirected(Boolean isDirected){
        this.isDirected = isDirected;
    }
}

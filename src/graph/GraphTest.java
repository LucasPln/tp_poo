package graph;

public class GraphTest {

    public static void main(String[] args) {
        

        Vertex vertex1 = new Vertex("1");
        Vertex vertex2 = new Vertex("2");
        Vertex vertex3 = new Vertex("3");

        Vertex[] tabVertex = new Vertex[]{vertex1, vertex2, vertex3};

        /*
        UndirectedEdge undirectedEdge1 = new UndirectedEdge(vertex1, vertex2, "");
        UndirectedEdge undirectedEdge2 = new UndirectedEdge(vertex3, vertex2, "");
        */

        DirectedEdge directedEdge1 = new DirectedEdge(vertex1, vertex2, "", true);
        DirectedEdge directedEdge2 = new DirectedEdge(vertex2, vertex3, "", false);

        //UndirectedEdge[] tabUndirectedEdge = new UndirectedEdge[]{undirectedEdge1, undirectedEdge2};
        DirectedEdge[] tabDirectedEdge = new DirectedEdge[]{directedEdge1, directedEdge2};


        Graph graph = new GraphImpl(tabVertex,tabDirectedEdge, true); // Taille 5, non orienté

        System.out.println("Nombre de noeud : "+graph.numbOfVertex());
        System.out.println("Nombre d'arc : "+graph.numbOfEdge());
        System.out.println("Nombre d'arc pour le noeud 3 : "+graph.numbOfEdgeByVertex(vertex3));
        
    }
}

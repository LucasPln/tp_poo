package graph;

import graph.Graph;
import graph.Vertex;
import graph.Edge;
import graph.UndirectedEdge;
import graph.DirectedEdge;

public class TestGraphImpl {

	public static void main(String[] args) {
		Vertex v1 = new Vertex("foo");
		Vertex v2 = new Vertex("bar");
		Vertex v3 = new Vertex("baz");
		Vertex v4 = new Vertex("tchp<3");

		DirectedEdge e1 = new DirectedEdge(v1, v2, "foobar", true);

		GraphImpl g = new GraphImpl(true);

		g.addEdge(e1);
		System.out.println(g.getNbVertex());

		System.out.println("");

		g.addVertex(v3);
		g.addVertex(v4);
		System.out.println(g.getNbVertex());

		System.out.println(g.numbOfEdge());

		g.addEdge(new DirectedEdge(v1, v3, "foobaz", true));

		System.out.println(g.numbOfEdge());

		for(int i = 0; i < 10; i++) {
			for(int j = 0; j < 10; j ++) {
				System.out.print(g.getEdges()[i][j] + " | ");
			}
			System.out.println("");
		}

		System.out.println(g.existEdgeBetween(v2,v1));
		System.out.println(g.existEdgeBetween(v1,v4));
	}
}
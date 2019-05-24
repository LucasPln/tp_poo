package graph;

import graph.Graph;
import graph.Vertex;
import graph.Edge;
import graph.UndirectedEdge;
import graph.DirectedEdge;

public class GraphImpl implements Graph{
	private Vertex[] vertexes = new Vertex[10];
	private int nbVertex = 0; 
	private Boolean[][] edges = new Boolean[10][10];
	private Boolean isOriented;

	public GraphImpl(Boolean isOriented) {
		for(int i = 0; i < 10; i++) {
			for(int j = 0; j < 10; j ++) {
				this.edges[i][j] = false;
			}
		}
		this.isOriented = isOriented;
	}

	public int getNbVertex() {
		return this.nbVertex;
	}

	public Boolean[][] getEdges() {
		return this.edges;
	}

	public int numbOfEdgeByVertex(Vertex v) {
		int posV = getVertexIndex(v);
		int cpt = 0;

		for(int i = 0; i < 10; i++) {
			if(edges[posV][i]) {
				cpt ++;
			}
		}
		return cpt;
	}

	public int numbOfEdge() {
		int cpt = 0;
		for(int i = 0; i < 10; i++) {
			for(int j = 0; j < 10; j ++) {
				if(this.edges[i][j]) {
					cpt++;
				}
			}
		}
		if(this.isOriented) {
			return cpt;
		}
		else {
			return cpt/2;
		}
	}

	public int numbOfVertex() {
		return this.nbVertex;
	}

	public Boolean existEdgeBetween(Vertex v1, Vertex v2) {
		int posV1 = getVertexIndex(v1);
		int posV2 = getVertexIndex(v2);

		if (posV1 == -1 || posV2 == -1) {
			return false;
		}
		else {
			return edges[posV1][posV2];
		}
	}

	public void addEdge(Edge e) {
		if((this.isOriented && e instanceof DirectedEdge) || (!this.isOriented && e instanceof UndirectedEdge)){
			Vertex v1 = e.getVertex1();
			Vertex v2 = e.getVertex2();

			int posV1 = getVertexIndex(v1);
			int posV2 = getVertexIndex(v2);

			if(posV1 == -1 && this.nbVertex < 10) {
				addVertex(v1);
				posV1 = this.nbVertex - 1;
			}

			if(posV2 == -1 && this.nbVertex < 10) {
				addVertex(v2);
				posV2 = this.nbVertex - 1;
			}

			edges[posV1][posV2] = true;

			if(e instanceof UndirectedEdge) {
				edges[posV2][posV1] = true;
			}
		}
	}

	public void addVertex(Vertex v) {
		this.vertexes[this.nbVertex] = v;
		this.nbVertex += 1;
	}

	public int getVertexIndex(Vertex v) {
		int posV = -1;

		for(int i = 0; i < this.nbVertex; i++) {
			if(this.vertexes[i].getLabel().equals(v.getLabel())){
				posV = i;
			}
		}
		return posV;
	}


}



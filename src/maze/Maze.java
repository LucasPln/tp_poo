package maze;

import graph.*;

public class Maze{

    private GraphImpl graph;
    private int hauteur;
    private int largeur;


    public Maze(int hauteur, int largeur, Cell[] listeEBox){
        this.hauteur = hauteur;
        this.largeur = largeur;
        Cell[][] lab = new Cell[hauteur][largeur];
        for (Cell cell : listeEBox){
            lab[cell.getCoordY()][cell.getCoordX()] = cell;
        }

        for(int i = 0; i < hauteur; i++){
            for (int j = 0; j < largeur; j++) {
                if(lab[i][j] == null){
                    lab[i][j] = new Cell(TypeCells.WBox, j, i, "");
                }
            }
        }

        Cell[] tabCell = new Cell[hauteur+largeur];
        
        int index = 0;
        for(int i = 0; i < hauteur; i++){
            for (int j = 0; j < largeur; j++) {
                tabCell[index] = lab[i][j];
                index++;
            }
        }
        this.graph = new GraphImpl(tabCell, false);
    }


    
    

}
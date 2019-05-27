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
            lab[cell.getCoordX()][cell.getCoordY()] = cell;
        }

        for(int i = 0; i < hauteur; i++){
            for (int j = 0; j < largeur; j++) {
                if(lab[i][j] == null){
                    lab[i][j] = new Cell(TypeCells.WBox, j, i, "");
                }
            }
        }

        Cell[] tabCell = new Cell[hauteur*largeur];
        
        int index = 0;
        for(int i = 0; i < hauteur; i++){
            for (int j = 0; j < largeur; j++) {
                tabCell[index] = lab[i][j];
                index++;
            }
        }
        this.graph = new GraphImpl(tabCell, false);
    }

    @Override
    public String toString(){
        String chaine = "";
        for(int i = 0; i < graph.numbOfVertex(); i++){

            Cell cell = (Cell) graph.getTabNoeud()[i];
            if(cell.getTypeCells() == TypeCells.DBox){
                chaine += "D ";
            } else if(cell.getTypeCells() == TypeCells.ABox){
                chaine += "A ";
            } else if(cell.getTypeCells() == TypeCells.EBox){
                chaine += "E ";
            } else if(cell.getTypeCells() == TypeCells.WBox){
                chaine += ". ";
            }

            if(i%largeur == largeur-1) chaine += "\n";
        }

        return chaine;


    }


    
    

}
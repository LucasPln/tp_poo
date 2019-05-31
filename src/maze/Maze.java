package maze;

import graph.*;
import java.io.Serializable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class Maze implements Serializable{

    private GraphImpl graph;
    private int hauteur;
    private int largeur;

    public Maze(){

    }

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



    public void saveMaze(){
      Scanner sc = new Scanner(System.in);
      System.out.println("Veuillez saisir le nom du fichier pour sauvegarder le Maze avec l'extension: .ser :");
      String filename  = sc.nextLine();

      FileOutputStream fos = null;
      ObjectOutputStream out = null;
      try {
          fos = new FileOutputStream(filename);
          out = new ObjectOutputStream(fos);
          out.writeObject(this);
          out.close();

      } catch (Exception ex) {
          ex.printStackTrace();
      }
      System.out.println("Sauvegarde du Maze effectué");
    }

    public void loadMaze(){
      Scanner sc = new Scanner(System.in);
      System.out.println("Veuillez saisir le nom du fichier pour charger le Maze avec l'extension: .ser :");
      String filename  = sc.nextLine();

      FileInputStream fis = null;
      ObjectInputStream in = null;
      Maze newMaze = new Maze();
      try {
          fis = new FileInputStream(filename);
          in = new ObjectInputStream(fis);
          newMaze = (Maze) in.readObject();
          in.close();
      } catch (Exception ex) {
          ex.printStackTrace();
      }
      this.hauteur = newMaze.hauteur;
      this.largeur = newMaze.largeur;
      this.graph = newMaze.graph;

      System.out.println("Chargement du Maze effecuté");
    }






}

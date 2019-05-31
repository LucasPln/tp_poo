package maze;

import graph.*;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestMaze{

    public static void main(String[] args) {
        Cell cell1 = new Cell(TypeCells.DBox, 0,0,"");
        Cell cell2 = new Cell(TypeCells.EBox, 0,1,"");
        Cell cell3 = new Cell(TypeCells.EBox, 0,2,"");
        Cell cell4 = new Cell(TypeCells.EBox, 1,2,"");
        Cell cell5 = new Cell(TypeCells.ABox, 2,2,"");

        Cell[] tabCell = new Cell[]{cell1,cell2,cell3,cell4,cell5};

        Maze maze = new Maze(3,3,tabCell);
        System.out.println("Affichage du maze n°1 :");
        System.out.println(maze);

        Cell cell_1 = new Cell(TypeCells.DBox, 0,0,"");
        Cell cell_2 = new Cell(TypeCells.EBox, 0,1,"");
        Cell cell_3 = new Cell(TypeCells.EBox, 1,1,"");
        Cell cell_4 = new Cell(TypeCells.EBox, 1,2,"");
        Cell cell_5 = new Cell(TypeCells.ABox, 2,2,"");

        Cell[] tabCell2 = new Cell[]{cell_1,cell_2,cell_3,cell_4,cell_5};

        Maze maze2 = new Maze(3,3,tabCell2);
        System.out.println("Affichage du maze n°2 :");
        System.out.println(maze2);

        String filename = "file.ser";

        FileOutputStream fos = null;
        ObjectOutputStream out = null;
        try {
            fos = new FileOutputStream(filename);
            out = new ObjectOutputStream(fos);
            out.writeObject(maze);
            System.out.println("Enregistrement du maze 1 dans un fichier");
            out.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        
        FileInputStream fis = null;
        ObjectInputStream in = null;
        try {
            fis = new FileInputStream(filename);
            in = new ObjectInputStream(fis);
            maze2 = (Maze) in.readObject();
            System.out.println("Chargement du maze 1 dans le maze 2");
            in.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        System.out.println("Affichage du maze n°2 :");
        System.out.println(maze2);

    }
}

package maze;

import graph.*;

public class TestMaze{
    
    public static void main(String[] args) {
        Cell cell1 = new Cell(TypeCells.DBox, 0,0,"");
        Cell cell2 = new Cell(TypeCells.EBox, 0,1,"");
        Cell cell3 = new Cell(TypeCells.EBox, 0,2,"");
        Cell cell4 = new Cell(TypeCells.EBox, 1,2,"");
        Cell cell5 = new Cell(TypeCells.ABox, 2,2,"");

        Cell[] tabCell = new Cell[]{cell1,cell2,cell3,cell4,cell5};

        Maze maze = new Maze(5,5,tabCell);

        System.out.println(maze);
    }
}
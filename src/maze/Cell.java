package maze;

import graph.*;

public class Cell extends Vertex{

	protected TypeCells type;
	protected int coordX;
	protected int coordY;

	public Cell(TypeCells type, int coordX, int coordY, String label){
		super(label);
		this.type = type;
		this.coordX = coordX;
		this.coordY = coordY;
	}

	public TypeCells getTypeCells(){
		return this.type;
	}

	public int getCoordX(){
		return this.coordX;
	}

	public int getCoordY(){
		return this.coordY;
	}

	public void setTypeCells(TypeCells type){
		this.type = type;
	}

	public void setCoordX(int coordX){
		this.coordX = coordX;
	}

	public void setCoordY(int coordY){
		this.coordY = coordY;
	}

}

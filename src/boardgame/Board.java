package boardgame;

import java.util.List;

public class Board {
	private int rows;
	private int columns;
	
	private Piece[][] piece;
	
	public Board(int rows, int columns) {
		this.rows = rows;
		this.columns = columns;
		piece = new Piece[rows][columns];
	}

	public int getRows() {
		return rows;
	}

	public void setRows(int rows) {
		this.rows = rows;
	}

	public int getColumns() {
		return columns;
	}

	public void setColumns(int columns) {
		this.columns = columns;
	}
	
	public Piece piece(Position position) {
		return null;
	}
	
	public void placePiece(Piece piece, Position position) {
		
	}
	
	public Piece removePiece(Position position) {
		return null;
		
	}
	
	public boolean positionExists(Position position) {
		return false;
	}
	
	public boolean therelsAPiece(Position position) {
		return false;
	}	
}

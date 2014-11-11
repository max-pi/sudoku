package com.terabrite.sudoku;

import com.badlogic.gdx.math.Vector2;

public class Cell {

	// should I be using the private keyword? sounds like that is good practice

	// the id of the cell in the overall grid. 0-80
	int cellId;

	// will be using the number 0 as a blank (do not render if 0)

	// the position of the cell in the game grid i.e. (0-8,0-8)
	
	Vector2 gridPosition;
	
	// the number currently in the cell
	int number;
	
	// the number that is the answer of the puzzle
	// I'm actually curious, is there multiple ways to solve a sudoku puzzle? theoretically.
	// what would guarantee a single solution
	// wonder what the mathematical proof for this is
	
	int answer;
	
	
	// whether this cell was one of the originals for the puzzle
	// need to figure out what to call this variable
	Boolean original;

	// should start to actually code using getters and setters :)
	// need to look up the format, i.e. start coding like a fucking professional goddamn it

	public void enterValue(int value) {
		number = value;
	}
	
	public void eraseValue() {
		number = 0;
	} 

	public Vector2 getGridPosition() {
		return gridPosition;
	}
	
	public int getValue() {
		return number;
	}
	
	public void select() {
		
		
	}
	
	public boolean checkOriginal() {
		if (original) {
			return true;
		} else {
			return false;
		}
	}
	

}
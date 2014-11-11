package com.terabrite.sudoku;

import com.badlogic.gdx.math.Vector2;

public class TouchRectangle {

	// simple class just used to set touch fields
	// I guess I want this so that I can use the same touch logic for both cells and other buttons
	// need to figure out the best way to organize this
	
	// the bottom left and top right corner
	Vector2 bottomLeftCorner;
	Vector2 topRightCorner;
	
	// not sure if I want fields such as width for convenience
	
	// optional reference to the cell that is controlled by this rectangle
	Cell referenceCell = null;
	// optional reference to the button that is controlled by this rectangle
	TouchButton referenceButton = null;

	TouchRectangle(Vector2 bottomLeftCorner, Vector2 topRightCorner) {
			// bottom left corner is essentially the position 
			this.bottomLeftCorner = bottomLeftCorner;
			this.topRightCorner = topRightCorner;
	}	

	public boolean surrounds(float x, float y) {
		// expected that x and y will be the touch coords of the user, but could be an arbitrary point
		if (x > bottomLeftCorner.x && x < topRightCorner.x  && y > bottomLeftCorner.x && y < topRightCorner.y) {
			return true;
		} else {
			return false;
		}
	}
	
	public void act() {
		// the action that runs when the rectangle is touched?
	
	}
	

}
package com.terabrite.sudoku;

import com.badlogic.gdx.Gdx;

public class InputManager {
	// this class will handle the user input events during gameplay (not sure
	// about the menu screens

	// reference to the cell that has been selected
	Cell selectedCell;

	// the 9 numbers that can be written (probably across the bottom)
	TouchRectangle[] numberTouchButtons;

	// what was I going to do with this? touchRectangles should reference
	// whatever they control
	TouchButton[] numberButtons;

	// grid of touch rectangles that makes of the playing field
	TouchRectangle[][] touchGrid = new TouchRectangle[9][9];

	public void checkForInput() {
		// should only run this after Gdx.input.justTouched() fires to be
		// efficient
		// could be cool to have a single array that points to every touch
		// rectangle
		// that way there is a single loop, and once it finds the object, it can
		// break out of the loop
		// and it won't loop through a different loop once already handled the
		// touch event

		for (TouchRectangle[] rArray : touchGrid) {
			for (TouchRectangle r : rArray) {
				if (r.surrounds(Gdx.input.getX(), Gdx.input.getY())) {
					// select the cell that this rectangle points to
					r.referenceCell.select();
				}
			}
		}

		for (TouchRectangle r : numberTouchButtons) {
			if (r.surrounds(Gdx.input.getX(), Gdx.input.getY())) {
				// select the cell that this rectangle points to
				r.referenceButton.select();
			}

		}

	}

}

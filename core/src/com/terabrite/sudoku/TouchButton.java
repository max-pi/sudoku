package com.terabrite.sudoku;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;

public class TouchButton {

	// this class should just handle the graphical bits of a button. rendering, position, text, etc
	// might rename without Touch prefix
	// TouchRectangle should handle the touch logic
	
	// display text of the button
	String text = null;
	// display image of the button
	Texture image = null;
	
	// position in the game world
	Vector2 position;
	
	// true if the button is greyed out
	boolean disabled;
	
	// additional stuff for convenience
	float width;
	float height;

	public TouchButton(String text, Vector2 position, Vector2 topRightCorner) {
		this.text = text;
		
		this.position = position;
		width = topRightCorner.x - position.x;
		height = topRightCorner.y - position.y;
	}
	
	public TouchButton(Texture image, Vector2 position, Vector2 topRightCorner) {
		// not really sure about this one
		// i should probably load images ahead of time
		this.image = image;
		
		this.position = position;
		width = topRightCorner.x - position.x;
		height = topRightCorner.y - position.y;
	}
	
	public void setDisabled() {
		// disables the button (maybe user has not unlocked the level or something)
		disabled = true;
	}
	
	public void setEnabled() {
		// enables the button 
		disabled = false;
	}

	public void render(SpriteBatch batch) {
		if (text != null) {
			// I honestly should probably look into libgdx built in button actors, I bet it has nice shit
			// render the text button
		} else if (image != null) {
			// render the image button
		}
	}

	public void select() {
		// TODO Auto-generated method stub
		
	}


}
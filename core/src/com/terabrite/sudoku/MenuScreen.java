package com.terabrite.sudoku;

import com.badlogic.gdx.Screen;
import com.badlogic.gdx.math.Vector2;

public class MenuScreen implements Screen {
	
	SudokuGame game;

	TouchButton quickStartButton;
	TouchButton levelSelectButton;
	TouchButton exitButton;

	
	
	public MenuScreen(SudokuGame game) {
		
		this.game = game;
		
		float y = 10;
		float x = 10;

		float buttonSpacing = 50;

		float buttonWidth = 100;
		float buttonHeight = 40;

		quickStartButton = new TouchButton("Quickstart", new Vector2(x, y
				+ buttonSpacing), new Vector2(x + buttonWidth, y
				+ buttonSpacing - buttonHeight));
		levelSelectButton = new TouchButton("Level Select", new Vector2(x, y
				+ buttonSpacing * 2), new Vector2(x + buttonWidth, y
				+ buttonSpacing * 2 - buttonHeight));
		exitButton = new TouchButton("Exit", new Vector2(x, y + buttonSpacing
				* 3), new Vector2(x + buttonWidth, y + buttonSpacing * 3
				- buttonHeight));
	}
	// the quick start button should just select the next uncompleted level in
	// the consecutive list

	@Override
	public void render(float delta) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void resize(int width, int height) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void hide() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void resume() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub
		
	}

	public void switchToGame() {
		
		
		
	}
	
	
}
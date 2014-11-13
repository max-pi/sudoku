package com.terabrite.sudoku;

import java.io.FileNotFoundException;
import java.io.IOException;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class SudokuGame extends Game {
	SpriteBatch batch;
	Texture img;
	
	static MenuScreen menuScreen;
	static GameScreen gameScreen;
	

	
	
	@Override
	public void create() {
//		
//		try {
//			LevelGenerator.scanLevel(10);
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		menuScreen = new MenuScreen(this);
		gameScreen = new GameScreen(this);
		
		setScreen(menuScreen);
		
		
	}
	

}

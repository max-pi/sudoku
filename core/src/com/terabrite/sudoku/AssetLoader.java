package com.terabrite.sudoku;

import java.util.ArrayList;

import com.badlogic.gdx.graphics.g2d.freetype.FreeType;
import com.badlogic.gdx.graphics.g2d.freetype.FreeTypeFontGenerator;

public class AssetLoader {
	
	FreeTypeFontGenerator fontGenerator;
	
	// make sure this is the resizable font type
	FreeType defaultFont;
	
	ArrayList<FreeType> fontList;
	int[] startingFontSizes= {8,12,32,72};

	// class in charge of loading all the game assets, fonts, textures, sudoku level files

	public void loadAll(){
		// load everything
		loadFonts();
		loadTextures();
		loadLevels();
	}

	public void loadFonts() {
		
		//fontgeneraalsdkjfsa
		
//		// load the fonts
//		defaultFont = fontGenerator.generateFont(12);(12, );
//		// should investigate changing the size of the font programatically
//		
//		for (int i = 0; i < startingFontSizes.length; i++) {
//			// loads 4 starting fonts to use. maybe there is a better approach
//			fontList.add(new FreeType(startingFontSizes[i], Gdx.files.internal("fonts/holo")));
//		}
	}
	
	public void changeFontSize(int newSize) {
		// reload font with the new size
		// maybe I should have a font array of various sizes. Will probably be need multiple sizes at the same time
	}
	
	public void loadTextures() {
		// not even sure what textures I will have yet
		// maybe should look in
		// levels will probably be labeled with a number,
		
		// the button designs I guess
	}
	
	public void loadLevels() {
		// not quite sure what this will mean yet
		
		// will load the level file
		// parse the level file for levels (actually I should really only load the current level for the Level class (singleton))
		// so I'll keep the level file open, but will search for the level id string on the fly.
		// this shouldn't take long even with 100levels / file
		
	}




}
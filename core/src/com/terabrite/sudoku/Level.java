package com.terabrite.sudoku;

public class Level {
	// class with level data, mainly used to load a new level
	
	// path to the level file
	// i should store many levels in the same file I think, as this should reduce overhead data
	String path;

	// unique level identifier 1-100
	int id;
	
	// not sure if I will use this yet
	int difficulty;


}



//// I will need to write a script that takes advantage of an online sudoku generator and imports levels into my file format
//
//// I will need a script to identify level duplicates
//
//// The level data file format: (a file will probably store 100 or so levels) (might be wise to separate by "pages" and "packs")
//
//// the level id (unique int for every single level!)
//[1];
//// the starting values
//3(1,3);
//2(4,5);
//etc.
//// the answer key
//1,2,3,4,5,6,7,8,9;
//5,7,8,9,3,6,4,2,1;
//etc.
////next levell
//[2];

// semicolons will delimit each line just to be sure.
// square brackets will only be used for level id, so should make locating levels, and knowing when level data ends easy
// maybe should have an "end" keyword to make it easier to know when data is done (but extra memory booooo)
// however what about the last level in the file (probably ez to check for EOF, but idk "end" might be cleaner)



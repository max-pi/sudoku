package com.terabrite.sudoku;

public class Level {

	// unique level identifier 1-100
	int id;

	// not sure if I will use this yet
	float difficulty;

	String[][] grid = new String[9][9];

	public Level(String[] lines, int id) {
		
		this.id = id;
		
		// 13 lines that describe the level
		// 1 spacing

		int yoffset = 1;
		int xoffset = 0;

		for (int y = 0; y < 9; y++) {

			for (int x = 0; x < 9; x++) {

				grid[x][y] = lines[y + yoffset].split(" ")[x + xoffset];
				// System.out.print(lines[y + yoffset].split(" ")[x+xoffset]);

				if (x == 2 || x == 5) {
					// skips the extra spaces
					xoffset++;
				}

			}
			xoffset = 0;

			if (y == 2 || y == 5) {
				yoffset++;
			}

			System.out.println();

		}
	}

	public String[][] getGrid() {

		return grid;

	}

}
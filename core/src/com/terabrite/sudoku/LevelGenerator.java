package com.terabrite.sudoku;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.nio.CharBuffer;
import java.util.Scanner;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.files.FileHandle;
import com.badlogic.gdx.graphics.Texture;
import com.sun.org.apache.bcel.internal.generic.NEW;

public class LevelGenerator {

	static Texture t;

	public static void createLevelFile() {

		// FileHandle file = Gdx.files.internal("levels100.txt");
		// String text = file.readString();
		//
		// System.out.println(text);

	}

	public static void scanLevel(int id) throws IOException {
		// retrieve level based on id

		FileHandle f = Gdx.files.internal("levels100.txt");

		String c = f.readString();

		String[] lines = c.split("\n");

		String[] levelLines = new String[14];

		System.out.println("level id:" + id);

		int count = 0;
		for (int i = 14 * id; i < 14 * id + 14; i++) {
			levelLines[count] = lines[i];
			System.out.println(lines[i]);
			count = count + 1;
		}

		for (int x = 0; x < 14; x++) {

			System.out.println(levelLines[x]);

		}
		Level level = new Level(levelLines, id);

	}

}

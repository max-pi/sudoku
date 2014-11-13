package com.terabrite.sudoku;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer.ShapeType;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton.TextButtonStyle;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;

public class GameScreen implements Screen {
	private Stage stage;
	private TextButton button;
	private SpriteBatch batch;
	private ShapeRenderer shapeRenderer;
	SudokuGame game;
	
	public GameScreen(SudokuGame game) {
		
		this.game = game;
		

		
		Skin skin = new Skin(Gdx.files.internal("data/ui/uiskin.json"));
		stage = new Stage();
        button = new TextButton("X", skin);	
        stage.addActor(button);
        button.setSize(Gdx.graphics.getHeight()/20, Gdx.graphics.getHeight()/20);
        button.addListener(new ClickListener() {
            @Override
            public void clicked(InputEvent event, float x, float y) {
            	((Game) Gdx.app.getApplicationListener()).setScreen(SudokuGame.menuScreen);
            }
        });

	}
	// the quick start button should just select the next uncompleted level in
	// the consecutive list
	
	@Override
	public void render(float delta) {
		// TODO Auto-generated method stub
		
		Gdx.gl.glClearColor(0, 0, 0.2f, 1);
	    Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
	    stage.act(Math.min(Gdx.graphics.getDeltaTime(), 1 / 30f));
        stage.draw();
        
        
        //Math is too hard
        shapeRenderer.begin(ShapeRenderer.ShapeType.Line);
        shapeRenderer.setColor(1, 1, 1, 100);
        for (int i = 0; i < 9; i++){
        	shapeRenderer.line(Gdx.graphics.getHeight()/5, Gdx.graphics.getHeight()/5 + (i * 40), (9 * 40), Gdx.graphics.getHeight()/5 + (i * 40));
        	shapeRenderer.line(Gdx.graphics.getHeight()/5 + (i * 40), 40 + Gdx.graphics.getHeight()/5, Gdx.graphics.getHeight()/5 + (i * 40), (9 * 40));
        }
        shapeRenderer.end();
        
	}

	@Override
	public void resize(int width, int height) {
		// TODO Auto-generated method stub
		button.setPosition(
                (width-(button.getWidth()+button.getWidth()/10)), 
                (height-(button.getHeight()+button.getWidth()/10)));
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		Gdx.input.setInputProcessor(stage);
		shapeRenderer = new ShapeRenderer();
		
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
		stage.dispose();
		
	}

	public void switchToGame() {
		
		
		
	}
	
	
}
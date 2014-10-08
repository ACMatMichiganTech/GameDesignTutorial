package com.jelly;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class Jelly extends ApplicationAdapter {
	SpriteBatch batch;
	Texture img;
	Character myCharacter;				//Our Character
	MyFirstListener keyboardListener;	//Our custom key listener
	
	@Override
	public void create () {
		batch = new SpriteBatch();
		img = new Texture("badlogic.jpg");
		
		//Initialize our key listener
		keyboardListener = new MyFirstListener();
		
		//Tell our game to use this listner
		Gdx.input.setInputProcessor(keyboardListener);
		
		//Initialize our character
		myCharacter = new Character();
	}

	@Override
	public void render () {
		
		//If we are pressing a key, make our character move
		if (keyboardListener.isKeyPressed(Keys.LEFT)) {
			myCharacter.x = myCharacter.x - 10;	//Move Left
		}
		
		if (keyboardListener.isKeyPressed(Keys.RIGHT)) {
			myCharacter.x = myCharacter.x + 10;	//Move Right
		}
		
		//Update our character
		myCharacter.update();
		
		Gdx.gl.glClearColor(1, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		batch.begin();
		
		//Draw the image at the position where our charater should be
		batch.draw(img, (int)myCharacter.x, (int)myCharacter.y);
		
		
		batch.end();
	}
}

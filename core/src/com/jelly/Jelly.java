package com.jelly;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class Jelly extends ApplicationAdapter {
	SpriteBatch batch;
	Texture img;
	Character myCharacter;
	
	
	@Override
	public void create () {
		batch = new SpriteBatch();
		img = new Texture("badlogic.jpg");
		
		myCharacter = new Character();
	}

	@Override
	public void render () {
		
		myCharacter.update();
		
		
		Gdx.gl.glClearColor(1, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		batch.begin();
		
		batch.draw(img, (int)myCharacter.x, (int)myCharacter.y);
		
		batch.end();
	}
}
package com.jelly;

import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.InputProcessor;

public class MyFirstListener implements InputProcessor {

	int numberOfKeysOnKeyboard = 999;	//I don't know...
	boolean[] keysPressed = new boolean[numberOfKeysOnKeyboard];
	
	@Override
	public boolean keyDown(int keycode) {
		keysPressed[keycode] = true;
		return false;
	}

	@Override
	public boolean keyUp(int keycode) {
		keysPressed[keycode] = false;
		return false;
	}
	
	/**Is the key with the given keycode being
	 * pressed right now?
	 * 
	 * @param keycode The key to check
	 * @return true if the key is down, false if not
	 */
	public boolean isKeyPressed(int keycode) {
		return keysPressed[keycode];
	}
	

	@Override
	public boolean keyTyped(char character) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean touchDown(int screenX, int screenY, int pointer, int button) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean touchUp(int screenX, int screenY, int pointer, int button) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean touchDragged(int screenX, int screenY, int pointer) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean mouseMoved(int screenX, int screenY) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean scrolled(int amount) {
		// TODO Auto-generated method stub
		return false;
	}

}

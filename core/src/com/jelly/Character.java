package com.jelly;

public class Character {
	double x;
	double y;
	
	double velocity;
	double gravity;
	
	public Character() {
		x = 200;
		y = 200;
		
		velocity = 0;
		gravity = 0.15;
	}
	
	public void update() {
		velocity -= gravity;
		y += velocity;
		
		if (y <= 0) {
			y = 0;
			velocity = -velocity;
		}
	}
}

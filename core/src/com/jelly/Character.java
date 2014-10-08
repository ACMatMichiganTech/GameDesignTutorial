package com.jelly;

public class Character {
	double x;			//x position on screen
	double y;			//y position on screen
	
	double velocity;	//The speed we are falling due to gravity
	double gravity;	//How fast to make us fall
	
	public Character() {
		x = 200;		//Somewhere on the screen
		y = 200;		//Somewhere on the screen
		
		velocity = 0.0;	//We are not falling
		gravity = 0.1;	//How much gravity to apply.  Tweak as needed
	}
	
	public void update() {
		//A little physics
		
		//Incrase the velocity
		velocity -= gravity;
		
		//Make our character fall
		y += velocity;
		
		//Make sure we dont fall off the screen
		if (y <= 0) {
			y = 0;					//Stick us to the ground
			velocity = 0;			//Stop falling
		}
	}
}

/**
 * 
 */
package com.brunon.game.character;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.Sprite;

/**
 * @author brunon
 *
 */
public class Hero extends Sprite {
	
	float heroSpeed = 100.0f; // 10 pixels per second.
	float heroX;
	float heroY;
	
	public Hero() {
		
		super(new Texture("badlogic.jpg"));
	}

	@Override
	public void draw(Batch batch) {
		if(Gdx.input.isKeyPressed(Keys.DPAD_LEFT)) 
			heroX -= Gdx.graphics.getDeltaTime() * heroSpeed;
		if(Gdx.input.isKeyPressed(Keys.DPAD_RIGHT)) 
			heroX += Gdx.graphics.getDeltaTime() * heroSpeed;
		if(Gdx.input.isKeyPressed(Keys.DPAD_UP)) 
			heroY += Gdx.graphics.getDeltaTime() * heroSpeed;
		if(Gdx.input.isKeyPressed(Keys.DPAD_DOWN)) 
			heroY -= Gdx.graphics.getDeltaTime() * heroSpeed;
		
		setY(heroY);
		setX(heroX);
		super.draw(batch);
	}
}

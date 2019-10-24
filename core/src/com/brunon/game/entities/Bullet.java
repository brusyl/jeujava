/**
 * 
 */
package com.brunon.game.entities;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.Sprite;

/**
 * @author brunon
 *
 */
public class Bullet extends Sprite {
	
	private float xPos = 150.0f;
	private float bulletSpeed = 300.0f;
	
	public Bullet(float initialXPos, float initialYPos) {
		super(new Texture("badlogic.jpg"));
		setScale(0.1f);
		setY(initialYPos);
		xPos = initialXPos;
		setX(xPos);
	}
	
	@Override
	public void draw(Batch batch) {
		xPos += Gdx.graphics.getDeltaTime() * bulletSpeed;
		setX(xPos);
		super.draw(batch);
	}
}

package com.brunon.game;

import java.util.ArrayList;
import java.util.List;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.brunon.game.entities.Bullet;
import com.brunon.game.entities.Hero;

public class MyGame extends ApplicationAdapter {
	SpriteBatch batch;

	private Hero hero;
	private List<Bullet> bullets = new ArrayList<Bullet>();
	private float lastBullet = 0.0f;

	@Override
	public void create () {
		batch = new SpriteBatch();
		hero = new Hero();
	}

	@Override
	public void render () {
		

		Gdx.gl.glClearColor(1, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		batch.begin();
		hero.draw(batch);
		
		lastBullet += Gdx.graphics.getDeltaTime();
		
		// TODO Bullet manager
		if(Gdx.input.isKeyPressed(Keys.SPACE)) {
			System.out.println(lastBullet);
			if (lastBullet > 0.2f) {
				bullets.add(new Bullet(hero.getX(), hero.getY()));
				lastBullet = 0.0f;
			}
		}
		
		for (int i = 0; i < bullets.size(); i++) {
			Bullet bullet = bullets.get(i);
			bullet.draw(batch);
		}
			
		batch.end();
	}

	@Override
	public void dispose () {
		batch.dispose();
	}
}

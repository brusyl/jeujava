package com.brunon.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.brunon.game.character.Hero;

public class MyGame extends ApplicationAdapter {
	SpriteBatch batch;

	private Hero hero;

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
		batch.end();
	}

	@Override
	public void dispose () {
		batch.dispose();
	}
}

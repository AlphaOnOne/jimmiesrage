package com.bowtiecollective.jimmiesrage;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class main extends ApplicationAdapter {
	SpriteBatch batch;
	Texture img;
	OrthographicCamera cam;
	RenderScene sceneHandler;
	Scene scene;
	public void create () {
		batch = new SpriteBatch();
		img = new Texture("dirt.jpg");
		float w = Gdx.graphics.getWidth();
        float h = Gdx.graphics.getHeight();
        cam = new OrthographicCamera(30, 30 * (h / w));
        cam.position.set(cam.viewportWidth / 2f, cam.viewportHeight / 2f, 0);
        cam.zoom =25;
        
        
        //Testing code for RenderScene
        //EVERYBODY SETTLE DOWN
        //Its temporary
        
        sceneHandler = new RenderScene();
        scene = new Scene(4,4,Tile.DIRT_U);
        sceneHandler.setScene(scene);
        
        
        
		
	}

	@Override
	public void render () {
		cam.update();
		batch.setProjectionMatrix(cam.combined);
		Gdx.gl.glClearColor(0, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		batch.begin();
		sceneHandler.render(batch);
		batch.draw(img, 0, 0);
		batch.end();
		
		
	}
}

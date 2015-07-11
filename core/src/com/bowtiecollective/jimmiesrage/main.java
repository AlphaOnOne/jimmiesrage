package com.bowtiecollective.jimmiesrage;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector3;

public class main extends ApplicationAdapter {
	SpriteBatch batch;
	Texture img;
	OrthographicCamera cam;
	RenderScene sceneHandler;
	Scene scene;
	public void create () {
		batch = new SpriteBatch();
		float w = Gdx.graphics.getWidth();
        float h = Gdx.graphics.getHeight();
        cam = new OrthographicCamera(30, 30 * (h / w));
        cam.position.set(cam.viewportWidth / 2f, cam.viewportHeight / 2f, 0);
        cam.zoom =25;
        
        
        //Testing code for RenderScene
        //EVERYBODY SETTLE DOWN
        //Its temporary
        
        sceneHandler = new RenderScene();
        scene = new Scene(20,6,Tile.DIRT_U);
        sceneHandler.setScene(scene);
        
        
        
		
	}

	@Override
	public void render () {
		handleInput();
		cam.update();
		batch.setProjectionMatrix(cam.combined);
		Gdx.gl.glClearColor(0, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		batch.begin();
		sceneHandler.render(batch);
		
		batch.end();
		
		
	}
	
	public void handleInput(){
		
		if(Gdx.input.isKeyPressed(Keys.W)){
			cam.position.add(new Vector3(0.0f,4.0f,0.0f));
		}
		if(Gdx.input.isKeyPressed(Keys.S)){
			cam.position.add(new Vector3(0.0f,-4.0f,0.0f));
		}
		if(Gdx.input.isKeyPressed(Keys.A)){
			cam.position.add(new Vector3(-4.0f,0.0f,0.0f));
		}
		if(Gdx.input.isKeyPressed(Keys.D)){
			cam.position.add(new Vector3(4.0f,0.0f,0.0f));
		}
		if(Gdx.input.isKeyPressed(Keys.EQUALS)){
			cam.zoom -= 0.5;
			
		}
		if(Gdx.input.isKeyPressed(Keys.MINUS)){
			cam.zoom += 0.5;
		}
				

		
	}
}

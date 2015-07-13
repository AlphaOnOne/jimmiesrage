package com.bowtiecollective.jimmiesrage;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector3;
import com.bowtiecollective.jimmiesrage.scEdit.ScEdit;

public class main extends ApplicationAdapter {
	SpriteBatch batch;
	Texture img;
	OrthographicCamera cam;
	RenderScene sceneHandler;
	Scene scene;
	
	
	//Handle for scene editor
	ScEdit scEdit;
	
	boolean isScEdit = false;
	boolean canScEdit = true;
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
        scene = new Scene(20,6,Tile.STONE_2);
        sceneHandler.setScene(scene);
        
        //If ScEdit is available, load er up
        if(canScEdit){
        	scEdit = new ScEdit();
        	scEdit.create();
        }
        
        
		
	}

	@Override
	public void render () {
		handleInput();
		cam.update();
		batch.setProjectionMatrix(cam.combined);
		Gdx.gl.glClearColor(0, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		batch.begin();
		
		
		if(isScEdit){
			scEdit.processInput();
			scEdit.render(batch);
		}else{
			sceneHandler.render(batch);
		}
		
		
		
		batch.end();
		
		
	}
	
	public void handleInput(){
		if(Gdx.input.isKeyJustPressed(Keys.F1)){
			if(canScEdit){
				if(isScEdit){
					isScEdit=false;
				}else{
					isScEdit=true;
				}
					
			}
		}
		
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

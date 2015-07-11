package com.bowtiecollective.jimmiesrage;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class RenderScene {
	
	public Scene curScene;
	
	
	
	public void render(SpriteBatch b){
		
		
			for(int i = 0;i<curScene.width;i++){
				for(int y = 0;y<curScene.height;y++){
					b.draw(curScene.tiles[i][y].tex,0+(64*i),0+(64*y));
				}
				
			}
		
		
		
	}
	
	public void setScene(Scene scn){
		curScene = scn;
		
	}
	

}

package com.bowtiecollective.jimmiesrage;

/* SCENE.JAVA  --  A single screen of gameplay.  linked to other scenes with doors
 * Author(s): Max
 * 
 * 
 * 
 * 
 * 
 */

public class Scene {

	//: Vars and constructor	
	// dimensions, in tiles
	public int height;
	public int width;
	
	//ALL TILES OF SCENE GO IN HERE
	public Tile[][] tiles;
	
	
	
	
	
	
	public Scene(int x, int y,int texID){
		height = y;
		width = x;
		sceneInit(texID);
		
	}
	
	public void resize(int x, int y){
		height = y;
		width = x;
		sceneInit(Tile.STONE_2);
		
	}
	
	public void sceneInit(int texID){
		tiles=new Tile[width][height];
		for (int x =0;x<width;x++){
			for(int y=0;y<height;y++){
				tiles[x][y]=new Tile(texID);
			}
		}
		
		
	}
	
	
	
	
	
	
}

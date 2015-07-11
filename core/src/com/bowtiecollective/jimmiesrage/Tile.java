package com.bowtiecollective.jimmiesrage;

import com.badlogic.gdx.graphics.Texture;

public class Tile {

	Texture tex; //64x64 ONLY
	
	
	
	public Tile(int id){
		
		switch(id){
		case 0:
			tex= new Texture("dirt.jpg");
		}
		
		
	}
	
	
	
	
	
	
	/*
	 * CONSTANTS FOR TILE ID
	 * DO NOT CHANGE!!!!!!!  UNLESS YOURE ME
	 * HAHAHA IM GREAT
	 * 		-MAX
	 */
	
	static int DIRT_U = 0;
	
	
	
	
	
}

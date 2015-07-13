package com.bowtiecollective.jimmiesrage;

import com.badlogic.gdx.graphics.Texture;

public class Tile {

	Texture tex; //64x64 ONLY
	int tid;
	
	
	public Tile(int id){
		tid = id;
		switch(id){
		case 0:
			tex= new Texture("stonewall_2.bmp");
		}
		
		
	}
	
	
	
	
	
	
	/*
	 * CONSTANTS FOR TILE ID
	 * DO NOT CHANGE!!!!!!!  UNLESS YOURE ME
	 * HAHAHA IM GREAT
	 * 		-MAX
	 */
	
	public static int STONE_2 = 0;
	
	
	
	
	
}

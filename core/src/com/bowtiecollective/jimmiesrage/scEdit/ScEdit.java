package com.bowtiecollective.jimmiesrage.scEdit;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

import javax.swing.JOptionPane;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.Json;
import com.bowtiecollective.jimmiesrage.Scene;
import com.bowtiecollective.jimmiesrage.Tile;

public class ScEdit {
	Texture newButtonTex;
	Scene curScene;
	
	public void create(){
		newButtonTex = new Texture("newbutton.jpg");
		
	}
	
	public void render(SpriteBatch b){
		b.draw(newButtonTex,0,0);
		
	}
	
	
	public void processInput(){
		
		//New scene
		if(Gdx.input.isKeyJustPressed(Keys.F2)){
			String s = JOptionPane.showInputDialog(null);
			int x = Integer.parseInt(JOptionPane.showInputDialog(null));
			int y = Integer.parseInt(JOptionPane.showInputDialog(null));
			newScene(s,x,y);
		}
		
	}
	
	
	
	
	
	
	public void save(String filename){
		
		PrintWriter pr;
		Json json = new Json();
		try {
			pr = new PrintWriter(filename, "UTF-8");
			pr.print(json.toJson(curScene));
			pr.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		

	}
	
	public void newScene(String filename,int w, int h){
		//Create a new scene
		curScene = new Scene(w,h,Tile.STONE_2);
		save(filename);
	
		


		
		
	}
}

package com.bowtiecollective.jimmiesrage;

import java.util.ArrayList;

/* INVENTORY -- An inventory object is a list of items
 * that can be added to and extracted from.
 * Stores items
 */

public abstract class Inventory {
	
	public ArrayList<Item> items = new ArrayList<Item>();
	public int size;
	public Inventory(int sz){
		size = sz;
		System.out.println("Initializing inventory");
	}
	
	//returns false if inventory is full
	public boolean add(Item ad){
		if(items.size()<size){
			items.add(ad);
			return true;
		}else{
			return false;
		}
	}
	
	public boolean take(Item tk){
		for (int i =0;i<items.size();i++){
			if (items.get(i).equals(tk)){
				items.remove(i);
				return true;
			}
		}
		
		return false;
	}
}

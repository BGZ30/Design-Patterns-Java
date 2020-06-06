package twoMenusSimple.Iterators;

import twoMenusSimple.Menus.*;

import java.util.ArrayList;

public class PancakeHouseIterator implements Iterator{
	
	ArrayList<MenuItem> menuItems;
	int position = 0;
	
	public PancakeHouseIterator(ArrayList<MenuItem> items) {
		this.menuItems = items;
	}
	
	public boolean hasNext() {
		if(position >= menuItems.size())
			return false;
		else
			return true;
	}
	
	public Object next() {
		MenuItem item = menuItems.get(position);
		position += 1;
		
		return item;
	}
}

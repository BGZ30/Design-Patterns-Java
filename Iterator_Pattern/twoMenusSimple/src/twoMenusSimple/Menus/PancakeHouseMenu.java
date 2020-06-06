package twoMenusSimple.Menus;

import twoMenusSimple.Menus.*;
import twoMenusSimple.Iterators.*;
import java.util.ArrayList;

public class PancakeHouseMenu{
	
	ArrayList<MenuItem> menuItems;
	
	public PancakeHouseMenu() {
		menuItems = new ArrayList<MenuItem>();
		
		addItem("K&B's Pancake Breakfast", 
				"Pancakes with scrambled eggs, and toast", 
				true,
				2.99);
	 
		addItem("Regular Pancake Breakfast", 
			"Pancakes with fried eggs, sausage", 
			false,
			2.99);
 
		addItem("Blueberry Pancakes",
			"Pancakes made with fresh blueberries, and blueberry syrup",
			true,
			3.49);
 
		addItem("Waffles",
			"Waffles, with your choice of blueberries or strawberries",
			true,
			3.59);
	}
	
	public void addItem(String name, String description, boolean vegetarian, double price) {
		MenuItem item = new MenuItem(name, description, vegetarian, price);
		menuItems.add(item);
	}
	
	public Iterator createIterator() {
		return PancakeHouseIterator(menuItems);
	}

}

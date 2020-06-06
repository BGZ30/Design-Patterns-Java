package twoMenusSimple.Iterators;

import java.util.ArrayList;

import twoMenusSimple.Menus.DinerMenuIterator;

public class PancakeHouseIterator implements Iterator{
	
	ArrayList<MenuItem> menuItems;
	
	public PancakeHouseIterator() {
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
	
	public addItem(String name, String description, boolean vegetarian, double price) {
		MenuItem item = new MenuITem(name, description, vegetarian, price);
		menuItems.add(item);
	}
	
	public Iterator createIterator() {
		return PancakeHouseIterator(menuItems);
	}

}

package twoMenusSimple.Menus;

public class DinerMenu {
	static final int MAX_ITEMS = 6;
	int numOfItems = 0;
	MenuItem[] menuItem;
	
	public DinerMenu() {
		menuItems = new MenuItem[MAX_ITEMS];
		
		addItem("Vegetarian BLT","(Fakin�) Bacon with lettuce & tomato on whole wheat", true, 2.99);
		addItem("BLT","Bacon with lettuce & tomato on whole wheat", false, 2.99);
		addItem("Soup of the day","Soup of the day, with a side of potato salad", false, 3.29);
		addItem("Hotdog","A hot dog, with saurkraut, relish, onions, topped with cheese",false, 3.05);
	}
	
	public void addItem(String name, String description,boolean vegetarian, double price) {
		if (numberOfItems >= MAX_ITEMS) {
			System.err.println("Sorry, menu is full! Can�t add item to menu");
		} 
		else {
			MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
			menuItems[numberOfItems] = menuItem;
			numOfItems = numOfItems + 1;
		}
	}
	
	public Iterator CreateIterator() {
		return new DinerMenuIterator(menuItems);
	}
}

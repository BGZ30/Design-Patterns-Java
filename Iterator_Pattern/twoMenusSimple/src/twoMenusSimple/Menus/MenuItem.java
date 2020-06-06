package twoMenusSimple.Menus;

public class MenuItem {

	String name;
	String description;
	boolean vegetarian;
	double price;
	private boolean vegeterian;
	
	public MenuItem(String name, String description, boolean vegeterian, double price) {
		this.name = name;
		this.description = description;
		this.vegetarian = vegeterian;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}
	
	public String getDescription() {
		return description;
	}
	
	public boolean isVegeterian() {
		return vegeterian;
	}
	
	public double getPrice() {
		return price;
	}

}

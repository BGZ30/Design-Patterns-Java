package nestedMenus.Menus;

import java.util.Iterator;
import java.util.ArrayList;

public class Menu extends MenuComponent {

	ArrayList<MenuComponent> menu = new ArrayList<MenuComponent>();
	String name;
	String description;
	Iterator iterator = null;
	
	public Menu(String name, String description) {
		this.name = name;
		this.description = description;
	}

	public void add(MenuComponent component) {
		menu.add(component);
	}
	
	public void remove(MenuComponent component) {
		menu.remove(component);
	}
	
	public MenuComponent getChild(int i) {
		return (MenuComponent)menu.get(i);
	}
	
	public String getName() {
		return name;
	}
	
	public String getDescription() {
		return description;
	}
	
	public Iterator createIterator() {
		if (iterator == null) {
			iterator = new CompositeIterator(menu.iterator());
		}
			return iterator;
	}

	public void print() {
		
		System.out.print("\n" + getName());
		System.out.println(", " + getDescription());
		System.out.println("---------------------");
	
		Iterator<MenuComponent> iterator = menu.iterator();
		
		while(iterator.hasNext()) {
			MenuComponent component = (MenuComponent)iterator.next();
			component.print();
		}
	}
}
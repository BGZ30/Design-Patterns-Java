package nestedMenus.People;

import nestedMenus.Menus.*;

public class Waitress {

	MenuComponent allMenus;
	
	public Waitress(MenuComponent allMenus) {
		this.allMenus = allMenus;
	}
	
	public void print() {
		allMenus.print();
	}

}

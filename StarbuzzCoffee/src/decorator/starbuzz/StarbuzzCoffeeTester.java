package decorator.starbuzz;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class StarbuzzCoffeeTester {
	
	// Create objects
	Beverage b1 = new Espresso();
	Beverage b2 = new DarkRoast();
	Beverage b3 = new HouseBlend();
	
	@Before
	public void setUp() throws Exception{
		
		// add condiments
		
		b2 = new Mocha(b2);
		b2 = new Mocha(b2);
		b2 = new Whip(b2);
 
		b3 = new Soy(b3);
		b3 = new Mocha(b3);
		b3 = new Whip(b3);
	}
	
	@Test
	public void testGetDescription() {
		// create test cases
		
		assertEquals("Beverage_1", "Espresso Coffee", b1.getDescription());
		assertEquals("Beverage_2", "Dark Roast Coffee, Mocha, Mocha, Whip", b2.getDescription());
		assertEquals("Beverage_3", "House Blend Coffee, Soy, Mocha, Whip", b3.getDescription());
	}
	
	@Test
	public void testCost() {
		// create test cases
		// add 0.1 as a threshold "delta"
		
		assertEquals("Beverage_1", 1.99, b1.cost(), 0.1);
		assertEquals("Beverage_2", 1.49, b2.cost(), 0.1);
		assertEquals("Beverage_3", 1.34, b3.cost(), 0.1);
	}
}

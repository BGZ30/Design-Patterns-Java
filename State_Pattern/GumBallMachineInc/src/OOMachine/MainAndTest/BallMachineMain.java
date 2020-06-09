/**
 * 
 */
package OOMachine.MainAndTest;

/**
 * @author Bassant Gamal
 *
 */

public class BallMachineMain {		
		public static void main(String[] args) {
			
			GumBallMachine gumballMachine = new GumBallMachine(5);
			System.out.println(gumballMachine);
			
			gumballMachine.insertQuarter();
			gumballMachine.turnCrank();
			System.out.println(gumballMachine);
			
			gumballMachine.insertQuarter();
			gumballMachine.turnCrank();
			gumballMachine.insertQuarter();
			gumballMachine.turnCrank();
			System.out.println(gumballMachine);
	}
	
}

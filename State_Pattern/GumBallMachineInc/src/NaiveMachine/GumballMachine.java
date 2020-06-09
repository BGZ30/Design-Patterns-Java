package NaiveMachine;

public class GumballMachine {

	/*
	 * states of the machine according to the state diagram.
	 * final ==> const
	 * static ==> one variable for all instances
	*/
	
	final static int SOLD_OUT = 0;
	final static int NO_QUARTER = 1;
	final static int HAS_QUARTER = 2;
	final static int SOLD = 4;
	
	int state = SOLD_OUT;  // initial state
	int gums = 0; // number of gums in the machine, initialized when creating the machine
	
	public GumballMachine(int gums) {
		this.gums = gums;
		if(gums > 0)
			this.state = NO_QUARTER;
	}

	/*
	 * actions are insertQuaret, ejectQuaretr, turnCrank and dispense
	*/
	public void insertQuarter() {
		if (state == HAS_QUARTER) {
			System.out.println("You can’t insert another quarter");
		} 
		else if (state == NO_QUARTER) {
			state = HAS_QUARTER;
			System.out.println("You inserted a quarter");
		} 
		else if (state == SOLD_OUT) {
			System.out.println("You can’t insert a quarter, the machine is sold out");
		} 
		else if (state == SOLD) {
		System.out.println("Please wait, we’re already giving you a gumball");
		}
	}
	
	public void ejectQuarter() {
		if (state == HAS_QUARTER) {
			System.out.println("Quarter returned");
			state = NO_QUARTER;
		} 
		else if (state == NO_QUARTER) {
			System.out.println("You haven’t inserted a quarter");
		} 
		else if (state == SOLD) {
			System.out.println("Sorry, you already turned the crank");
		} 
		else if (state == SOLD_OUT) {
			System.out.println("You can’t eject, you haven’t inserted a quarter yet");
		}
	}
	
	public void turnCrank() {
		if (state == SOLD) {
			System.out.println("Turning twice doesn’t get you another gumball!");
		} 
		else if (state == NO_QUARTER) {
			System.out.println("You turned but there’s no quarter");
		} 
		else if (state == SOLD_OUT) {
			System.out.println("You turned, but there are no gumballs");
		} 
		else if (state == HAS_QUARTER) {
			System.out.println("You turned...");
			state = SOLD;
			dispense();
		}
	}
	
	public void dispense() {
		if (state == SOLD) {
			System.out.println("A gumball comes rolling out the slot");
			gums = gums - 1;
			if (gums == 0) {
				System.out.println("Oops, out of gumballs!");
				state = SOLD_OUT;
			} 
			else {
				state = NO_QUARTER;
			}
		} 
		else if (state == NO_QUARTER) {
			System.out.println("You need to pay first");
		} 
		else if (state == SOLD_OUT) {
			System.out.println("No gumball dispensed");
		} 
		else if (state == HAS_QUARTER) {
			System.out.println("No gumball dispensed");
		}
	}
}

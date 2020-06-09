package OOMachine.States;

public class Sold implements State {

	GumballMachine gumballMachine;
	
	public Sold(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}

	@Override
	public void insertQuarter() {
		System.out.println("Please wait, we’re already giving you a gumball");
	}

	@Override
	public void ejectQuarter() {
		System.out.println("Sorry, you already turned the crank");
	}

	@Override
	public void turnCrank() {
		System.out.println("Turning twice doesn’t get you another gumball!"");
	}

	@Override
	public void despense() {
		/*
		 * release a gumball, and then check if there is any remaining gums;
		 * if yes, then move to the NoQuarter state and wait for a new customer.
		 * if not, then move to SoldOut state.
		*/
		gumballMachine.releaseBall();
		
		if (gumballMachine.getBalls() > 0) {
			gumballMachine.setState(gumballMachine.getNoQuarterState());
		}else {
			System.out.println("Oops, out of gumballs!");
			gumballMachine.setState(gumballMachine.getSoldOutState());
		}
	}

}

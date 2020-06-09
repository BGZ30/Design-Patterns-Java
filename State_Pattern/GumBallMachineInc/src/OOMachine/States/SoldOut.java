package OOMachine.States;

public class SoldOut implements State {

	GumballMachine gumballMachine;
	
	public SoldOut(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}

	@Override
	public void insertQuarter() {
		System.out.println("You can’t insert a quarter, the machine is sold out");
	}

	@Override
	public void ejectQuarter() {
		System.out.println("You can’t eject, you haven’t inserted a quarter yet");
	}

	@Override
	public void turnCrank() {
		System.out.println("You turned, but there are no gumballs");
	}

	@Override
	public void despense() {
		System.out.println("No gumball dispensed");
	}

}

package OOMachine.States;

public class hasQuarter implements State{

	GumballMachine gumballMachine;
	
	public hasQuarter(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine
	}
	
	@Override
	public void insertQuarter() {
		System.out.println("You can't insert another quarter");
	}

	@Override
	public void ejectQuarter() {
		System.out.println("Quarter returned");
		gumballMachine.setState(gumballMachine.getNoQuarterState());
	}

	@Override
	public void turnCrank() {
		System.out.println("You turned...");
		gumballMachine.setState(gumballMachine.getSoldState());
	}

	@Override
	public void despense() {
		System.out.println("No gumball despensed");
	}


}

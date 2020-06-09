package OOMachine.States;

public class hasQuarter implements State{

	GumballMachine gumballMachine;
	Random randomWinner = new Random(System.currentTimeMillis());

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
		int winner = randomWinner.nextInt(10);
		
		if ((winner == 0) && (gumballMachine.getCount() > 1))
			gumballMachine.setState(gumballMachine.getWinnerState());
		else
			gumballMachine.setState(gumballMachine.getSoldState());
	}

	@Override
	public void despense() {
		System.out.println("No gumball despensed");
	}


}

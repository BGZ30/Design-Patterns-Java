package OOMachine.States;

import OOMachine.MainAndTest.*;
import java.util.*;

public class hasQuarter implements State{

	GumBallMachine gumballMachine;
	Random randomWinner = new Random(System.currentTimeMillis());

	public hasQuarter(GumBallMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
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
		
		if ((winner == 0) && (gumballMachine.getBalls() > 1))
			gumballMachine.setState(gumballMachine.getWinnerState());
		else
			gumballMachine.setState(gumballMachine.getSoldState());
	}

	@Override
	public void dispense() {
		System.out.println("No gumball despensed");
	}


}

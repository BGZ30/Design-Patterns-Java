package OOMachine.MainAndTest;

import OOMachine.States.*;

public class GumBallMachine {
	State soldOutState;
	State noQuarterState;
	State hasQuarterState;
	State soldState;
	State winnerState;
	
	State state = soldOutState;
	int gums = 0;
	
	public GumBallMachine(int numberGumballs) {
		this.gums = numberGumballs;
				
		soldOutState = new SoldOut(this);
		noQuarterState = new NoQuarter(this);
		hasQuarterState = new hasQuarter(this);
		winnerState  = new LuckyWinner(this);
		
		soldState = new Sold(this);
		
		if (numberGumballs > 0) {
			state = noQuarterState;
		}
	}
	
	public void insertQuarter() {
		state.insertQuarter();
	}
	
	public void ejectQuarter() {
		state.ejectQuarter();
	}
	
	public void turnCrank() {
		state.turnCrank();
		state.dispense();
	}
	
	// should be private
	public void setState(State state) {
		this.state = state;
	}
	
	// should be private
	public void releaseBall() {
		System.out.println("A gumball comes rolling out the slot...");
		
		if (gums != 0) {
			gums -= 1;
		}
	}
	
	public int getBalls() {
		return gums;
	}
	
	public State getNoQuarterState() {
		return noQuarterState;
	}
	
	public State getSoldOutState() {
		return soldOutState;
	}
	
	public State getHasQuarterState() {
		return hasQuarterState;
	}
	
	public State getSoldState() {
		return soldState;
	}
	
	public State getWinnerState() {
		return winnerState;
	}

}
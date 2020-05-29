package decorator.starbuzz;

public class Milk extends CondimentDecorator {
	
	Beverage beverage;

	public Milk(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return beverage.getDescription() + ", Milk";
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return beverage.cost() + 0.1;
	}

}

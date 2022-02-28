package entities;

public class Individual extends TaxPayer {

	private double healthExpenditures;
	
	public Individual() {
		super();
	}
	public Individual(String name, double anullIncome, double healthExpenditures) {
		super(name, anullIncome);
		this.healthExpenditures = healthExpenditures;
	}
	public double getHealthExpenditures() {
		return healthExpenditures;
	}
	public void setHealthExpenditures(double healthExpenditures) {
		this.healthExpenditures = healthExpenditures;
	}
	
	@Override
	public double tax() {
		if(anullIncome < 20000 ){
			return  anullIncome * 0.15 - (healthExpenditures * 0.5) ;
		}
		else {
			return  anullIncome * 0.25 - (healthExpenditures * 0.5);
		}
	}

}

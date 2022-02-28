package entities;

public abstract class TaxPayer {
	protected String name;
	protected double anullIncome;
	
	public TaxPayer() {
		
	}
	public TaxPayer(String name, double anullIncome) {
		this.name = name;
		this.anullIncome = anullIncome;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getAnullIncome() {
		return anullIncome;
	}
	
	public abstract double tax();
}

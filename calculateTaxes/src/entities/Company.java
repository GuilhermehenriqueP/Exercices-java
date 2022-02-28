package entities;

public class Company extends TaxPayer {
	private Integer numberOfEmployees;
	
	public Company() {
		super();
	}
	
	public Company(String name, double anullIncome, Integer numberOfEmployees) {
		super(name, anullIncome);
		this.numberOfEmployees = numberOfEmployees;
	}


	public Integer getNumberOfEmployees() {
		return numberOfEmployees;
	}

	public void setNumberOfEmployees(Integer numberOfEmployees) {
		this.numberOfEmployees = numberOfEmployees;
	}

	@Override
	public double tax() {
		if(numberOfEmployees > 10) {
			return anullIncome * 0.14;
		}
		else {
			return anullIncome * 0.16;
		}
	}
	
}

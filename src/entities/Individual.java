package entities;

public class Individual extends TaxPayer{
	private Double healthExpenditures; //Despesas de sa�de

	public Individual(String name, Double anuallncome) {
		super(name, anuallncome);
	}

	public Individual(String name, Double anuallncome, Double healthExpenditures) {
		super(name, anuallncome);
		this.healthExpenditures = healthExpenditures;
	}

	public Double getHealthExpenditures() {
		return healthExpenditures;
	}

	public void setHealthExpenditures(Double healthExpenditures) {
		this.healthExpenditures = healthExpenditures;
	}
	@Override	
	public Double tax() {
		if(super.getAnuallncome() < 20000.0) {
			return super.getAnuallncome() * 0.15 - healthExpenditures*0.5;
		}else {
			return super.getAnuallncome() * 0.25 - healthExpenditures*0.5;
		}
	}
}	

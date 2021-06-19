package entities;

public class Company extends TaxPayer{
	private Integer numberOfEmployees; //Número de Empregados

	public Company(String name, Double anuallncome) {
		super(name, anuallncome);
	}

	public Company(String name, Double anuallncome, int numberOfEmployees) {
		super(name, anuallncome);
		this.numberOfEmployees = numberOfEmployees;
	}

	public int getNumberOfEmployees() {
		return numberOfEmployees;
	}

	public void setNumberOfEmployees(Integer numberOfEmployees) {
		this.numberOfEmployees = numberOfEmployees;
	}
	@Override
	public Double tax() {
		if(numberOfEmployees < 10) {
			return getAnuallncome() * 0.16;
		}else{
			return getAnuallncome() * 0.14;
		}
	}
}

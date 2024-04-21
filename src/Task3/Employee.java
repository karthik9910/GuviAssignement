package Task3;

public class Employee implements Taxable{
	
	private int empId;
	private String name;
	private double yearlyIncome;


	public Employee(int empId, String name, double yearlyIncome) {
		super();
		this.empId = empId;
		this.name = name;
		this.yearlyIncome = yearlyIncome;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getYearlyIncome() {
		return yearlyIncome;
	}

	public void setYearlyIncome(double yearlyIncome) {
		this.yearlyIncome = yearlyIncome;
	}

	@Override
	public void calcTax() {
		// TODO Auto-generated method stub
		Double totalIncomeTax=this.yearlyIncome*incomeTax/100;
		System.out.println("Income Tax to be payable: " + totalIncomeTax);
	}
	


}

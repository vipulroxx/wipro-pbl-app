class Employee extends Person
{
	public double annualSalary;
	public int yearStarted;
	public String nationalInsuranceNumber;

	public void setAnnualSalary(double annualSalary)
	{
		this.annualSalary = annualSalary;
	}
	public double getAnnualSalary()
	{
		return this.annualSalary;
	}
	public void setYearStarted(int yearStarted)
	{
		this.yearStarted = yearStarted;
	}
	public int getYearStarted()
	{
		return this.yearStarted;
	}
	public void setNationalInsuranceNumber(String nationalInsuranceNumber)
	{
		this.nationalInsuranceNumber = nationalInsuranceNumber;
	}
	public String getNationalInsuranceNumber()
	{
		return this.nationalInsuranceNumber;
	}
}

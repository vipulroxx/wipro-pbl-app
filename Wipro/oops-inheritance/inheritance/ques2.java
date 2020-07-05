import java.io.*;
class TestEmployee extends Employee
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		Employee employee = new Employee();
		System.out.print("Enter the name of the employee : ");
		String name = in.readLine();
		employee.setName(name);
		System.out.print("Enter the annual salary of the employee : ");
		double annualSalary = Double.parseDouble(in.readLine());
		employee.setAnnualSalary(annualSalary);
		System.out.print("Enter starting year of the employee : ");
		int year = Integer.parseInt(in.readLine());
		employee.setYearStarted(year);
		System.out.print("Enter national insurance number of the employee : ");
		String insuranceNumber = in.readLine();
		employee.setNationalInsuranceNumber(insuranceNumber);
		System.out.println();
		System.out.println("Employee Name : " + employee.getName());
		System.out.println("Employee Annual Salary : " + employee.getAnnualSalary());
		System.out.println("Employee Joining Year : " + employee.getYearStarted());
		System.out.println("Employee National Insurance Number : " + employee.getNationalInsuranceNumber());
	}
}
		

class miniproject
{
	public static void main(String args[]) 
	{
		System.out.println("Enter employee ID : ");
		String empid = args[0]; 
		String[] name = {"Ashish", "Sushma", "Rahul", "Chahat", "Ranjan", "Suman", "Tanmay"};
		String[] designation = {"Engineer", "Consultant", "Clerk", "Receptionist", "Manager", "Engineer", "Consultant"};
		String[] department = {"R&D", "PM", "Acct", "Front Desk", "Engg", "Manufacturing", "PM"};
		int[] basic = {20000, 30000, 10000, 12000, 50000, 23000, 29000};
		int[] hra = {8000, 12000, 8000, 6000, 20000, 9000, 12000};
		int[] da = {20000, 32000, 12000, 15000, 40000, 20000, 32000};
		int[] it = {3000, 9000, 1000, 2000, 20000, 4400, 10000};
		int[] salary = new int[7];
		for (int i = 0; i < 7; i++)
			salary[i] = basic[i] + hra[i] + da[i] - it[i];
		System.out.println("Emp No.\tEmp Name\tDepartment\tDesignation\tSalary");
		switch(empid)
		{
			case("1001"):
				System.out.println("1001"+"\t"+name[0]+"\t\t"+department[0]+"\t\t"+designation[0]+"\t"+salary[0]);
				break;
			case("1002"):
				System.out.println("1002"+"\t"+name[1]+"\t\t"+department[1]+"\t\t"+designation[1]+"\t"+salary[1]);
				break;

			case("1003"):
				System.out.println("1003"+"\t"+name[2]+"\t\t"+department[2]+"\t\t"+designation[2]+"\t\t"+salary[2]);
				break;
			case("1004"):
				System.out.println("1004"+"\t"+name[3]+"\t\t"+department[3]+"\t"+designation[3]+"\t"+salary[3]);
				break;
			case("1005"):
				System.out.println("1005"+"\t"+name[4]+"\t\t"+department[4]+"\t\t"+designation[4]+"\t\t"+salary[4]);
				break;
			case("1006"):
				System.out.println("1006"+"\t"+name[5]+"\t\t"+department[5]+"\t"+designation[5]+"\t"+salary[5]);
				break;
			case("1007"):
				System.out.println("1007"+"\t"+name[6]+"\t\t"+department[6]+"\t\t"+designation[6]+"\t"+salary[6]);
				break;
			default:
				System.out.println("There is no employee with empid : " + empid);
				break;
		}
	}
}

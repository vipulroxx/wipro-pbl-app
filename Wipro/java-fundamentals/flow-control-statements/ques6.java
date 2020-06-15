import java.io.*;
class ques6
{
	public static void main(String args[]) throws IOException
	{
		BufferedReader in =  new BufferedReader(new InputStreamReader(System.in));
		String gender = args[0];
		int age = Integer.parseInt(args[1]);
		double pi = 0.0;
		if ((gender.equals("female")) && (age >= 1 && age <= 58))
			pi = 8.2;
		else if ((gender.equals("female")) && (age >= 59 && age <= 100))
			pi = 9.2;
		else if ((gender.equals("male")) && (age >= 1 && age <= 58))
			pi = 8.4;
		else if ((gender.equals("male")) && (age >= 59 && age <= 100))
			pi = 10.5;
		System.out.println("Percentage of Interest  : " + pi);
	}
}

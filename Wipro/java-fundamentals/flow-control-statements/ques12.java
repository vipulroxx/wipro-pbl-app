import java.io.*;
class ques12
{
	public static void main(String args[]) throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter a number to check if it is prime or not : ");
		int n = Integer.parseInt(in.readLine());
		int c = 0;
		for(int i = 2; i < n; i++)
		{
			if (n % i == 0)
			{
				c++;
				break;
			}
		}
		if (c > 0)
			System.out.println("Not a prime number");
		else
			System.out.println("Prime number");
	}
}

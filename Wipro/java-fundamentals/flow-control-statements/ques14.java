import java.io.*;
class ques14
{
	public static void main(String args[]) throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter a number to calculate sum of its digits : ");
		int n = Integer.parseInt(in.readLine());
		int digit, sum = 0;
		while (n != 0)
		{
			digit = n % 10;
			sum += digit;
			n = n / 10;
		}
		System.out.println("Sum of the digits of the number = " + sum);
	}
}


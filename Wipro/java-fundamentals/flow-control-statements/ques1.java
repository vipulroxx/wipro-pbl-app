import java.io.*;
class ques1
{
	public static int lastDigit(int n)
	{
		int ld = n % 10;
		return ld;
	}

	public static void main(String args[]) throws IOException
	{
		BufferedReader in =  new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter a number to check whether it is negative, positive or zero : ");
		int n = Integer.parseInt(in.readLine());
		if (n > 0)
			System.out.println("The number " + n + " is positive.");
		else if (n == 0)
			System.out.println("The number " + n + " is 0.");
		else
			System.out.println("The number " + n + " is negative.");
		System.out.print("Enter two numbers to check if their last digits are equal or not : ");
		int a = Integer.parseInt(in.readLine());
		int b = Integer.parseInt(in.readLine());
		if (lastDigit(a) == lastDigit(b))
			System.out.println("true");
		else
			System.out.println("false");
	}
}



import java.io.*;
class ques3
{
	public static void main(String args[]) throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		System.out.println("The sum of " + a + " and " + b + " is " + (a + b));
	}
}

import java.io.*;
class ques15
{
	public static void main(String args[]) throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter an integer : ");
		int n = Integer.parseInt(in.readLine());
		for (int i = 1; i <= n; i++)
		{
			for (int j = 1; j <=  i; j++)
				System.out.print("* ");
			System.out.println();
		}
	}
}

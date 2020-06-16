import java.io.*;
class ques4
{
	public static void main(String args[]) throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int n[] = new int[5];
		System.out.println("Enter 5 ASCII values : ");
		for (int i = 0; i < 5; i++)
			n[i] = Integer.parseInt(in.readLine());
		System.out.println("The corresponding character values are : ");
		for (int j = 0; j < n.length; j++)
			System.out.println(n[j] + " : " + (char)n[j]);
	}
}

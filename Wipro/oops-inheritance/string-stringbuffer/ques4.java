import java.io.*;
class ques4
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter a string : ");
		String str = in.readLine();
		int n = str.length();
		String res = "";
		if (n % 2 == 0)
		{
			for (int i = 0; i < n/2; i++)
				res = res + str.charAt(i);
			System.out.println(res);
		}
		else
			System.out.println("null");
	}
}

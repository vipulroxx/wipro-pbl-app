import java.io.*;
class ques8
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter a string : ");
		String str = in.readLine();
		String res = "";
		for (int i = 0; i < str.length(); i++)
			if (str.charAt(i) == '*')
				res = str.substring(0, i - 1) + str.substring(i+2, str.length());
		System.out.println(res);
	}
}


import java.io.*;
class ques3
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter a string : ");
		String str = in.readLine();
		String res = "";
		String temp = "" + str.charAt(0) + str.charAt(1);
		for (int i = 0; i < str.length(); i++)
			res = res + temp;
		System.out.println(res);
	}
}

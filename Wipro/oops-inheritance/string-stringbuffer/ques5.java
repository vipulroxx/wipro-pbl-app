import java.io.*;
class ques5
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter a string : ");
		String str = in.readLine();
		String res = "";
		for (int i = 1; i != str.length()-1; i++)
			res = res + str.charAt(i);
		System.out.println(res);
	}
}

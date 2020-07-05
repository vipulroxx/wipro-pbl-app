import java.io.*;
class ques9
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter first string : ");
		String str1 = in.readLine();
		System.out.print("Enter second string : ");
		String str2 = in.readLine();
		String res = "";
		for (int i = 0; i < str1.length(); i++)
			res = res + str1.charAt(i) + str2.charAt(i);
		System.out.println(res);
	}
}

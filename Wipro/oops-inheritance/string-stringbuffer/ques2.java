import java.io.*;
class ques2
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter first string : ");
		String str1 = in.readLine();
		System.out.print("Enter second string : ");
		String str2 = in.readLine();
		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();
		if ((str1.charAt(str1.length()-1)) != (str2.charAt(0)))
			System.out.println(str1.concat(str2).toLowerCase());
		else
		{
			String str3 = "";
			for (int i = 1; i < str2.length(); i++)
				str3 = str3 + str2.charAt(i);
			System.out.println(str1.concat(str3).toLowerCase());
		}
	}
}

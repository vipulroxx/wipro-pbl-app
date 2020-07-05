import java.io.*;
class ques1
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter a string : ");
		String str = in.readLine();
		char ch;
		String r = "";
		for (int i = 0; i < str.length(); i++)
		{
	 		ch = str.charAt(i);
			r = ch + r;
		}
		if (str.compareToIgnoreCase(r) == 0)
			System.out.println("Palindrome string");
		else
			System.out.println("Not a palindrome string");
	}
}


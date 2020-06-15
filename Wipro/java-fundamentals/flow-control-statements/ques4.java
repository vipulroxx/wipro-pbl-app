import java.io.*;
class ques4
{
	public static void main(String args[]) throws IOException
	{
		BufferedReader in =  new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter two letter string : ");
		String str = in.readLine();
		char ch, ch1;
		String res = "";
		ch = str.charAt(0);
		ch1 = str.charAt(1);
		if (ch < ch1)
		{
			res += ch;
			res += ch1;
		}
		else
		{
			res += ch1;
			res += ch;
		}
		System.out.println(res);
	}
}

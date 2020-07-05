import java.io.*;
class ques10
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter the string : ");
		String str = in.readLine();
		System.out.print("Enter an integer : ");
		int n = Integer.parseInt(in.readLine());
		String substring = str.substring(str.length()-n, str.length());
		String res = "";
		for (int i = 0; i < n; i++)
			res = res + substring;
		System.out.println(res);
	}
}

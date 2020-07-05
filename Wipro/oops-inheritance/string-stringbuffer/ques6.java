import java.io.*;
class ques6
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter shorter string : ");
		String str1 = in.readLine();
		System.out.print("Enter longer string : ");
		String str2 = in.readLine();
		System.out.println(str1.concat(str2).concat(str1));
	}
}

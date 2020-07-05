import java.io.*;
class ques7
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter a string : ");
		String str = in.readLine();
		if ((str.charAt(0) == 'x') && (str.charAt(str.length()-1) == 'x'))
			System.out.println(str.substring(1, str.length() - 1));
		else
			System.out.println(str);
	}
}




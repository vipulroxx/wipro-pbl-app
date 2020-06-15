import java.io.*;
class ques16
{
	public static void main(String args[]) throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter a number to reverse it : ");
		int n = Integer.parseInt(in.readLine());
		String str = "";
		int digit;
		while (n != 0)
		{
			digit = n % 10;
			str += Integer.toString(digit);
			n = n / 10;
		}
		n = Integer.parseInt(str);
		System.out.println(str);
	}
}	

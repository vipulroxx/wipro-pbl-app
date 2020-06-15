import java.io.*;
class ques5
{
	public static void main(String args[]) throws IOException
	{
		BufferedReader in =  new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter a character : ");
		char ch = (char)in.read();
		if (ch >= 32 && ch <= 47 ||ch >= 58 && ch <= 64 || ch >= 91 && ch <= 96)
			System.out.println("Special Character");
		if (ch >= 48 && ch <= 57)
			System.out.println("Number");
		if (ch >= 65 && ch <= 90 || ch >= 97 && ch <= 122)
			System.out.println("Alphabet");
	}
}


import java.io.*;
class ques13
{
	public static void main(String args[])
	{
		int a = 10, b = 99;
		if (a % 2 == 0)
			a++;
		for (int i = a; i <= b; i+=2)
		{
			int c = 0;
			for (int j = 2; j*j <= i; j++)
			{
				if (i % j == 0)
				{
					c++;
					break;
				}
			}
			if (c == 0)
				System.out.println(i);
		}
	}
}


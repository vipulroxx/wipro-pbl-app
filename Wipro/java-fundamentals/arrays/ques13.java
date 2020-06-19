import java.io.*;
class ques13
{
	public static void main(String args[]) throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter 4 numbers for 2 x 2 array : ");
		int[][] n = new int[2][2];
		for (int i = 0; i < 2; i++)
			 for (int j = 0; j < 2; j++)
				 n[i][j] = Integer.parseInt(in.readLine());
		System.out.println("Original Array : ");
		for (int i = 0; i < 2; i++)
		{
			 for (int j = 0; j < 2; j++)
			 	System.out.print(n[i][j] + " ");
			 System.out.println();
		}
		System.out.println("Reversed Array : ");
		for (int i = 1; i >= 0; i--)
		{
			 for (int j = 1; j >= 0; j--)
			 	System.out.print(n[i][j] + " ");
			 System.out.println();
		}
	}
}

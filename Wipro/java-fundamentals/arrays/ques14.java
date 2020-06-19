import java.io.*;
class ques14
{
	public static void main(String args[]) throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter 9 integers for 3 x 3 array : ");
		int n[][] = new int[3][3];
		for (int i = 0; i < 3; i++)
			for (int j = 0; j < 3; j++)
				n[i][j] = Integer.parseInt(in.readLine());
		int max = n[0][0];
		for (int i = 0; i < 3; i++)
			for (int j = 0; j < 3; j++)
				if (max < n[i][j])
					max = n[i][j];
		System.out.print("Maximum number : " + max);
		System.out.println();
	}
}

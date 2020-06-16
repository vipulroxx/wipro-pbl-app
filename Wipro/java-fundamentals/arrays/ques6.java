import java.io.*;
class ques6
{
	public static void main(String args[]) throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter 5 numbers for an array to be sorted : ");
		int n[] = new int[5];
		for (int i = 0; i < n.length; i++)
			n[i] = Integer.parseInt(in.readLine());
		for (int i = 0; i < n.length; i++)
		{
			int index = i;
			for (int j = i + 1; j < n.length; j++)
			{
				if (n[j] < n[index])
					index = j;
			}
			int smallerNumber = n[index];
			n[index] = n[i];
			n[i] = smallerNumber;
		}
		System.out.println("Sorted Array : ");
		for (int i = 0; i < n.length; i++)
			System.out.print(n[i] + " ");
	}
}

import java.util.Arrays;
import java.io.*;
class ques3
{
	public static void main(String args[]) throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int n[] = { 21, 31, 41, 51, 61, 71 };
		System.out.println("Enter a number : ");
		int a = Integer.parseInt(in.readLine());
		Arrays.sort(n);
		int c = 0, low = 0, high = n.length, mid;
		while (low < high)
		{
			mid = low + (high - low)/2;
			if (a == n[mid])
			{
				c++;
				System.out.println("Index  : " + (mid + 1));
				break;
			}
			else if (a < n[mid])
				high = mid - 1;
			else
				low = mid + 1;
		}
		if (c > 0)
			System.out.println("Number present");
		else
			System.out.println("Number not present");
	}
}

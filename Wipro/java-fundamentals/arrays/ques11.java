class ques11
{
	public static void main(String args[])
	{
		int n[] = {1, 4, 4, 1, 4, 1, 1};
		System.out.println("Original array : ");
		for (int i = 0; i < n.length; i++)
			System.out.print(n[i] + " ");
		System.out.println();
		int c = 0;
		for (int i = 0; i < n.length; i++)
		{
			if (n[i] != 1 || n[i] != 4)
			{
				c++;
				break;
			}
		}
		if (c > 1)
			System.out.println("False");
		else
			System.out.println("True");
	}
}

class ques9
{
	public static void main(String args[])
	{
		int n[] = {1, 2, 10, 10, 3, 4};
		System.out.println("Original Array :");
		for (int i = 0; i < n.length; i++)
			System.out.print(n[i] + " ");
		System.out.println();
		int[] result = new int[n.length];
		int j = 0;
		for (int i = 0; i < n.length; i++)
		{
			if (n[i] == 10)
				continue;
			else
			{
				result[j] = n[i];
				j++;
			}
		}
		System.out.println("Rearranged Array : ");
		for (int i = 0; i < result.length; i++)
			System.out.print(result[i] + " ");
		System.out.println();
	}
}

class ques10
{
	public static void main(String args[])
	{
		int n[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		System.out.println("Original Array : ");
		for (int i = 0; i < n.length; i++)
			System.out.print(n[i] + " ");
		System.out.println();
		int[] result = new int[n.length];
		int j = 0, k = n.length - 1;
		for (int i = 0; i < n.length; i++)
		{
			if (n[i] % 2 == 0)
			{
				result[j] = n[i];
				j++;
			}
			else
			{
				result[k] = n[i];
				k--;
			}
		}
		System.out.println("Rearranged Array : ");
		for (int i = 0; i < result.length; i++)
			System.out.print(result[i] + " ");
		System.out.println();
	}
}

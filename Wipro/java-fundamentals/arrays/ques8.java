class ques8
{
	public static void main(String args[])
	{
		int n[] = {10, 3, 6, 1, 2, 7, 9};
		System.out.println("Original Array : ");
		for (int i = 0; i < n.length; i++)
			System.out.print(n[i] + " ");
		System.out.println();
		int sum = 0;
		boolean add = true;
		for (int i = 0; i < n.length; i++)
		{
			if (n[i] == 6)
				add = false;
			else if (n[i] == 7)
				add = true;
			else if (n[i] != 6 && add == true)
				sum += n[i];
		}
		System.out.println("Sum of the array based on condition : " + sum);
	}
}

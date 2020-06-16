class ques7
{
	public static void main(String args[])
	{
		int n[] = { 1, 1, 2, 2, 3, 3, 4, 4, 5, 5 };
		System.out.println("Original Array : ");
		for (int i = 0; i < n.length; i++)
			System.out.print(n[i] + " ");
		System.out.println();
		System.out.println("After removing duplicates : ");
		int[] temp = new int[n.length];
		int j = 0;
		for (int i = 0; i < n.length - 1; i++)
			if (n[i] != n[i + 1])
				temp[j++] = n[i];
		temp[j++] = n[n.length- 1];
		for (int i = 0; i < j; i++)
			n[i] = temp[i];
		for (int i = 0; i < j; i++)
			System.out.print(n[i] + " ");
		
	}
}



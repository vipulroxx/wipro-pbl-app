class ques12
{
	public static void main(String args[])
	{
		int a[] = { 1, 2, 3};
		int b[] = { 4, 5, 6};
		System.out.println("Original arrays : ");
		for (int i = 0; i < a.length; i++)
			System.out.print(a[i] + " ");
		System.out.println();
		for (int i = 0; i < b.length; i++)
			System.out.print(b[i] + " ");
		int mid1, mid2;
		mid1 = 0 + (a.length - 0)/2;
		mid2 = 0 + (b.length - 0)/2;
		System.out.println();
		int[] result = new int[2];
		result[0] = a[mid1];
		result[1] = b[mid2];
		for (int i = 0; i < result.length; i++)
			System.out.print(result[i] + " ");
		System.out.println();
	}
}


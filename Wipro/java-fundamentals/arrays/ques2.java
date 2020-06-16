class ques2
{
	public static void main(String args[])
	{
		int n[] = { 12, 21 , 23, 2, 4, 5};
		int max = n[0];
		int min = n[0];
		for (int i = 1; i < n.length; i++)
			if (max < n[i])
				max = n[i];
		System.out.println("Maximum : " + max);
		for (int i = 1; i < n.length; i++)
			if (min > n[i])
				min = n[i];
		System.out.println("Minimum : " + min);
	}
}

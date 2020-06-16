class ques1
{
	public static void main(String args[])
	{
		int n[] = {1, 2, 3, 4, 5};
		int sum = 0;
		double average;
		for (int i = 0; i < n.length; i++)
			sum = sum + n[i];
		average = sum / n.length;
		System.out.println("Sum of all the elements : " + sum);
		System.out.println("Average of all the elements : " + average);
	}
}

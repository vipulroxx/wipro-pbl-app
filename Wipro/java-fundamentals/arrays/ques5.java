class ques5
{
	public static void main(String args[])
	{
		int temp, i;
		int a[] = {1, 2, 3, 4, 5};
		int largest = a[0];
		int secondlargest = a[1];
		if (largest < secondlargest)
		{
			temp = largest;
			largest = secondlargest;
			secondlargest = temp;
		}
		for (i = 2; i < a.length; i++)
		{
			if (a[i] > largest)
			{
				secondlargest = largest;
				largest = a[i];
			}
			else if (a[i] > secondlargest && a[i] != largest)
				secondlargest = a[i];
		}
		System.out.println("Largest Number : " + largest);
		System.out.println("Second Largest Number : " + secondlargest);
		int minimum = a[0];
		int secondminimum = a[1];
		if (minimum > secondminimum)
		{
			temp = minimum;
			minimum = secondminimum;
			secondminimum = temp;
		}
		for (i = 2; i < a.length; i++)
		{
			if (a[i] < minimum)
			{
				secondminimum = minimum;
				minimum = a[i];
			}
			else if (a[i] < secondminimum && a[i] != minimum)
				secondminimum = a[i];
		}
		System.out.println("Minimum Number : " + minimum);
		System.out.println("Second Minimum Number : " + secondminimum);
	}
}	


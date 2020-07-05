import java.io.*;
import java.lang.Math;
class Calculator
{
	public static int powerInt(int num1, int num2)
	{
		return (int)Math.pow(num1, num2);
	}
	public static double powerDouble(double num1, double num2)
	{
		return Math.pow(num1, num2);
	}
	public static void main(String[] args) throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter two numbers to return their power in Integer and Double format : ");
		int num1 = Integer.parseInt(in.readLine());
		int num2 = Integer.parseInt(in.readLine());
		int powInt = powerInt(num1, num2);
		double powDouble = powerDouble((double)num1, (double)num2);
		System.out.println("Power in integer format : " + powInt);
		System.out.println("Power in double format : " + powDouble);
	}
}

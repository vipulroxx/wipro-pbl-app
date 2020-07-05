import java.io.*;
class box
{
	public static double width = 0.0;
	public static double height = 0.0;
	public static double depth = 0.0;
	box(double width, double height, double depth)
	{
		box.width = width;
		box.height = height;
		box.depth = depth;
	}
	double volume()
	{
		double volume;
		volume = box.height * box.width * box.depth;
		return volume;
	}
}
class ques1
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the dimensions of the box :-");
		System.out.print("Enter width : ");
		double width = Double.parseDouble(in.readLine());
		System.out.print("Enter height : ");
		double height = Double.parseDouble(in.readLine());
		System.out.print("Enter depth : ");
		double depth = Double.parseDouble(in.readLine());
		box obj = new box(width, height, depth);
		double volume = obj.volume();
		System.out.print("Volume of the box is " + volume);
		System.out.println();
	}
}
	

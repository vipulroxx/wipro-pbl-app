class Shape
{
	public void draw()
	{
		System.out.println("Drawing Shape");
	}
	public void erase()
	{
		System.out.println("Erasing Shape");
	}
}
class Circle extends Shape
{
	public void draw()
	{
		System.out.println("Drawing circle");
	}
	public void erase()
	{
		System.out.println("Erasing circle");
	}
}
class Triangle extends Shape
{
	public void draw()
	{
		System.out.println("Drawing Triangle");
	}
	public void erase()
	{
		System.out.println("Erasing Triangle");
	}
}
class Square extends Shape
{
	public void draw()
	{
		System.out.println("Drawing square");
	}
	public void erase()
	{
		System.out.println("Erasing square");
	}
}
class ques2
{
	public static void main(String[] args)
	{
		Shape c = new Circle();
		Shape t = new Triangle();
		Shape s = new Square();
		c.draw();
		c.erase();
		t.draw();
		t.erase();
		s.draw();
		s.erase();
	}
}

class Fruit
{
	public String  name;
	public String taste;
	public int size;

	public void eat()
	{
		name = "Mango";
		taste = "Tasty";
	}
}
class Apple extends Fruit
{
	public void eat()
	{
		name = "Apple";
		taste = "Sweet";
	}
}
class Orange extends Fruit
{
	public void eat()
	{
		name = "Orange";
		taste = "Savoury";
	}
}
class ques1
{
	public static void main(String[] args)
	{
		Fruit f;
		f = new Apple();
		f.eat();
		System.out.println("Name of the fruit is " + f.name + " and its taste is " + f.taste);
		f = new Orange();
		f.eat();
		System.out.println("Name of the fruit is " + f.name + " and its taste is " + f.taste);
	}
}

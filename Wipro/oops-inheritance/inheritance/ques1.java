import java.io.*;
class Animal
{
	public void eat()
	{
		System.out.println("Every specie needs food to survive.");
	}
	public void sleep()
	{
		System.out.println("Having proper sleep is good for health.");
	}
}
class Bird extends Animal
{
	public void eat()
	{
		System.out.println("A bird looks for food by flying around for miles.");
	}
	public void sleep()
	{
		System.out.println("The bird sleeps during the day.");
	}
	public void fly()
	{
		System.out.println("The bird flies around for three hours to look for its food.");
	}

	public static void main(String[] args)
	{
		Bird bird = new Bird();
		bird.eat();
		bird.sleep();
		bird.fly();
	}
}

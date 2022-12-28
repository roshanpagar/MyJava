package Inheritance.parentchild;

public class Fruit {
	void taste()
	{
		System.out.println("Fruit are generally sweet in taste");
	}
}

class Apple extends Fruit
{
	void taste()
	{
		System.out.println("Apple are sweet to taste");
	}
}
class Strawberry extends Fruit
{
	void taste()
	{
		System.out.println("Stawberries are sweet and sour i taste");
	}
}
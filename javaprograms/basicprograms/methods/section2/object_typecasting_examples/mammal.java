class mammal1
{
	void eat (mammal1 m)
	{
		System.out.println("mammal eats food");
	}
}
class cattle extends mammal1
{
	void eat( cattle c)
	{
          System.out.println("cattle eats hay");
	}
}

class horse extends cattle
{
	void eat(horse h)
	{
		System.out.println("horse eats hay");
	}
}

class  mammal
{
	public static void main(String[] args) 
	{
		mammal1 h=new horse();
		cattle c=new horse();
		c.eat(h);
		System.out.println("Hello World!");
	}
}
